import java.util.Scanner;

class output1{
    public Boolean status;
    public String message;
    public Double content;
}

public class b1 {
    public static Scanner in = new Scanner(System.in);
    public static output1 tong(Double[] arr){
        output1 result = new output1();
        if (arr.length == 0) {
            result.status = false;
            result.message = "không tính được tổng vì mảng không có phần tử";
            return result;
        }

        int  dem = 0;
//        for(int i = 0; i < arr.length; i++) {   //duyệt từng phần tử trong mảng cho đến phần tử cuối
//            if(arr[i] instanceof Double){
//                result.content += arr[i];
//            }else dem++;
//        }
//        if(dem==0){
//            result.status = true;
//            result.message = "tính tổng thành công";
//        }else{
//            result.status = false;
//            result.message = "mảng không có phần tử số";
//        }

//        for(double i: arr){
//            result.status = true;
//            result.message = "tính tổng thành công";
//            result.content += i;
//        }

//        result.content = Arrays.stream(arr).reduce(0.0,(tong,giatri) -> tong + giatri);

        result.status = true;
        result.message = "tính tổng thành công";
        return result;    //trả ra output
    }
    public static void main(String[] args) {
        System.out.print("nhập số phần tử của mảng:");
        int n = in.nextInt();
        Double[] array = new Double[n];
        System.out.println("nhập phần tử của mảng:");
        for(int i =0; i<n;i++){
            System.out.print("array"+"["+i+"]: ");
            array[i] = in.nextDouble();
        }
        System.out.println(tong(array).status);
        System.out.println(tong(array).message);
        System.out.println(tong(array).content);
    }
}
