/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sandyakbar.latihanmvcjdbc.main;

import edu.sandyakbar.latihanmvcjdbc.dabase.BarbershopDatabase;
import edu.sandyakbar.latihanmvcjdbc.error.PelangganException;
import java.sql.SQLException;
import javax.swing.SwingUtilities;

/**
 *
 * @author Andri
 */
public class PBOULANG10114504LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    MainViewPelanggan pelanggan = new MainViewPelanggan();
                    pelanggan.loadDatabase();
                    pelanggan.setVisible(true);
                } catch (SQLException ex) {
                } catch (PelangganException ex) {
                }

            }
        });


        /*
        //BarbershopDatabase.getConnection();
        Pelanggan pelanggan = new Pelanggan();
        pelanggan.setNama("Sandy Akbar");
        pelanggan.setAlamat("Jalan Kiaracondong");
        pelanggan.setTelepon("082217267227");
        pelanggan.setEmail("kasandeee@gmail.com");
        dao.insertPelanggan(pelanggan);
         */
 /*
         Pelanggan pelanggan = dao.getPelanggan(1);
         System.out.println("NAMA : "+pelanggan.getNama());
         */
 /*
        Pelanggan pelanggan = dao.getPelanggan("rizkiadam01@gmail.com");
        System.out.println("NAMA : " + pelanggan.getNama());
         */
 /*
        PelangganDao dao = BarbershopDatabase.getPelangganDao();
        dao.deletePelanggan(1);
         */
 /*Pelanggan pelanggan = dao.getPelanggan(1);
        pelanggan.setNama("Hulk");
        pelanggan.setAlamat("Jalan Industri");
        dao.updatePelanggan(pelanggan);
         */

 /*
         List<Pelanggan> list = dao.selectAllPelanggan();
         for (Pelanggan pelanggan : list) {
             System.out.println("NAMA : "+pelanggan.getNama());
             System.out.println("ALAMAT : "+pelanggan.getAlamat());
             System.out.println("TELEPON : "+pelanggan.getTelepon());
             System.out.println("EMAIL : "+pelanggan.getEmail());
            
        }*/
    }
}
