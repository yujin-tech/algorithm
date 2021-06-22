import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _3052 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] bal = new int[43];
		int cnt = 0;
		
		for(int i=0; i<10; i++) {
			int n = Integer.parseInt(br.readLine()) % 42;
			bal[n]++;
		}
		
		for(int i=0; i<43; i++) {
			if(bal[i] != 0)
				cnt++;
		}
		
		System.out.println(cnt);
	}
}
