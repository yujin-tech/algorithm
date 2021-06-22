import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class _2562 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] n = new int[9];
		
		for(int i=0; i<9; i++)
			n[i] = Integer.parseInt(br.readLine());
		
		int max = n[0];
		int order = 1;
		
		for(int i=1; i<9; i++) {
			if(n[i] > max) {
				max = n[i];
				order = i+1;
			}
		}
		
		bw.write(max + "\n" + order + "\n");
		bw.flush();
		bw.close();
	}
}
