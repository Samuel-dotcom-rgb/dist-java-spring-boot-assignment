package edu.wctc.springbootlab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TutorialController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/tutorial/step-1")
    public String stepOne() {
        return "tutorial/step1";
    }

    @GetMapping("/tutorial/step-2")
    public String stepTwo() {
        return "tutorial/step2";
    }

    @GetMapping("/tutorial/step-3")
    public String stepThree() {
        return "tutorial/step3";
    }
}
