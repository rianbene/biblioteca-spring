package com.exemplo.biblioteca_spring.controller;

import com.exemplo.biblioteca_spring.model.Livro;
import com.exemplo.biblioteca_spring.service.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LivroController {
    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping("/livros")
    public String listarLivros(Model model){
        model.addAttribute("livros", livroService.listarTodos());
        return "lista-livros"; // Nome do template Thymeleaf
    }

    @GetMapping("/livros/novo")
    public String mostrarForm(Model model){
        model.addAttribute("livro", new Livro());
        return "form-livro";
    }

    @PostMapping("livros/salvar")
    public String salvarLivro(@ModelAttribute Livro livro) {
        if (livro.getId() == null) {
            // Novo livro
            livroService.adicionarLivro(livro);
        } else {
            // Edição de livro existente
            livroService.atualizarLivro(livro);
        }
        return "redirect:/livros";
    }

    @GetMapping("livros/editar/{id}")
    public String editarLivro(@PathVariable Long id, Model model) {
        // Busca o livro existente pelo ID
        Livro livro = livroService.buscarPorId(id);
        model.addAttribute("livro", livro);
        return "form-livro"; // Mesmo formulário para criar/editar
    }
}
