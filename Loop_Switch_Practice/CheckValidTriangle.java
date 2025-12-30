public class CheckValidTriangle {
    
    public static void main(String[] args) {
        
        int a=7;
        int b=12;
        int c=10;

        if(a+b>c && b+c>a && a+c>b){

            System.out.println("Valid Triangle...");
        }
        else{
            System.out.println("Invalid Triangle..");
        }
    }
}
