import java.util.Scanner;

public class PrintPatterns {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pattern : (1. Square, 2. Triangle, 3. Pyramid, 4. Diamond, 5. Reverse Triangle): ");
        int pattern=sc.nextInt();

        switch(pattern){

            case 1:
                for(int i=1;i<=5;i++){
                    for(int j=1;j<=5;j++){

                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
                
            case 2:
                 for(int i=1;i<=5;i++){
                    for(int j=1;j<=i;j++){

                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 3:
                for(int i=1;i<=5;i++){
                    
                    for(int j=i;j<=5;j++){
                        System.out.print(" ");
                    }

                    for(int k=1;k<=(2*i-1);k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            
            case 4:
                 for(int i=1;i<=5;i++){
                    
                    for(int j=i;j<=5;j++){
                        System.out.print(" ");
                    }

                    for(int k=1;k<=(2*i-1);k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }

                 for(int i=5;i>=1;i--){
                    
                    for(int j=i;j<=5;j++){
                        System.out.print(" ");
                    }

                    for(int k=1;k<=(2*i-1);k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

                case 5:
                     for(int i=5;i>=1;i--){
                    
                    for(int j=i;j<=5;j++){
                        System.out.print(" ");
                    }

                    for(int k=1;k<=(2*i-1);k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid pattern number.");
                break;



        }
    }
}
