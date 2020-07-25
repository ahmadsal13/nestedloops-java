public class Main {

  public static void main(String[] args) {
    try {
      int[] a = { 4 };
      System.out.println(a[1]);
    } catch (NullPointerException e) {
      System.out.println("man you are really freaking stupid you know you can not do this!");
    }

    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("even worse");
    }

    catch (Exception e) {
      System.out.println("still stupid");
    }

  }

  // try catch java examples
}
