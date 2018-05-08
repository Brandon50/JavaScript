 public class summation{
       public static void main(String[] args) {
           int sum = sigma(3);
           System.out.println(sum);
       }

       public static int sigma(int n){
           int sum = 0;
           for (int i = 0; i <= n; i++) {
               sum += 1;
           }
           return sum;
       }
   }
