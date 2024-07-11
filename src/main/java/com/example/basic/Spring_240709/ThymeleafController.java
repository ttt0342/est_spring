package com.example.basic.Spring_240709;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ThymeleafController {


    @GetMapping("/index")
    public String index(@RequestParam("name") String name, Model model) {
        model.addAttribute("name1", name);
        return "index";
    }


//    public String index(Model model) {
//        model.addAttribute("name1", "김");
//        model.addAttribute("name2", "성");
//        model.addAttribute("style1", "color: red");
//        model.addAttribute("name3", "연");
//        model.addAttribute("style2", "color: blue");
//
//        // 속성값을 넣어주었으나 실제 화면에서는 p태그로 보인다. 이때 변수명을 맞춰주어야 화면에 뜬다.
//        return "index";  //인덱스가 HTML 파일명과 다르면 에러 발생
//    }
}
