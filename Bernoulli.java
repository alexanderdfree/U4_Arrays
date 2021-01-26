public class Bernoulli{
   public static boolean flipCoin(double p){
   /*Flip a possibly unfair coin with probability of heads p
   Input:
      double p: the probability of heads [0.0-1.0]
   Output:
      return: whether or not the result is heads
   Ex.
   flipCoin(0.5) -> true
   flipCoin(0.5) -> false
   flipCoin(0.1) -> false
   flipCoin(0.9) -> true
   */
   double coinFlip = Math.random();
   if (coinFlip < p) return true;
   else return false;
   
   
   }
   
   public static int numHeads(int nCoin, double p){
      /*Return the number of heads after flipping nCoins with 
      probability of heads p
      Input:
         int nCoin: the number of coins to flip
         double p: the odds of getting heads [0.0-1.0]
      Output:
         return: the number of times you got heads
      Ex.
      numHeads(100, 1.0) -> 100
      numHeads(100, 0.5) -> 52
      numHeads(100, 0.1) -> 8
      */
      int tracker = 0;
      
      for (int i = 0; i < nCoin; i++){
         if (flipCoin(p)){
            tracker++;
         }
      }
      return tracker;
   
   
   
   }


}