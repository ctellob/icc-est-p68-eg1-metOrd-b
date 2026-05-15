package models;

public class Movie {
  private String titulo;
  private int año;

  public Movie(String titulo, int año) {
    this.titulo = titulo;
    this.año = año;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getAño() {
    return año;
  }

  public void setAño(int año) {
    this.año = año;
  }

  @Override
  public String toString() {
    return "Movie [titulo=" + titulo + ", año=" + año + "]";
  }

}
