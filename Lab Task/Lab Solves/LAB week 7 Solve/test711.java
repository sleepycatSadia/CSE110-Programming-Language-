 import java.util.Scanner;
  public class test711{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int num;
      System.out.println("please enter a number");
      int i=0;
      num=sc.nextInt();
      for(int lineCnt=1; lineCnt<=num; lineCnt++){
        for(int sCnt=1; sCnt<=(num-lineCnt); sCnt++){
          System.out.print(" ");
        }
        for(int colCnt=num-i; colCnt<=num; colCnt++){
          System.out.print(colCnt);
          
        }
        System.out.println();
        i=i+1;
    }
    }
  }