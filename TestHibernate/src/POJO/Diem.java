package POJO;
// Generated May 26, 2020 3:19:12 PM by Hibernate Tools 4.3.1



/**
 * Diem generated by hbm2java
 */
public class Diem  implements java.io.Serializable {


     private int stt;
     private String masv;
     private Float diem;

    public Diem() {
    }

	
    public Diem(int stt) {
        this.stt = stt;
    }
    public Diem(int stt, String masv, Float diem) {
       this.masv = masv;
       this.diem = diem;
    }
   
    public int getStt() {
        return this.stt;
    }
    
    public void setStt(int stt) {
        this.stt = stt;
    }
    public String getMasv() {
        return this.masv;
    }
    
    public void setMasv(String masv) {
        this.masv = masv;
    }
    public Float getDiem() {
        return this.diem;
    }
    
    public void setDiem(Float diem) {
        this.diem = diem;
    }




}


