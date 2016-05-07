package fastbuy.entity;

import java.util.Date;

/**
 * Created by wenqing on 2016/5/7.
 */
public class SuccessBuy {

    private long fastbuyId;
    private long userPhone;
    private short state;
    private Date createTime;
    private FastBuy fastBuy;

    public long getFastbuyId() {
        return fastbuyId;
    }

    public void setFastbuyId(long fastbuyId) {
        this.fastbuyId = fastbuyId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public FastBuy getFastBuy() {
        return fastBuy;
    }

    public void setFastBuy(FastBuy fastBuy) {
        this.fastBuy = fastBuy;
    }

    @Override
    public String toString() {
        return "SuccessBuy{" +
                "fastbuyId=" + fastbuyId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                ", fastBuy=" + fastBuy +
                '}';
    }
}
