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
   public static void exposeNnomatterwhat(int[] pop, int n){
      //accidentally followed the directions wrong
      //and made my own method that keeps going
      //until it affects 2 people
      
      /*Expose n randomly selected members of the population to
      the pathogen. If the exposed people are susceptible, they
      will become sick. If they are already sick or immune, they
      will be unaffected.
      Input:
         int[] pop: the population we are simulating
         int n: the number of randomly-selected individuals to
                expose
      Output: None
      Side Effects: n randomly-selected members of the
                    population have been exposed to the disease
                    and may or may not be newly infected.
      Ex.
      int[] pop = new int[10];
      Arrays.toString(pop) -> [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
      exposeN(pop, 2);
      Arrays.toString(pop) -> [0, 0, 1, 0, 0, 1, 0, 0, 0, 0]
      */
      int total = Outbreak.countSuscept(pop);
      //Math.random(0, total);
      //double criteria = 1.0/n;
      int counter = 0;
      while (counter < n){
         double random = Math.random();
         double doubleAt = pop.length * random;
         int intAt = (int) doubleAt;
         if (pop[intAt] == 0){
            pop[intAt] = 1;
            counter++;
         }
      }
      /*for (int i = 0; i < pop.length; i++){
         criteria = 1.0/(n - i);
         double randomNum = Math.random();
         if (randomNum > criteria && pop[i] == 0 && counter < n) {
            pop[i] = 1;
            counter++;
         }
      }*/
}
   public static void exposeN(int[] pop, int n){
      /*Expose n randomly selected members of the population to
      the pathogen. If the exposed people are susceptible, they
      will become sick. If they are already sick or immune, they
      will be unaffected.
      Input:
         int[] pop: the population we are simulating
         int n: the number of randomly-selected individuals to
                expose
      Output: None
      Side Effects: n randomly-selected members of the
                    population have been exposed to the disease
                    and may or may not be newly infected.
      Ex.
      int[] pop = new int[10];
      Arrays.toString(pop) -> [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
      exposeN(pop, 2);
      Arrays.toString(pop) -> [0, 0, 1, 0, 0, 1, 0, 0, 0, 0]
      */
   for (int i = 0; i < n; i++){
      double random = Math.random();
      double doubleAt = pop.length * random;
      int intAt = (int) doubleAt + 1;
      Outbreak.expose(pop, intAt);
   }
}
   public static void spread(int[] pop, double r0){
      /*Simulate the spread of disease from contagious members
      of a population. Each contagious individual will try to
      expose a random number (Poisson-distributed, r0 on avg.)
      of other people to the pathogen.
      Input:
         int[] pop: the population we are simulating
         double r0: the avg. number of people infected by each
                    contagious person
      Output: None
      Side Effects: Contagious individuals have exposed
      randomly selected members of the population
      Ex.
      int[] pop = new int[10];
      pop[0] = 2;
      Arrays.toString(pop) -> [2, 0, 0, 0, 0, 0, 0, 0, 0, 0]
      spread(pop, 1.5)
      Arrays.toString(pop) -> [2, 0, 1, 0, 0, 1, 0, 0, 0, 0]
      */
   for (int i = 0; i < pop.length; i++){
      if (pop[i] == 2){
         int random = StdRandom.poisson(r0);
         Outbreak.exposeN(pop, random);
      }
   }
}
   public static void step(int pop[], double r0){
      /*Simulate one round of disease spread. Each
      round contagious people spread to randomly selected
      new people. Then, everyone's state updates:
      0 -> 0 (susceptible remain susceptible)
      1 -> 2 (newly infected become contagious)
      2 -> 3 (contagious recover)
      3 -> 3 (recovered stay the same
      Input:
         int pop[]: the population we are simulating
         double r0: the avg. num. of exposures from each
                    contagious person
      Output: None
      Side Effects: pop has been updated by one round
      Ex.
      int[] pop = new int[5];
      pop[0] = 2;
      Arrays.toString(pop) -> [2, 0, 0, 0, 0]
      step(pop, 2.0)
      Arrays.toString(pop) -> [3, 0, 2, 0, 2]
      */
   Outbreak.spread(pop, r0);
   Outbreak.progress(pop);
}
   public static void main(String args[]){
      StdOut.println("How many people in the population?");
      int population = StdIn.readInt();
      StdOut.println("What is the R0 (avg. num. new infections per contagious person)?");
      double r0 = StdIn.readDouble();
      StdOut.println("What fraction of the population should be initially infected?");
      double initial = StdIn.readDouble();
      StdOut.println("What fraction of the population should be vaccinated?");
      double vaccinated = StdIn.readDouble();
      StdOut.println("How many steps would you like to simulate?");
      int steps = StdIn.readInt();
      int[] pop = new int[population];
      int initialInfected = (int) (initial * pop.length);
      //StdOut.println(initialInfected);
      for (int i = 0; i < initialInfected; i++){
         pop[i] = 2;
      }
      StdOut.println(Arrays.toString(pop));
      StdOut.println("Step	Sus.	Inf.	Rec.");
      for (int i = 0; i < steps; i++){
         int infected = Outbreak.countContagious(pop) + Outbreak.countNewlyInfected(pop);
         String printed = i + " " + Outbreak.countSuscept(pop) + " " + infected + " " + Outbreak.countRecovered(pop);
         StdOut.println(printed);
         Outbreak.step(pop, r0);
      }
   }
}