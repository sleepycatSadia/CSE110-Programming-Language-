import java.util.Scanner;
public class test720{
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    int row_cnt,col_cnt,s_cnt;
    for(row_cnt=1;row_cnt<=3;row_cnt++){
      for(s_cnt=1;s_cnt<=(3-row_cnt);s_cnt++){
        System.out.print(" ");
      }
    
      for(col_cnt=1;col_cnt<=(row_cnt*2)-2;col_cnt++){
        if(row_cnt==2&&col_cnt==2){
          System.out.print(" ");
        }
        else{
        System.out.print("*");
      }
      }
      System.out.println("*");
    }
    System.out.println();
  }
}