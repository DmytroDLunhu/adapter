package adapter;

public class AdapterFromJavatoDatabase extends JavaApp implements Database {

    @Override
    public void insert() {
        saveObj();
    }

    @Override
    public void update() {
        updateObj();
    }

    @Override
    public void select() {
        loadObj();
    }

    @Override
    public void remove() {
        deleteObj();
    }
}
