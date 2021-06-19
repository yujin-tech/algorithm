import java.util.Scanner;

public class _2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m-45 < 0) {
			int val = 45-m;
			m = 60-val;
			if(h == 0)
				h = 23;
			else
				h--;
		}
		else
			m -= 45;
		System.out.println(h + " " + m);
	}
}
