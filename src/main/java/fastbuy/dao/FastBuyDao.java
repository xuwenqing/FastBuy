package fastbuy.dao;

import fastbuy.entity.FastBuy;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by wenqing on 2016/5/7.
 */
public interface FastBuyDao {
    int reduceNumber(@Param("fastbuyId")long fastbuyId,@Param("buyTime")Date buyTime);
    FastBuy queryById(long fastbuyId);
    List<FastBuy> queryAll(@Param("offset")int offset,@Param("limit") int limit);
}
