import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        if (n == 1) {
            System.out.print("1 0");
            return;
        }
        StringBuilder builder = new StringBuilder();
        int[] paid = new int[n];
        int total = 0;
        for (int i = 0; i < m; i++) {
            int person = input.nextInt();
            int amount = input.nextInt();

            paid[person - 1] += amount;
            total += amount;
        }

        int average = total / n;
        for (int i = 0; i < n; i++) {
            paid[i] -= average;
            builder.append((i + 1)).append(" ");

            if (paid[i] > 0) {
                builder.append(paid[i]).append(" payee\n");
            } else if (paid[i] < 0) {
                builder.append(-paid[i]).append(" debtor\n");
            } else {
                builder.append("0\n");
            }
        }
        System.out.print(builder);
    }
}
