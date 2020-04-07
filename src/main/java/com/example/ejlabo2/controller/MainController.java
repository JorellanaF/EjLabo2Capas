package com.example.ejlabo2.controller;

import com.example.ejlabo2.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/agregarUsuario")
    public String enviarForm(Usuario usuario){

        return "agregarUsuario";
    }

    @PostMapping("/agregarUsuario")
    public String procesarForm(Usuario usuario){

        return "mostrarMensaje";
    }

}
