package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatKillException;
import org.seckill.exception.SeckillCloseException;
import org.seckill.exception.SeckillException;

import java.util.List;

/**
 * @program: seckill
 * @description: 明日安在 无人能允
 * @author: yidaoyiseng
 * @create: 2018-09-24 12:22
 **/
public interface SeckillService {
    /**
     * 查询所有秒杀列表
     * @return
     */
    List<Seckill> getSeckillList();

    /**
     * 通过id查询秒杀列表
     * @param seckillId
     * @return
     */
    Seckill getById(Long seckillId);

    /**
     * 秒杀开始时输出秒杀接口地址
     * 否则输出系统时间和秒杀时间
     * @param seckillId
     */
    Exposer exportSeckillUrl(Long seckillId);

    /**
     * 执行秒杀操作
     * @param seckillId
     * @param userPhone
     * @param MD5
     */
    SeckillExecution executeSeckillProcedure(Long seckillId, Long userPhone, String MD5)
            throws SeckillException, SeckillCloseException, RepeatKillException;

    
}
