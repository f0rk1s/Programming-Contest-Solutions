import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args) {

        FastReader input = new FastReader();
        int n = input.nextInt();
        int k = input.nextInt();
        HashMap<String, Boolean> exists = new HashMap<>();
        String[] words = new String[k];
        words[0] = input.next();

        boolean found = false;
        int steps = 0;
        if (k < 2) {
            System.out.println("-1");
            return;
        }
        for (int i = 1; i < k; i++) {
            steps++;
            words[i] = input.next();
            if (words[i].charAt(0) != words[i - 1].charAt((words[i - 1].length() - 1)) || exists.get(words[i]) == Boolean.TRUE) {
                found = true;
                break;
            }
            exists.put(words[i],Boolean.TRUE);
        }

        if (found) {
            System.out.println((steps % n) + 1);
        } else {
            System.out.println("-1");
        }
    }
}
