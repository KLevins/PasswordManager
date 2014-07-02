package framework;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import commands.Command;
//import commands.CreateCommand;
import commands.ReadAllCommand;
//import commands.RemoveCommand;
//import commands.UpdateCommand;


public class Main 
{
	private static boolean exitKey = true;
	private static Scanner scan;
	
	public static void main (String args[]) {
		System.out.println("Доступны следующие команды: create, read, update, delete");
		
		DBHelper helper = DBHelper.getInstance();
	    Connection connection = helper.getConnection();
	    
	    String pref = "enter your command>";
//        Command create = new CreateCommand(connection);
	    Command read = new ReadAllCommand(connection);
//        Command update = new UpdateCommand(connection);
//        Command delete = new RemoveCommand(connection);
       
        
        Map<String, Command> commandMap = new HashMap<String, Command>();
//        commandMap.put("create", create);
        commandMap.put("read", read);
//        commandMap.put("update", update);
//        commandMap.put("delete", delete);
	    
        
        scan = new Scanner(System.in);
        while (exitKey){
            System.out.print(pref);
            String input = scan.nextLine();
            if(input != null){
                if(input.length() > 0){
                    Command command = commandMap.get(input.substring(0,input.indexOf(" ")));
                    if(command != null){
                        if(command.execute(input)){
                            continue;
                        } else {
                            System.out.println("Command run error!");
                        }
                    } else {
                        System.out.println("Unknown command!");
                    }
                }
            }
        }
    }
}
