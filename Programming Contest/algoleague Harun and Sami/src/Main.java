import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        String s = scan.next(); //round winners

        if (K <= s.length() / 2) {
            System.out.println("Cilek");
            return;
        }

        //count number of wins for players
        int S = 0;
        int H = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'H') {
                H++;
            } else if (c == 'S') {
                S++;
            }
        }

        if (H >= (N / 2) + 1) {
            System.out.println("Harun");
        } else if (S >= (N / 2) + 1) {
            System.out.println("Sami");
        }
        else {
            System.out.println("Cilek");
        }
    }
}
