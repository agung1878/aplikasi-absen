package id.go.absen.aplikasiabsen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author agung
 */
@Controller

public class LoginController {
    @GetMapping("/login")
    public String showLogin(){
        return "login";
    }
}
