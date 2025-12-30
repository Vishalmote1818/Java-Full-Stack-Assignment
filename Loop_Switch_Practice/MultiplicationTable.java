public class MultiplicationTable {
    
    public static void main(String[] args) {
        
        int n=7;

        // Multiplication table using for loop.

        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }

         // Multiplication table using while loop.

         int i=1;
         while(i<=10){

            System.out.println(n+" * "+i+" = "+n*i);
            i++;
         }


         // Multiplication table using while loop.

      //   int i=1;
         do{

            System.out.println(n+" * "+i+" = "+n*i);
            i++;
         }
         while(i<=10);


    }
}
