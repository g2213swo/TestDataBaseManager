package me.g2213swo;

import me.g2213swo.database.DataBaseManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数据库名称： ");
        String type = scanner.nextLine();
        DataBaseManager.initialize(type);
        System.out.println(DataBaseManager.getDataBase());
    }
}