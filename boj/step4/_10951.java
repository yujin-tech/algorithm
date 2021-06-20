import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String str = br.readLine();
			
			if(str == null)
				break;
			
			StringTokenizer st = new StringTokenizer(str);
			
			int[] n = new int[2];
			int j = 0;
			int sum;
			
			while(st.hasMoreTokens())
				n[j++] = Integer.parseInt(st.nextToken());
			
			sum = n[0] + n[1];
			
			bw.write(sum + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
