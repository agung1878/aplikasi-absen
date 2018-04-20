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
@RequestMapping("/kelas")
public class KelasController {
    
    @GetMapping("/list")
    public String showList(){
        return "kelas/list";
    }
    
    @GetMapping("/form")
    public String showForm(){
        return "kelas/form";
    }
    
    @ModelAttribute("pageTitle")
    public String pageTitle(){
        return "Kelas";
    }
}
