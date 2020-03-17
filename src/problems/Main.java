package problems;

public class Main {

  public static void main(String[] args) {
    System.out.println(fib(5));
  }

  public static int fact(int n){
      if(n==0) return 1;
      return n*fact(n-1);
  }

  public static int fib(int n){
      if(n==0) return 1;
      if(n==1) return 1;
      return fib(n-1)+fib(n-2);
  }
}
