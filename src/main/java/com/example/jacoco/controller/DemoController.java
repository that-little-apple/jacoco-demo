package com.example.jacoco.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 计算方法1
 */
@RestController
@RequestMapping("/")
public class DemoController {
    @RequestMapping(value = "/1", method = RequestMethod.GET)
    public String add(Param param) {
        int result = 0;
        if (param.getMethod().isEmpty()) {
            return "method参数为空，无法进行计算！";
        }
        if (param.getMethod().equals("add")) {
            result = param.getP1() + param.getP2();
        } else if (param.getMethod().equals("sub")) {
            result = param.getP1() - param.getP2();
            System.out.println("01");
        } else if (param.getMethod().equals("mul")) {
            result = param.getP1() * param.getP2();
            System.out.println("02");
        } else if (param.getMethod().equals("div")) {
            result = param.getP1() / param.getP2();
            System.out.println("03");
        } else {
            System.out.println("结束。");
            return "对不起，暂不支持您输入的计算方式！";
        }
        return param.getMethod() + "计算结果为： " + result;
    }

        @RequestMapping(value = "/2", method = RequestMethod.GET)
        public String add2(Param param) {
            int result = 0;
            if (param.getMethod().isEmpty()) {
                return "method参数为空，无法进行计算！";
            }
            if (param.getMethod().equals("add")) {
                result = param.getP1() + param.getP2();
            } else if (param.getMethod().equals("sub")) {
                result = param.getP1() - param.getP2();
                System.out.println("01");
            } else if (param.getMethod().equals("mul")) {
                result = param.getP1() * param.getP2();
                System.out.println("02");
            } else if (param.getMethod().equals("div")) {
                result = param.getP1() / param.getP2();
                System.out.println("03");
            } else {
                System.out.println("结束。");
                return "对不起，暂不支持您输入的计算方式！";
            }
            return param.getMethod() + "计算结果为： " + result;
        }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "hello!";
    }
}
