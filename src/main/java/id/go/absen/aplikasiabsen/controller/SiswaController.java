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
@RequestMapping("/siswa")
public class SiswaController {
   
    @GetMapping("/list")
    public String showList(){
        return "siswa/list";
    }
    
    @GetMapping("/form")
    public String showForm(){
        return "siswa/form";
    }
    
    @ModelAttribute("pageTitle")
    public String pageTitle() {
        return "Daftar Siswa";
    }
}
