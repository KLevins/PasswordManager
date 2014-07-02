package commands;

import java.sql.*;
//import java.util.Date;
//import java.sql.*;


public class ReadAllCommand implements Command {
	
	private final Connection connection;
	
	public  ReadAllCommand(Connection connection){
        this.connection = connection;
    }
	
	public boolean execute(String input) {

        System.out.println("����� ��������� �������������:\n");

        try {
            Statement statement = connection.createStatement();

            statement.execute("select USER, PASSWORD, DATE from USERPASSWORD");

            ResultSet set = statement.getResultSet();
            while(set.next()){
                String user = set.getString("USER");
                String pass = set.getString("PASSWORD");
                String date = set.getString("DATE");
                System.out.println("     "+user+" - "+pass+" - "+date);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}	

	
////	public Entry getEntryByName(String Name){
////		//open connection
////		Entry entry = new Entry();
////		statement.execute("select user, password from userPassword where id = " + id);
////		entry.setId(id)
////		return user;
////	}
////	
////	public Boolean deleteEntry (String Name){
////		
////	}
//	
//	//CRUD
//	//Entry
//	//������� � ������������� ���� ������ Hash function (��������� HashTable) (�� �������� ��������� �� ���������� ������)
//	
//	/*� ���� ������ �������� �������� ����, ������. �������� 4 ������� Create, Read, Update, Delete
//	  class DbHelper()
//	  ������ ������
//	   
//	  public static Boolean createEntry(Entry entry)
//	  ���������� TRUE ���� ���� �������� � �������, FALSE ���� ���
//	  
//	  public static Boolean getEntryByName(String name)
//	  ���������� TRUE ���� ������������ ������ �� �����, FALSE ���� ���
//	  
//	  public static Boolean updateEntry(Entry entry)
//	  ���������� TRUE ���� ������ � ������� ��������, FALSE ���� ��� 
//	  
//	  public static Boolean deleteEntry(Entry entry)
//	  ������������ TRUE ���� ������������ ������, FALSE ���� ���
//	  
//	  class Entry()
//	  ����: 
//	  		public String name;
//	        public String password; 
//	        private Calendar changeDate;
//	  ������:
//	        public Entry setName(String name);
//	        public Entry setPassword(String password);
//	        public Calendar getChangeDate();
//	  ������ �������������:
//	  Entry user = new Entry().setName("User").setPassword("1234");
//	  */
//
//
//
////class Entry
////{
////	public String name;
////	public String password;
////	//public Date
////
////	public Entry setName(String name) {
////		this.name = name;
////		return this;
////	}
////	
////	public Entry setPassword(String password) {
////		this.password = password;
////		return this;
////	}
////	
////	public Calendar ChangeDate;
////	
////	public Entry getChangeDate() { 
////		this.ChangeDate = Calendar.getInstance();
////		return this;
////	}
////}