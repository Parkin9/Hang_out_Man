package pl.parkin9.Hang_out_Man.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/index")
    public ModelAndView showIndexForm() {

        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }
}
