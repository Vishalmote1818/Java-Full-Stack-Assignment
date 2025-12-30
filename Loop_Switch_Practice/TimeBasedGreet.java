import java.util.Scanner;

public class TimeBasedGreet{
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the time in 24 hour time format: ");
        int time=sc.nextInt();

        sc.close();
        
        if(time>=10 && time<=11){
            System.out.println("Good Mornning...");
        }
        else if(time>=12 && time<=16){
            System.out.println("Good Afternoon...");
        }
        else if(time>=17 && time<=20){

            System.out.println("Good Evening...");
        }
        else{
            System.out.println("Good Night...");
        }
    }
}