/* If statement used to execute block of
code based on a condition
*/

public class IfElse {
  public static void main(String args[]){
    int num = 50;
    num += Math.random() * 100 + 1;
    if (num < 100) {
      System.out.println("num is less then 100!");
      if (num % 2 == 0){
        System.out.println("num is even!");
      } else {
        System.out.println("num is odd!");
      }
    } else if(num == 100){
      System.out.println("num is equal to 100!");
    } else {
      System.out.println("num is greater then 100!");
    }
  }
}