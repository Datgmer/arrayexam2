import java.util.HashMap;
import java.util.Map;

class output7 {
    public Boolean status;
    public String message;
    public Map<Character,Integer> kytu;
    public Map<Integer,Integer> so;

    @Override
    public String toString() {
        return "output7{" +
                "\nstatus=" + status +
                ",\n message='" + message + '\'' +
                ",\n kytu=" + kytu +
                ",\n so=" + so +
                "\n}";
    }
}
public class b7 {
    public static output7 dem(Character[][] a){
        output7 result = new output7();
        if(a.length == 0){
            result.message = "Không có mảng ký tự để đếm";
            return result;
        }
        int demmangrong = 0;
        result.kytu = new HashMap<>();
        result.so = new HashMap<>();
        for (Character[] mangtrong : a) {
            if (mangtrong.length == 0) {
                demmangrong++;
            } else {
                for (char el : mangtrong) {
                    if(Character.isDigit(el)){
                        int number = el - '0';
                        result.so.put(number,result.so.getOrDefault(number,0)+1);
                    }else{
                        result.kytu.put(el,result.kytu.getOrDefault(el,0)+1);
                    }
                }
            }
        }
        if (demmangrong == a.length) {
            result.status = false;
            result.message = "Không có ký tự để đếm";
            return result;
        }
        result.status = true;
        result.message = "Các ký tự và số lượng của chúng là:";
        return result;
    }

    public static void main(String[] args) {
        Character[][] input = {{'1','2'}, {'a','b','3'}, {'a','3'}};
        System.out.println(dem(input));
    }
}
