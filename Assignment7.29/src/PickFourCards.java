
public class PickFourCards {

	public static void main(String[] args) {

		// input code
		
		//make custom method
public static int pickCard() {
  int card = (int) (Math.random() * 52.0); // pick a card 0-51
  return card;
 }
 
 public static int getRank(int card) {
 
  return card / 4 + 1; // determine the rank 1-13
 
	}

}
