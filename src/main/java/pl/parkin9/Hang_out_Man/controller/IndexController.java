package pl.parkin9.Hang_out_Man.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import pl.parkin9.Hang_out_Man.Model.FormObject;
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
    public ModelAndView showIndexGet() {

        ModelAndView modelAndView = new ModelAndView("index");

        return modelAndView;
    }

    @PostMapping("/")
    public ModelAndView showIndexPost(HttpServletRequest request) {

        ModelAndView modelAndView = new ModelAndView("redirect:/game");

        //TODO
        //String player1name = request.getParameter("player1name");
        //String player2name = request.getParameter("player2name");

        return modelAndView;
    }

    @GetMapping("/game")
    public ModelAndView showGameGet() throws IOException {

        ModelAndView modelAndView = new ModelAndView("game");

        String codeword = codewordService.getRandCodeword();
        modelAndView.addObject("codeword", codeword);

        return modelAndView;
    }
}
