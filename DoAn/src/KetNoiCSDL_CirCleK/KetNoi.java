/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KetNoiCSDL_CirCleK;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author ASIA
 */
public class KetNoi {   
    
    private static final String DBNAME = "QLNS_XayDung";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "123";
    private static final String CONNECTSTRING = "jdbc:sqlserver://localhost:1433;databaseName=" + DBNAME + ";user=" + USERNAME + ";password=" + PASSWORD + ";";
    public static Statement getStament() throws SQLException {
        return DriverManager.getConnection(CONNECTSTRING).createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    } 
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(CONNECTSTRING);
    }
    
    public static Statement getStatement() throws SQLException {
        return getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }


    }
    

