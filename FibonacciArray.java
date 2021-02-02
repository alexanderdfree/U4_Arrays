import java.util.*;
public class FibonacciArray{
   public static int[] firstN(int n){
   /*Calculate the first n Fibonacci numbers
   Input:
      int n: how many fibonacci numbers to calculate
   Output:
      return: a int[] containing the first n Fibonacci
              numbers.
   Ex.
   firstN(1) -> [0]
   firstN(2) -> [0, 1]
   firstN(3) -> [0, 1, 1]
   firstN(5) -> [0, 1, 1, 2, 3]
   */
   
   int[] sequenceTracker = new int[n];
   StdOut.println(Arrays.toString(sequenceTracker));
   sequenceTracker[0] = 0;
   if (n == 1) return sequenceTracker;
   sequenceTracker[1] = 1;
   for (int i = 2; i < n; i++) {
      sequenceTracker[i] = sequenceTracker[i-1] + sequenceTracker[i-2];
   }
   StdOut.println(Arrays.toString(sequenceTracker));
   return sequenceTracker;


}
}