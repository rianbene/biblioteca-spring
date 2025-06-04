package com.exemplo.biblioteca_spring.model;

public class Livro {
    private Long id;
    @NotBlank(message = "Campo obrigatório")
    @Size(min = 3, max = 100, message = "Campo deve ter entre 3 e 100 caracteres")
    private String titulo;
    @NotBlank(message = "Campo obrigatório")
    private String autor;

    private int anoPublicacao;

    public Livro (String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
