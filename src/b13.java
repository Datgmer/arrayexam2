import java.util.ArrayList;
import java.util.Scanner;

public class b13 {
    static Scanner in = new Scanner(System.in);

    public static ArrayList<String> nhapmon() {
        ArrayList<String> monan = new ArrayList<>();
        System.out.print("Nhập số lượng món ăn");
        int n = in.nextInt();
        System.out.print("Món ưa thích 1:");
        String m = in.next(); // Sử dụng in.next() để đọc món đầu tiên
        monan.add(m);
        for (int i = 1; i < n; i++) {
            System.out.print(STR."Món ưa thích \{i + 1}:");
            m = in.nextLine(); // Sử dụng in.nextLine() cho các món còn lại
            monan.add(m);
        }
        return monan;
    }

    public static void main(String[] args) {
        nhapmon();

    }
}
