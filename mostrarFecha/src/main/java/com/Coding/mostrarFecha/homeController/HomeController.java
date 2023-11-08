package com.Coding.mostrarFecha.homeController;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HomeController {
	
	//metodo home
    @RequestMapping("/home")
    public String index() {
        return "index.jsp";
    }
    //metodo date
    @RequestMapping("/date")
    public String date(Model model) {
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE, d 'de' MMMM, yyyy");
        String formattedDate = formatter.format(currentDate);
        model.addAttribute("formattedDate", formattedDate);
        return "date.jsp";
    }
    //metodo time
    @RequestMapping("/time")
    public String time(Model model) {
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        String formattedTime = formatter.format(currentTime);
        model.addAttribute("formattedTime", formattedTime);
        return "time.jsp";
    }
}








