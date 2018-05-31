package pl.parkin9.Hang_out_Man.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.parkin9.Hang_out_Man.service.CodewordService;

import java.io.IOException;

@Controller
public class IndexController {

    private final CodewordService codewordService;

    @Autowired
    public IndexController(CodewordService codewordService) {
        this.codewordService = codewordService;
    }

//////////////////////////////////////////////////////////////////////////////////

    @GetMapping("/")
    public ModelAndView showIndexForm() throws IOException {

        String codeword = codewordService.getRandCodeword();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("codeword", codeword);

        return modelAndView;
    }
}
