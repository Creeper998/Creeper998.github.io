package com.java.pojo;

public class Room {
    private Integer roomN;
    private String roomClass;
    private String roomStatus;
    private Integer bedN;
    private String money;
    private String username;

    public Integer getRoomN() {
        return roomN;
    }

    public void setRoomN(Integer roomN) {
        this.roomN = roomN;
    }

    public String getRoomClass() {
        return roomClass;
    }

    public void setRoomClass(String roomClass) {
        this.roomClass = roomClass;
    }

    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Integer getBedN() {
        return bedN;
    }

    public void setBedN(Integer bedN) {
        this.bedN = bedN;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomN=" + roomN +
                ", roomClass='" + roomClass + '\'' +
                ", roomStatus='" + roomStatus + '\'' +
                ", bedN=" + bedN +
                ", money='" + money + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
