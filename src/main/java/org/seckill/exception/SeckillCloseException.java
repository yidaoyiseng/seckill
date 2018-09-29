package org.seckill.exception;

/**
 * @program: seckill
 * @description: 明日安在 无人能允
 * @author: yidaoyiseng
 * @create: 2018-09-26 15:18
 **/
public class SeckillCloseException extends SeckillException{
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
