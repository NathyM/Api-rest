package com.apirest.progavan;

import org.springframework.web.bind.annotation.*;

@RestController
public class ApiController {

    @GetMapping("/home")
    public String home(){
        return "Página Inicial da API";
    }
    @GetMapping("/")
    public String pegar(){
        return "Esse endpoint utiliza o verbo GET.";
    }
    @PostMapping("/")
    public String postar(){
        return "Esse endpoint utiliza o verbo POST.";
    }
    @PutMapping("/")
    public String colocar() {
        return "Esse endpoint utiliza o verbo PUT.";
    }
    @PostMapping("/{dado}")
    public String recebe(@PathVariable("dado") String dado){
        return "Esse Endpoint recebe o" + dado + "via URL.";
    }
    @PutMapping("/estudante")
    public String estudante(@RequestBody String dado){
        return"Esse Endpoint recebe o" + dado +  "via Corpo de Requisição.";
    }

    @DeleteMapping("/")
    public String deletar(){
        return "Esse endpoint utiliza o verbo DELETE.";
    }


}
