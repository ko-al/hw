package com.kolaiev.hw.model;

public class Orders {
    private int orderId;
    private int personId;
    private String status;

    public Orders(int orderId, int personId, String status) {
        this.orderId = orderId;
        this.personId = personId;
        this.status = status;
    }

    public Orders() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
