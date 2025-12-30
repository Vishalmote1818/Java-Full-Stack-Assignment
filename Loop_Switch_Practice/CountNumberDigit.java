public class CountNumberDigit {
    
    public static void main(String[] args) {
        
        int n=1234;
        int count=0;

        while(n>0){

            int rem=n%10;
            n/=10;
            count++;
        }

        System.out.println("Digits: "+count);
    }
}
