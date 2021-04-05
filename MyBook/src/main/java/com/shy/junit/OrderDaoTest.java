package com.shy.junit;

import com.shy.dao.OrderDao;
import com.shy.dao.impl.OrderDaoImpl;
import com.shy.bean.Order;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

public class OrderDaoTest {

    @Test
    public void saveOrder() {

        OrderDao orderDao = new OrderDaoImpl();

        orderDao.saveOrder(new Order("1234567891",new Date(),new BigDecimal(100),0, 1));

    }
}