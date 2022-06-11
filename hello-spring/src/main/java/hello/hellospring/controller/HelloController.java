package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

    // 1. 정적 컨텐츠 -> 파일을 그대로 반환한다.
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!");
        return "hello";
    }


    // 2. mvc와 템블릿 엔진 = model, view, controller
    // -> 템플릿 엔진을 모델뷰 컨트롤러 방식으로 쪼갠다 = 렌더링이 된 html을 반환
    @GetMapping("hello-mvc")
    // 파라미터의 정보가 required = true 이다. 기본으로 파라미터 값(attribueValue)을 넘겨주어야 한다.
    // 파마리터 정보 보는 단축키 cmd + p
    // ex) localhost:8080/hello-mvc?name=spring!
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";    // xml 반환
    }


    // API 방식 -> json을 반환한다.
    @GetMapping("hello-string")
    @ResponseBody // body에 직접 해당값을 넣어주겠다.
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; // "hello spring"
    }

    // json 방식으로 결과값이 나온다. -> default
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        // 객체가 오면 json 방식으로 만들어서 http 응답에 반환을 해준다.
        hello.setName(name);
        return hello;
    }


    // javabean 표준 규약
    static class Hello {
        // private인 변수를 다른 클래스에서 사용하지 못하므로
        private String name;

        // getter setter 메서드를 생성하여 다른 클래스에서 사용가능하도록 만듬
        // 프로퍼티 접근 방법
        // cmd + n -> getter and setter 생성가능
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}
