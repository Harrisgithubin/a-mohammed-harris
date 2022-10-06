package newproject;

public class conditional {

	public static void main(String[] args) {
		final int LOWERBOUND=1;
		final int UPPERBOUND=1000;
		
		int sumodd=0;
		int sumeven=0;
		int number=LOWERBOUND;
		while(number<=UPPERBOUND) {
			if(number%2==0) {
			sumeven += number;
			} else{
			sumodd += number;
			}
			++number;
		    }
			System.out.println("the sum order from"+LOWERBOUND+"from"+UPPERBOUND+"to"+sumodd);
			System.out.println("the sum order from"+LOWERBOUND+"from"+UPPERBOUND+"to"+sumeven);
			System.out.println("the difference between the two sum is"+(sumodd-sumeven));
		}
		

	}


