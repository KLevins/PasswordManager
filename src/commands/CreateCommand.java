package commands;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateCommand implements Command {
	
	private final Connection connection;

    public  CreateCommand (Connection connection) {
        this.connection = connection;
    }

	@Override
	public boolean execute(String input) {
		// TODO Auto-generated method stub
		return false;
	}

}
