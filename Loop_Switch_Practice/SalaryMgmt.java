import java.util.Scanner;

public class SalaryMgmt {
    
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the salary: ");
        int salary=sc.nextInt();

        if(salary<=50000){

            System.out.println("No Tax Applicable");
        }
        else if(salary> 50000 && salary<100000){

            System.out.println("Salary After 10% Tax: "+(salary-(salary*0.10)));
        }
        else{

         System.out.println("Salary After 25% Tax: "+(salary-(salary*0.25)));

        }

        sc.close();
    }
}
