package no4;

/*
Nama      : Siti Nursahida Imlan_13020180104
Kelas     : B2
hari/tgl  : Senin, 18 Mei 2020
 */

import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.util.logging.Level;
	import java.util.logging.Logger;
	public class DatabaseUtilities{
	    private static Connection con;
	    public static Connection getConnection(){
	        if(con==null){
	            try {
	                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbakademik","root","");
	                //dbnyadbakademik, usernyaroot, danpasswordnyakosong
	            } 
	            catch (SQLException ex) {
	                Logger.getLogger(DatabaseUtilities.class.getName()).log(Level.SEVERE, null, ex);
	            }
	        }
	    return con;
	    }
	}
