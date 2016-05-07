package fastbuy.dao;

import fastbuy.entity.SuccessBuy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by wenqing on 2016/5/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")
public class SuccessBuyDaoTest {

    @Resource
    private SuccessBuyDao successBuyDao;

    @Test
    public void testInsertSuccessBuy() throws Exception {
        int result = successBuyDao.insertSuccessBuy(1004,18363031234L);
        System.out.println(result);
    }

    @Test
    public void testQueryByIdWithFastBuy() throws Exception {
        SuccessBuy successBuy = successBuyDao.queryByIdWithFastBuy(1004L);
        System.out.println(successBuy);
    }
}