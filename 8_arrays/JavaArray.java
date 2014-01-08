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
   */