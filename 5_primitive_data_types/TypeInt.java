/* Int type
  when byte and short values are used in an 
  expression they are promoted to int when
  the expression is evaluated

  size & value: int is a signed 32 bit type

  octal integer(base 8):
  Octal values are denoted in Java by a leading
  0.  valid value 09 will produce an error from the
  compiler, since 9 is outside out octals 0 to 7 range
  Example:
  */
  public class TypeInt {
    public static void main(String[] args) {
      int i = 010; //8
      int a = 020; //16
      int b = 017; //15

      System.out.println(i);
      System.out.println(a);
      System.out.println(b);

      /* hexadecimal matches with modulo 8
      word sizes, such as 8.16,32, and 64 bits
      you signify a hexadecimal constant with a
      leading zero-x, (0x or 0X)
      hex range is 0-15, with A-F taking the place of 10-15
      An integer literal can always be assigned to a long
      An integer can also be assigned to a char as long as it is within range
      */
      int f = 0X0002F;
      System.out.println(f); //points to 47
    }
  }