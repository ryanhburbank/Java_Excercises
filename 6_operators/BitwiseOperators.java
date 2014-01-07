/* Bitwise operators act upon the 
individual bits of their operand.  Java
bitwise operators can be applied to the integer
types: long, int, short, char, and byte.

>> :shift right
>>> shift right fill
<< shift left
>>= shiftwise right assignment
>>> shift right zero fill assignment
<<= shift left assignment
^= exclusive OR assignment
Example demonstrates some bitwise operations
*/
public class BitwiseOperators {
  public static void main(String args[]){
    int a = 1;
    int b = 20;
    int c = 3;
    a |= 3;
    System.out.println(a);
    b >>= 2;
    System.out.println(b);
    c <<= 1;//previously 011(3), now 110(6)
    //each shift left doubles original value
    //each shift right halves original value
    System.out.println(c);
  
    //the unsigned higher order operator >>>
    //always shifts zeros into the higher order
    //bit as value >> num, which num specifying
    //the number of positions to shift 
    int ahh = -1;
    ahh = ahh >>> 24;
    System.out.println("a is " + ahh);  
  }
}