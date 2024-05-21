import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class b10 {
    public static output diemchung(Double[][] arr) {
        output result = new output();
        if (arr.length == 0) {
            result.status = false;
            result.message = "fail";
            result.content = "không có mảng con";
            return result;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length == 0) {
                result.status = false;
                result.message = "fail";
                result.content = "không có điểm chung";
            }
        }
        if (arr.length == 1) {
            result.status = true;
            result.message = "success";
            result.content = STR."Điểm chung: \{arr[0]}";
            return result;
        }
        List<Double> arrchung = Arrays.stream(arr[0]).distinct().collect(Collectors.toList());
        for (int i = 1; i < arr.length; i++) {
            List<Double> arrchungtamthoi = new ArrayList<>();
            for (int j = 0; j < arrchung.size(); j++) {
                for (int k = 0; k < arr[i].length; k++) {
                    if (Objects.equals(arr[i][k], arrchung.get(j))) {
                        arrchungtamthoi.add(arrchung.get(j));
                        break;
                    }
                }
            }
            arrchung = arrchungtamthoi;
            if (arrchung.isEmpty()) {
                result.status = true;
                result.message = "success";
                result.content = STR."Điểm chung: \{arrchung}";
                return result;
            }
        }
        result.status = true;
        result.message = "success";
        result.content = STR."Điểm chung: \{arrchung}";
        return result;
    }

    public static void main(String[] args) {
        Double[][] arr = {
                {3.0, 6.0, 2.0, 8.0, 6.0, 23.0},
                {3.0, 7.0, 9.0, 4.0, 2.0, 6.0},
                {9.0, 5.0, 2.0, 6.0, 2.0}
        };
        System.out.println(diemchung(arr));
    }
}
