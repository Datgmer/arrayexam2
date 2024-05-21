import java.util.Arrays;
import java.util.Scanner;

public class Quick_sort {
    static Scanner in = new Scanner(System.in);

    public static void quick_sort(int[] arr, int left, int right) {
        if (left < right) {
            int vitrichiamang = phanvung(arr, left, right);
            quick_sort(arr, left, vitrichiamang - 1);
            quick_sort(arr, vitrichiamang + 1, right);
        }
    }

    public static int phanvung(int[] arr, int left, int right) {
        int chot = arr[right];
        int vitrichot = right;
        for (int i = right - 1; i >= left; i--) {
            if (arr[i] >= chot) {
                vitrichot--;
                int tam = arr[i];
                arr[i] = arr[vitrichot];
                arr[vitrichot] = tam;
            }
        }
        int tam = arr[right];
        arr[right] = arr[vitrichot];
        arr[vitrichot] = tam;
        return vitrichot;
    }

    public static void main(String[] args) {
        System.out.print("Nhập số lượng phần tử: ");
        int ptu = in.nextInt();
        int[] array = new int[ptu];
        for (int i = 0; i < array.length; i++) {
            System.out.print(STR."phần tử \{i}:");
            int j = in.nextInt();
            array[i] = j;
        }
        if (array.length == 0 ) {
            System.out.println("sắp xếp thất bại vì không có phần tử");
            System.out.println(STR."mảng sau khi sắp xếp: \{Arrays.toString(array)}");
        } else if(array.length == 1){
            System.out.println("sắp xếp thất bại vì số lượng phần tử là 1");
            System.out.println(STR."mảng sau khi sắp xếp: \{Arrays.toString(array)}");
        } else {
            quick_sort(array, 0, array.length - 1);
            System.out.println("Sắp xếp thành công");
            System.out.println(STR."mảng sau khi sắp xếp: \{Arrays.toString(array)}");
        }
    }
}
