//Print numbers from 1 to 10 using a loop.

public class Print1to10{

    public static void main(String args[]){


        for(int i=1;i<=10;i++){

            System.out.println(i);
        }

    }

}


//Print numbers from 10 to 1.

public class Print10to1 {
    
    public static void main(String[] args) {
        
        for(int i=10;i>=1;i--){

            System.out.println(i);
        }
    }
}


// Print all even numbers between 1 and 50.

public class PrintEven1to50 {
    
    public static void main(String[] args) {
        
        for(int i=1;i<=50;i++){

            if(i%2==0){

                System.out.println(i);
            }
        }
    }
}


// Print all odd numbers between 1 and 50.

public class PrintOdd1to50 {
    
    public static void main(String[] args) {
        
        for(int i=1;i<=50;i++){

            if(i%2!=0){

                System.out.println(i);
            }
        }
    }
}

// Print the table of 5 using a loop.

public class Print5Table {
    
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++){

            System.out.println(5+" * "+i+" = "+(5*i));
        }
    }
}

// Print the table of any number (e.g., n = 7).

import java.util.Scanner;

public class PrintAnyTable {
    
public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        for(int i=1;i<=10;i++){

            System.out.println(n+ " * "+i+" = "+(n*i));
        }
}    
}

// Print Hello 10 times.


public class PrintHello10 {
    
    public static void main(String[] args) {
        
        for(int i=1;i<=10;i++){

            System.out.println("Hello!! ->  "+i);
        }
    }
}


// Print the sum of first 10 natural numbers.

public class Sum10NaturalNo {
    
    public static void main(String[] args) {
    
        int sum=0;
        for(int i=1;i<=10;i++){
            sum+=i;
        }

        System.out.println(sum);
    
    }
}

// Print the sum of even numbers from 1 to 100.

public class SumEven1to100 {
    
    public static void main(String[] args) {
        
        int sumEven=0;
        for(int i=1;i<=100;i++){

            if(i%2==0){
                sumEven+=i;
            }
        }

        System.out.println(sumEven);
    }
}

// Print the sum of odd numbers from 1 to 100.

public class SumOdd1to100 {
    
    public static void main(String[] args) {
        
        for(int i=1;i<=100;i++){

            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}



