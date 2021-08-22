import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nInput = new int[n];

        int sum = 0;

        for(int i=0; i<n; i++) {
            nInput[i] = Integer.parseInt(br.readLine());
            sum += nInput[i];
        }

        Arrays.sort(nInput);

        double avg = (double)sum / n; //산술평균
        int mid = nInput[(n-1)/2]; //중앙값
        int range = nInput[n-1] - nInput[0]; //범위

        int[] mode = new int[8001];
        //[0] : 0/ [-4000 ~ -1] : 1~4000/ [1 ~ 4000] : 4001~8000

        for(int i=0; i<nInput.length; i++) {
            if(nInput[i] < 0) //음수인 경우
                mode[Math.abs(nInput[i])]++;
            else if(nInput[i] == 0) //0인 경우
                mode[0]++;
            else //양수인 경우
                mode[nInput[i] + 4000]++;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i=0; i<mode.length; i++) {
            if (mode[i] != 0)
                arrayList.add(mode[i]);
        }

        Collections.sort(arrayList);

        int maxCnt = arrayList.get(arrayList.size() - 1);
        int value = 0;

        if(Collections.frequency(arrayList, maxCnt) > 1 && arrayList.size() > 1) { // 최빈값 여러개 존재시(최빈값 중 두번째로 작은 수 구해야 함)
            int cnt = 0;
            for(int i=4000; i>=0; i--) {
                if(mode[i] != 0 && mode[i] == maxCnt){
                    cnt++;
                    if(cnt == 2) {
                        value = i;
                        break;
                    }
                }
            }
            if(cnt != 2) {
                for (int i = 4001; i < 8000; i++) {
                    if (mode[i] != 0 && mode[i] == maxCnt) {
                        cnt++;
                        if (cnt == 2) {
                            value = i;
                            break;
                        }
                    }
                }
            }
        }
        else { //최빈값 여러개 존재 x
            for(int i=0; i<mode.length; i++){
                if(mode[i] != 0 && mode[i] == maxCnt)
                    value = i;
            }
        }

        if(value >= 1 && value <= 4000)
            value = -(value);
        if(value >= 4001 && value <=8000)
            value -= 4000;

        bw.write(Math.round(avg) + "\n");
        bw.write(mid + "\n");
        bw.write(value + "\n");
        bw.write(range + "\n");

        bw.flush();
        bw.close();
    }

}
