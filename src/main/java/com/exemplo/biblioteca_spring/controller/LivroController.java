package com.exemplo.biblioteca_spring.controller;

import com.exemplo.biblioteca_spring.service.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
