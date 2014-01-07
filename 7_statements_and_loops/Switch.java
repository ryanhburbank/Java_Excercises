/* Switch statements is a multiway branch statements
better alternative than a large series of if-else-if
statements

General form of switch statement below
*/
import java.util.*;

public class Switch {
  public static void main(String args[]) {
    int coin = (Math.random() < 0.5)?0:1;
    for (int i = 0; i < 6; i++)
      switch (i) {
        case 0:/* j a  v  a2 s.  c om*/
          System.out.println("i is zero.");
          break;

        case 1:
          switch(i + coin){
           case 1: 
            System.out.println("i is one.");
            break;
           case 2:
            System.out.println("i is now two.");
            break; 
           }
          System.out.println("case 1 complete.");
          break;

        case 2:
          System.out.println("i is two.");
          break;

        case 3:
          System.out.println("i is three.");
          break;

        default:
          System.out.println("i is greater than 3.");
      }
      Random rand = new Random();
      int x = rand.nextInt(2);
      System.out.println(x);
  }
}