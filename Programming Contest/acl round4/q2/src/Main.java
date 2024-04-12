import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        long b = input.nextLong();
        long s = input.nextLong();
        long n = input.nextLong();

        /*
        int b = 2;
        int s = 5;
        int n = 3;

         */

        long profit = s - b;
        long currentMoney = 1;
        long numberOfApples = 0;

        if (n == 0) {
            System.out.println(1);
            return;
        }
        if (n == 1) {
            System.out.println(1 + n);
            return;
        }
        if (profit <= 2) {
            System.out.println(n + 1);
            return;
        }

        for (int i = 0; i < n; i++) {

            if (currentMoney >= b && (i != n-1)) { //buy
                currentMoney -= b;
                numberOfApples++;
            } else if (numberOfApples > 0) { //sell
                currentMoney += (numberOfApples*s);
                numberOfApples = 0;
            } else { //work
                currentMoney++;
            }
        }
        System.out.println(currentMoney);
    }
}
