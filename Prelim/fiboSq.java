public class fiboSq{
   public static void main(String[] args){
   
      for(int i = 0; i <= 10; i++){
         System.out.println("fibonacci ("+i+")--> "+fibo(i));
      }
   
   }
   
   public static int fibo(int n){
      if(n <= 1) {
         return n;
      }
      return fibo(n - 1) + fibo(n - 2);
   }

}