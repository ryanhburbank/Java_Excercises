/* Double type represents double-precision
numbers
double is 64-bit width 
example: program that uses double variables to 
compute the area of a circle
*/
public class TypeDouble {
  public static void main(String args[]){
    double pi, r, a;
    r = 10.8888; //radius of circle
    pi = 3.1415926; //pi(approx)
    a = pi * r * r;
    System.out.println("Area of circle is " + a);
  
    double d = 3.14159D; // explicit specification
        // of a double literal by appending a D or d
    double d1 = 6.022E23; //
    /*sci-notation uses a 
    standard notation,. floating point # plus
     a suffix that specifies a power of 10 by
    which the number is multiplied.  The
    exponent is indicated by an E or e followed by a
    positive or negative decimal number */
    System.out.println(1.0/0.0);
    /* floating point calculations are 
    capable of returning +infinity, -infinity
    +0.0, -0.0, and NaN.  Dividing a positive
    number by 0.0 returns infinity.
    */
    System.out.println(-1.0/0.0);
    //Dividing a negative by 0.0 yields -infinity
    System.out.println(0.0/0.0);
    //dividing 0.0 by 0.0 yields NaN
    System.out.println(Math.sqrt(-25));
    //square root of a negative yields NaN.
    System.out.println(1.0/(1.0/0.0));//yields +0.0
    //dividing a positive by infinity yields +0.0
    System.out.println(-1.0/(1.0/0.0));
    //dividing a negative by infinity yeilds -0.0
  }
}
/* double type numbers have decimal values with 
a fractional component.  They can be expressed in either
standard or scientific notation.  Standard notation consists
of a whole number component followed by a decimal point 
followed by a fractional component. 
For example 2.0, 3.14159, 0.6667
*/

