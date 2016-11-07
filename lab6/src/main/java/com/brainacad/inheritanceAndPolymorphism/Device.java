package com.brainacad.inheritanceAndPolymorphism;

/**
 * Create classes:
 1) Base class Device(manufacturer(String), price(float), serialNumber(String));
 2) Subclasses Monitor(resolutionX(int), resolutionY(int)) and EthernetAdapter(speed (int), mac (String));
 Add getters/setters and constructor to each class

 */
class Device{
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Float.compare(device.price, price) != 0) return false;
        if (!manufacturer.equals(device.manufacturer)) return false;
        return serialNumber.equals(device.serialNumber);

    }

    @Override
    public int hashCode() {
        int result = manufacturer.hashCode();
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + serialNumber.hashCode();
        return result;
    }

    public String toString()
    {
        return String.format(" %s %s, %s $%,.2f, %s %s","Device: manufacturer =" , getManufacturer(), "price="
                , getPrice(), "serialNumber=", getSerialNumber());
    }
}
