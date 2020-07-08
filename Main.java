public class Main {

  public static void main(String[] args) {
    welcome();
    divide(100, 25);
    multiply(4, 20);
    multiply(56, 90);
    multiply(120, 897);
    alexlee();
  }

  public static void welcome() {
    System.out.println("Welcome to our calculator!");
  }

  public static void multiply(int a, int b) {
    System.out.println(a * b);
  }

  public static void divide(int a, int b) {
    System.out.println(a / b);
  }

  public static void alexlee() {
    System.out.println("This dude is so awesome and he is teaching me alot in how to code!\n Watch his youtube channel!!!");
  }

  // methods are so much cleaner than having to type everything out

}

// also always use sysout as it print the code much faster