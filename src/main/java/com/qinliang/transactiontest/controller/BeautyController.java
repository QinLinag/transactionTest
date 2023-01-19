package com.qinliang.transactiontest.controller;


import com.qinliang.transactiontest.service.BeautyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeautyController {

    @Autowired
    private BeautyService beautyService;


    @RequestMapping("/delete1")
    @Transactional(rollbackFor = Exception.class)
    public String delete1() throws Exception {
        boolean b = beautyService.removeById(4);

        try{
            int a=1/0;
        }catch (Exception e){
            throw new Exception();
        }

        System.out.println(b);
        return "ok";
    }


    //同一个类中，没有被@Transactional修饰的方法调用被@Transactional修饰的方法，   @Transactional失效
    @RequestMapping("/delete2")
    public String delete2() throws Exception {
       test();
       int a=1/0;
        return "ok";
    }


    @Transactional
    public void test(){
        beautyService.removeById(7);
    }



    @GetMapping("/hello")
    public String hello(){
        return "hello my name is qinliang 哈哈哈";
    }





}
