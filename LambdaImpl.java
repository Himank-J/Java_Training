import java.util.*;

interface evenodd{
    public void even_odd(int num);
}

interface posneg{
    public void pos_neg(int num);
}

interface strupper{
    public String str_upper(String s) ;
}

class LambdaImpl{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        /*evenodd eo = (int num) -> {
            if (num%2 == 0){
                System.out.println("Input number is even");
            }
            else{
                System.out.println("Input number is odd");
            }
        };
        System.out.println("Input number:");
        int num = in.nextInt();
        eo.even_odd(num);*/
        
        /*posneg pn = (int num) -> {
            if (num<0){
                System.out.println("Input number is negative");
            }
            else{
                System.out.println("Input number is positive");
            }
        };
        System.out.println("Input number:");
        int num = in.nextInt();
        pn.pos_neg(num);*/

        strupper up = (String s) -> s.toUpperCase();
        System.out.println("Input string in lowercase:");
        String x = in.next();
        System.out.println(up.str_upper(x));
    }
}