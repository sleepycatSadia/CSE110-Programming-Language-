import java.util.Scanner;

class test722 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("please enter a number");
    int n = scan.nextInt();
    int g = n-2;
    int h = 1;
    for(int i=0;i<n-1;++i){
      System.out.print(' ');
    }
    System.out.print('*');
    for(int i=0;i<n-1;++i){
      System.out.print(' ');
    }
    System.out.println();
    for(int i=0;i<n-1;++i){
      for(int j=0;j<g;++j){
        System.out.print(' ');
      }
      System.out.print('*');
      for(int j=0;j<h;++j){
        System.out.print(' ');
      }
      System.out.print('*');
      System.out.println();
      --g;
      h+=2;
    }
    g+=2;
    h-=4;
    for(int i=0;i<n-2;++i){
      for(int j=0;j<g;++j){
        System.out.print(' ');
      }
      System.out.print('*');
      for(int j=0;j<h;++j){
        System.out.print(' ');
      }
      System.out.print('*');
      System.out.println();
      ++g;
      h-=2;
    }
    for(int i=0;i<n-1;++i){
      System.out.print(' ');
    }
    System.out.print('*');
    for(int i=0;i<n-1;++i){
      System.out.print(' ');
    }
  }
}