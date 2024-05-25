import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] arr = new int[10];
    static List<Integer> list = new ArrayList<>();
    static boolean[] isUsed = new boolean[10];
    
    static void func(int start, int k) {
        if(k == m) {
            for(int i=0; i<m; ++i) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }
        int num = 0;
        for(int i=start; i<n; ++i) {
            if(!isUsed[i]) {
                if(num == list.get(i)) continue;
                arr[k] = list.get(i);
                isUsed[i] = true;
                func(i+1, k+1);
                isUsed[i] = false;
                num = list.get(i);
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
        func(0, 0);
        System.out.println(sb);
    }
}