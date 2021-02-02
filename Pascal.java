import java.util.*;
public class Pascal{
   public static int[] nextRow(int[] prev){
   /*Given a previous row, generate the next row
   of Pascal's Triangle.
   Input:
      int[] prev: the previous row of Pascal's Triangle
   Output:
      return: a new int[] containing the next row of
              Pascal's Triangle
   Ex.
           |||
           vvv making an array directly
   nextRow(new int[]{1}) -> [1, 1]
   nextRow(new int[]{1, 1}) -> [1, 2, 1]
   nextRow(new int[]{1, 2, 1}) -> [1, 3, 3, 1]
   */
   int[] newRow = new int[prev.length+1];
   newRow[0] = 1;
   newRow[prev.length] = 1;
   //StdOut.println(Arrays.toString(newRow));
   if (prev.length == 1) return newRow;
   for (int i = 2; i < prev.length+1; i++){
      newRow[i-1] = prev[i-1] + prev[i-2];
   }
   //StdOut.println(Arrays.toString(newRow));
   return newRow;
}
   public static void main(String[] args){
      StdOut.println("How many rows of Pascal's triangle would you like?");
      int response = StdIn.readInt();
      int[] row = new int [0];
      if (response != 0) {
      StdOut.println("[1]");
      for (int i = 0; i < response-1; i++){
         //int save[] = row;
         //row = new int[i];
         row = Pascal.nextRow(row);
         StdOut.println(Arrays.toString(Pascal.nextRow(row)));
      }
      }
      
}
}