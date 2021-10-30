import java.util.Scanner;
  public class test717{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int num;
      System.out.println("please enter a number");
      num=sc.nextInt();
      for(int lineCnt=1; lineCnt<=num; lineCnt++){
        for(int colCnt=1; colCnt<=lineCnt; colCnt++){
          if(lineCnt==num||colCnt==1||lineCnt==colCnt){
          System.out.print(colCnt);
          }
          else{
            System.out.print(" ");
        }
        }
        System.out.println();
    }
  }
  }