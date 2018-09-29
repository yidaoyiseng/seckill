package org.seckill.exception;

/**
 * @program: 重复秒杀异常
 * @description: 明日安在 无人能允
 * @author: yidaoyiseng
 * @create: 2018-09-26 15:12
 **/
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
