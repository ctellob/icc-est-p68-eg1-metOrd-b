package controllers;

import models.Movie;

public class MovieController {

    /**
     * Método que debe ser implementado
     * Debe ordenar el arreglo de películas por título en orden ascendente.
     * 
     * @param movies Arreglo de películas a ordenar
     */
    public void sortByTitle(Movie[] movies) {
        int n = movies.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (movies[j].getTitulo().compareToIgnoreCase(movies[j + 1].getTitulo()) > 0) {
                    Movie aux = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = aux;
                }
            }
        }
    }

  

}
