package packagebylayer.detailed.applicationbusinessrules.usecase.serviceusecase;

//Data structure
public class InputData {
    private final String username;
    private final String password;

    public InputData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
