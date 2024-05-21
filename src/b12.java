import java.util.*;

public class b12 {
    static Scanner in = new Scanner(System.in);

    public static ArrayList<String> nhapmon() {
        ArrayList<String> monan = new ArrayList<>();
        System.out.print("Nhập số lượng món ăn");
        int n = in.nextInt();
        in.nextLine();
//        System.out.print("Món ưa thích 1:");
//        monan.add(in.next());
        for (int i = 0; i < n; i++) {
            System.out.print(STR."Món ưa thích \{i + 1}:");
            String m = in.nextLine();
            monan.add(m);
        }
        return monan;
    }

    public static void main(String[] args) {
        ArrayList<String> monan = nhapmon();
        System.out.println(monan);
        System.out.print("Nhập món ăn muốn thêm: ");
        String themmon = in.nextLine();
        System.out.println(STR."Thêm món ăn ưa thích \{monan.add(themmon)}");
        System.out.println(monan);
        System.out.println(STR."Loại bỏ món ăn đầu tiên \{monan.removeFirst()}");
        System.out.println(monan);
        System.out.println(STR."Số lượng món ăn còn lại \{monan.size()}");
        if (monan.size() < 2) {
            System.out.println("Chỉ có duy nhất 1 món ăn");
        } else {
            System.out.println(STR."Món ăn thứ 2: \{monan.get(1)}");
        }
        monan.sort(Comparator.reverseOrder());
        System.out.println(STR."Sắp xếp món ăn từ z-a: \{monan}");
        System.out.print("Nhập món ăn muốn tìm: ");
        String timmon = in.nextLine();
        int vitrimon = -1;
        for(int i = 0; i < monan.size(); i++){
            if(monan.get(i).toLowerCase().trim().contentEquals(timmon.toLowerCase().trim())){
                vitrimon = monan.indexOf(monan.get(i));
                break;
            }
        }
        if (vitrimon == -1) {
            System.out.println("Không có món ăn cần tìm trong danh sách");
        } else {
            System.out.println(STR."Món cần tìm là món thứ \{vitrimon + 1} trong danh sach");
        }
        System.out.println(STR."Các món ăn trong mảng là: \{monan}");
    }
}
