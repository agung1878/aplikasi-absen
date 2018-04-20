package id.go.absen.aplikasiabsen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author agung
 */
@Controller
@RequestMapping("/absen")
public class AbsenController {
    
    @GetMapping("/list")
    public String showList(){
        return "absen/list";
    }
    
    @GetMapping("/form")
    public String showForm(){
        return "absen/form";
    }
    
    @ModelAttribute("pageTitle")
    public String pageTitle(){
        return "Absen";
    }
}
