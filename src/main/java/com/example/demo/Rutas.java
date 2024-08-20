package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController                 // clases que definen rutas
public class Rutas {
    
    @GetMapping ("/hola")
    String primeraRuta() {
        return "Hola mundo desde Spring Controller :)";
    }


    // aplicando path param
    // http://localhost:8081/libro/1
    @GetMapping ("/libro/{id}")
    String leerLibros(@PathVariable int id) {
        return "Leyendo el libro id: " + id;
    }


    // http://localhost:8081/libro/25/torres
    @GetMapping ("/libro/{id}/{editorial}")
    String leerLibros2param(@PathVariable int id, @PathVariable String editorial) {
        return "Leyendo el libro id: " + id + ", editorial: " + editorial;
    }
    
    // agregando query params
    
    
    // http://localhost:8081/libro2/25?params=parametroenviado
    // http://localhost:8081/libro2/25?token=parametroenviado&params=parametroAceptado   ignora el parametro token y toma solo el params
    @GetMapping ("/libro2/{id}")
    String leerLibros2Queryparam(@PathVariable int id, @RequestParam String params) {
        return "Leyendo el libro id: " + id + ", params: " + params;
    }
    
    // http://localhost:8081/libro3/25?token=jaldjsflkjlkjfeik&params=parametroAceptado 
    @GetMapping ("/libro3/{id}")
    String leerLibros2Queryparam2(@PathVariable int id, @RequestParam String params, @RequestParam String token) {
        return "Leyendo el libro id: " + id + ", params: " + params + ",token: "+ token;
    }

    
    




}
