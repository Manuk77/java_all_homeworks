package org.all_homeworks.homeworks.inheritance.association.useraddress7;

import java.util.ArrayList;
import java.util.List;

public class Address {
    private String address;
    private List<User> userList;

    /**
     * sets address
     * @param address
     */
    public void setAddress(String address){
        if(address != null && !address.isEmpty()){
            this.address = address;
        }
    }

    /**
     *
     * @return address
     */
    public String getAddress(){
        return this.address;
    }

    /**
     * sets user list
     * @param userList
     */
    public void setUserList(List<User> userList){
        this.userList = userList;
    }

    /**
     *
     * @return users list
     */
    public List<String> getUserList(){
        List<String> addressList = new ArrayList<String>();
        for(User user: this.userList){
            addressList.add(user.getName());
        }
        return addressList;
    }

    public Address(String address){
        this.address = address;
    }
    public Address(){}

}
