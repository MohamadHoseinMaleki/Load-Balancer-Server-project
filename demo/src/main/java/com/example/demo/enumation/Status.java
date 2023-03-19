package com.example.demo.enumation;

public enum Status {

    SERVER_UP ("SERVER_UP"),
    SERVER_DOWN ("SERVER_DWON");
    private final String status;

    Status(String status){
        this.status=status;
    }

    public String getStatus(){
        return this.status;

    }
}
