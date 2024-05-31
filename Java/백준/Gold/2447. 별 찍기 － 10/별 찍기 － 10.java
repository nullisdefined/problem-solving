import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    
    static List<String> makePattern(int n) {
        if(n == 3) {
            return Arrays.asList("***", "* *", "***");
        }
        int m = n / 3;
        List<String> pattern = makePattern(m);
        List<String> result = new ArrayList<String>();

        for(int i=0; i<3; ++i) {
            for(int j=0; j<m; ++j) {
                if(i == 1)
                    result.add(pattern.get(j) + " ".repeat(m) + pattern.get(j));
                else 
                    result.add(pattern.get(j) + pattern.get(j) + pattern.get(j));
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> result = makePattern(n);
        for(String line: result)
            sb.append(line+"\n");
        System.out.println(sb);
    }
}