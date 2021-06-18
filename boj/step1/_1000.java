import java.util.Scanner;

public class _1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 规过1
		 * */
		String str = sc.nextLine();
		String[] num = str.split(" ");
		
		int n = 0;
		
		for(String s : num)
			n += Integer.parseInt(s);
		
		System.out.println(n);
		
		/*
		 * 规过2
		 * */
	/*	int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b); */
	}
}
