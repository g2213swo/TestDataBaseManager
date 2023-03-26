package me.g2213swo;

import me.g2213swo.database.DataBaseManager;
import me.g2213swo.database.MySQL;
import me.g2213swo.database.Redis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextLine().equalsIgnoreCase("mysql")) {
            DataBaseManager.initialize(new MySQL());
        } else if (scanner.nextLine().equalsIgnoreCase("redis")) {
            DataBaseManager.initialize(new Redis());
        }
    }
}