package commands;

import java.sql.Connection;

public abstract class UpdateCommand implements Command {
	private final Connection connection;

    public  UpdateCommand (Connection connection) {
        this.connection = connection;
    }

}
