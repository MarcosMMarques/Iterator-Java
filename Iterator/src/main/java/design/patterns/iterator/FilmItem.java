/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.patterns.iterator;

/**
 *
 * @author Marcos
 */
public class FilmItem {
    private String name;
    private double price;
	
    public FilmItem(String name, double price){
	setName(name);
	setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
	this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
}
