import java.util.*;

public class count_digits_in_a_number {

  public static void main(String[] args) {
    // Write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    // find diviser 
  int div = 1;
  int temp = n;
  while(temp >= 10){
      temp  = temp / 10;
      div = div * 10;
  }
  while(div >= 1){
      int q = n / div;
      int r = n % div;
      System.out.println(q);
      n = r;
      div = div / 10; 
  }
  }
}