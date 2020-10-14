package packagebylayer.detailed.frameworks.db;

import packagebylayer.detailed.enterprisebusinessrules.entity.User;

public class Database {
    public User readUser() {
        return new User("Ben", "encryptedPassword");
    }
}
