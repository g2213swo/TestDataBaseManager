package me.g2213swo.database;

public class DataBaseManager {

    public static DataBase dataBase = null;

    public static DataBase getDataBase() {
        if (dataBase == null) {
            DataBaseManager.initialize("local");
        }
        if (dataBase == null){
            throw new NullPointerException("Database not initialized!");
        }

        return dataBase;
    }

    public static void initialize(String type) {
        System.out.println("Initializing database...");
        switch (type) {
            case "mysql":
                dataBase = new MySQL();
                dataBase.connect();
                break;
            case "redis":
                dataBase = new Redis();
                dataBase.connect();
                break;
            case "local":
                dataBase = new Local();
                dataBase.connect();
                break;
            default:
                System.out.println("Invalid database type!");
                break;
        }
    }
}
