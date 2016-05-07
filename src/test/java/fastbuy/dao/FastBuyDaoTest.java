package fastbuy.dao;

import fastbuy.entity.FastBuy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.List;


/**
 * Created by wenqing on 2016/5/7.
 * Ctrl+Shift+T  ÃÌº”≤‚ ‘¿‡
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")
public class FastBuyDaoTest {

    @Resource
    private FastBuyDao fastBuyDao;

    @Test
    public void testReduceNumber() throws Exception {
        int row = fastBuyDao.reduceNumber(1004,new Date());
        System.out.println(row);
    }

    @Test
    public void testQueryById() throws Exception {
        long id = 1004;
        FastBuy fastBuy = fastBuyDao.queryById(1004);
        System.out.println(fastBuy);
    }

    @Test
    public void testQueryAll() throws Exception {
        List<FastBuy> list = fastBuyDao.queryAll(0,100);
        System.out.println(list);
    }
}