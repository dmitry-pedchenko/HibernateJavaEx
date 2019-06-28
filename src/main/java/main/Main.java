package main;

import dbService.DBException;
import dbService.DBService;
import dbService.dataSets.UsersDataSet;

public class Main {
    public static void main(String[] args) {
        DBService dbsService = new DBService();

        try {
            long userId = dbsService.addUser("Dima");
            System.out.println("Added: " + userId);

            UsersDataSet dataSet = dbsService.getUser(userId);
            System.out.println("User data set: " + dataSet);

        } catch (DBException e) {
            e.printStackTrace();
        }

    }
}
