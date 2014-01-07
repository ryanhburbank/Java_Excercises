/* String class represents character strings
a quoted string constant can be assigned to a string
variable 

String literals in Java are specified by enclosing a
sequence of characters between a pair of double quotes
in Java Strings are object types.
Example: method that declares String type variable
*/

public class TypeString {
  public static void main(String[] argv){
    String str1 = "this is a test string";
    String str2 = new String(str1);
    System.out.println(str1);
    System.out.println(str1 + ".equals(" + str2 + ") -> " + str1.equals(str2)); //true as the characters are a match
    System.out.println(str1 + " == " + str2 + " -> " +(str1 == str2)); //false as they are different instances
  /* the equals() method and the == operator
  perform two different operations.  equals()
  method compares the characters inside a String 
  object.  The == operator compares two object 
  references to see whether they refer to the same
  instance. 
  */

    //following escapes the new line string and double quote string
  String s = "first line\nand second line";
  System.out.println("s is a " + s);
  s = "\"quotes\"";
  System.out.println("s is " + s);
  
  //The + operator can be used to concatenate strings
  String age = "23";
  s = "He is " + age + " years old.";
  System.out.println(s); 
  //concatenation can be used with other data types
  int year = 2014;
  s = "It is the year " + year + '.';
  System.out.println(s);
  //Be careful when mixing other operations with
  //concatentation
  s = "four: " + 2 + 2;// yields string 'four: 22'
  System.out.println(s);
  s = "four: " + (2 + 2); //yields string 'four: 4'
  System.out.println(s); 
  }
}