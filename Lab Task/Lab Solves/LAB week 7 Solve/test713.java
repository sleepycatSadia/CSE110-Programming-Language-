import java.util.Scanner;
public class test713{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("please enter a number ");
    num=sc.nextInt();
    for(int lineCnt=1; lineCnt<=num; lineCnt++){
      for(int sCnt=1; sCnt<=num-lineCnt; sCnt++){
        System.out.print(" ");
      }
      for(int colCnt=1; colCnt<lineCnt*2; colCnt++){
        System.out.print(colCnt);
      }
      System.out.println();
    }
    for(int lineCnt=num-1; lineCnt>0; lineCnt--){
      for(int sCnt=1; sCnt<=num-lineCnt; sCnt++){
        System.out.print(" ");
      }
      for(int colCnt=1; colCnt<lineCnt*2; colCnt++){
        System.out.print(colCnt);
      }
      System.out.println();
    }
  }
}