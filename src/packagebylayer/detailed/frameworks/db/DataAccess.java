package packagebylayer.detailed.frameworks.db;

import packagebylayer.detailed.applicationbusinessrules.usecase.simpleusecase.DataAccessInterface;
import packagebylayer.detailed.enterprisebusinessrules.entity.User;

public class DataAccess  implements DataAccessInterface {

    private final Database database;

    public DataAccess(Database database) {
        this.database = database;
    }

    @Override
    public User getUser() {
        return database.readUser();
    }
}
