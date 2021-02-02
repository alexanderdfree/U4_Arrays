import java.util.Random;
public class Birthday{
   public static boolean birthday(int nPeople){
   /*Simulate one round of the birthday problem. Given n people,
   is there a shared birthday? Assume all birthdays are equally
   as likely.
   
   Input:
       int nPeople: the number of people in the group
   Output:
       return: whether or not there was at least 1 shared bday
   Ex.
   birthday(0)   -> false
   birthday(20)  -> false
   birthday(20)  -> true
   birthday(366) -> true
   */
   Boolean[] birthdayTracker = new Boolean[365];
   for (int i = 0; i < 365; i++){
      birthdayTracker[i] = false;
   }
   for (int i = 0; i < nPeople; i++){
      int day = (int)(Math.random() * 365);
      if (birthdayTracker[day] == !false) return true;
      birthdayTracker[day] = true;
      /*
      if (Math.random() * 365 >= 1) {
         return true;
      }
      else{
         birthdayTracker[i] = false;
      
      }*/
   }
   return false;

}
   public static double birthdayOdds(int nPeople, int nReps){
   /*Simulate nReps of the birthday problem, and calculate the
   probability that given nPeople, at least one pair will share 
   a birthday
   Input:
      int nPeople: the number people in the group
      int nReps: the number of times to repeat the experiment
   Output:
      return: the percentage of times at least 1 pair shared a
      birthday [0.0-1.0]
   Ex.
   birthdayOdds(0, 100000)   -> 0.0
   birthdayOdds(10, 100000)  -> 0.11767
   birthdayOdds(365, 100000) -> 1.0
   */
   int counter = 0;
   for (int i = 0; i < nReps; i++){
      boolean birthdayResults = Birthday.birthday(nPeople);
      if (birthdayResults) {
         counter++;
      }
   }
   double probability = counter * 1.0 / nReps; 
   return probability;
}
 public static void main(String[] args){
      StdOut.println("How many times would you like to run the simulation?");
      int response = StdIn.readInt();
      StdOut.println("The Birthday Problem Simulation (n = " + response + ")");
      StdOut.println("Approx. Likelihood of At Least One Shared Birthday");
      StdOut.println("Group Size (# of people): Prob. Shared Bday");
      StdOut.println("5: " + Birthday.birthdayOdds(5, response));
      StdOut.println("10: " + Birthday.birthdayOdds(10, response));
      StdOut.println("15: " + Birthday.birthdayOdds(15, response));
      StdOut.println("20: " + Birthday.birthdayOdds(20, response));
      StdOut.println("25: " + Birthday.birthdayOdds(25, response));
      StdOut.println("30: " + Birthday.birthdayOdds(30, response));
      StdOut.println("35: " + Birthday.birthdayOdds(35, response));
      StdOut.println("40: " + Birthday.birthdayOdds(40, response));
      StdOut.println("45: " + Birthday.birthdayOdds(45, response));
      StdOut.println("50: " + Birthday.birthdayOdds(50, response));
      StdOut.println("55: " + Birthday.birthdayOdds(55, response));
      StdOut.println("60: " + Birthday.birthdayOdds(60, response));
      StdOut.println("65: " + Birthday.birthdayOdds(65, response));
      StdOut.println("70: " + Birthday.birthdayOdds(70, response));
      StdOut.println("75: " + Birthday.birthdayOdds(75, response));
      StdOut.println("80: " + Birthday.birthdayOdds(80, response));
      StdOut.println("85: " + Birthday.birthdayOdds(85, response));
      StdOut.println("90: " + Birthday.birthdayOdds(90, response));
      StdOut.println("95: " + Birthday.birthdayOdds(95, response));
      StdOut.println("100: " + Birthday.birthdayOdds(100, response));

}
}