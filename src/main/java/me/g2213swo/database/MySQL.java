package me.g2213swo.database;

public class MySQL implements DataBase {

    @Override
    public void connect() {
        System.out.println("MySQL connected!");
    }

    @Override
    public void disconnect() {
        System.out.println("MySQL disconnected!");
    }

    @Override
    public void createTable() {
        System.out.println("MySQL table created!");
    }

    @Override
    public void deleteTable() {
        System.out.println("MySQL table deleted!");
    }

    @Override
    public void insert() {
        System.out.println("MySQL inserted!");
    }

    @Override
    public void update() {
        System.out.println("MySQL updated!");
    }

    @Override
    public void delete() {
        System.out.println("MySQL deleted!");
    }

    @Override
    public void select() {
        System.out.println("MySQL selected!");
    }
}
