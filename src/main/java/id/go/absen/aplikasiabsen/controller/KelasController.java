package id.go.absen.aplikasiabsen.controller;

import id.go.absen.aplikasiabsen.dao.KelasDao;
import id.go.absen.aplikasiabsen.entity.Jurusan;
import id.go.absen.aplikasiabsen.entity.Kelas;
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
@RequestMapping("/kelas")
public class KelasController {

    @Autowired
    private KelasDao kelasDao;

    @GetMapping("/list")
    public String showList(ModelMap mm, @PageableDefault(size = 10) Pageable pageable) {
        Page<Kelas> result = kelasDao.findAll(pageable);
        mm.addAttribute("data", result);
        return "kelas/list";
    }

    @GetMapping("/form")
    public String showForm(@RequestParam(required = false) String id, ModelMap mm) {
        Kelas kelas = new Kelas();
        if (StringUtils.hasText(id)) {
            kelas = kelasDao.findById(id).get();
        }
        mm.addAttribute("kelas", kelas);
        return "kelas/form";
    }

    @ModelAttribute("pageTitle")
    public String pageTitle() {
        return "Kelas";
    }

    @PostMapping("/form")
    public String prosesForm(@ModelAttribute @Valid Kelas kelas, BindingResult errors, ModelMap mm) {
        if (errors.hasErrors()) {
            mm.addAttribute("kelas", kelas);
            return "/kelas/form";
        }
        kelasDao.save(kelas);
        return "redirect:/kelas/list";
    }

    @GetMapping("/delete")
    public String deleteData(@RequestParam(required = false) String id) {
        kelasDao.deleteById(id);

        return "redirect:/kelas/list";
    }
}
