package com.exemplo.biblioteca_spring.service;

import com.exemplo.biblioteca_spring.model.Livro;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class LivroService {
    private final List<Livro> livros = new ArrayList<>();
    private Long nextId = 1L;

    public LivroService (){
        adicionarLivro(new Livro("Dom Quixote","Miguel de Cervantes"));
        adicionarLivro(new Livro("1984","George Orwell"));
        adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
    }

    public List<Livro> listarTodos(){
        return new ArrayList<>(livros);
    }

    public void adicionarLivro(Livro livro){
        livro.setId(nextId++);
        livros.add(livro);
    }
}
