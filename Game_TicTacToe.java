import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Game_TicTacToe
{
static ArrayList<Integer> playerPos = new ArrayList<Integer>();
static ArrayList<Integer> cpuPos = new ArrayList<Integer>();
static int cpos,ppos;
public static void main(String args[])
{
char[][] gameBoard = {{'1','|','2','|','3'},
 {'-','+','-','+','-'},
 {'4','|','5','|','6'},
 {'-','+','-','+','-'},
 {'7','|','8','|','9'}};
print(gameBoard);
while(true)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the position where you need to place X");
ppos = sc.nextInt();
try
{
int numInput = ppos;
if (!(numInput > 0 && numInput <= 9))
{
System.out.println("Invalid input; re-enter slot number:");
continue;
}
}
catch (InputMismatchException e)
{
System.out.println("Invalid input; re-enter slot number:");
continue;
}
while(playerPos.contains(ppos) || cpuPos.contains(ppos))
{
System.out.println("position is taken already......");
System.out.println("Choose another position");
ppos = sc.nextInt();
}
play(gameBoard,ppos,"player");
String result = checkWinner();
if(result.length()>0)
{
print(gameBoard);
System.out.println(result);
break;
}
comp c = new comp();
Random ran = new Random();
int a = c.cpuWin(gameBoard);
cpos = ran.nextInt(9) + 1;
while(playerPos.contains(cpos) || cpuPos.contains(cpos))
{
cpos = ran.nextInt(9) + 1;
}
if(a == 0)
{
play(gameBoard,cpos,"cpu");
}
else
{
cpos = a;
play(gameBoard,cpos,"cpu");
}
print(gameBoard);
result = checkWinner();
if(result.length()>0)
{
System.out.println(result);
break;
}
}
}
public static void print(char[][] board)
{
for(char[] row : board)
{
for(char c : row)
{
System.out.print(c);
}
System.out.println();
}
}
public static void play(char[][] gameBoard,int pos,String user)
{
char symbol = 'X';
if(user.equals("player"))
{
symbol = 'X';
playerPos.add(pos);
}
else if(user.equals("cpu"))
{
symbol = 'O';
cpuPos.add(pos);
}
switch(pos)
{
case 1:
if(gameBoard[0][0] !='X' | gameBoard[0][0] !='O' )
{
gameBoard[0][0] = symbol;
}
else
{
System.out.println("Slot already taken; re-enter slot number:");
}
break;
case 2:
gameBoard[0][2] = symbol;
break;
case 3:
gameBoard[0][4] = symbol;
break;
case 4:
gameBoard[2][0] = symbol;
break;
case 5:
gameBoard[2][2] = symbol;
break;
case 6:
gameBoard[2][4] = symbol;
break;
case 7:
gameBoard[4][0] = symbol;
break;
case 8:
gameBoard[4][2] = symbol;
break;
case 9:
gameBoard[4][4] = symbol;
break;
}
}
public static String checkWinner()
{
List r1 = Arrays.asList(1,2,3);
List r2 = Arrays.asList(4,5,6);
List r3 = Arrays.asList(7,8,9);
List c1 = Arrays.asList(1,4,7);
List c2 = Arrays.asList(2,5,8);
List c3 = Arrays.asList(3,6,9);
List d1 = Arrays.asList(1,5,9);
List d2 = Arrays.asList(3,5,7);
List<List> win = new ArrayList<List>();
win.add(r1);
win.add(r2);
win.add(r3);
win.add(c1);
win.add(c2);
win.add(c3);
win.add(d1);
win.add(d2);
for(List l : win)
{
if(playerPos.containsAll(l))
{
return "***********congratulations....you have won***********************";
}
else if(cpuPos.containsAll(l))
{
return "!!!!!!! oops cpu have won !!!!!!!!";
}
else if(playerPos.size() + cpuPos.size() == 9)
{
return "draw";
}
}
return "";
}
}
class comp
{
public static int cpuWin(char[][] board)
{
for(int i = 0; i < 3; i++)
{
for(int j = 0; j < 3; j++)
{
if(board[0][0] == 'X' && board[0][2] == 'X' && board[0][4] == '3')
{
return 3;
}
else if(board[0][0] == 'X' && board[0][4] == 'X' && board[0][22] == '2')
{
return 2;
}
else if(board[0][2] == 'X' && board[0][4] == 'X' && board[0][0] == '1')
{
return 1;
}
else if(board[2][0] == 'X' && board[2][2] == 'X' && board[2][4] == '6')
{
return 6;
}
else if(board[2][0] == 'X' && board[2][4] == 'X' && board[2][2] == '5')
{
return 5;
}
else if(board[2][2] == 'X' && board[2][4] == 'X' && board[2][0] == '4')
{
return 4;
}
else if(board[4][0] == 'X' && board[4][2] == 'X' && board[4][4] == '9')
{
return 9;
}
else if(board[4][0] == 'X' && board[4][4] == 'X' && board[4][2] == '8')
{
return 8;
}
else if(board[4][2] == 'X' && board[4][4] == 'X' && board[4][0] == '7')
{
return 7;
}
else if(board[0][0] == 'X' && board[2][0] == 'X' && board[4][0] == '7')
{
return 7;
}
else if(board[0][0] == 'X' && board[4][0] == 'X' && board[2][0] == '4')
{
return 4;
}
else if(board[4][0] == 'X' && board[2][0] == 'X' && board[0][0] == '1')
{
return 1;
}
else if(board[0][2] == 'X' && board[2][2] == 'X' && board[4][2] == '8')
{
return 8;
}
else if(board[0][2] == 'X' && board[4][2] == 'X' && board[2][2] == '5')
{
return 5;
}
else if(board[4][2] == 'X' && board[2][2] == 'X' && board[0][2] == '2')
{
return 2;
}
else if(board[0][4] == 'X' && board[2][4] == 'X' && board[4][4] == '9')
{
return 9;
}
else if(board[0][4] == 'X' && board[4][4] == 'X' && board[2][4] == '6')
{
return 6;
}
else if(board[4][4] == 'X' && board[2][4] == 'X' && board[0][4] == '3')
{
return 3;
}
else if(board[0][0] == 'X' && board[2][2] == 'X' && board[4][4] == '9')
{
return 9;
}
else if(board[0][0] == 'X' && board[4][4] == 'X' && board[2][2] == '5')
{
return 5;
}
else if(board[4][4] == 'X' && board[2][2] == 'X' && board[0][0] == '1')
{
return 1;
}
else if(board[0][4] == 'X' && board[2][2] == 'X' && board[4][0] == '7')
{
return 7;
}
else if(board[0][4] == 'X' && board[4][0] == 'X' && board[2][2] == '5')
{
return 5;
}
else if(board[4][0] == 'X' && board[2][2] == 'X' && board[0][4] == '3')
{
return 3;
}
}
}
return 0;
}
}
