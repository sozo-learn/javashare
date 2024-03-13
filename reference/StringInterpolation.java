/**
 * to print a line with a variable
 * you _could_ use the plus sign _or_
 * (as i learned) you can interpolate with String.format _aaand_
 * (as i recently learned 😅) if what you want to 
 * print out an interpolated line, just use `printf`  
 */

public class MyClass {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;

      System.out.println("Sum of x+y = " + z);
      System.out.println(String.format("Sum of x+y = %d", z));
      System.out.printf("Sum of x+y = %d", z);
    }
}
