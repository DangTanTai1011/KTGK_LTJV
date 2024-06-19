package com.example.NhanVien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "KIỂM TRA BUỔI 8 - LẬP TRÌNH ỨNG DỤNG VỚI JAVA!");
        return "home/index";
    }
}
