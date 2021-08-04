public class Milli {
  public static void main(String[] args) {
    int result = 0;
    long start = System.currentTimeMillis();

    for(int i = 0; i < 10000000; i++) {
      result += i;
    }
    long end = System.currentTimeMillis();
    System.out.println((end - start) + " ms");
  }
}
