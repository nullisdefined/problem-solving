import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] arr = new int[10];
    static boolean[] isUsed = new boolean[10];
    
    static void func(int num, int k) {
        if(k == m) {
            for(int i=0; i<m; ++i) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i=num; i<=n; ++i) {
            if(!isUsed[i]) {
                arr[k] = i;
                isUsed[i] = true;
                func(i+1, k+1);
                isUsed[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        func(1, 0);
        System.out.println(sb);
    }
}