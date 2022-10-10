package com.java.pojo;

public class User {
    private String id;
    private String username;
    private String tel;//手机号码
    private Integer roomN;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getRoomN() {
        return roomN;
    }

    public void setRoomN(Integer roomN) {
        this.roomN = roomN;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", tel='" + tel + '\'' +
                ", roomNumber='" + roomN + '\'' +
                '}';
    }
}
