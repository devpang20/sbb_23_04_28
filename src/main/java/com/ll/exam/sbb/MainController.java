package com.ll.exam.sbb;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    int num = -1;

    @RequestMapping("/plus")
    @ResponseBody
    public int showPlus(int a, int b) {
        return a + b;
    }

    @RequestMapping("/minus")
    @ResponseBody
    public int showMinus(int a, int b) {
        return a - b;
    }

    @RequestMapping("/increase")
    @ResponseBody
    public int showIncrease() {
        num++;
        return num;
    }

    @RequestMapping("/mbti/{name}")
    @ResponseBody
    public String showMbti(@PathVariable  String name) {
        return  switch (name) {
            case "홍길동" -> "INFP";
            case "홍길순" -> "ENFP";
            case "임꺽정" -> "ENFJ";
            case "반장" -> "ESTJ";
            default -> "모름";
        };
    }
}
