/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.patterns.iterator;

/**
 *
 * @author Marcos
 */
public class FilmIterator implements Iterator{
    FilmItem[] itens;
    int position = 0;
	
	public FilmIterator(FilmItem[] itens) {
		this.itens = itens;
	}

	public Object next() {
		FilmItem filmItem = itens[position];
		position++;
		return filmItem;
	}

	public boolean hasNext() {
		if (position >= itens.length || itens[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
