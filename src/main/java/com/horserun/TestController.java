package com.horserun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println("**** hello *** ");
        return "we";
    }

    @RequestMapping("he")
    public @ResponseBody  Student say()
    {
        Student st = new Student();
        st.setAge(9);
        st.setName("phil");
        return st;
    }

}
