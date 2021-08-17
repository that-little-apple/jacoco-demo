/**
 * projectName: CyberRange
 * fileName: Param.java
 * packageName: com.cyber.range.controller
 * date: 2021-02-20 下午2:51
 */
package com.example.jacoco.controller;


import lombok.Data;

/**
 * @version: V1.0
 * @author: kuohai
 * @className: Param
 * @packageName: com.cyber.range.controller
 * @description: 计算器参数
 * @data: 2021-02-20 下午2:51
 **/
@Data
public class Param {

    private int p1;
    private int p2;
    private String method;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

}