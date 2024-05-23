import java.io.*;
import java.util.*;

public class Main {
    static int n;
    static int cnt = 0;
    static boolean[] colUsed;
    static boolean[] diag1Used;
    static boolean[] diag2Used;

    /*
     * 퀸을 배치할 수 없는 경우
     * 1. 같은 행에 퀸이 놓여져 있는 경우
     * 2. 같은 열에 퀸이 놓여져 있는 경우
     * 3. 같은 왼쪽 위 대각선에 퀸이 놓여져 있는 경우 -> row-col값이 같음
     * 4. 같은 오른쪽 위 대각선에 퀸이 놓여져 있는 경우 -> row+col값이 같음
     */

    static void func(int row) { // 지금까지 처리한 행 개수
        if(row == n) { // 재귀 함수 종료 조건문
            cnt++;
            return;
        }
        for(int col=0; col<n; ++col) { 
            // 현재 열, 오른쪽 위 대각선, 왼쪽 위 대각선이 사용 중인지 확인
            // row-col+n-1에서 n-1는 음수가 되지 않기 위함
            if(colUsed[col] || diag1Used[row+col] || diag2Used[row-col+n-1]) continue;
            
            // 현재 열, 왼쪽 위 대각선, 오른쪽 위 대각선 사용 표시
            colUsed[col] = diag1Used[row+col] = diag2Used[row-col+n-1] = true;
            func(row+1);
            // 현재 열, 왼쪽 위 대각선, 오른쪽 위 대각선 사용 해제
            colUsed[col] = diag1Used[row+col] = diag2Used[row-col+n-1] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(br.readLine());
        colUsed = new boolean[n];
        // nxn 행렬에서 대각선의 개수는 2n-1개
        diag1Used = new boolean[2*n-1];
        diag2Used = new boolean[2*n-1];
        func(0);
        sb.append(cnt);
        System.out.println(sb);
    }
}