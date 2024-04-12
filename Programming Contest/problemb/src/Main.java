import java.util.Scanner;

public class Main {

    static int findSmallest(long[] arr) {
        long smallest = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= smallest) {
                smallest = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        String x = "4 10 8 6 5";
        Scanner input = new Scanner(x);

        int n = input.nextInt();

        long[] numbers = new long[n];
        if (n == 1) {
            System.out.println(0);
            return;
        }
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        int result = 0;
        int smallestIndex = 0;
        while(numbers[0] > 0) {
            smallestIndex = findSmallest(numbers);
            if (smallestIndex == 0) {
                break;
            }
            if (numbers[0] == numbers[smallestIndex] || numbers[0] - 1 == numbers[smallestIndex]) {
                result += 1;
                break;
            }

            long diff = (numbers[0] - numbers[smallestIndex]) / 2;
            numbers[0] -= diff;
            numbers[smallestIndex] += diff;
            result += diff;
        }
        System.out.println(result);
    }
}