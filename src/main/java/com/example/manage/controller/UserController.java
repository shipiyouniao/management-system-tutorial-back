package com.example.manage.controller;

import com.example.manage.entity.User;
import com.example.manage.service.UserService;
import com.example.manage.util.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户表 控制类
 */
@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 获取用户列表
     */
    @GetMapping("/list")
    public Result<List<User>> list() {
        return Result.ok(userService.list());
    }

    /**
     * 根据用户id获取用户
     */
    @GetMapping("/getById")
    public Result<User> getById(@RequestParam Integer id) {
        return Result.ok(userService.getById(id));
    }

    /**
     * 新增用户
     */
    @PostMapping("/save")
    public Result<Boolean> save(@RequestBody User user) {
        return Result.ok(userService.save(user));
    }

    /**
     * 修改用户
     */
    @PostMapping("/update")
    public Result<Boolean> update(@RequestBody User user) {
        return Result.ok(userService.updateById(user));
    }

    /**
     * 根据用户id删除用户
     */
    @GetMapping("/delete")
    public Result<Boolean> delete(@RequestParam Integer id) {
        return Result.ok(userService.removeById(id));
    }

}
