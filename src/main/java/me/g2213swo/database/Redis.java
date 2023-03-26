package me.g2213swo.database;

public class Redis implements DataBase{
    @Override
    public void connect() {
        System.out.println("Redis connected!");
    }

    @Override
    public void disconnect() {
        System.out.println("Redis disconnected!");
    }

    @Override
    public void createTable() {
        System.out.println("Redis table created!");
    }

    @Override
    public void deleteTable() {
        System.out.println("Redis table deleted!");
    }

    @Override
    public void insert() {
        System.out.println("Redis inserted!");
    }

    @Override
    public void update() {
        System.out.println("Redis updated!");
    }

    @Override
    public void delete() {
        System.out.println("Redis deleted!");
    }

    @Override
    public void select() {
        System.out.println("Redis selected!");
    }
}
