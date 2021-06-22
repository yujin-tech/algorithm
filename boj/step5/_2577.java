import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class _2577 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] cnt = new int[10];
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int result = a*b*c;
		
		String s = Integer.toString(result);
		
		for(int i=0; i<s.length(); i++) {
			int n = Character.getNumericValue(s.charAt(i));
			
			cnt[n]++;
		}
		
		for(int i=0; i<10; i++)
			bw.write(cnt[i] + "\n");
		
		bw.flush();
		bw.close();
	}
}
