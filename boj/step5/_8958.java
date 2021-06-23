import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class _8958 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int score=0, cnt=0;
		
		for(int i=0; i<n; i++) {
			String tc = br.readLine();
			
			int len = tc.length();
			
			for(int j=0; j<len; j++) {
				if(tc.charAt(j) == 'O')
					cnt++;
				else
					cnt = 0;
				score += cnt;
			}
			
			bw.write(score + "\n");
			score = cnt = 0;
		}
		
		bw.flush();
		bw.close();
	}
}
