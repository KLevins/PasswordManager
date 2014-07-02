package framework;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {

    private final Connection connection;
    private static DBHelper helper;

    private DBHelper(){
        this.connection = getConn();
    }

    public static DBHelper getInstance(){

        if(helper == null){
            helper = new DBHelper();
        }
        return helper;
    }

    public Connection getConnection(){

        return connection;
    }

    private Connection getConn() {

        Connection conn = null;

        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:"+new File("src/framework/UserPassword.db").getAbsolutePath());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }
    
//    public static boolean createEntry(Entry entry){
//    	return false;
//    }
//    
//    public static boolean getAllUsers(Entry entry){
//    	return false;    	
//    }
//    
//    public static boolean updateEntry(Entry entry){
//    	return false;
//    }
//    
//    public static boolean deleteEntry(Entry entry){
//    	return false;
//    }
    
}