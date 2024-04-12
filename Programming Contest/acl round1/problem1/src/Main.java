//Brace your keyboard
//inzva community built algoleague for every algorithm enthusiast hungry for self-improvement and friendly competition. Have fun and good luck!

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int M = input.nextInt();

        int K = input.nextInt();
        int X = input.nextInt();

        boolean[][] seats = new boolean[N][M];

        for (int i = 0; i < X; i++) {
            int a = input.nextInt();
            int b = input.nextInt();
            seats[a - 1][b - 1] = true;
        }
        int counter = 0;
        for (int i = 0; i < N; i++) {
            outer:
            for (int j = 0; j < M - K + 1; j++) {
                for(int k = 0; k < K; k++) {
                    if (seats[i][j + k] == true) {
                        continue outer;
                    }
                }
                counter++;
            }
        }
        System.out.println(counter);
    }
}
