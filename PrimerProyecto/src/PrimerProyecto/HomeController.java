package PrimerProyecto;


import org.sprint

@RestController
@RequestMapping("/hello")
public class HomeController {
     @RequestMapping("")
     public String hello() {
             return "Hello World!";
     }
     @RequestMapping("/world")
     public String world() {
             return "¡Las anotaciones de clase tambien son geniales!";
     }
}

