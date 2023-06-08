public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String cmnd;
    
    public Nguoi(String hoTen, int tuoi, String cmnd) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.cmnd = cmnd;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    
    public int getTuoi() {
        return tuoi;
    }
    
    public String getCmnd() {
        return cmnd;
    }
    
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
}