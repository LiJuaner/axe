package com.hxy.lab.axe.controller;

import com.hxy.lab.axe.api.PeopleControllerApi;
import com.hxy.lab.axe.model.entity.People;
import com.hxy.lab.axe.service.impl.PeopleServiceImpl;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
public class PeopleController implements PeopleControllerApi {

    @Autowired
    private PeopleServiceImpl peopleService;



    @GetMapping("getAll")
    @Override
    public List<People> getAll() {
        return peopleService.list();
    }

    @PostMapping("add")
    @Override
    public People addPeople(@RequestParam String name,
                            @RequestParam String sex,
                            @RequestParam String birth,
                            @RequestParam String province) {
        return null;
    }
}
