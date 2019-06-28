package dbService.executor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Executor {
    private final Connection connection;

    public Executor(Connection connection) {
        this.connection = connection;
    }

    public void execUpdate(String update) throws SQLException {
        Statement stmnt = connection.createStatement();
        stmnt.execute(update);
        stmnt.close();
    }

    public <T> T execQuery(String query,
                           ResultHandler<T> handler) throws SQLException {
        Statement stmnt = connection.createStatement();
        stmnt.execute(query);
        ResultSet resultSet = stmnt.getResultSet();
        T  value = handler.handle(resultSet);
        resultSet.close();
        stmnt.close();
        return value;
    }
}
