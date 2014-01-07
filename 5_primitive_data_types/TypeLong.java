/* Long type is used when an int 
 is not large enough, it is a 64 bit signed type

 To specify a long literal you tell the compiler
 that the literal value is of type long by appending an upper
 or lowercase L to the literal
 for example: 123123123123L or 0x7ffffffffffffffL

The following code creates a long type literal and assigns it to 
a long type variable
*/
public class TypeLong {
  public static void main(String args[]) {
    long l = 0x7ffffffffffffffL;
    long p = 0000000000000011L;
    System.out.println("l is " + l);
    System.out.println("p is " + p);
    //The below result could not be stored in an int
    long result = (long)Integer.MAX_VALUE * (long)10;
    System.out.println(result);
  }
}