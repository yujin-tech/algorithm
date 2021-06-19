import java.util.Scanner;

public class _2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * solve 1
		 * */
		int n1 = Integer.parseInt(sc.nextLine());
		String n2 = sc.nextLine();
		
		int n22 = Character.getNumericValue(n2.charAt(2)) * n1;
		System.out.println(n22);
		int n21 = Character.getNumericValue(n2.charAt(1)) * n1;
		System.out.println(n21);
		int n20 = Character.getNumericValue(n2.charAt(0)) * n1;
		System.out.println(n20);
		
		int value = n22 + n21*10 + n20*100;
		System.out.println(value);
		
		/*
		 * solve 2
		 * */
	/*	int n1 = scanner.nextInt();
    	int n2 = scanner.nextInt();
    	int balance, result;
    	int sum = 0;
    	int cnt=1;
    	
    	while(n2>0) {
    		balance = n2%10;
    		result = n1*balance;
    		System.out.println(result);
    		sum += (result*cnt);
    		cnt *= 10;
    		n2 /= 10;
    	}
    	
    	System.out.println(sum);	*/
	}
}
