public class GradeBasedRemark{

    public static void main(String[] args) {
        
        char grade='A';
        switch(grade){
            case 'A':
                System.out.println("Excellent...");
                break;
            
            case 'B':
                System.out.println("Better...");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Try to improve");
                break;

            case 'F':
                System.out.println("Failed...");    
                break;

            default:
                System.out.println("Invalid Grade....");    
        }
    }
}