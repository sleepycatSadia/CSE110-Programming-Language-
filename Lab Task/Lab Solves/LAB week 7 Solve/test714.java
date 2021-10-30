import java.util.Scanner;
  public class test714{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int num1;
      int num2;
      System.out.println("please enter line number");
      num1=sc.nextInt();
      System.out.println("please enter column number");
      num2=sc.nextInt();
      for(int lineCnt=1; lineCnt<=num1; lineCnt++){
        for(int colCnt=1; colCnt<=num2; colCnt++){
          if(lineCnt==1||lineCnt==num1||colCnt==1||colCnt==num2){
          System.out.print("*");
          }
          else{
            System.out.print(" ");
        }
        }
        System.out.println();
      }
    }
  }