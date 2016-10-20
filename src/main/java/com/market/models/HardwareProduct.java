package com.market.models;

public class HardwareProduct {

    private int computerId;
    private String computerName;
    private int computerPrice;
    private String computerSupplier;
    private String supplierAddress;
    private String computerCustomer;
    private int categoryId;

    public HardwareProduct(int computerId, String computerName, int computerPrice, String computerSupplier, String supplierAddress, String computerCustomer) {
        this.computerId = computerId;
        this.computerName = computerName;
        this.computerPrice = computerPrice;
        this.computerSupplier = computerSupplier;
        this.supplierAddress = supplierAddress;
        this.computerCustomer = computerCustomer;
    }

    public HardwareProduct() {

    }

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getComputerName() {
        return computerName;
    }

    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }

    public int getComputerPrice() {
        return computerPrice;
    }

    public void setComputerPrice(int computerPrice) {
        this.computerPrice = computerPrice;
    }

    public String getComputerSupplier() {
        return computerSupplier;
    }

    public void setComputerSupplier(String computerSupplier) {
        this.computerSupplier = computerSupplier;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getComputerCustomer() {
        return computerCustomer;
    }

    public void setComputerCustomer(String computerCustomer) {
        this.computerCustomer = computerCustomer;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

}