import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class output2 extends output1{
    public Double[] content2;
}
public class b2 {
    public static output2 Binhphuong (Double[] arr){
        output2 result = new output2();
        result.content2 = new Double[arr.length];
        int dem = 0;
        if(arr.length == 0){
            result.status = false;
            result.message = "Mảng không có phần tử";
            return result;
        }
//        for(int i = 0; i<arr.length; i++){
//            result.content2[i] = arr[i] * arr[i];
//        }

        List<Double> list = Arrays.stream(arr).map(el -> el*el).collect(Collectors.toList());
        for(int i = 0; i<list.size();i++){
            result.content2[i] = list.get(i);
        }
        result.status = true;
        result.message = "bình phương thành công";
        return result;
    }

    public static void main(String[] args) {
        Double[] array = {3.0,4.2,5.2,-6.1};
        System.out.println(Binhphuong(array).status);
        System.out.println(Binhphuong(array).message);
        System.out.println(Arrays.toString(Binhphuong(array).content2));
    }
}
