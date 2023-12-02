/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.patterns.iterator;

/**
 *
 * @author Marcos
 */
public class FilmIterator implements Iterator<FilmItem>{
    private FilmItem[] itens;
    private int position = 0;
	
    public FilmIterator(FilmItem[] itens) {
	setItens(itens);
    }

    public FilmItem[] getItens() {
        return itens;
    }

    public void setItens(FilmItem[] itens) {
        this.itens = itens;
    }

    @Override
    public FilmItem next() {
	FilmItem filmItem = itens[position++];
	return filmItem;
    }

    @Override
    public boolean hasNext() {
	if (position >= itens.length || itens[position] == null) {
            return false;
	} else {
            return true;
	}
    }
}
