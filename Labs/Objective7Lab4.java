public class Objective7Lab4 {
  public static void main(String[] args) {

    int sum = 0, count = 0;
    while(count <= 19) {
      count = count + 1;
      sum = count + sum;
    }
    if(count == 20) {
      System.out.println(sum);
    }
  }
}
