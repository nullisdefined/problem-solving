import java.io.*;
import java.util.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    
    static List<String> makePattern(int n) {
        if(n == 3) {
            return Arrays.asList("*", "* *", "*****");
        }
        int m = n / 2;
        List<String> pattern = makePattern(m);
        List<String> result = new ArrayList<String>();

        int blankSize = pattern.get(pattern.size()-1).length();

        for(String line: pattern) {
            result.add(line);
        }
        for(int i=0; i<pattern.size(); ++i) {
            result.add(pattern.get(i) + " ".repeat(blankSize-(2*i)) + pattern.get(i));
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> result = makePattern(n);
        int i=1;
        for(String line: result) {
            sb.append(" ".repeat(n-i)+line+" ".repeat(n-i)+"\n");
            i++;
        }
        System.out.println(sb);
    }
}