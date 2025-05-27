package com.elguiadeltallado.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/inicio"})
    public String home(Model model) {
        model.addAttribute("mensaje", "Hola Mundo desde El Guía del Tallado");
        return "index";
    }
    
    @GetMapping("/productos")
    public String productos() {
        return "productos";
    }
}
