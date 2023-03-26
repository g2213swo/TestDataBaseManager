package me.g2213swo.database;

public interface DataBase {
    public void connect();
    public void disconnect();
    public void createTable();
    public void deleteTable();
    public void insert();
    public void update();
    public void delete();
    public void select();
}
