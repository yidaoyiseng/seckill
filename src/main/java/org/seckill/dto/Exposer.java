package org.seckill.dto;

/**
 * @program: 暴露秒杀地址
 * @description: 明日安在 无人能允
 * @author: yidaoyiseng
 * @create: 2018-09-24 12:45
 **/
public class Exposer {
    private Long seckillId;
    //当前系统时间
    private Long now;
    private Long start;
    private Long end;
    //加密
    private String MD5;
    //是否开启秒杀
    private boolean exposed;

    public Exposer(Long seckillId, boolean exposed) {
        this.seckillId = seckillId;
        this.exposed = exposed;
    }

    public Exposer(Long seckillId,Long now, Long start, Long end, boolean exposed) {
        this.seckillId=seckillId;
        this.now = now;
        this.start = start;
        this.end = end;
        this.exposed = exposed;
    }

    public Exposer(Long seckillId, String MD5, boolean exposed) {
        this.seckillId = seckillId;
        this.MD5 = MD5;
        this.exposed = exposed;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Long getNow() {
        return now;
    }

    public void setNow(Long now) {
        this.now = now;
    }

    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getEnd() {
        return end;
    }

    public void setEnd(Long end) {
        this.end = end;
    }

    public String getMD5() {
        return MD5;
    }

    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    public boolean isExposed() {
        return exposed;
    }

    public void setExposed(boolean exposed) {
        this.exposed = exposed;
    }

    @Override
    public String toString() {
        return "Exposer{" +
                "seckillId=" + seckillId +
                ", now=" + now +
                ", start=" + start +
                ", end=" + end +
                ", MD5='" + MD5 + '\'' +
                ", exposed=" + exposed +
                '}';
    }
}
