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

        System.out.println("»меем следующих пользователей:\n");

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
//	//’ранить в зашифрованном виде пароли Hash function (загуглить HashTable) (не €вл€етс€ проверкой на совпадение парол€)
//	
//	/*¬ базу данных ввод€тс€ значени€ ёзер, пароль. ƒоступны 4 команды Create, Read, Update, Delete
//	  class DbHelper()
//	  методы класса
//	   
//	  public static Boolean createEntry(Entry entry)
//	  возвращает TRUE если юзер добавлен в таблицу, FALSE если нет
//	  
//	  public static Boolean getEntryByName(String name)
//	  возвращает TRUE если пользователь найден по имени, FALSE если нет
//	  
//	  public static Boolean updateEntry(Entry entry)
//	  возвращает TRUE если данные в таблице изменены, FALSE если нет 
//	  
//	  public static Boolean deleteEntry(Entry entry)
//	  возвращаетс€ TRUE если пользователь удален, FALSE если нет
//	  
//	  class Entry()
//	  пол€: 
//	  		public String name;
//	        public String password; 
//	        private Calendar changeDate;
//	  методы:
//	        public Entry setName(String name);
//	        public Entry setPassword(String password);
//	        public Calendar getChangeDate();
//	  пример инициализации:
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