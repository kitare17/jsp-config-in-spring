package com.viewconfig.demo1;

import com.viewconfig.demo1.entity.Home;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
public class TestController {

    @GetMapping("/hello")
    public String okTest(Model model) {
        Home home=new Home();

        model.addAttribute("home",home);
        return "hello";
    }

    @RequestMapping("/showmess")
    public String showMess(@Valid @ModelAttribute("home") Home home, BindingResult result){
        System.out.println(home);
        if (result.hasErrors())
            return "hello";
        else
        return "hello";

    }
}
