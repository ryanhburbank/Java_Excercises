/* A Java array variable has two parts
   array type and array object 
   The array type is the type of the array 
   variable the array object is the 
   memory allocated for an array variable

   when defining an array we can first 
   define the array type and
   allocate the memory later
   Syntax: 
   int[] myIntArray //Declare an integer 
   array variable the variable myIntArray 
   is now a type for an integer array
   No memory has been allocated to hold 
   an array itself

   Later we will allocate memory and 
   specify how many elements
   it can contain.

   the [] following the type indicates that 
   the variable is for any array of int values
   and not for storing a single value of type int

   alternative syntax : int myIntArray[];
   note: int[] form preferred since it
   indicates more clearly that the type is an array
   of values of type int

   Array Create: after you declare an array
   variable, you can define an array that it
   references
   myIntArray = new int[10]; //define an array of 10 integers
   creates an array of 10 integers and stores a reference to
   the array in the variable myIntArray

   Single statment declaration:
   int[] = myIntArray = new int[10];
   the keyword new indicates that you are allocating memory
   for the array, and int[10] specifies that the capacity
   is 10 variables of type int in the array
   
  Array initial values:
    after we allocate memory for a Java array, Java assigns
    each element in an array to its initial values.
   
    the initial value is zero in the case of an array of numerical
    values, is false for boolean arrays, is \'u0000' for arrays storing 
    type char, and is null for an array of objects of a class type.
  byte,int,short : 0, float: 0.0f, char: '\u0000', long: 0L, double: 0.0d,
  boolean: false, object reference: null

  Java array length: you can refer to the length of the array,
  aka the number of elements it contains, using length, a data
  member of the array object.

  syntax Array size, arrayName.length(), holds an array's length
  Code example below:
   */
  public class JavaArray {
    public static void main(String args[]) {
      int a1[] = new int[10];
      int a2[] = {1,2,3,4,5}; //no need to use new when initialized during declaration
      double a3[] = {4,3,2,1};
      double result = 0;
      System.out.println(a2[0]);
      for(int i = 0; i < 4; i++)
        result = result + a3[i];
      //loops are commonly used to access each element in an array
      System.out.println("Average is " + result / a3.length );
      //we can use a collection based loop instead of a numerical loop
      //when processing the values of the element of the array
      //syntax for(arrayType variableName: array){
        //process each variableName
      //}
      int days[] = {1,2,3};
      for(int i:days){
        System.out.println(i);
      }
    }
  }

