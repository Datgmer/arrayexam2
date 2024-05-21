import java.util.*;

public class b11 {
    static Scanner in = new Scanner(System.in);
    public static output gop(ArrayList<ArrayList<Double>> a){
        output result = new output();
        int demmangrong = 0,kichthuocmang = 0,chiso = 0;
        for (ArrayList<Double> doubles : a) {
            if (doubles.isEmpty()) {
                demmangrong++;
            }
            kichthuocmang += doubles.size();
        }
        if (demmangrong == a.size()) {
            result.message = "Không có phần tử nào để gộp, sắp xếp và rút gọn";
            return result;
        }
        Double[] array = new Double[kichthuocmang];
        for(ArrayList<Double> t : a){
            for(Double el : t){
                array[chiso++] = el;
            }
        }

        Arrays.sort(array);
        List<Double> newarr = Arrays.stream(array).distinct().toList();
        result.status = true;
        result.message = "thành công";
        result.content = STR."Mảng gộp, sắp xếp và rút gọn: \{newarr}";
        return result;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Double>> a = new ArrayList<>();
        System.out.print("Nhập số lượng mảng");
        int somang = in.nextInt();
        System.out.print("Nhập số lượng phần tử");
        int soptu = in.nextInt();
        for(int i=0;i<somang;i++){
            ArrayList<Double> mang = new ArrayList<>();
            for(int j = 0;j< soptu; j++){
                System.out.print(STR."ptu \{j+1}:");
                Double ptu = in.nextDouble();
                mang.add(ptu);
            }
            a.add(mang);
        }
        System.out.println(a);
        System.out.println(gop(a));
    }
}
