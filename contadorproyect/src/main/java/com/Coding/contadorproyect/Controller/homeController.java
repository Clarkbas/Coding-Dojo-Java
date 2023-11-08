package com.Coding.contadorproyect.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@Controller
public class homeController {
    private static final Logger logger = LoggerFactory.getLogger(homeController.class);
    private static final String INDEX_VIEW = "index.jsp";
    private static final String COUNTER_VIEW = "index2.jsp";

    @GetMapping("/")
    public String index(HttpSession session, Model model) {
        // Verificar si el contador ya existe en la sesión
        if (session.getAttribute("count") == null) {
            // Si no existe, inicializar el contador en cero
            session.setAttribute("count", 0);
        } else {
            // Si existe, incrementar el contador en uno en cada visita
            int count = (int) session.getAttribute("count");
            count++;
            session.setAttribute("count", count);
        }
        
        return INDEX_VIEW;
    }

    @GetMapping("/model")
    public String incrementCounter(Model model, HttpSession session) {
        // Verificar si el contador ya existe en la sesión
        if (session.getAttribute("count") == null) {
            // Si no existe, inicializar el contador en cero
            session.setAttribute("count", 0);
        } else {
            // Si existe, incrementar el contador en uno en cada visita
            int count = (int) session.getAttribute("count");
            count++;
            session.setAttribute("count", count);
        }
        
        model.addAttribute("contador", session.getAttribute("count"));
        return INDEX_VIEW;
    }

    @GetMapping("/counter")
    public String showCounter(Model model, HttpSession session) {
        // Verificar si el contador ya existe en la sesión
        if (session.getAttribute("count") == null) {
            // Si no existe, inicializar el contador en cero
            session.setAttribute("count", 0);
        } else {
            // Si existe, incrementar el contador en uno en cada visita
            int count = (int) session.getAttribute("count");
            count++;
            session.setAttribute("count", count);
        }
        
        model.addAttribute("contador", session.getAttribute("count"));
        return COUNTER_VIEW;
    }

    @GetMapping("/cerrarSesion")
    public String cerrarSesion(HttpSession session) {
        session.invalidate();
        return COUNTER_VIEW;
    }



    @GetMapping("/sesion")
    public String usarSesiones(HttpSession session) {
        if (session.getAttribute("count") == null) {
            session.setAttribute("count", 0);
        }
        Integer count = (Integer) session.getAttribute("count");
        count++;
        session.setAttribute("count", count);
        return COUNTER_VIEW;
    }

    @GetMapping("/URL")
    @ResponseBody
    public String hello() {
        return "Hola Mundo!";
    }

    @GetMapping("/saludo")
    @ResponseBody
    public String world() {
        return "<b>texto world!</b>";
    }

    @GetMapping("/greeting/hello")
    @ResponseBody
    public String hello_2() {
        return "Hello world! ¿Qué ruta utilizaste para acceder aquí?";
    }

    @GetMapping("/X")
    @ResponseBody
    public String index(@RequestParam(value = "consulta") String valorConsulta) {
        return "hola: " + valorConsulta;
    }

    @GetMapping("/{variable1}/{x}/{var3}/{var4}/{var5}")
    @ResponseBody
    public String showLesson(
            @PathVariable("variable1") String var1,
            @PathVariable("x") String var2,
            @PathVariable("var3") String var3,
            @PathVariable("var4") String var4,
            @PathVariable("var5") String var5) {
        return "var1: " + var1 + ", var2: " + var2 + ", var3: " + var3 + ", var4: " + var4 + ", var5: " + var5;
    }
    
    @GetMapping("/test-another-visit")
    public String testAnotherVisit(HttpSession session) {
        session.removeAttribute("count");
        return "redirect:/";
    }
}



