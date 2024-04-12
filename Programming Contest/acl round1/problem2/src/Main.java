//Brace your keyboard
//inzva community built algoleague for every algorithm enthusiast hungry for self-improvement and friendly competition. Have fun and good luck!

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int distance(int[] arr, int a, int b) {
        int distance = arr[a] - arr[b];

        if (distance > 0) {
            return distance;
        }
        return distance * -1;
    }
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); //number of elves
        int M = input.nextInt(); //number of houses

        if (N > M) {
            System.out.println(0);
            return;
        }
        int[] loc = new int[M];
        for (int i = 0; i < M; i++) {
            loc[i] = input.nextInt();
        }

        Arrays.sort(loc);

        int maxDistance = distance(loc, 0, M - 1);

        int[] distances = new int[M - 1];

        for (int i = 0; i < M - 1; i++) {
            distances[i] = distance(loc, i, i + 1);
        }

        //find max

        int max = 0;
        int index = 0;
        int sum = 0;

        for(int j = 0; j < N - 1; j++) {
            max = 0;
            index = 0;
            for (int i = 0; i < distances.length; i++) {
                if (distances[i] > max) {
                    max = distances[i];
                    index = i;
                }
            }
            distances[index] = 0;
            sum += max;
        }

        System.out.println(maxDistance - sum);
    }
}
