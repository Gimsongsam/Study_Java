package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    // 파라미터의 정보가 required = true 이다. 기본으로 파라미터 값(attribueValue)을 넘겨주어야 한다.
    // 파마리터 정보 보는 단축키 cmd + p
    // ex) localhost:8080/hello-mvc?name=spring!
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }
}
