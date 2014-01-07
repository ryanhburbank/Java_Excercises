/*
  Java Keywords and Reserved words:
  abstract, class, extends, implements, null, stictfp,
  true, assert, const, false, import, package, super, 
  try, boolean, continue, final, instanceof, private, switch,
  void, break, default, finally, int, protected, synchronized,
  volatile, byte, do, float, interface, public, this, while,
  case, double, for, long, return, throw, catch, else, goto, native,
  short, throws, char, enum, if, new, static, transient
*/

/* 
  An identifier is a word used by a progammer to name a 
  variable, method, class, or label.  Keywords and 
  reserved words may not be usedas identifiers.  An
  identifier must begin with a letter, $, or underscore,
  subsequent characters may be letters, $, underscores, 
  or digits
*/

/* 
identifiers are case sensitive
identifiers are used for class names, method names, 
and variable names.  An 
*/
// Example of valid identifiers
public class KeywordList {
  public static void main(String[] argv) {
    int ATEST, count, i1, $Atest, this_is_a_test;
  }
}
// Example of invalid identifiers
public class Main {
  public static void main(String[] argv){
    int 2count, h-l, a/b;
  }
}