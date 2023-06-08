import java.util.ArrayList;

public class KhachSan {
    private ArrayList<Nguoi> danhSachKhach;
    private int soNgayThue;
    private char loaiPhong;
    private int giaPhong;
    
    public KhachSan(int soNgayThue, char loaiPhong) {
        this.soNgayThue = soNgayThue;
        this.loaiPhong = loaiPhong;
        switch (loaiPhong) {
            case 'A':
                giaPhong = 500;
                break;
            case 'B':
                giaPhong = 300;
                break;
            case 'C':
                giaPhong = 100;
                break;
            default:
                giaPhong = 0;
                break;
        }
        danhSachKhach = new ArrayList<Nguoi>();
    }
    
    public void themKhach(Nguoi khach) {
        danhSachKhach.add(khach);
    }
    
    public void xoaKhach(String cmnd) {
        for (Nguoi khach : danhSachKhach) {
            if (khach.getCmnd().equals(cmnd)) {
                danhSachKhach.remove(khach);
                break;
            }
        }
    }
    
    public double tinhTienThuePhong(String cmnd) {
        double tienThuePhong = 0;
        for (Nguoi khach : danhSachKhach) {
            if (khach.getCmnd().equals(cmnd)) {
                tienThuePhong = soNgayThue * giaPhong;
                break;
            }
        }
        return tienThuePhong;
    }
    
    public int getSoNgayThue() {
        return soNgayThue;
    }
    
    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }
    
    public char getLoaiPhong() {
        return loaiPhong;
    }
    
    public void setLoaiPhong(char loaiPhong) {
        this.loaiPhong = loaiPhong;
        switch (loaiPhong) {
            case 'A':
                giaPhong = 500;
                break;
            case 'B':
                giaPhong = 300;
                break;
            case 'C':
                giaPhong = 100;
                break;
            default:
                giaPhong = 0;
                break;
        }
    }
    
    public int getGiaPhong() {
        return giaPhong;
    }
}
