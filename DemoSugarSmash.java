class SugarSmashPlayer
{
 int ID;
 String screenName;
 protected int[] scores = new int[10];
 void setId(int num)
 {
 ID = num;
 } 
 void setName(String player)
 {
 screenName = player;
 }
 void setScore(int score, int level)
 {
 if (level == 0)
 { scores[level] = score;}
 else
 {
 if (scores[level - 1] >= 100 && level < scores.length)
 {scores[level] = score;}
 else
 {
 System.out.println("Invalid score");
 }
 }
 }
 int getId()
 {
 return ID;
 }
 String getName(){
 return screenName;
 }
 int getScore(int level)
 {
 if (level >= scores.length)
 {
 System.out.println("Invalid game level"); 
 return 0;
 }
 else{
 return scores[level];

 }
 }
}
class PremiumSugarSmashPlayer extends SugarSmashPlayer
{
 protected int[] scores = new int[50];
 void setScore(int score, int level)
 {
 if (level == 0)
 { scores[level] = score;}
 else
 {
 if (scores[level - 1] >= 100 && level < scores.length)
 {scores[level] = score;}
 else
 {
 System.out.println("Invalid score");
 }
 }
 }
 int getScore(int level)
 {
 if (level >= scores.length)
 { 
 System.out.println("Invalid game level");
 return -1;
 }
 else{
 return scores[level];

 }
 }
}
public class DemoSugarSmash
{
 public static void main(String[] args)
 {
 SugarSmashPlayer ss = new SugarSmashPlayer();
 PremiumSugarSmashPlayer ps = new PremiumSugarSmashPlayer();
 ss.setName("Jhon");
 ss.setId(1519);
 int a= 100;
 for(int i = 0;i<10;i++){
 ss.setScore(a,i);
 a=a+100;
 }
 String name = ss.getName();
 int n = ss.getId();
 System.out.print(name + " of player Id " + n + " Scores are ");
 int o;
 for(int j=0;j<10;j++){
 o=ss.getScore(j);
 System.out.print(o + " ");
 
 }
 System.out.println();
 ps.setId(9562);
 ps.setName("Vicky");
 int b= 100;
 for(int k = 0;k<50;k++){
 ps.setScore(b,k);
 b=b+100;
 }
 name = ps.getName();
 n=ps.getId();
 System.out.print(name + " of player Id " + n + " Score at 17th level is ");
 System.out.print(ps.getScore(16));
 }
}