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