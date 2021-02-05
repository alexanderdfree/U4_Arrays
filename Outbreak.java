import java.util.*;
public class Outbreak{
   public static void ones(int[] arr){
      /*Overwrites the entries of arr with 1s
      Input:
         int[] arr: an array to overwrite
      Output: none
      Side Effects: arr is now full of 1s
      Ex.
      int[] a = new int[]{2, 3, 4}
      Arrays.toString(a) -> [2, 3, 4]
      ones(a)
      Arrays.toString(a) -> [1, 1, 1]
      */
      //go through all the entries in a
      for(int i = 0; i < arr.length; i++){
         arr[i] = 1; //overwrite with 1
      }
   }
public static int countSuscept(int[] pop){
      /*Count how many people in the current population are 
      currently susceptible
      Input:
         int[] pop: the population we are simulating
      Output:
         return: the number of people in the current population
                 that are currently susceptible
      Ex.
      int[] pop = new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 3};
      countSuscept(pop) -> 4
      */
      int numSus = 0;
      for(int i = 0; i < pop.length; i++){
         if (pop[i] == 0){
            numSus++;
         }
      }
      return numSus;
}
   public static int countNewlyInfected(int[] pop){
      /*Count how many people in the current population are 
      newly infected
      Input:
         int[] pop: the population we are simulating
      Output:
         return: the number of people in the current population
                 that are newly infected
      Ex.
      int[] pop = new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 3};
      countNewlyInfected(pop) -> 3
      */
      int numNew = 0;
      for(int i = 0; i < pop.length; i++){
         if (pop[i] == 0){
            numNew++;
         }
      }
      return numNew;
}
   public static int countContagious(int[] pop){
         /*Count how many people in the current population are 
         contagious
         Input:
            int[] pop: the population we are simulating
         Output:
            return: the number of people in the current population
                    that are contagious
         Ex.
         int[] pop = new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 3};
         countContagious(pop) -> 2
         */
         int numContagious = 0;
         for(int i = 0; i < pop.length; i++){
            if (pop[i] == 0){
               numContagious++;
            }
         }
         return numContagious;
}
   public static int countRecovered(int[] pop){
         /*Count how many people in the current population are 
         recovered
         Input:
            int[] pop: the population we are simulating
         Output:
            return: the number of people in the current population
                    that are recovered
         Ex.
         int[] pop = new int[] {0, 0, 0, 0, 1, 1, 1, 2, 2, 3};
         countRecovered(pop) -> 1
         */
         int numRecovered = 0;
      for(int i = 0; i < pop.length; i++){
         if (pop[i] == 0){
            numRecovered++;
         }
      }
      return numRecovered;
}
}