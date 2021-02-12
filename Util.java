package utilities;
import java.util.*;
import java.util.Map.Entry;
import java.awt.geom.*;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class Util {
 private static String myID = "Util";
 private static ScriptEngine jsEngine = new
ScriptEngineManager().getEngineByName("JavaScript");
 private static Log log = LogFactory.getLog(Util.class);
 // Global heading from (angle between) one point to another
 public static double getHeadingFrom(double x1, double y1, double x2, double y2) {
 double h = Math.atan2((y2 - y1), (x2 - x1));
 return h;
 }
 // Heading to point relative to given heading
 public static double getHeadingFromRel(double x1, double y1, double x2, double y2,
double h) {
 double xtmp = x2 - x1;
 double ytmp = y2 - y1;
 // First rotate the destination so heading is 0
 double xdif = Math.cos(h) * xtmp - Math.sin(h) * ytmp;
 double ydif = Math.cos(h) * ytmp + Math.sin(h) * xtmp;
 // Then calculate the angle -- negated because of Y-axis switch
 h = -Math.atan2(ydif, xdif);
 return h;
 }
 // Distance between two points
 public static double getDistanceFrom(double x1, double y1, double x2, double y2) {
 double d;
 d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
 return d;
 }
public static double lldist(double x1, double y1, double x2, double y2) {
 double R = 6372795; // Average radius of earth
 double xcurr = Math.toRadians(x1);
 double xdest = Math.toRadians(x2);
 double ycurr = Math.toRadians(y1);
 double ydest = Math.toRadians(y2);
 double dx = xdest - xcurr;
 double dy = ydest - ycurr;
 double dist;
 dist = Math.pow(Math.sin(dy / 2), 2) + Math.cos(ycurr) * Math.cos(ydest) *
Math.pow(Math.sin(dx / 2), 2);
 //dist = 2 * Math.atan2(Math.sqrt(dist), Math.sqrt(1 - dist));
 dist = 2 * Math.asin(Math.min(1, Math.sqrt(dist)));
 dist = R * dist;
 return dist;
 }
 public static double lineAngle(Line2D l) {
 double dx = l.getX2() - l.getX1();
 double dy = l.getY2() - l.getY1();
 double a;
 if (dx == 0) {
 a = Math.PI / 2.0;
 } else if (dy == 0) {
 a = Math.PI;
 } else {
 a = Math.atan(dy / dx);
 }
 return a;
 }
 public static Point2D lineIntersection(Line2D line1, Line2D line2) {
 Point2D p = null;
 double dx1 = line1.getX2() - line1.getX1();
 double dx2 = line2.getX2() - line2.getX1();
 double dy1 = line1.getY2() - line1.getY1();
 double dy2 = line2.getY2() - line2.getY1();
 double n1 = dx2 * (line1.getY1() - line2.getY1()) - dy2 * (line1.getX1() - line2.getX1());
 double n2 = dx1 * (line1.getY1() - line2.getY1()) - dy1 * (line1.getX1() - line2.getX1());
 double d = dy2 * dx1 - dx2 * dy1;
 double ua, ub;
 if (d == 0) {
 return p; // parallel
 }
 ua = n1 / d;
 ub = n2 / d;
 if ((ua < 0) || (ua > 1) || (ub < 0) || (ub > 1)) {
 return p; // intersect outside segments
 }
 p = new Point2D.Double(line1.getX1() + ua * dx1, line1.getY1() + ua * dy1);
 return p;
 }
 /**
 * Sleep. This is a convenience method to obviate the need to catch the
 * InterruptedException any time you want to sleep.
 *
 * @param millis the sleep duration
 */
 public static void Sleep(long millis) {
 if (millis < 0) {
 return;
 }
 try {
 Thread.sleep(millis);
 } catch (InterruptedException ie) {
 log.info("Sleep interrupted!", ie);
 }
 }
 private static int calcParenBalance(String str, int bal) {
 int opar = str.indexOf('(');
 int cpar = str.indexOf(')');
 //System.err.println("calcParenBalance('" + str + "', " + bal + ");");
 if (opar < 0 && cpar < 0) {
 return bal;
 } else if (opar < 0 && cpar >= 0) {
 return calcParenBalance(str.substring(cpar + 1), bal - 1);
 } else if (opar >= 0 && cpar < 0) {
 return calcParenBalance(str.substring(opar + 1), bal + 1);
 } else if (cpar > opar) {
 return calcParenBalance(str.substring(opar + 1), bal + 1);
 } else {
 return calcParenBalance(str.substring(cpar + 1), bal - 1);
 }
 }
 /**
 * Attempts to break string into separate tokens to be used
 * to build a Predicate.
 * @param args
 * @return ArrayList of strings or null if args was in an invalid form
 */
 public static ArrayList<String> tokenizeArgs(String args) {
 log.debug("attempting to tokenize "+args);
 int parenBalance = 0;
 ArrayList<String> retTokens = new ArrayList<String>();
 ArrayList<String> tokens = new ArrayList<String>();
 String[] tokenArray = args.split(",");
 tokens.addAll(Arrays.asList(tokenArray));
 log.debug("length() = " + tokens.size());
 String tmpStr = tokens.remove(0);
 boolean isEmpty;
 do {
 isEmpty = tokens.isEmpty();
 parenBalance = calcParenBalance(tmpStr, 0);
 //System.err.println("tmpStr = " + tmpStr + "; parenBalance = " + parenBalance);
 if (parenBalance == 0) {
 retTokens.add(tmpStr);
 if (!isEmpty) {
 tmpStr = tokens.remove(0);
 }
 } else if (parenBalance > 0) {
 if (!isEmpty) {
 tmpStr += "," + tokens.remove(0);
 }
 } else {
 log.error("[tokenizeArgs] invalid args, returning null.");
 return null;
 }
 } while (!isEmpty);
 ///// print for debugging
for(String token: retTokens) {
 log.debug(token + ", ");
 }
 return retTokens;
 }
 public static com.Predicate functionPredicate(String desc) {
 int opar = desc.indexOf('('); // open parenthesis
 int cpar = desc.lastIndexOf(')'); // close parenthesis
 int delim = 0;
 String name = desc.substring(0, opar);
 String args = desc.substring(opar + 1, cpar).replaceAll(" ", "");
 boolean parsedArgs = false;
 ArrayList<com.Symbol> arglist = new ArrayList<com.Symbol>();
 com.Symbol nextArg = null;
 //System.out.println("parsing "+desc+" into "+name+" and "+args);
 ArrayList<String> tokens = tokenizeArgs(args);
 if (tokens == null) {
 return null;
 }
 for (int i = 0; i < tokens.size(); i++) {
 cpar = tokens.get(i).indexOf(')');
 if (cpar > 0) {
 //System.err.println("functionPredicate() - " + tokens.get(i));
 nextArg = functionPredicate(tokens.get(i));
 //System.err.println("functionPredicate() fp - " + nextArg.toString() + " : " +
nextArg.getClass().toString();
 } else {
 //System.err.println("functionPredicate() - " + tokens.get(i));
 String a = tokens.get(i);
 int ind = a.indexOf(":");
 if (ind < 0) {
 //System.err.println("Arguments to Predicates should be typed ("+desc+")");
 nextArg = new com.Symbol(a);
 } else {
 String aname = a.substring(0, ind);
 String atype = a.substring(ind + 1);
 if (aname.startsWith("?")) {
 nextArg = new com.Variable(aname, atype);
 } else {
 nextArg = new com.Constant(aname, atype);
 }
 }
 }
 arglist.add(nextArg);
 }
 /*while (! parsedArgs) {
 cpar = args.indexOf(')');
 delim = args.indexOf(',',cpar);
 if (delim < 0)
 delim = args.length();
 System.out.println("next arg is: "+args.substring(0, delim));
 if (cpar > 0) {
 System.err.println("functionPredicate() - " + args.substring(0, delim));
 nextArg = functionPredicate(args.substring(0, delim));
 } else {
 System.err.println("functionPredicate() - " + args.substring(0, delim));
 nextArg = new com.Symbol(args.substring(0, delim));
 }
 arglist.add(nextArg);
 if (args.length() > delim) {
 args = args.substring(delim+1);
 } else {
 parsedArgs = true;
 }
 }*/
 return new com.Predicate(name, arglist);
 }
 public static com.Predicate functionPredVars(String desc) {
 int opar = desc.indexOf('('); // open parenthesis
 int cpar = desc.lastIndexOf(')'); // close parenthesis
 int delim = 0;
 String name = desc.substring(0, opar);
 String args = desc.substring(opar + 1, cpar).replaceAll(" ", "");
 boolean parsedArgs = false;
 ArrayList<com.Symbol> arglist = new ArrayList<com.Symbol>();
 com.Symbol nextArg = null;
 ArrayList<String> tokens = tokenizeArgs(args);
 if (tokens == null) {
 return null;
 }
 for (int i = 0; i < tokens.size(); i++) {
 cpar = tokens.get(i).indexOf(')');
 if (cpar > 0) {
 nextArg = functionPredVars(tokens.get(i));
 } else if (tokens.get(i).charAt(0) > 'Z' || tokens.get(i).charAt(0) < 'A') {
 nextArg = new com.Symbol(tokens.get(i));
 } else {
 com.Variable v = new com.Variable("", tokens.get(i));
 nextArg = v;
 }
 arglist.add(nextArg);
 }
 return new com.Predicate(name, arglist);
 }
 public static com.Predicate createPredVars(String desc) {
 int opar = desc.indexOf('('); // open parenthesis
 int cpar = desc.lastIndexOf(')'); // close parenthesis
 int delim = 0;
 String name = desc.substring(0, opar);
 String args = desc.substring(opar + 1, cpar).replaceAll(" ", "");
 boolean parsedArgs = false;
 ArrayList<com.Symbol> arglist = new ArrayList<com.Symbol>();
 com.Symbol nextArg = null;
 ArrayList<String> tokens = tokenizeArgs(args);
 if (tokens == null) {
 return null;
 }
 for (int i = 0; i < tokens.size(); i++) {
 cpar = tokens.get(i).indexOf(')');
 if (cpar > 0) {
 nextArg = createPredVars(tokens.get(i));
 } else if (tokens.get(i).charAt(0) > 'Z' || tokens.get(i).charAt(0) < 'A') {
 nextArg = new com.Symbol(tokens.get(i));
 } else {
 com.Variable v = new com.Variable(tokens.get(i),"");
 nextArg = v;
 }
 arglist.add(nextArg);
 }
 return new com.Predicate(name, arglist);
 }
 public static com.Predicate functionPredicateRehj(String desc) {
 int opar = desc.indexOf('('); // open parenthesis
 int cpar = desc.lastIndexOf(')'); // close parenthesis
 int delim = 0;
 String name = desc.substring(0, opar);
 String args = desc.substring(opar + 1, cpar).replaceAll(" ", "");
 boolean parsedArgs = false;
 ArrayList<com.Symbol> arglist = new ArrayList<com.Symbol>();
 com.Symbol nextArg = null;
 ArrayList<String> tokens = tokenizeArgs(args);
 if (tokens == null) {
 return null;
 }
 for (int i = 0; i < tokens.size(); i++) {
 cpar = tokens.get(i).indexOf(')');
 if (cpar > 0) {
 nextArg = functionPredicate(tokens.get(i));
 } else {
 if (tokens.get(i).length() == 1) {
 nextArg = new com.Variable(tokens.get(i));
 } else {
 nextArg = new com.Symbol(tokens.get(i));
 }
 }
 arglist.add(nextArg);
 }
 return new com.Predicate(name, arglist);
 }
 public static com.Symbol createSymbol(String desc) {
 if (!desc.contains(" ") && !desc.contains(",") && !desc.contains(")")) {
 return new com.Symbol(desc);
 }
 return createPredicate(desc);
 }
 // create a Predicate from space-delimited description (at cramer
 // breakroom) or function-style description (at(cramer,breakroom))
 public static com.Predicate createPredicate(String desc) {
 if (desc.contains(")")) {
 return functionPredicate(desc);
 }
 StringTokenizer s = new StringTokenizer(desc);
 String name = s.nextToken();
 ArrayList<com.Symbol> args = new ArrayList<com.Symbol>();
 while (s.hasMoreTokens()) {
 String a = s.nextToken();
 int ind = a.indexOf(":");
 if (ind < 0) {
 log.error(String.format("Arguments to Predicates should be typed (%s)", desc));
 args.add(new com.Symbol(a));
 } else {
 String aname = a.substring(0, ind);
 String atype = a.substring(ind + 1);
 if (aname.startsWith("?")) {
 args.add(new com.Variable(aname, atype));
 } else {
 args.add(new com.Constant(aname, atype));
 }
 }
 }
 return new com.Predicate(name, args);
 }
 // create a Predicate
 public static com.Predicate createPredicate(String name, String... args) {
 ArrayList<com.Symbol> symargs = new ArrayList<com.Symbol>();
 for (String a : args) {
 symargs.add(new com.Symbol(a));
 }
 return new com.Predicate(name, symargs);
 }
 // create a Predicate
 public static com.Predicate createPredicate(String name, com.Symbol... args) {
 ArrayList<com.Symbol> symargs = new ArrayList<com.Symbol>();
 symargs.addAll(Arrays.asList(args));
 return new com.Predicate(name, symargs);
 }
 /**
 * Converts text numbers into digits.
 *
 * @author mheilman
 */
 public static String numbersTextToDigits(String in) {
 final String[] numberStrings = {"zero", "one", "two", "three", "four", "five", "six", "seven",
"eight", "nine", "ten",
 "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
"nineteen"};
 final String[] tensStrings = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty",
"seventy", "eighty", "ninety"};
 String result = in;
 int idx1, idx2;
 int i, j, k;
 String token;
 boolean test = false;
 int tmpidx = 0;
 int number;
 int tmpnumber;
 idx1 = -1;
 boolean numberstart;
 idx2 = -1;
 boolean firstloop = true;
 //System.out.println("numbersTextToDigits: in == " + in);
 while (tmpidx != -1) {
 number = 0;
 k = 0;
 firstloop = true;
 tmpnumber = 0;
 numberstart = true;
 while ((tmpidx = k) != -1 || firstloop) {
 k = result.indexOf(" ", tmpidx + 1);
 if (firstloop && k != -1) {
 token = result.substring(tmpidx, k);
 tmpidx--;
 firstloop = false;
 } else if (firstloop && k == -1) {
 token = result.substring(tmpidx);
 tmpidx--;
 firstloop = false;
 } else if (k != -1) {
 token = result.substring(tmpidx + 1, k);
 } else {
 token = result.substring(tmpidx + 1);
 }
 //System.out.println("token == " + token);
 test = false;
 if (numberstart) {
 for (j = 0; j < numberStrings.length; j++) {
 if (numberStrings[j].compareTo(token) == 0) {
 numberstart = false;
 tmpnumber = j;
 idx1 = tmpidx + 1;
 break;
 }
 }
 for (j = 0; j < tensStrings.length; j++) {
 if (tensStrings[j].compareTo(token) == 0) {
 tmpnumber = j * 10;
 numberstart = false;
 idx1 = tmpidx + 1;
 break;
 }
 }
 if (token.compareTo("hundred") == 0) {
 numberstart = false;
 idx1 = tmpidx + 1;
 tmpnumber = 100;
 } else if (token.compareTo("thousand") == 0) {
 numberstart = false;
 idx1 = tmpidx + 1;
 tmpnumber = 1000;
 } else if (token.compareTo("million") == 0) {
 numberstart = false;
 idx1 = tmpidx + 1;
 tmpnumber = 1000000;
 } else if (token.compareTo("billion") == 0) {
 numberstart = false;
 idx1 = tmpidx + 1;
 tmpnumber = 1000000000;
 }
 } else {
 idx2 = tmpidx;
 for (j = 0; j < numberStrings.length; j++) {
 if (numberStrings[j].compareTo(token) == 0) {
 if (tmpnumber > 999) {
 number += tmpnumber;
 tmpnumber = 0;
 }
 test = true;
 tmpnumber += j;
 }
 }
 for (j = 0; j < tensStrings.length; j++) {
 if (tensStrings[j].compareTo(token) == 0) {
 if (tmpnumber > 999) {
 number += tmpnumber;
 tmpnumber = 0;
 }
 test = true;
 tmpnumber += j * 10;
 }
 }
 if (token.compareTo("hundred") == 0) {
 test = true;
 tmpnumber *= 100;
 } else if (token.compareTo("thousand") == 0) {
 test = true;
 tmpnumber *= 1000;
 } else if (token.compareTo("million") == 0) {
 test = true;
 tmpnumber *= 1000000;
 } else if (token.compareTo("billion") == 0) {
 test = true;
 tmpnumber *= 1000000000;
 } else if (token.compareTo("and") == 0) {
 test = true;
 number += tmpnumber;
 tmpnumber = 0;
 }
 if (!test) {
 number += tmpnumber;
 result = result.substring(0, idx1) + number + result.substring(idx2);
 break;
 }
 }
 }
 if (test) {
 //number ended the string
 number += tmpnumber;
 result = result.substring(0, idx1) + number;
 }
 }
 return result;
 }
 /**
 * Check whether next arg is another parameter (i.e., starts with '-').
 *
 * @return true if it's a parameter
 */
 public static boolean checkNextArg(String[] args, int i) {
 int j = i + 1;
 return ((j >= args.length)
 || (args[j].length() == 0)
 || (args[j].charAt(0) == '-'));
 }
 public static int signedInt(byte b1, byte b2) {
 int sint = (int) b1 << 8 | (int) b2;
 return sint;
 }
 public static int unsignedInt(byte b1, byte b2) {
 int uint = ((0xFF & (int) b1) << 8
 | (0xFF & (int) b2)) & 0xFFFFFFFF;
 return uint;
 }
 public static int unsignedInt(byte b1, byte b2, byte b3) {
 int uint = ((0xFF & (int) b1) << 16
 | (0xFF & (int) b2) << 8
 | (0xFF & (int) b3)) & 0xFFFFFFFF;
 return uint;
 }
 public static long unsignedInt(byte b1, byte b2, byte b3, byte b4) {
 long uint = ((long) ((0xFF & (int) b1) << 24
 | (0xFF & (int) b2) << 16
 | (0xFF & (int) b3) << 8
 | (0xFF & (int) b4))) & 0xFFFFFFFFL;
 return uint;
 }
 public static void iPrinterrln(String text) {
 iPrint(text + "\n", true);
 }
 public static void iPrinterr(String text) {
 iPrint(text, true);
 }
 public static void iPrintln(String text) {
 iPrint(text + "\n", false);
 }
 public static void iPrint(String text, boolean err) {
 String id = myID;
 /*
 String myType = getTypeFromID(id);
 String myName = getNameFromID(id);
 if (myName.startsWith(myType))
 id = myName;
 else
 id = myID;
 */
 if (err) {
 log.error(String.format("%s: %s", id, text));
 } else {
 log.info(String.format("%s: %s", id, text));
 }
 }

 public static int countOccur(String searchString, String s) {
 int count = -1;
 int index = 0;
 int start = 0;
 while (index != -1) {
 count++;
 index = s.indexOf(searchString, start);
 start = index + 1;
 }
 return count;
 }
 /**
 * Allows a class to receive a config file as a list of String args. Config
 * file should have one option per line, with the flag and the (optional
 * single) option separated by a space. Lines or ends of lines may be
 * commented out with "#".
 *
 * @param configFile name of config file
 * @return String array containing flags and values
 * @author Rehj Cantrell
 */
 public static String[] parseConfigFile(String configFile) {
 // System.out.println("configFile: " + configFile);
 String[] argArray = null;
 BufferedReader in = null;
 try {
 in = new BufferedReader(new FileReader(configFile));
 String line = in.readLine();
 ArrayList<String> args = new ArrayList<String>();
 while (line != null) {
 int commentstart = line.indexOf("#");
 if (commentstart != -1) {
 line = line.substring(commentstart);
 }
 StringTokenizer tokenizer = new StringTokenizer(line, " ");
 while (tokenizer.hasMoreTokens()) {
 args.add(tokenizer.nextToken());
 }
 line = in.readLine();
 }
 argArray = new String[args.size()];
 for (int i = 0; i < args.size(); i++) {
 argArray[i] = args.get(i);
 }
 in.close();
 } catch (java.io.FileNotFoundException e) {
 log.error("Config file not found. Returning null.", e);
 } catch (java.io.IOException e) {
 log.error("Error reading config file. Returning null.", e);
 }
 return argArray;
 }
 public static String arrayListToString(List<String> list) {
 String stringVal = "";
 for (String token : list) {
 stringVal += token + " ";
 }
 return stringVal.trim();
 }
 public static ArrayList<String> getArrayList(String Utterance) {
 StringTokenizer st = new StringTokenizer(Utterance);
 ArrayList<String> output = new ArrayList<String>();
 while (st.hasMoreTokens()) {
 output.add(st.nextToken());
 }
 return output;
 }
 public static String[] getArray(String Utterance) {
 StringTokenizer st = new StringTokenizer(Utterance);
 String[] output = new String[st.countTokens()];
 for (int n = 0; n < output.length; n++) {
 output[n] = st.nextToken();
 }
 return output;
 }
 public static Object jsEval(String in) {
 try {
 return jsEngine.eval(in);
 } catch (ScriptException se) {
 log.error(String.format("Error evaluating %s.", in), se);
 return null;
 }
 }
 /**
 * method for joining objects (more properly, their .toString()) with a
 * specific deliminator to produce a string of the form "a, b, c". based on
 * http://snippets.dzone.com/posts/show/91
 */
 public static String join(Iterable<? extends Object> objectCollection, String separator) {
 Iterator<? extends Object> iter = objectCollection.iterator();
 if (!iter.hasNext()) {
 return "";
 }
 StringBuilder out = new StringBuilder(String.valueOf(iter.next()));
 while (iter.hasNext()) {
 out.append(separator).append(iter.next());
 }
 return out.toString();
 }
 /**
 * searches through a collection (ArrayList, HashSet, etc) and determines if
 * the collection contains a particular searchFor string, IGNORING case.
 */
 public static boolean containsIgnoreCase(Collection<String> searchIn, String searchFor) {
 for (String eachElement : searchIn) {
 if (eachElement.equalsIgnoreCase(searchFor)) {
 return true;
 }
 }
 // if haven't already quit with true
 return false;
 }
 /**
 * searches through a Map<String, Object> (can be a hashmap, treemap, etc) and
 * returns the value associated with the key, IGNORING case. If not key
 * matched, returns null.
 */
 public static <T> T getIgnoreCase(Set<Entry<String, T>> entrySet, String searchForKey) {
 for (Entry<String, T> eachEntry : entrySet) {
 if (eachEntry.getKey().equalsIgnoreCase(searchForKey)) {
 return eachEntry.getValue();
 }
 }
 // if found nothing:
 return null;
 }
}
