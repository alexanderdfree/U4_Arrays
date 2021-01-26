import java.util.*;
public class Dice{
public static int rollNormalDice(){
   /*Return a random roll of 2 normal dice
   Input: none
   Output: the sum of a roll of two normal dice
   */
   //setup Die #1
   int[] die1 = new int[6];
   die1[0] = 1;
   die1[1] = 2;
   die1[2] = 3;
   die1[3] = 4;
   die1[4] = 5;
   die1[5] = 6;
   //setup Die #2
   int[] die2 = new int[6];
   die2[0] = 1;
   die2[1] = 2;
   die2[2] = 3;
   die2[3] = 4;
   die2[4] = 5;
   die2[5] = 6;
   //Pick random faces for each die
   int face1 = StdRandom.uniform(6); //a random number [0-6)
   int face2 = StdRandom.uniform(6); //a random number [0-6)
   return die1[face1] + die2[face2];
}
public static int rollSichermanDice(){
   /*Return a random roll of Sicherman dice
   Die 1: [1, 2, 2, 3, 3, 4]
   Die 2: [1, 3, 4, 5, 6, 8]
   
   Input: none
   Output: the sum of a roll of 2 Sicherman dice
   */
   int[] die1 = new int[6];
   die1[0] = 1;
   die1[1] = 2;
   die1[2] = 2;
   die1[3] = 3;
   die1[4] = 3;
   die1[5] = 4;
   //setup Die #2
   int[] die2 = new int[6];
   die2[0] = 1;
   die2[1] = 3;
   die2[2] = 4;
   die2[3] = 5;
   die2[4] = 6;
   die2[5] = 8;
   //Pick random faces for each die
   int face1 = StdRandom.uniform(6); //a random number [0-6)
   int face2 = StdRandom.uniform(6); //a random number [0-6)
   return die1[face1] + die2[face2];

}
public static int[] rollNormalDiceNTimes(int n){
   /*Roll a pair of normal dice n times.
   Input:
      int n: the number of times to roll the pair of dice
   Output:
      return: an int[] showing the number of times you got
              each outcome (the index of the array is the
              outcome sum, the value of the array is the
              number of times you got that outcome)
   Ex.
   If you rolled the following: 4, 6, 7, 4, 5, 6, 3
   the output would be:
   rollNormalDiceNTimes(7) -> [0, 0, 0, 1, 2, 1, 2, 1,...
                        index: 0  1  2  3  4  5  6  7 ...
   */
   
   
   
   int[] die1 = new int[6];
   die1[0] = 1;
   die1[1] = 2;
   die1[2] = 3;
   die1[3] = 4;
   die1[4] = 5;
   die1[5] = 6;
   //setup Die #2
   int[] die2 = new int[6];
   die2[0] = 1;
   die2[1] = 2;
   die2[2] = 3;
   die2[3] = 4;
   die2[4] = 5;
   die2[5] = 6;
   //Pick random faces for each die
   
   int[] trackDice = new int[13];
   for (int i = 0; i < n; i++){
      int face1 = StdRandom.uniform(6); //a random number [0-6)
      int face2 = StdRandom.uniform(6); //a random number [0-6)
      int result = die1[face1] + die2[face2];
      trackDice[result]++;
   }
   StdOut.println(Arrays.toString(trackDice));
   return trackDice;

}
public static int[] rollSichermanDiceNTimes(int n){
   /*Roll a pair of Sicherman dice n times.
   Input:
      int n: the num. of times to roll the Sicherman dice
   Output:
      return: an int[] showing the number of times you got
              each outcome (the index of the array is the
              outcome sum, the value of the array is the
              number of times you got that outcome)
   Ex.
   If you rolled the following: 4, 6, 7, 4, 5, 6, 3
   the output would be:
   rollSichermanDiceNTimes(7) -> [0, 0, 0, 1, 2, 1, 2, 1,...
                           index: 0  1  2  3  4  5  6  7 ...
   */
   int[] die1 = new int[6];
   die1[0] = 1;
   die1[1] = 2;
   die1[2] = 2;
   die1[3] = 3;
   die1[4] = 3;
   die1[5] = 4;
   //setup Die #2
   int[] die2 = new int[6];
   die2[0] = 1;
   die2[1] = 3;
   die2[2] = 4;
   die2[3] = 5;
   die2[4] = 6;
   die2[5] = 8;
   //Pick random faces for each die
   
   int[] trackDice = new int[13];
   for (int i = 0; i < n; i++){
      int face1 = StdRandom.uniform(6); //a random number [0-6)
      int face2 = StdRandom.uniform(6); //a random number [0-6)
      int result = die1[face1] + die2[face2];
      trackDice[result]++;
   }
   StdOut.println(Arrays.toString(trackDice));
   return trackDice;

}

}