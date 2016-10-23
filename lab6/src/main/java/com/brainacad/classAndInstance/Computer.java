package com.brainacad.classAndInstance;

/**
 * Write Computer class, the attributes of this class is
 * manufacturer (of String type),
 * serialNumber(of int type),
 * price (of float type),
 * quantityCPU(of int type) and
 * frequencyCPU(of int type).
 */
public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public Computer(String manufacturer, int serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    public Computer() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void view(){
        System.out.printf("%s %s %d %f %d %d\n",getClass(),getManufacturer(),getSerialNumber(),getPrice(),getQuantityCPU(),getFrequencyCPU());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber=" + serialNumber +
                ", price=" + price +
                ", quantityCPU=" + quantityCPU +
                ", frequencyCPU=" + frequencyCPU +
                '}';
    }
}
