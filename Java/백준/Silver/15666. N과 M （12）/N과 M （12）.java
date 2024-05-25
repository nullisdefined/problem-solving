import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int n, m;
    static int[] arr = new int[10];
    static List<Integer> list;

    static void func(int idx, int k) {
        if (k == m) {
            for (int i=0; i<m; ++i)
                sb.append(arr[i] + " ");
            sb.append("\n");
            return;
        }
        for (int i=idx; i<list.size(); ++i) {
            arr[k] = list.get(i);
            func(i, k+1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        list = new ArrayList<>(set);
        list.sort(Comparator.naturalOrder());
        func(0, 0);
        System.out.println(sb);
    }
}