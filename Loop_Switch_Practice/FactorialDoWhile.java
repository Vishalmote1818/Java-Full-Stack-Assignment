public class FactorialDoWhile {

    public static void main(String[] args) {

        int n = 5;

        int i = 1;
         int fact = 1;


        if (n <= 1) {
            System.out.println("factorial of " + n + " is: " + 1);

        }

        do {


            fact=fact*i;
            i++;

        } while (i <= n);

         System.out.println("factorial of " + n + " is: "+fact);

    }
}
