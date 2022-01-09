package com.innova.util;

public abstract class DatabaseInformation {
    private String url;
    private String userName;
    private String userPassword;
    private String forNameData;

    public DatabaseInformation() {
        this.url="jdbc:mysql://localhost:3306/innova_patika_projects";
        this.userName="root";
        this.userPassword="12345";
        this.forNameData="com.mysql.jdbc.Driver";
    }

    public DatabaseInformation(String url, String userName, String userPassword, String forNaneData) {
        this.url = url;
        this.userName = userName;
        this.userPassword = userPassword;
        this.forNameData = forNaneData;
    }

    @Override
    public String toString() {
        return "DatabaseInformation{" +
                "url='" + url + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", forNaneData='" + forNameData + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getForNaneData() {
        return forNameData;
    }

    public DatabaseInformation setForNaneData(String forNaneData) {
        this.forNameData = forNaneData;
        return this;
    }
}
