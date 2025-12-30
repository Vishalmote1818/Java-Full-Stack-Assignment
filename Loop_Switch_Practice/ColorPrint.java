import java.util.Scanner;

public class ColorPrint {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the color first letter: ");
        char ch=sc.next().charAt(0);

        switch(ch){

            case 'R':
                System.out.println("Red Color");
                break;
            
            case 'G':
                System.out.println("Green Color");
                break;

            case 'B':
                System.out.println("Blue Color");
                break;

            case 'Y':
                System.out.println("Yellow Color");
                break;

            default:
                System.out.println("Invalid Color");
        }
    }
}
