/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posa;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;



public class Koneksi {
    
    public static Connection Go(){
        try {
            MysqlDataSource C = new MysqlDataSource();
            C.setServerName("localhost"); 
            C.setDatabaseName("pos_a");
            C.setUser("root"); 
            C.setPassword(""); 
            C.setPortNumber(3306); 
            C.setServerTimezone("Asia/Jakarta"); 
            Connection con = C.getConnection();
            return con;
        } catch (SQLException e) {
            System.err.println("Error: "+e.getMessage());
        }        
        return null;        
    }
    
//    public static void main(String[] args) {
//        if(Go() == null){
//            System.err.println("Koneksi Gagal");
//        }else {
//            System.out.println("Koneksi sukses");
//        }
//    }
}
