package org.javaTutorials;
import org.javaTutorials.MathOperation;
import org.javaTutorials.MathHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MathOperation mathOperation=new MathOperation();
        MathHelper mathHelper= new MathHelper();

        /**
         * calls add method
         */
        System.out.println("Addition  " + mathOperation.add(10,8));
        /**
         * calls subtract method
         */
        System.out.println("Subtraction  "+ mathOperation.subtract(10,8));
        /**
         * calls multiplication method
         */
        System.out.println("Multiplication "+ mathOperation.multiply(10,8));
        /**
         * calls Division method
         */
        System.out.println("Divide "+ mathOperation.division(10,8));
        System.out.println("Remainder = " + mathHelper.remainder(10,8));
    }
}
