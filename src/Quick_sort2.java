import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quick_sort2 {
    public static ArrayList<Integer> quick_sort(ArrayList<Integer> arr) {
        if (arr.size() < 2) {
            return arr;
        }
        ArrayList<Integer> leftarr = new ArrayList<>();
        ArrayList<Integer> rightarr = new ArrayList<>();
        Integer pivot = arr.getLast();
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < pivot) {
                leftarr.add(arr.get(i));
            } else {
                rightarr.add(arr.get(i));
            }
        }
        ArrayList<Integer> sortedleft = quick_sort(leftarr);
        ArrayList<Integer> sortedright = quick_sort(rightarr);
        ArrayList<Integer> sortedarr = new ArrayList<>();
        sortedarr.addAll(sortedleft);
        sortedarr.add(pivot);
        sortedarr.addAll((sortedright));
        return sortedarr;
    }

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int ptu;
        do {
            try {
                System.out.print("Nhập số lượng phần tử: ");
                ptu = in.nextInt();
                if (ptu < 0) {
                    throw new IllegalArgumentException("Số lượng phần tử không được âm");
                }
                if (ptu == 0) {
                    throw new IllegalArgumentException("Mảng rỗng vui lòng nhập lại");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println(STR."Nhập sai định dạng số vui lòng nhập lại \{e}");
                in.next();
            } catch (IllegalArgumentException i) {
                System.out.println(i);
            }
        } while (true);
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < ptu; i++) {
            int j;
            do {
                try {
                    System.out.print(STR."phần tử \{i}:");
                    j = in.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println(STR."Nhập sai định dạng số vui lòng nhập lại");
                    in.next();
                }
            } while (true);
            array.add(j);
        }
        System.out.println(STR."Dãy đã sắp xếp: \{quick_sort(array)}");
    }
}