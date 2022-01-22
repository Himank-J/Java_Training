import java.util.*;

public class MyDataType{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        /*
        int a = 10;
        float b = 10.0f;
        double d = 100.56;
        char c = 'A';
        String str = "Hello World";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(str);
        */

        /* Java Program to display input number
        System.out.println("Enter number: ");
        int num = in.nextInt();
        if (num > 0)
        {
            System.out.println(num+" is Positive");
        }
        else
        {
            System.out.println(num+" is Negative");
        }

        */
        /*Java Program to add integer
        System.out.println("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Sum = "+(a+b));
        */

        /*Java Program to mutiply float values
        System.out.println("Enter two numbers: ");
        int a = in.nextFloat();
        int b = in.nextFloat();
        System.out.println("Result = "+(a*b));
        */

        /*Java program to find ascii value
        System.out.println("Enter character: ");
        char a = in.next().charAt(0);
        System.out.println("Ascii value of "+a+" is "+(int)a);
        */

        /* Java program to swap two numbers
        System.out.println("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Before Swap:");
        System.out.println("num1: "+a);
        System.out.println("num2: "+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap:");
        System.out.println("num1: "+a);
        System.out.println("num2: "+b);
        */

        /* Find even or odd number
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if (num%2==0)
        {
            System.out.println(num+" is even");
        }
        else
        {
            System.out.println(num+" is odd");
        }
        */

        /*
        System.out.println("Enter an Alphabet");
        char ch = in.next().charAt(0);
        switch(ch){
            case ('a'):
            case ('A'):
            case ('e'):
            case ('E'):
            case ('i'):
            case ('I'):
            case ('o'):
            case ('O'):
            case ('u'):
            case ('U'):
                    System.out.println("Vowel");
                    break;
            default:
                    System.out.println("Consonent");
        }            
        */

        /* largest number
        System.out.println("Enter 3 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(a>b && a>c)
        {
              System.out.println(a+" is the largest number");
        }
        else if(b>a && b>c)
        {
            System.out.println(b+" is the largest number");
        }
        else
        {
            System.out.println(c+" is the largest number");
        }
        */

        /* leap year
        System.out.println("Enter year");
        int year = in.nextInt();

        if (((year%4==0) && (year%100!=0)) || (year%400==0))
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }
        */
    }
}