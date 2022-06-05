package com.haha.controller;

import com.haha.vo.Student;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author : zengkai
 * @email:598421227@qq.com
 * @desc:
 * @datetime:2022/5/2 16:24
 */
@RestController
public class RedisController {

    //redis操作对象
    @Resource
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/set")
    public String addToRedis() {

        //操作string类型的数据
        ValueOperations valueOperations = redisTemplate.opsForValue();

        valueOperations.set("myname", "haha");

        return "add";

    }

    @RequestMapping("/get")
    public String getData() {

        ValueOperations valueOperations = redisTemplate.opsForValue();

        String myname = (String) valueOperations.get("myname");


        return myname;

    }

    @RequestMapping("/set2")
    public String addToRedis2() {

        //操作string类型的数据
        stringRedisTemplate.opsForValue().set("name","haha");

        return "add2";

    }

    @RequestMapping("/get2")
    public String getData2() {

        String name = stringRedisTemplate.opsForValue().get("name");

        return name;

    }


    @RequestMapping("/json")
    public String addJson(){

        Student student = new Student();
        student.setId(1);
        student.setName("haha");
        student.setAge(20);

        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));

        redisTemplate.opsForValue().set("student",student);

        return "json";

    }

    @RequestMapping("/getjson")
    public String getJson(){


        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(Student.class));

        Student student =(Student) redisTemplate.opsForValue().get("student");

        return "json"+student;

    }

}
