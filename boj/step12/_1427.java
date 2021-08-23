import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class _1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.nextLine();
        Integer[] arr = new Integer[st.length()];

        for(int i=0; i<st.length(); i++)
            arr[i] = Integer.parseInt(st.substring(i, i+1));

        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++)
            sb.append(arr[i]);

       System.out.println(sb.toString());
    }
}
