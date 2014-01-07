/* char stores up to 65,536 characters
 unicode is used to represent characters
 characters are indices(index positions) 
 in  the Unicode character set.  
*/

 public class TypeChar {
  public static void main(String args[]) {
    char ch1, ch2;
    ch1 = 88; //Unicode index position,
             // points to 'Y'
    ch2 = 'Y';

    System.out.print("ch1 and ch2: ");
    System.out.println(ch1 + " " + ch2);
    System.out.println("Incrementing ch1 by 1...");
    ch1 += 1;
    System.out.println("ch1 now set to " + ch1);
    //ch1 & ch2: X Y

    /* to store unicode literal in a char variable
       the following format is used '\uxxxx'
    */
  }
 }

 /* '\' is for the single-quote character.
 '\n' is for the newline character.
 for octal notation, use backslash with a 3 digit number
 example: '\141' is the letter 'a'
 for hexadecimal, enter a backslash-u(\u), then exactly 4
 hexadecimal digits.  For example '\u0061' is 'a' because the top byte is 0
 '\ua432' is a Japanese character

 Escape Value List add to '\':
 ddd :octal character
 uxxxx : hexadecimal character
 ' : single quote
 " : double quote
 \ : backslash
 r : carriage return
 n : new line
 f : form feed
 t : tab
 b : backspace
 */