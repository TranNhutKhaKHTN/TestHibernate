/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testhibernate;

import POJO.Diem;
import POJO.Hocsinh;
import dao.HocSinhDao;
import java.util.List;

/**
 *
 * @author HP
 */
public class TestHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Hocsinh> ds=HocSinhDao.layDanhSachSinhVien();
        for(int i=0; i<ds.size(); i++){
        Hocsinh sv=ds.get(i);
        System.out.println("MSSV: "+sv.getMaSv());
        System.out.println("Họ và tên: "+sv.getHoTen());
        System.out.println("Ngày sinh: " +
        sv.getNgaySinh());
        System.out.println("Địa chỉ: "+ sv.getDiaChi());
        }
        Diem d;
        double a;
        a = 6.6;
        d = new Diem(2,"1111",(float)a);
        HocSinhDao.ThemDiem(d);
    }
    
}
