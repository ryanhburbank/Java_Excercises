/* Boolean logical operators
&  Logical AND
|  Logical OR
^  Logical XOR(exclusive OR)
|| Short-circuit OR
&& Short-circuit AND
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

  }
}