public class Main {

  public static void main(String[] args) {
    countBackword(14);
  }

  public static void countBackword(int n) {
    if (n == 0) {
      System.out.println("Nice job!");
    } else {
      System.out.println(n);
      n--;
      countBackword(n);
    }

  }
  // Java Intermediate 1
}
