import java.util.Scanner;
public class test706{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
 int num;
 System.out.println("please enter a number");
 num=sc.nextInt();
  for (int lineCnt=1; lineCnt<=num; lineCnt++){
    for(int colCnt=1; colCnt<=lineCnt; colCnt++){
      System.out.print(colCnt);
    }
    System.out.println();
  }
  }
}
