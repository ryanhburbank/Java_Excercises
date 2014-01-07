/* Byte is the smallest integer type, and is
useful when working with a stream of data
from a network or file.

Byte variables are declared by use of the byte keyword

size: byte is a signed( can represent neg & pos)
8-bit type with a range of -128-127
Example code:
*/
public class TypeByte {
  public static void main(String[] args) {
    byte b1 = 100;
    byte b2 = 20;
    System.out.println("Value of byte variable b1 is: " + b1);
    System.out.println("Value of byte variable b2 is: " + b2);
  }
}
/* Byte class wraps a value of primitive type byte in an object.
 byte class provides several methods for converting a byte to a String
 and a String to a byte
 */