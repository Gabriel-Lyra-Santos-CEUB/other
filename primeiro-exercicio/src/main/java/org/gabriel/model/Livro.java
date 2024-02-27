package org.gabriel.model;

public class Livro {
    
    private static final double precoDefault = 0.0;

    private String titulo;
    private String autor;
    private Integer paginas;
    private Double preco;
    
    public Livro(String titulo, String autor, Integer paginas, Double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.preco = preco;
    }

    public Livro(String titulo, String autor, Integer paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.preco = precoDefault;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if (titulo == null) {
            throw new RuntimeException();
        }
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Integer getPaginas() {
        return paginas;
    }
    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + ", preco=" + preco + "]";
    }
}
