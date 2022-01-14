package com.docker.dockerdemo02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengyou.yp
 * @Title: DockerDemoController
 * @Description:
 * @date 2022/1/149:52 上午
 */
@RestController
public class DockerDemoController {
    @GetMapping("/login")
    public String login(){
        return "hello world !";
    }
}
