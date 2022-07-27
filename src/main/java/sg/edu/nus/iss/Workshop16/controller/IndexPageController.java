package sg.edu.nus.iss.Workshop16.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {
    private static final Logger logger = LoggerFactory.getLogger(IndexPageController.class);

    @GetMapping(path = "/")
    public String listAllMastermind(Model model) {
        return "list";
    }

    @GetMapping(path = "/new")
    public String showAddNewBoardGame(Model model) {
        logger.info("new add mastermind");
        return "add";
    }
}
