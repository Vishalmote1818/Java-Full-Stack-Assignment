import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {
       

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int n1=sc.nextInt();
        System.out.println("Enter the Operator: ");
        char operator=sc.next().charAt(0);

        System.out.println("Enter the 2nd number: ");
        int n2=sc.nextInt();
        
        switch(operator){

            case '+':
                System.out.println("Addition of "+n1+" and "+n2+" is: "+(n1+n2));
                break;
            
            
            case '-':
                System.out.println("Substraction of "+n1+" and "+n2+" is: "+(n1-n2));
                break;

            
            case '*':
                System.out.println("Multiplication of "+n1+" and "+n2+" is: "+(n1*n2));
                break;

            
            case '/':
                System.out.println("Division of "+n1+" and "+n2+" is: "+(n1/n2));
                break;    

            
            case '%':
                System.out.println("Remainder of "+n1+" and "+n2+" is: "+(n1+n2));
                break;

            default:
                System.out.println("Invalid Operators!!");
                break;

        }
    }
}
