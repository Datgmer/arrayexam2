//class output9 {
//    public Boolean status;
//    public String message;
//    public String content =1 ;
//
//    @Override
//    public String toString() {
//        return "output9{" +
//                "\nstatus=" + status +
//                ",\n message='" + message + '\'' +
//                ",\n content=" + content +
//                "\n}";
//    }
//}
public class b9 {
//    public static output9 giaithua(int a){
//        output9 result = new output9();
//        if (a < 0) {
//            result.status = false;
//            result.message = "không thể giai thừa "+ a +" vì " +a+" không phải số nguyên dương";
//            result.content = null;
//            return result;
//        }
//        if (a == 0) {
//            result.status = true;
//            result.message = "Giai thừa của số " + a +" là:";
//            return result;
//        }
//        for (int i = a; i > 0; i--) {
//            result.content *= i;
//        }
//        result.status = true;
//        result.message = "Giai thừa của số "+ a +" là:";
//        return result;
//    }

    public static void main(String[] args) {
        int a = 5;
//        System.out.println(giaithua(a));
    }
}
