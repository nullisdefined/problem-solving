import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        List<Pair> list = new ArrayList<>();

        for(int i=0; i<N; ++i) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            list.add(new Pair(first, second));
        }

        Collections.sort(list); // second 기준 오름차순 정렬

        int min = list.get(0).second; // second 최소값
        int ans = 1; 

        for(int i=1; i<list.size(); ++i) {
            if(min<=list.get(i).first) {
                min = list.get(i).second;
                ans++;
            }
        }

        System.out.println(ans);
    }

    public static class Pair implements Comparable<Pair> {
        int first, second;
        Pair(int x, int y) {
            this.first = x;
            this.second = y;
        }

        @Override
        public int compareTo(Pair o) {
            if(this.second == o.second) return this.first - o.first;
            return this.second - o.second;
        }
    }
}