import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		int[] a = new int[N];
		int[] b = new int[N];
		int[] cntA = new int[101]; // 0~100
		int[] cntB = new int[101]; // 0~100
		int[] resA = new int[N];
		int[] resB = new int[N];

		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; ++i) {
			int val = Integer.parseInt(st.nextToken());
			a[i] = val;
			cntA[val]++;
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; ++i) {
			int val = Integer.parseInt(st.nextToken());
			b[i] = val;
			cntB[val]++;
		}

		// 카운트 배열 누적합
		for(int i=1; i<101; ++i) {
			cntA[i] += cntA[i-1];
			cntB[i] += cntB[i-1];
		}

		// 카운트 배열 각 값에 대응되는 result 배열 위치에 배정
		for(int i=N-1; i>=0; --i) {
			int valA = a[i];
			cntA[valA]--;
			resA[cntA[valA]] = valA;
			int valB = b[i];
			cntB[valB]--;
			resB[cntB[valB]] = valB;
		}
		
		int ans = 0;
		for(int i=0, j=N-1; i<N; ++i, --j) {
			ans += resA[i] * resB[j];	
		}

		System.out.println(ans);
	}
}