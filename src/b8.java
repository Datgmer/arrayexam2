class output8{
    public Boolean status;
    public String message;
    public Double mean=0.0,median=0.0;

    @Override
    public String toString() {
        return "output8{" +
                "\nstatus=" + status +
                ",\n message='" + message + '\'' +
                ",\n mean=" + mean +
                ",\n median=" + median +
                "\n}";
    }
}
public class b8 {
    public static output8 meanandmedian(Double[] a){
        output8 result = new output8();
        if (a.length == 0) {
            result.message = "Không có phần tử để tính trung bình";
            result.mean = null;
            result.median = null;
            return result;
        }
//        if (a.length ==1){
//            result.status = true;
//            result.message = "Trung bình cộng và giá trị trung bình là:";
//        }
        Double tong = 0.0;
        for (int i = 0; i < a.length; i++) {
            tong += a[i];
        }
        result.mean = tong / a.length;

        Double hieu = Math.abs(a[0] - result.mean);
        result.median = a[0];
        if(hieu == 0){
            result.status = true;
            result.message = "Trung bình cộng và giá trị trung bình là:";
            return result;
        }
        for (int i = 1; i < a.length-1; i++) {

//            for(int j = 1; j< a.length; j++){
//                if(Math.abs(a[j] - result.mean) < Math.abs(a[j-1] - result.mean)){
//                    result.median = a[j];
//                    if(Math.abs(a[j] - result.mean) == 0){
//                        return result;
//                    }
//                }else {
//                    result.median = a[j - 1];
//                    if(Math.abs(a[j-1] - result.mean) == 0){
//                        return result;
//                    }
//                }
//            }

            if (Math.abs(a[i] - result.mean) < hieu) {
                hieu = Math.abs(a[i] - result.mean);
                result.median = a[i];
                if(hieu == 0){
                    result.status = true;
                    result.message = "Trung bình cộng và giá trị trung bình là:";
                    return result;
                }
            }
        }
        result.status = true;
        result.message = "Trung bình cộng và giá trị trung bình là:";
        return result;
    }
    public static void main(String[] args) {
        Double[] array = {12.0,46.0,32.0,64.0};
        System.out.println(meanandmedian(array));
    }
}
