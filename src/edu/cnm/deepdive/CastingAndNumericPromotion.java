package edu.cnm.deepdive;

/*
RULES

1. When two values have different data types, Java will auto promote the value with the smaller
data type to that of the larger one.
2. When one of the values is integral (byte, short, int, long) and the other is floating-point (float,
double, Java will auto promote the integral value to the floating-point value's data type.
3. Small data types (byte, short and char) are first promoted to int any time they are used with a
binary arithmetic operator, even when neither of the operands is an int.
4. After all promotion has finished and the operands are of the same data type, the result value will
have the same data type as its promoted operands.
 */

public class CastingAndNumericPromotion {

  public static void main(String[] args) {
    //promotion is converting smaller into bigger type.
    int x = 5;
    double y = 10.55;
    //System.out.println("x + y = " + x + y); Don't do this. This is String concatenation.
    System.out
        .println("x + y = " + (x + y));//outcome is 15.55 (x has been promoted to being a double
    //5.00.

    byte b = 10;
    int c = 5;
    double d = 4.5;

    double result = b + c + d;
    System.out.println("result = " + result);

    // casting is converting bigger type into smaller type.

    double myDouble = 5.55;
    //int myInt = 4 + myDouble; doesn't work because Java promotes the int 4 to a double which you
    //then try to assign to an int. Here casting comes into play.
    int myInt = 4 + (int)myDouble;// everything after the decimal point will be truncated. Result will
    //be 9.
    System.out.println("result = " + myInt);

    int anotherInt = 125;
    byte myBite = 15;
    int intResult = anotherInt + myBite;
    //byte byteResult = anotherInt + myBite; gives a compilation error because byte has been promoted
    //to int and the sum of the two ints doesn't not fit in byteResult.
    //byte byteResult = (byte)anotherInt + myBite; this will not compile because myBite has been promoted
    //to an int on the moment the + keep into play. Needed is casting the outcome to byte like so:
    byte byteResult = (byte)(anotherInt + myBite);
    System.out.println("intResult = " + intResult);
    System.out.println("byteResult = " + byteResult);// a byte can only take values up to 127 so wraps
    //around to the negative numbers. This is called overflow.
  }
}
