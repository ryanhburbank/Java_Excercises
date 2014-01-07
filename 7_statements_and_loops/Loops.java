/* for loop statement
syntax:
for(initialization; condition; iteration)
 statement;

 Java loop has three parts
 initialization sets a loop control variable to 
 an initial value

 condition is a Boolean expression that tests the loop control
 variable.  If condition is true, the for loop continues to iterate. 
 If condition is false, the loop terminates.
 The iteration determines how the loop control variable is changed
 each time the loop iterates
Example: Simple loop example below:
*/

public class Loops {
  public static void main(String args[]) {
    int i;

    for(i = 0; i < 10; i = i + 1)
      System.out.println("This is i: " + i);
  /*java allows for two or more variables
   to control a for loop. You can include 
   statements in both the initialization and 
   iteration portions of the for loop.  Each statement
   is seperated from the next by a comma.  
   Example:
   for(int a = 1, b = 4; a < b; a++, b--)
   the three sections of the for loop can
   be used for any purpose and parts of the
   loop can be empty
   example: 
   for(; !done;) {
    if(i == 10)
    done = true;
    i++;
   }
   */
   //second loop makes 10 dots first, then 9, etc...
    for (int t = 0; t < 10; t++) {
      for (int n = t; n < 10; n++)
        System.out.print(".");
      System.out.println();/*ja v  a2  s  . c  om*/
    }
  }
}
