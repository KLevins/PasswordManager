package commands;

import java.sql.Connection;

public interface Command {

    public boolean execute(String input);
}