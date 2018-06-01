package pl.parkin9.Hang_out_Man.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.parkin9.Hang_out_Man.service.CodewordService;

import javax.servlet.http.HttpServletRequest;
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
    public ModelAndView showIndex(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }

    @PostMapping("/")
    public ModelAndView showGame(HttpServletRequest request) throws IOException {

        ModelAndView modelAndView = new ModelAndView("game");

        String player1name = request.getParameter("player1name");
        String player2name = request.getParameter("player2name");

        String codeword = codewordService.getRandCodeword();
        modelAndView.addObject("codeword", codeword);

        return modelAndView;
    }
}
