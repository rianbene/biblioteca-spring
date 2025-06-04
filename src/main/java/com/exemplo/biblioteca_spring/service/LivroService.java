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
        adicionarLivro(new Livro("Dom Quixote","Miguel de Cervantes",1605));
        adicionarLivro(new Livro("1984","George Orwell",1949));
        adicionarLivro(new Livro("A Sociedade do Anel", "J.R.R. Tolkien",1954));
    }

    public List<Livro> listarTodos(){
        return new ArrayList<>(livros);
    }

    public void adicionarLivro(Livro livro){
        livro.setId(nextId++);
        livros.add(livro);
    }

    public Livro buscarPorId(Long id) {
        return livros.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void atualizarLivro(Livro livro, ){
        livro.setId();
    }
}
