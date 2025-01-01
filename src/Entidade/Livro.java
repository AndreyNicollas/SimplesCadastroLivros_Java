package Entidade;

public class Livro {
    public String tituloLivro;
    public String autor;
    public int isbn;
    public int ed;

    public Livro(String tituloLivro, String autor, int isbn, int ed) {
        this.tituloLivro = tituloLivro;
        this.autor = autor;
        this.isbn = isbn;
        this.ed = ed;
    }

    public String getTituloLivro() {
        return this.tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getEd() {
        return this.ed;
    }

    public void setEd(int ed) {
        this.ed = ed;
    }

    public String toString() {
        return "Titulo: " + this.tituloLivro + ". Autor: " + this.autor +
                ". ISBN: " + this.isbn + ", Ed.: " + this.ed + ".";
    }
}
