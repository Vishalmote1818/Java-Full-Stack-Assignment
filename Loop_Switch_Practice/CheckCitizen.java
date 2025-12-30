public class CheckCitizen {
    
    public static void main(String[] args) {
        
        int age=70;
        char gender='M';

        if(age>60 && gender=='F'){
            System.out.println("Senior Women Citizen...");
        }
        else if(age>60 && gender=='M'){
            System.out.println("Senior Men Citizen...");
        }
        else{
            System.out.println("Not a Senior Citizen...");
        }
    }
}
