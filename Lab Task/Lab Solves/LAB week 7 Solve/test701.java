import java.util.Scanner;
public class test701{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int num;
  System.out.println("please enter a number");
  num=sc.nextInt();
  for(int colCnt=1; colCnt<=num; colCnt++){
    System.out.print(colCnt);
  }
}
}