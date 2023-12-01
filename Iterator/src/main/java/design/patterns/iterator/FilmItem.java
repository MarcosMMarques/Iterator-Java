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
    String name;
    double price;
	
    FilmItem(String name, double price){
	this.name = name;
	this.price = price;
    }

    public void setPrice(double price) {
	this.price = price;
    }
}
