import java.util.Scanner;
public class test704{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int num1;
  System.out.println("please enter line number");
   num1=sc.nextInt();
  int num2;
  System.out.println("please enter column number");
  num2=sc.nextInt();
  for(int lineCnt=1; lineCnt<=num1; lineCnt++){
  for(int colCnt=1; colCnt<=num2; colCnt++){
    System.out.print(colCnt);
  }
    System.out.println();
  }
  }
}
 