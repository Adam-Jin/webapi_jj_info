package cn.keyshen.jjinfo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author : Kayshen Xu
 * @ Date : Created in 12:40 PM 2018/11/19
 * @ Description :
 * @ Version :
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public String Hello() {
        //调用dao层

        return "Hello Word!";
    }

}
