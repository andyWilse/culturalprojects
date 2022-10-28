package com.leqing.culture.culturalprojects.livestream.controller;

import com.leqing.culture.culturalprojects.livestream.entity.UserVo;
import com.leqing.culture.culturalprojects.livestream.services.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/demo")
public class DemoController {
    @Autowired
    private DemoService demoService;

    @GetMapping
    public String getDemo(){
        List<UserVo> users = demoService.selectAll();
        return users.get(0).getUserName();
    }

}
