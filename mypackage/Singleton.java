package mypackage;
class DatabaseManager {
    final String filePath;

    final static DatabaseManager instance = new DatabaseManager("users/admin/databse");

    private DatabaseManager() {
        this("");
    }

    private DatabaseManager(String filePath) {
        this.filePath = filePath;
    }

    public void createAccount(String username, String password){}
}

public class Singleton {
    public static void main(String[] args) {
        DatabaseManager database = DatabaseManager.instance;
        database.createAccount("arfeen.yousuf@gmail.com", "1234");
    }
}