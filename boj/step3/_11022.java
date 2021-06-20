import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class _11022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int[] n = new int[2];
			int j = 0;
			
			while(st.hasMoreTokens())
				n[j++] = Integer.parseInt(st.nextToken());
			
			int sum = n[0] + n[1];
			
			bw.write("Case #" + i + ": " + n[0] + " + " + n[1] + " = " + sum + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
