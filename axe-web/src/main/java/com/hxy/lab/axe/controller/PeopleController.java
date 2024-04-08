package com.hxy.lab.axe.controller;

import com.hxy.lab.axe.model.entity.People;
import com.hxy.lab.axe.service.impl.PeopleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author LiJuan.Li
 * @since 2024-04-08
 */
@RestController
@RequestMapping("/axe/people")
public class PeopleController {

    @Autowired
    private PeopleServiceImpl peopleService;

    @GetMapping("get")
    public List<People> get() {
        return peopleService.list();
    }
}
