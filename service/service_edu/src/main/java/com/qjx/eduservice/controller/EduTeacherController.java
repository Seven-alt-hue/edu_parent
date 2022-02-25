package com.qjx.eduservice.controller;
import com.qjx.eduservice.entity.EduTeacher;
import com.qjx.eduservice.service.EduTeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author qjx
 * @since 2022-02-25
 */
@RestController
@RequestMapping("/eduservice/edu-teacher")
public class EduTeacherController {
    //访问地址： http://localhost:8001//eduservice/edu-teacher/findAll
    //把service注入
    @Autowired
    private EduTeacherService teacherService;
    //1 查询讲师表所有数据
    //rest风格
    @GetMapping("findAll")
    public List<EduTeacher> findAllTeacher(){
        //调用service的方法实现查询所有的操作
        List<EduTeacher> list = teacherService.list(null);
        return list;
    }
    @DeleteMapping("{id}")
    public boolean removeTeacher(@PathVariable String id){
        boolean flag = teacherService.removeById(id);
        return flag;
    }

}

