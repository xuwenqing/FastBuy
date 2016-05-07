package fastbuy.dao;

import fastbuy.entity.SuccessBuy;
import org.apache.ibatis.annotations.Param;

/**
 * Created by wenqing on 2016/5/7.
 */
public interface SuccessBuyDao {
    int insertSuccessBuy(@Param("fastbuyId") long fastbuyId, @Param("userPhone") long userPhone);
    SuccessBuy queryByIdWithFastBuy(long fastbuyId);
}
