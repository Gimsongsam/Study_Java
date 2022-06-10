package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello";
    }

    // 정적
    @GetMapping("hello-mvc")
    // 파라미터의 정보가 required = true 이다. 기본으로 파라미터 값(attribueValue)을 넘겨주어야 한다.
    // 파마리터 정보 보는 단축키 cmd + p
    // ex) localhost:8080/hello-mvc?name=spring!
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    // API 방식
    @GetMapping("hello-string")
    @ResponseBody // body에 직접 해당값을 넣어주겠다.
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; // "hello spring"
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }


    static class Hello {
        private String name;

        // cmd + n -> getter and setter 생성가능
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
