package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.SuccessKilled;

/**
 * @program: seckill
 * @description: 明日安在 无人能允
 * @author: yidaoyiseng
 * @create: 2018-09-21 19:10
 **/
public interface SuccessKilledDao {
    /**
     * 插入购买明细，过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(@Param("seckillId") Long seckillId, @Param("userPhone") Long userPhone);

    /**
     * 根据id查询成功秒杀的产品并附带产品信息
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") Long seckillId, @Param("userPhone") Long userPhone);
}
