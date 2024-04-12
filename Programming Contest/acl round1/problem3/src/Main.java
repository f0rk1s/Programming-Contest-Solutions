//Brace your keyboard
//inzva community built algoleague for every algorithm enthusiast hungry for self-improvement and friendly competition. Have fun and good luck!

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static int dogFinder (String s) {
        StringBuilder n = new StringBuilder(s);
        int count = 0;
        int index;

        while ((index = n.indexOf("DOG")) != -1) {
            n.delete(index, index + 3);
            count++;
        }
        return count;
    }
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int t = Integer.parseInt(input.nextLine()); //number of test cases
        String[] s = new String[t];
        for (int i = 0; i < t; i++) {
            s[i] = input.nextLine();
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(dogFinder(s[i]));
        }
    }
}
