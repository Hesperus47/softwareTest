package com.hnist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exam2 {
    /**
     * @param headphones 耳机
     * @param shells 手机壳
     * @param protectors 手机贴膜
     * @return salary 佣金
     */
    public float commission(int headphones, int shells, int protectors){
        float salary; //佣金
        float total;  //总销售额
        if (headphones <= 0 || shells < 0 || protectors < 0){
            return (float) -1 ;
        }
        total = headphones * 80 + shells * 10 + protectors * 8;
        if (total < 1000){
            salary = total * (float) 0.1;
        }else if (total < 1800){
            salary = 1000 * (float) 0.1 + (total - 1000) * (float) 0.15;
        }else {
            salary = 1000 * (float) 0.1 + (800) * (float) 0.15 + (total - 1800) * (float) 0.2;
        }
        return salary;
    }

    //语句覆盖
    @Test
    public void Test1(){
        assertEquals(commission(0,0,0),-1,0);
        assertEquals(commission(10,10,10),98,0);
        assertEquals(commission(20,10,10),217,0);
        assertEquals(commission(20,20,10),236,0);
    }

    //判定覆盖
    @Test
    public void Test2(){
        assertEquals(commission(20,20,10),236,0);
        assertEquals(commission(20,10,10),217,0);
        assertEquals(commission(10,10,10),98,0);
        assertEquals(commission(0,0,0),-1,0);
    }

    //条件覆盖
    @Test
    public void Test3(){
        assertEquals(commission(20,20,10),236,0);
        assertEquals(commission(20,10,10),217,0);
        assertEquals(commission(10,10,10),98,0);
        assertEquals(commission(-1,0,0),-1,0);
    }

    //条件判定覆盖
    @Test
    public void Test4(){
        assertEquals(commission(20,20,10),236,0);
        assertEquals(commission(20,10,10),217,0);
        assertEquals(commission(10,10,10),98,0);
        assertEquals(commission(-1,0,0),-1,0);
    }

    //条件组合覆盖
    @Test
    public void Test5(){
        assertEquals(commission(20,20,10),236,0);
        assertEquals(commission(20,10,10),217,0);
        assertEquals(commission(10,10,10),98,0);
        assertEquals(commission(-1,0,0),-1,0);
    }

    //路径覆盖
    @Test
    public void Test6(){
        assertEquals(commission(0,0,0),-1,0);
        assertEquals(commission(10,10,10),98,0);
        assertEquals(commission(20,10,10),217,0);
        assertEquals(commission(20,20,10),236,0);
    }

    //MC/DC覆盖
    @Test
    public void Test7(){
        assertEquals(commission(10,10,10),98,0);
        assertEquals(commission(20,10,10),217,0);
        assertEquals(commission(20,20,10),236,0);
    }
}
