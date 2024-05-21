import java.util.*;

public class Binarysearch {
    static Scanner in = new Scanner(System.in);

    public static output binary_search(ArrayList<Integer> arr, Integer so) {
        output result = new output();
        if (arr.isEmpty()) {
            result.status = false;
            result.message = "Dãy rỗng";
            return result;
        }
        int vitridau = 0;
        int vitricuoi = arr.size() - 1;
        while(vitridau <= vitricuoi){
            int trungvi = (vitridau + vitricuoi) /2;
            if(arr.get(trungvi).equals(so)){
                result.status = true;
                result.message = "Đã tìm thấy số cần tìm";
                result.content = STR."Vị trí số cần tìm trong dãy: \{trungvi}";
                return result;
            }else if(so < arr.get(trungvi)){
                vitricuoi = trungvi - 1;
            }else {
                vitridau = trungvi + 1;
            }
        }
        result.status = false;
        result.message = "Không tìm thấy số cần tìm";
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Nhập số phần tử trong mảng: ");
        int soptu = in.nextInt();
        ArrayList<Integer> array = new ArrayList<>(soptu);
        for(int i = 0; i<soptu ; i++){
            System.out.print(STR."phần tử \{i}");
            Integer ptu = in.nextInt();
            array.add(ptu);
        }
        System.out.print("Nhập số cần tìm: ");
        Integer socantim = in.nextInt();
        System.out.println(binary_search(array, socantim));
    }
}
