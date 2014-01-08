/* We can specify a label for break statement
and let the code logic exit to that point
the following example uses the label to 
make break statement exit two layers of the nested
for loop
*/

public class BreakContinue {
  public static void main(String args[]) {
    outer: for (int i = 0; i < 10; i ++){
      for (int j = 0; j < 10; j++) {
        if (j + 1 < i) {
          System.out.println();
          continue outer; //breaks back to loop labeled 'outer'
        }
        System.out.print(" " + (i * j));
      }
    }
    System.out.println("Program terminated.");
  
    /* The continue statement forces an early iteration of a loop
    in while and do-while loops, a continue statement causes control to 
    be trasferred to the conditional expression that controls
    the loop.  Control goes first to the iteration portion, then 
    to the statement expression.  
    Example below: 
    */
    for (int i = 0; i < 10; i++) {
     System.out.print(i + " ");
     if( i % 2 == 0)
      continue; //control back to iteration(i++), then conditional( i < 10)
     System.out.println("");
    } 
    /* as with break, continue can continue to a specified label
    */
    outer: for (int m = 0; m < 10; m++) {
      for (int j = 0; j < 10; j++) {
        if (j > m) {
          System.out.println();/*j a v a2s.co m*/
          continue outer;
        }
        System.out.print(" " + (m * j));
      }
    }
    System.out.println();
  }
}