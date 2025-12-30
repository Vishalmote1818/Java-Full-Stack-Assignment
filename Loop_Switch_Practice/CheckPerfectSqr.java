public class CheckPerfectSqr {
    
    public static void main(String[] args) {
        
        int n=16;

        int sqrroot=(int)Math.sqrt(n);

        if(sqrroot*sqrroot==n){

            System.out.println(n+" is a perfect square.");
        }
        else{
            System.out.println(n+" is not perfect square.");
        }
    }
}
