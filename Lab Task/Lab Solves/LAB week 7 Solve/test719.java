import java.util.Scanner;
  public class test719{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int num;
      System.out.println("please enter a number");
      num=sc.nextInt();
      for(int lineCnt=num; lineCnt>=1; lineCnt--){
        for(int sCnt=lineCnt-1; sCnt>=1; sCnt--){
          System.out.print(" ");
        }
        for(int colCnt=lineCnt; colCnt<=num; colCnt++){
          if((lineCnt==num||lineCnt==1)){
          System.out.print(colCnt);
          }
          else if(colCnt==lineCnt||colCnt==num){System.out.print(colCnt);}
          else{
            System.out.print(" ");
            }
        }
        System.out.println();
      }
    }
  }