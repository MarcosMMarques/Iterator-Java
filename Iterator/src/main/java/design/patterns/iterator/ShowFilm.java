/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package design.patterns.iterator;

/**
 *
 * @author Marcos
 */
public class ShowFilm {
    public static void main(String[] args) {
	FilmItem [] filmItens = new FilmItem[6];
	filmItens[0] = new FilmItem("Batman Cavaleiro das Trevas", 18);
	filmItens[1] = new FilmItem("Interstelar", 15);
	filmItens[2] = new FilmItem("Missão Impossivel", 12);
	filmItens[3] = new FilmItem("Duna", 17);
        filmItens[4] = new FilmItem("Filme do Pelé", 7);
        filmItens[5] = new FilmItem("Ultima Aparição", 10);
		
	FilmIterator filmIterator = new FilmIterator(filmItens);
		
	while (filmIterator.hasNext()) {
            FilmItem filmItem = filmIterator.next();
            System.out.println(filmItem.getName() + " = R$ " + filmItem.getPrice());
	}
    }
}
