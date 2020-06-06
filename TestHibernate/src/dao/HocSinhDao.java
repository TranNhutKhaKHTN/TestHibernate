/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import POJO.Diem;
import POJO.Hocsinh;
import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

/**
 *
 * @author HP
 */
public class HocSinhDao {
    public static List<Hocsinh> layDanhSachSinhVien() {
    List<Hocsinh> ds = null;
    Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
    try {
    String hql = "select sv from Hocsinh sv";
    Query query = session.createQuery(hql);
    ds = query.list();
    } catch (HibernateException ex) {
//Log the exception
    System.err.println(ex);
    } finally {
        session.close();
    }   
        return ds;
    }
    
    public static List<Diem> layDanhSachDiem() {
    List<Diem> ds = null;
    Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
    try {
    String hql = "select sv from Diem sv";
    Query query = session.createQuery(hql);
    ds = query.list();
    } catch (HibernateException ex) {
//Log the exception
    System.err.println(ex);
    } finally {
        session.close();
    }   
        return ds;
    }
    
    public static String layTenHS(int id)
    {
        String name = "";
        Session session;
        session = NewHibernateUtil.getSessionFactory()
                .openSession();
    try {
    String hql = "from Hocsinh hs"
            + "where hs.maSv =:id";
    Query query = session.createQuery(hql);
    query.setInteger("id", id);
    name = query.toString();
    } catch (HibernateException ex) {
//Log the exception
    System.err.println(ex);
    } finally {
        session.close();
    }   
        return name;
    }
    
    public static void ThemDiem(Diem d)
    {
        Session session;
        session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
        transaction = session.beginTransaction();
        session.save(d);
        transaction.commit();
        } catch (HibernateException ex) {
//Log the exception
            transaction.rollback();
            System.err.println(ex);
        } finally {
            session.close();
        }
    }
}
