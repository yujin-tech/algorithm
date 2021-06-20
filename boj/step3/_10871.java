import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num = new int[2];
		int j=0;
		
		while(st.hasMoreTokens())
			num[j++] = Integer.parseInt(st.nextToken());
		
		int n = num[0];
		int x = num[1];
		
		st = new StringTokenizer(br.readLine());

		while(st.hasMoreTokens()) {
			int element = Integer.parseInt(st.nextToken());
			
			if(element < x)
				bw.write(element + " ");
		}
		
		bw.flush();
		bw.close();
	}
}
