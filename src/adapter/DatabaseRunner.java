package adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterFromJavatoDatabase();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
