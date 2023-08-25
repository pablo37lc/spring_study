package com.mysite.spring_study;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/main")
    @ResponseBody
    public String index() {
        return "QnA 게시판 입니다.";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:question/list";
    }
}
