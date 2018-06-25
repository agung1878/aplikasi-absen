package id.go.absen.aplikasiabsen.controller;

import id.go.absen.aplikasiabsen.dao.JurusanDao;
import id.go.absen.aplikasiabsen.dao.KelasDao;
import id.go.absen.aplikasiabsen.dao.SiswaDao;
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
@RequestMapping("/siswa")
public class SiswaController {
    
    @Autowired
    private SiswaDao siswaDao;
    
    @Autowired
    private KelasDao kelasDao;
    
    @Autowired
    private JurusanDao jurusanDao;
   
    @GetMapping("/list")
    public String showList(ModelMap mm, @PageableDefault(size = 10) Pageable pageable){
        Page<Siswa> result = siswaDao.findAll(pageable);
        mm.addAttribute("data", result);
        return "siswa/list";
    }
    
    @GetMapping("/form")
    public String showForm(@RequestParam(required = false) String id, ModelMap mm){
        Siswa siswa = new Siswa();
        if (StringUtils.hasText(id)) {
            siswa = siswaDao.findById(id).get();
        }
        mm.addAttribute("siswa", siswa);
        mm.addAttribute("listKelas", kelasDao.findAll());
        mm.addAttribute("listJurusan", jurusanDao.findAll());
        return "siswa/form";
    }
    
    @PostMapping("/form")
    public String prosesForm(@Valid Siswa siswa, BindingResult errors, ModelMap mm) {
        if (errors.hasErrors()) { System.out.println("Terjadi Error Yoga");
            mm.addAttribute("siswa", siswa);
            mm.addAttribute("listKelas", kelasDao.findAll());
            mm.addAttribute("listJurusan", jurusanDao.findAll());
            return "/siswa/form";
        }
        siswaDao.save(siswa);
        return "redirect:/siswa/list";
    }
    
    @GetMapping("/delete")
    public String deleteData(@RequestParam(required = false) String id) {
        siswaDao.deleteById(id);
        return "redirect:/management/client/list";
    }
    
    @ModelAttribute("pageTitle")
    public String pageTitle() {
        return "Daftar Siswa";
    }
}
