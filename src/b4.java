import java.util.Arrays;

class output4{
    public Boolean status;
    public String message;
    public Double[] mangtrung;
    public Double[] mang0trung;

    @Override
    public String toString() {
        return "output4{" +
                "\n status=" + status +
                ",\n message='" + message + '\'' +
                ",\n mangtrung=" + Arrays.toString(mangtrung) +
                ",\n mang0trung=" + Arrays.toString(mang0trung) +
                '}';
    }
}
public class b4 {
    public static Double[] locriengbiet(Double[] a){
        if(a.length ==0 || a.length == 1){
            return a;
        }

        Double[] uniqueElements = new Double[a.length];     // Tạo mảng mới để lưu trữ các phần tử duy nhất

        int uniqueIndex = 0;    // Khởi tạo biến để theo dõi các phần tử duy nhất
        Double previousElement = null;

        for (Double element : a) {
            if (previousElement == null || !element.equals(previousElement)) {      // Kiểm tra xem phần tử hiện tại có khác với phần tử trước đó hay không
                uniqueElements[uniqueIndex++] = element;   // Nếu đó là phần tử duy nhất, hãy thêm nó vào mảng `uniqueElements`
            }
            previousElement = element;      // Cập nhật `previousElement` cho lần lặp tiếp theo
        }

        // Tạo mảng mới với kích thước thực tế của các phần tử duy nhất
        Double[] result = new Double[uniqueIndex];

        // Sao chép các phần tử duy nhất vào mảng kết quả
        System.arraycopy(uniqueElements, 0, result, 0, uniqueIndex);

        return result;
    }
    public static output4 loctrung(Double[] ...a){
        output4 result = new output4();
        for (Double[] doubles : a) {
            if (doubles.length != 0) {
                result.status = true;
                break;
            } else result.status = false;
        }
        if(!result.status){
            result.message = "Các mảng đều rỗng";
            return result;
        }
        Double[][] uniqueArrays = new Double[a.length][];
        int totalUniqueElements = 0;
        for (int i = 0; i < a.length; i++) {
            uniqueArrays[i] = locriengbiet(a[i]);
            totalUniqueElements += uniqueArrays[i].length;
        }

        Double[] newArray = new Double[totalUniqueElements]; // Tạo bản sao mảng đầu tiên

        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (Double element : uniqueArrays[i]) {
                newArray[index++] = element;
            }
        }

        int c=0,d=0;
        result.mangtrung = new Double[newArray.length];
        result.mang0trung = new Double[newArray.length];
        for (int i = 0; i < newArray.length; i++) {
            int xuathien = 0;
            if (!Arrays.asList(result.mangtrung).contains(newArray[i])) {
                for (int j = 0; j < newArray.length; j++) {
                    if (newArray[i].equals(newArray[j])) {
                        xuathien++;
                    }
                }
                if (!Arrays.asList(result.mang0trung).contains(newArray[i])) {
                    if (xuathien == a.length) {
                        result.mangtrung[c++] = newArray[i];
                    } else result.mang0trung[d++] = newArray[i];
                }
            }
        }

        result.mangtrung = Arrays.copyOf(result.mangtrung,c);
        result.mang0trung = Arrays.copyOf(result.mang0trung,d);

        if (result.mangtrung.length == 0) {
            result.status = true;
            result.message = "không có phần tử trùng giữa các mảng";
        } else if (result.mang0trung.length == 0) {
            result.status = true;
            result.message = "các phần tử của các mảng giống nhau";
        } else {
            result.status = true;
            result.message = "các phần tử trùng và phần tử không trùng là";
        }

        return result;
    }

    public static void main(String[] args) {
        Double[] a = {}, b = {7.0}, c = {};
        System.out.println(loctrung(a,b,c));
    }
}
