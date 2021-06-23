import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _4344 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int c = Integer.parseInt(br.readLine());
		
		for(int i=0; i<c; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			double[] score = new double[n];
			double sum = 0.0;
			int j=0;
			
			while(st.hasMoreTokens()) {
				score[j] = Double.parseDouble(st.nextToken());
				sum += score[j++];
			}
			
			double avg = sum/n;
			int student = 0;
			
			for(j=0; j<score.length; j++) {
				if(score[j] > avg)
					student++;
			}
			
			double p = (double)student/n*100;
			bw.write(String.format("%.3f", p) + "% \n");
		}
		
		bw.flush();
		bw.close();
	}
}
