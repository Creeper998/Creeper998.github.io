package com.java.pojo;

public class Adm {
    private Integer id;
    private String admName;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Adm{" +
                "id=" + id +
                ", admName='" + admName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
