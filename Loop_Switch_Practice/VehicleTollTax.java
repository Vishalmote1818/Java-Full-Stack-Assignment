import java.util.Scanner;

public class VehicleTollTax{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Vehicle name: ");
        String vehicle=sc.nextLine();

        switch(vehicle){

            case "Car":
                System.out.println("Toll Tax: "+100);
                break;
            
            case "Bus":
                System.out.println("Toll Tax: "+150);
                break;

            case "Truck":
                System.out.println("Toll Tax: "+200);
                break;

            case "Bike":
                System.out.println("No Toll Tax Applicable");
                break;

            default:
                System.out.println("Invalid Bike Type");
                break;
        }
    }
}