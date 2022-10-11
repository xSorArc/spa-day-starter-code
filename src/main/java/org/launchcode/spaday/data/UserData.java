package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.util.ArrayList;

public class UserData {

    // TODO: create add(), getAll(), getById() methods
    private static ArrayList<User> allUsers;

    public static void add(User user) {
        allUsers.add(user);
    }

    public static ArrayList<User> getAll() {
        return allUsers;
    }

//    public static ArrayList<User> getById(User user) {
//
//    }
}
