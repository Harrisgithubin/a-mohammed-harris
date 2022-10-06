package newproject;

public class runningsum {
	public static void main(String []args) {
		
		final  int LOWERCASE=1;
		final int UPPERCASE=10;
		int sum=0;
		
		int number=LOWERCASE;
		while(number<=UPPERCASE) {
		sum=sum+number;
		++number;
		}
		System.out.println("your sum "+LOWERCASE+"from"+UPPERCASE+"is"+sum);
	}

}
