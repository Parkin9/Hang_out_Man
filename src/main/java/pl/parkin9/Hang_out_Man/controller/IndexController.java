package pl.parkin9.Hang_out_Man.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.parkin9.Hang_out_Man.service.CodewordService;

import java.io.FileNotFoundException;

@Controller
public class IndexController {

//    @Autowired
//    private CodewordService codewordService;

    @GetMapping("/")
    public ModelAndView showIndexForm() throws FileNotFoundException {

//        String x = codewordService.codeword();
        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.addObject("x", x);

        return modelAndView;
    }
}
