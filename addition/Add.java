public class Add {
  public static void main(String args[]) {
    int num, num2; // a variable called num
    //in java variables must be declared before use
    num = 100;
    num2 = 200;
    if (num < num2) { //begining of block
      num = num2;
      num2 = 0;
      System.out.println("num == " + num);
      System.out.println("num2 == " + num2);
    } //end of block

    System.out.println("This is num: " + num);

    System.out.print("The sum of " + num + " and " + num2 + " is: ");
    System.out.println(num + num2);
  }
}