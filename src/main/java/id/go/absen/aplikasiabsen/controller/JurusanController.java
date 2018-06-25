package id.go.absen.aplikasiabsen.controller;

import id.go.absen.aplikasiabsen.dao.JurusanDao;
import id.go.absen.aplikasiabsen.entity.Jurusan;
import id.go.absen.aplikasiabsen.entity.Siswa;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author agung
 */
@Controller
@RequestMapping("/jurusan")
public class JurusanController {
    
    @Autowired
    private JurusanDao jurusanDao;
    
    @GetMapping("/list")
    public String showList(ModelMap mm, @PageableDefault(size = 10) Pageable pageable){
        Page<Jurusan> result = jurusanDao.findAll(pageable);
        mm.addAttribute("data", result);
        return "jurusan/list";
    }
    
    @GetMapping("/form")
    public String showForm(@RequestParam(required = false) String id, ModelMap mm){
        Jurusan jurusan = new Jurusan();
        if (StringUtils.hasText(id)) {
            jurusan = jurusanDao.findById(id).get();
        }
        mm.addAttribute("jurusan", jurusan);
        return "jurusan/form";
    }
    
     @PostMapping("/form")
    public String prosesForm(@ModelAttribute @Valid Jurusan jurusan, BindingResult errors, ModelMap mm) {
        if (errors.hasErrors()) {
            mm.addAttribute("jurusan", jurusan);
            return "/jurusan/form";
        }
        jurusanDao.save(jurusan);
        return "redirect:/jurusan/list";
    }
    
    @GetMapping("/delete")
    public String deleteData(@RequestParam(required = false) String id) {
        jurusanDao.deleteById(id);

        return "redirect:/jurusan/list";
    }
    @ModelAttribute("pageTitle")
    public String pageTitle(){
        return "Jurusan";
    }
}
