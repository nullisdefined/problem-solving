import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static List<Integer> list = new ArrayList<>();
    static int n, m;
    static int[] arr = new int[10];
    static boolean[] isUsed;
    static void func(int k) {
        if(k == m) {
            for(int i=0; i<m; ++i) {
                sb.append(arr[i]+" ");
            }
            sb.append("\n");
            return;
        }
        for(int i=0; i<n; ++i) {
            if(!isUsed[i]) {
                arr[k] = list.get(i);
                isUsed[i] = true;
                func(k+1);
                isUsed[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; ++i) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        list.sort(Comparator.naturalOrder());
        isUsed = new boolean[n];
        func(0);
        System.out.println(sb);
    }
}