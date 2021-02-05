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
         if (pop[i] == 1){
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
            if (pop[i] == 2){
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
            if (pop[i] == 3){
               numRecovered++;
            }
         }
         return numRecovered;
}
   public static void expose(int[] pop, int index){
      /*Expose the person at index with the pathogen. 
      If they are susceptible they become infected. If already 
      sick or recovered they will be unaffected.
      Input:
         int[] pop: the population we are simulating
         int index: the index of the person to expose
      Output: None
      Side Effects: the person in pop at index will be infected
      if they weren't already
      Ex.
      int[] pop = new int[]{3, 2, 1, 0};
      Arrays.toString(pop) -> [3, 2, 1, 0]
      expose(pop, 0)
      Arrays.toString(pop) -> [3, 2, 1, 0]
      expose(pop, 1)
      Arrays.toString(pop) -> [3, 2, 1, 0]
      expose(pop, 2)
      Arrays.toString(pop) -> [3, 2, 1, 0]
      expose(pop, 3)
      Arrays.toString(pop) -> [3, 2, 1, 1]
      */
      int status = pop[index];
      if (status == 0) {
         pop[index] = 1;
      }
}
   public static void progress(int pop[]){
      /*Progress the disease state of everyone in pop
      0 -> 0 (susceptible remain susceptible)
      1 -> 2 (newly infected become contagious)
      2 -> 3 (contagious recover)
      3 -> 3 (recovered stay the same)
      Input:
         int pop[]: the population we are simulating
      Output: None
      Side Effects: every member of pop's disease state
                    has been appropriately updated.
      Ex.
      pop = new int[]{3, 0, 1}
      Arrays.toString(pop) -> [3, 0, 1]
      progress(pop);
      Arrays.toString(pop) -> [3, 0, 2]
      progress(pop);
      Arrays.toString(pop) -> [3, 0, 3]
      */
      for (int i = 0; i < pop.length; i++){
         if (pop[i] == 1 || pop[i] == 2){
            pop[i]++;
         }
      }
}
}