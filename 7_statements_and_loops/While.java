/* While loop repreats a statement or block
while its controlling condition is true

Syntax: 
while(condition) {
  //body of loop
}
condition can be any Boolean expression
body will be executed so long as condition is true
curly braces are not needed if only a single statement
is being repeated
*/
public class While {
  public static void main(String args[]){
    int i, j;
    i = 10;
    j = 20;
    while( ++i < --j){
      ;
    }
    System.out.println("Midpoint is " + i);
  /*to execute body of a while loop at least once,
  you can use the do-while loop
  syntax: do {
    //body of loop
  } while(condition)
  */
  int n = 0;
    do {
      System.out.println("n:" + n);
    } while (--n > 0); //executes once even though condition not met
  }
}