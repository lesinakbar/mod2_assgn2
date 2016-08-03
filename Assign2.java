/*
 * Date : 25/07/2016
 * Program to print prime numbers between 1 and 100
 */
public class Assign2 {

	public static void main(String[] args) {
		System.out.println("\nPrime numbers between 1 and 100\n");
		int upCounter;
		int primeNumber;
		int nxtCounter;
		int comparator=0;
		boolean detect = true;

		for (upCounter = 2; upCounter <= 100; upCounter++) {
			
			primeNumber = upCounter;
			comparator = primeNumber/2;
			
			for (nxtCounter = 2; nxtCounter <= comparator ;nxtCounter++){
				if(primeNumber%nxtCounter==0){
					detect = false;
					break;
				}
								
			}
			
			if(detect == true){
			System.out.print(primeNumber  + " ");
			}
			
			detect = true;
		}
	}
}
