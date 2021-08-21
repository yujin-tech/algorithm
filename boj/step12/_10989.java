import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class _10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] nInput = new int[n];
        int max = 0;
        int min = 10000000;

        for(int i=0; i<n; i++) {
            nInput[i] = Integer.parseInt(br.readLine());

            if(nInput[i] > max)
                max = nInput[i];
            if(nInput[i] < min)
                min = nInput[i];
        }

        int[] cnt = new int[max+1];
        for(int i=0; i<nInput.length; i++){
            if(nInput[i] != 0)
                cnt[nInput[i]]++;
        }

        for(int i=min; i<=max; i++){
            if(cnt[i] != 0) {
                for (int j = 0; j < cnt[i]; j++)
                    bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
