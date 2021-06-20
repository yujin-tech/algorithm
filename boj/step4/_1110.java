import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class _1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String number = br.readLine();
		int n = Integer.parseInt(number);
		int num = n;
		int cnt = 0;
		
		do {
			int n1, n2;
			
			if(num < 10) {
				n1 = 0;
				n2 = num;
			}
			else {
				n1 = num/10;
				n2 = num%10;
			}
			
			int sum = n1 + n2;
			if(sum >= 10)
				sum %= 10;
			
			num = n2*10 + sum;
			
			cnt++;

		} while(num != n);
		
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
	}
}
