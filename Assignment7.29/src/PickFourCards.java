
public class PickFourCards {

	public static void main(String[] args) {

		// input code
int sum = 0, numberOfPick = 0;
  while (sum != 24) {
   sum = pickCard() + pickCard() + pickCard() +pickCard();
   numberOfPick++;
 
  }
 
  System.out.println("Number of picks:" + numberOfPick*4);
 }
 
		
		//make custom method
	}

}
