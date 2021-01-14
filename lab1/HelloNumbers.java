public class HelloNumbers {
  public static void main (String[] args){
    int n = 0;
    int i = 0;
    while (n < 10) {
      i = n + i;
      System.out.print(i + " ");
      n = n + 1;
    }
    System.out.print("\n");
  }
}
