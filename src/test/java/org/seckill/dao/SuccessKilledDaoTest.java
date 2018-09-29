package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @program: seckill
 * @description: 明日安在 无人能允
 * @author: yidaoyiseng
 * @create: 2018-09-22 21:09
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {

    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() {
        long phone = 13501594242L;
        int insertCount=successKilledDao.insertSuccessKilled(1001L,phone);
        System.out.println(insertCount);
    }

    @Test
    public void queryByIdWithSeckill() {
        long phone = 13501594242L;
        SuccessKilled successKilled =successKilledDao.queryByIdWithSeckill(1001L,phone);
        System.out.println(successKilled);
        System.out.println(successKilled.getSeckill());
    }

}