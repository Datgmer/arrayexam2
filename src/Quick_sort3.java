import java.util.Arrays;
import java.util.Stack;

public class Quick_sort3 {

    public static void quickSort(int[] arr, int low, int high) {
        Stack<Integer> stack = new Stack<>();

        stack.push(high);
        stack.push(low);

        while (!stack.isEmpty()) {
            int lowIndex = stack.pop();
            int highIndex = stack.pop();

            if (lowIndex < highIndex) {
                int pivot = phanvung(arr, lowIndex, highIndex);

                stack.push(highIndex);
                stack.push(pivot + 1);
                stack.push(pivot - 1);
                stack.push(lowIndex);
            }
        }
    }

    private static int phanvung(int[] arr, int low, int high) {
        int chot = arr[high];
        int vitrichot = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= chot) {
                vitrichot++;
                doicho(arr, vitrichot, j);
            }
        }

        doicho(arr, vitrichot + 1, high);
        return vitrichot + 1;
    }

    private static void doicho(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 2, 9, 1, 6, 3, 7, 4};
        System.out.println(STR."Mảng ban đầu: \{Arrays.toString(arr)}");

        quickSort(arr, 0, arr.length - 1);
        System.out.println(STR."Mảng sau khi sắp xếp: \{Arrays.toString(arr)}");
    }
}
