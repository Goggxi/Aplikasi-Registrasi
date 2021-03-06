package com.goggxi.aplikasiregistrasi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Slf4j
@Controller
public class RegistrasiController {

    @GetMapping("/registrasi")
    public ModelMap tampilkanFormRegistrasi(){
        log.info("Menjalankan Method tampilkanFormRegistrasi");
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("nama", "Ipang");
        modelMap.addAttribute("waktu", LocalDateTime.now());
        return modelMap;
    }

    @PostMapping("/registrasi")
    public String prosesFormRegistrasi() {
        log.info("Insert Ke Database");

        /* Cara Salah jangan retrun html, tapi return redrect agar tidak terjadi
        double submit
        ModelAndView modelAndView = new ModelAndView("konfirmasi");
        return modelAndView; */

        return "redirect:/konfirmasi";
    }

    @GetMapping("/konfirmasi")
    public void tampilkanFormKonfirmasi(){
    }
}
