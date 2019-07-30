/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd.edu.seu.hibernatedemo;

import org.hibernate.Session;

/**
 *
 * @author Monirujjaman
 */
public class Main {

    public Main() {
        System.out.println("Helow World");
        Session openSession = HibernateUtil.getSessionFactory().openSession();
        System.out.println(openSession);
    }
    
    public static void main(String args[]) {
        new Main();
    }
  
}
