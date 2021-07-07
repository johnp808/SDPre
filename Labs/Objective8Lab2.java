public class Objective8Lab2 {
  public static void main(String[] args) {
    for (int num =0, sum = 0; sum < 211; num++){
      sum = num + sum;
      if (sum == 210) {
        System.out.println(sum);
      }
    }
  }
}
