package me.g2213swo.database;

public class DataBaseManager {

    public static void initialize(DataBase dataBase) {
        System.out.println("Initializing database...");
        dataBase.connect();
    }
}
