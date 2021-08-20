package step12;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.ArrayList;

public class Boj_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr1 = new int[n];
        int max = 0;

        for(int i=0; i<n; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
            if(arr1[i] > max)
                max = arr1[i];
        }

        int[] cnt = new int[max+1];
        for(int i=0; i<n; i++) {
            cnt[arr1[i]]++;
        }

        HashMap<Integer, Integer> sum = new HashMap<>();
        for(int i=2; i<=n; i++){
            if(cnt[i] != 0)
                sum.put(i, cnt[i]);
        }
    }
}
