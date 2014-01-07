/* For each iterates elements in a sequence
 without using a loop counter

 syntax: 
 for (type variable_name:array){
 the type must be compatible with the array type 
 }
 */
 public class ForEach {
  public static void main(String args[]){
    String[] arr = new String[]{"testing","this","is","Ryan"};
    for(String s:arr){
      System.out.println(s);
    }
  //for-each useful when searching an for an element in an array
    int nums[] = { 6, 8, 3, 7, 2, 5, 1, 4 };
    int val = 5;
    boolean found = false;
   
    for (int x : nums) {
      if (x == val) {
        found = true;
        break;
      }
    }
    if (found)
      System.out.println("Value found!");
  }
 }