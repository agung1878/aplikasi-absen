package id.go.absen.aplikasiabsen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author agung
 */
@Controller
public class HomeController {
    @RequestMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
    
    @ModelAttribute("pageTitle")
    public String pageTitle() {
        return "Dashboard";
    }
}
