import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		double[] score = new double[n];
		double m, sum;
		m = sum = 0.0;
		int i = 0;
		
		while(st.hasMoreTokens()) {
			score[i] = Double.parseDouble(st.nextToken());
			
			if(score[i] > m)
				m = score[i];
			
			i++;
		}
		
		for(i=0; i<n; i++) {
			score[i] = score[i]/m*100;
			sum += score[i];
		}
		
		double avg = sum/n;
		
		System.out.println(avg);
	}
}
