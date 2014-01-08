/* In Java multidimensional arrays are actually arrays of arrays

syntax: 
the following declares a two dimensional array
variable called twoD
int twoD[][] = new int[4][5]; allocates a 4 * 5 array and
assigns it to twoD
below example uses nested loop to assign values to a two dimensional array
*/

public class Multidimensional {
  public static void main(String args[]) {
    int twoD[][] = new int[4][5];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        twoD[i][j] = i*j;/*from j a  v a  2  s.  c o  m*/
      }
    }
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.print(twoD[i][j] + " ");
      }
      System.out.println();
    }
  /*You can also allocate the remaining dimensions separately.
  int twoD[][] = new int[4][];
  twoD[0] = new int[5]; notice that with manual allocation, each
  dimension can have different #s of elements

  /*finally, you can initialize multiD arrays during declaration 
  by enclosing each dimensions initializer within its own set of 
  curly braces */

  double m[][] = {
      {0,1,2,3,4},
      {0,1,2,3,4}
    }; //creates m[2][4] size multiD array
  }
}  