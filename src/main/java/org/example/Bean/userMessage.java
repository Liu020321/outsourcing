package org.example.Bean;

public class userMessage {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUserintro() {
        return userintro;
    }

    public void setUserintro(String userintro) {
        this.userintro = userintro;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public userMessage(int id, String name, int age, String phonenumber, String userintro, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.userintro = userintro;
        this.address = address;
    }

    private int id;
    private String name;
    private int age;
    private String phonenumber;
    private String userintro;
    private String address;

    public userMessage(){

    }



}
