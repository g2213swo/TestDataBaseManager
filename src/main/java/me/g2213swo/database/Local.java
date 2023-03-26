package me.g2213swo.database;

public class Local implements DataBase{

    @Override
    public void connect() {
        System.out.println("Local connected!");
    }

    @Override
    public void disconnect() {
        System.out.println("Local disconnected!");
    }

    @Override
    public void createTable() {
        System.out.println("Local table created!");
    }

    @Override
    public void deleteTable() {
        System.out.println("Local table deleted!");
    }

    @Override
    public void insert() {
        System.out.println("Local inserted!");
    }

    @Override
    public void update() {
        System.out.println("Local updated!");
    }

    @Override
    public void delete() {
        System.out.println("Local deleted!");
    }

    @Override
    public void select() {
        System.out.println("Local selected!");
    }
}
