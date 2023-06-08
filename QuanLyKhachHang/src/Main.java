public class Main {
    public static void main(String[] args) {
        KhachSan khachSan1 = new KhachSan(3, 'A');
        Nguoi khach1 = new Nguoi("Mai", 20, "123456789");
        Nguoi khach2 = new Nguoi("Phong", 25, "987654321");
        khachSan1.themKhach(khach1);
        khachSan1.themKhach(khach2);
        System.out.println("Tien thue phong cua khach1 la: " + khachSan1.tinhTienThuePhong("123456789"));
        System.out.println("Tien thue phong cua khach2 la: " + khachSan1.tinhTienThuePhong("987654321"));
        khachSan1.xoaKhach("123456789");
        System.out.println("Tien thue phong cua khach1 sau khi bi xoa la: " + khachSan1.tinhTienThuePhong("123456789"));
        khachSan1.setSoNgayThue(5);
        System.out.println("Tien thue phong cua khach2 sau khi tang so ngay thue la: " + khachSan1.tinhTienThuePhong("987654321"));
        khachSan1.setLoaiPhong('B');
        System.out.println("Tien thue phong cua khach2 sau khi doi loai phong la: " + khachSan1.tinhTienThuePhong("987654321"));
    }
}
