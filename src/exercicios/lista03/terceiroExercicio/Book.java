package exercicios.lista03.terceiroExercicio;

public class Book {

    private String isbn;
    private String titulo;
    private String autor;

    private Integer quantidade;

    public Book() {
    }

    public Book(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void emprestimo(int qtd){
        if(this.quantidade >= qtd && qtd > 0)
            this.quantidade -= qtd;
    }

    public void devolver(int qtd){
        if(qtd > 0)
            this.quantidade += qtd;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
