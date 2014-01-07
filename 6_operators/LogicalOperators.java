/* Boolean logical operators
&  Logical AND
|  Logical OR
^  Logical XOR(exclusive OR)
|| Short-circuit OR
&& Short-circuit AND
short-circuit operands will not evaulate
right hand operand when the outcome can be 
determined by the left hand operand
!  Logical unary NOT
&= AND assignment
|= OR assignment
^= XOR assignment
== Equal to
!= Not equal to
?: Ternary if-then-else
The below example, demonstrates how the
operators work
*/
 
public class LogicalOperators {
  public static void main(String args[]) {
    boolean a = true;/*from j av a  2  s  . co  m*/
    boolean b = false;
    boolean c = a | b;
    boolean d = a & b;
    boolean e = a ^ b;
    boolean f = (!a & b) | (a & !b);
    boolean g = !a;

    System.out.println(" a = " + a);
    System.out.println(" b = " + b);
    System.out.println(" a|b = " + c);
    System.out.println(" a&b = " + d);
    System.out.println(" a^b = " + e);
    System.out.println("!a&b|a&!b = " + f);
    System.out.println(" !a = " + g);

    //example of short-circuit operation
    int denom = 0;
    int num = 3;
    if(denom != 0 && num / denom > 10) {
      System.out.println("Here");
    } else {
      System.out.println("There");
    }
    //we can turn of the short-circuit if we need
    int x = 0;
    int y = 99;
    int z = 0;
    if (x == 1 & y++ <100)
      z = 100;
    System.out.println("z is " + z);
    System.out.println("y is " + y);//operation completed though the first condition evaluated the statement to false
  }
}