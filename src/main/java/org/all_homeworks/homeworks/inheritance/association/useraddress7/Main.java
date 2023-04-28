package org.all_homeworks.homeworks.inheritance.association.useraddress7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Vardkez");
        User user2 = new User("Vigen");
        User user3 = new User("Anahit");

        Address address = new Address("erevan");

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        address.setUserList(userList);
        System.out.println("address \t" + " user ");
        System.out.println(address.getAddress() + " \t\t" + address.getUserList());

    }
}
