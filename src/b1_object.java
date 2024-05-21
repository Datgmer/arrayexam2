import java.util.Scanner;
class nhanvien{
    private String ten;
    private Integer tuoi;
    private String diachi;
    private String sdt;

    public nhanvien (String ten, Integer tuoi, String diachi, String sdt){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
public class b1_object {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        nhanvien[] f13 = new nhanvien[6];
        f13[0] = new nhanvien("Phan Thành Đạt", 22,"Lĩnh Nam","0145685168");
        f13[1] = new nhanvien("Phan Lương Bằng", 24, "Tây Hồ", "0659794354");
        f13[2] = new nhanvien("Phạm Ngọc Lợi", 24,"Trường Chinh","0367843893");
        f13[3] = new nhanvien("Nguyễn Hải Long",27,"Tây Hồ","0269419414");
        f13[4] = new nhanvien("Tô Văn Nguyên", 24,"Mỹ Đình","0318791648");
        f13[5] = new nhanvien("Nguyễn Đình Giang", 21, "Mỹ Đình","0475464156");

    }
}
