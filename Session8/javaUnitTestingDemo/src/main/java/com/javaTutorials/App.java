package com.javaTutorials;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MathOperation mathoperation=new MathOperation();
        int a=7;
        int b=5;
        /**
         * Autoboxing
         */
        Integer number1=Integer.valueOf(a);
        Integer number2=Integer.valueOf(b);


        System.out.println( "Addition--" + mathoperation.add(number1,number2));
        System.out.println("Subtraction--"+ mathoperation.subtract(number1,number2));
        System.out.println("Multiply--"+ mathoperation.multiply(number1,number2));
        System.out.println("Division--"+mathoperation.divide(number1,number2));
    }
}
