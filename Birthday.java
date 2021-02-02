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
   Boolean[] birthdayTracker = new Boolean[nPeople];
   for (int i = 0; i < nPeople; i++){
      if (Math.random() * 365 >= 1) {
         return true;
      }
      else{
         birthdayTracker[i] = false;
      
      }
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
   Boolean[] birthdayTracker = new Boolean[nPeople];
   
   for (int i = 0; i < nReps; i++){
   
   }
}

}