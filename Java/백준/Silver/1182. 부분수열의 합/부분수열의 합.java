import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, s, ans;
    static List<Integer> list = new ArrayList<>();
    static Integer[] arr;
    static boolean[] isUsed;

    static void func(int k) {
        if(k == n) {
            int sum = 0;
            for(int i=0; i<n; ++i) {
                if(arr[i] == null) continue;
                sum += arr[i];
            }
            if(sum == s) 
                ans++;
            return;
        }
        // 현재 원소를 선택하지 않는 경우
        arr[k] = null;
        func(k + 1);
        // 현재 원소를 선택하는 경우
        arr[k] = list.get(k);
        func(k + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        arr = new Integer[n];
        isUsed = new boolean[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; ++i) 
            list.add(Integer.parseInt(st.nextToken()));
        func(0);
        if(s == 0) ans--;
        System.out.println(ans);
    }
}