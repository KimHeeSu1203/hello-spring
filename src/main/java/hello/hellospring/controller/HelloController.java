package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("hello") // url 받은 것에 매칭
    public String Hello(Model model){
        model.addAttribute("data","sprint!");
        return "hello"; // view resolver가 알아서 HTML 파일을 찾는다
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){ // ?name= ~~~ 의 값이 name에 들어가고
        model.addAttribute("name",name); //name에 들어간 값이 name이름으로 넘어감
        return "hello-template";

    }
}