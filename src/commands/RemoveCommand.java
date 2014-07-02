package commands;

import java.sql.Connection;

public abstract class RemoveCommand implements Command {

	private final Connection connection;

    public  RemoveCommand (Connection connection) {
        this.connection = connection;
    }
}
