import java.util.Arrays;

class output3 extends output2{
    public Double[] mangle;
    public Double tongmangle =0.0,tongmangchan=0.0;
}
public class b3 {
    public static output3 mangchanle(Double[] a,Double[] b){
        output3 result = new output3();
        Double[] array = new Double[a.length + b.length];
        System.arraycopy(a,0,array,0,a.length);
        System.arraycopy(b,0,array,a.length,b.length);
        if(array.length == 0){
            result.status = false;
            result.message = "không có phần tử";
            return result;
        }
        result.content = 0.0;
        result.content2 = new Double[array.length];
        result.mangle = new Double[array.length];
        int c=0,d=0;
        for(int i = 0;i < array.length;i++){
            result.content += array[i];
            if(array[i] % 2 == 0){
                result.content2[c] = array[i];
                result.tongmangchan += array[i];
                c++;
            }else {
                result.mangle[d] = array[i];
                result.tongmangle += array[i];
                d++;
            }
        }
        result.content2 = Arrays.copyOf(result.content2,c);
        result.mangle = Arrays.copyOf(result.mangle,d);
        result.status = true;
        result.message = "2 mảng đã chia và các tổng là:";
        return result;
    }

    public static void main(String[] args) {
        Double[] a = {}, b = {5.4,2.8,8.0};
        System.out.println(mangchanle(a,b).status);
        System.out.println(mangchanle(a,b).message);
        System.out.println(Arrays.toString(mangchanle(a,b).content2));
        System.out.println(mangchanle(a,b).tongmangchan);
        System.out.println(Arrays.toString(mangchanle(a,b).mangle));
        System.out.println(mangchanle(a,b).tongmangle);
        System.out.println(mangchanle(a,b).content);
    }
}
