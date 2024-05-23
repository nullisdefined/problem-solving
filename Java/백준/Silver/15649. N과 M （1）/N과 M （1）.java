import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n;
    static int m;
    static int[] arr;
    static boolean[] isUsed;

    static void func(int cur) {
        if(cur == m) {
            for(int i=0; i<m; ++i)
                sb.append(arr[i]+" ");
            sb.append("\n");
            return;
        }

        for(int i=1; i<=n; ++i) {
            if(!isUsed[i]) {
                arr[cur] = i;
                isUsed[i] = true;
                func(cur+1);
                isUsed[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[m];       
        isUsed = new boolean[9];
        func(0);
        System.out.println(sb);
    }
}