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
   public static int[] distNHeads(int nCoin, double p, int nReps){
      /*Flip nCoin coins with odds p. Repeat the experiment nReps
      times, keeping track of how often you see each result.
      Inputs:
         int nCoin: how many coins to flip in each trial
         double p: the odds of heads on each flip
         int nReps: the number of times to repeat the experiment
      Outputs:
         return: an int[] showing how often you got each total # of
                 heads. (the index of the array is the num. of
                 heads seen in a given trial, the value of the
                 array is how many trials you saw that many heads)
      Ex.
      distNumHeads(1, 1.0, 100) -> [0, 100]
      distNumHeads(2, 0.5, 20)  -> [4, 11, 5]
      distNumHeads(4, 0.5, 10)  -> [1, 3, 4, 1, 1]
      */
      
    
   }


}