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
@RequestMapping("/jurusan")
public class JurusanController {
    
    @GetMapping("/list")
    public String showList(){
        return "jurusan/list";
    }
    
    @GetMapping("/form")
    public String showForm(){
        return "jurusan/form";
    }
    
    @ModelAttribute("pageTitle")
    public String pageTitle(){
        return "Jurusan";
    }
}
