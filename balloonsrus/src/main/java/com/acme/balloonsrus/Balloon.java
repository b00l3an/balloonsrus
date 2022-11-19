/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.acme.balloonsrus;

/**
 *
 * @author Brendan
 */

public class Balloon {
    private String label;
    private double price;
    private String description;
    private String material;
    private String gas;
    private String occasion;
       
    public Balloon(String label, double price, String description,
            String material, String gas, String occasion){
        this.label = label;
        this.price = price;
        this.description = description;
        this.gas = gas;
        this.occasion = occasion;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getMaterial() {
        return material;
    }

    public String getGas() {
        return gas;
    }

    public String getOccasion() {
        return occasion;
    }
    
}
