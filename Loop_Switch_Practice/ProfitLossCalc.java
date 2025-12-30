public class ProfitLossCalc {
    
    public static void main(String[] args) {
        
        int selling_price=100;
        int cost_price=70;

        if(selling_price>cost_price){

            System.out.println((selling_price-cost_price)/cost_price);
        }
        else if(cost_price>selling_price){

            System.out.println((cost_price-selling_price)/cost_price);
        }
        else{

            System.out.println("No Profit, No Loss...");
        }
    }
}
