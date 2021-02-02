public class Recaman{
   public static void recamanSequence(int n){
   /*Generate the first n entries in the Recamán Sequence
   Input:
      int n: the number of entries to generate
   Output:
      print: the first n entries of the Recamán Sequence
   Ex.
   recamanSequence(9)
   0
   1
   3
   6
   2
   7
   13
   20
   12
   */
   int arrLength = 0;
   int hopSize2 = 1;
   for (int i = 0; i < n; i++){
      arrLength += hopSize2;
      hopSize2++;
   }
   boolean[] recamanSeen = new boolean[arrLength];
   int hopSize = 1;
   int counter = 0;
   for (int i = 0; i < n; i++){
      recamanSeen[counter] = true;
      StdOut.println(counter);
      //if (){
      if (counter - hopSize >=0 && recamanSeen[counter - hopSize] == false){
         counter -= hopSize;
      }//}
      else{
      counter+=hopSize;
      }
      
      hopSize++;
      
   }
   }

}