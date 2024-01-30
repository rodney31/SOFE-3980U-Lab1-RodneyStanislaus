package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App 
{
	/**
	* Main program:  The entry point of the program. The local time will be printed first,
	*      Then it will create two binary variables, add them and print the result.
	*
	* @param args: not used
	*/
    public static void main( String[] args )
    {
		System.out.println("============================");
		System.out.println("Example #1: Original Example");
		System.out.println("============================\n");

		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
		Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
		Binary sum= Binary.add(binary1,binary2);
		System.out.println( "Their summation is "+sum.getValue());
		Binary or = Binary.bitwiseOR(binary1, binary2);
		System.out.println( "Their OR is "+or.getValue());
		Binary and = Binary.bitwiseAND(binary1, binary2);
		System.out.println( "Their AND is "+and.getValue());
		Binary mult = Binary.multiply(binary1, binary2);
		System.out.println( "Their multiplication is "+mult.getValue());

		System.out.println("\n");

		System.out.println("==========");
		System.out.println("Example #2");
		System.out.println("==========\n");
		Binary binary3=new Binary("11011");
		System.out.println( "Third binary number is "+binary3.getValue());
		Binary binary4=new Binary("100");
		System.out.println( "Fourth binary number is "+binary4.getValue());
		Binary or2 = Binary.bitwiseOR(binary3, binary4);
		System.out.println( "Their OR is "+or2.getValue());
		Binary and2 = Binary.bitwiseAND(binary3, binary4);
		System.out.println( "Their AND is "+and2.getValue());
		Binary mult2 = Binary.multiply(binary3, binary4);
		System.out.println( "Their multiplication is "+mult2.getValue());


    }
}
