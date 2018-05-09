package camt.se234.project.service;

import camt.se234.project.dao.OrderDao;

import camt.se234.project.entity.Product;
import camt.se234.project.entity.SaleOrder;
import camt.se234.project.entity.SaleTransaction;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SaleOrderServiceImplTest {
    OrderDao orderDao;
    SaleOrderServiceImpl orderService;
    @Before
    public void setup() {
        orderDao = mock(OrderDao.class);
        orderService = new SaleOrderServiceImpl();
        orderService.setOrderDao(orderDao);
    }
    @Test
    public void testgetSaleOrders(){
        List<SaleOrder> mockSaleorders = new ArrayList<>();
        List<SaleTransaction> mockTransactions = new ArrayList<>();
        mockTransactions.add(new SaleTransaction(000001L,"123",new SaleOrder(),new Product(000001L,"001","p1","product1","p1.jpg",100.0),10));
        mockTransactions.add(new SaleTransaction(000002L,"345",new SaleOrder(),new Product(000002L,"002","p2","product2","p2.jpg",50.0),5));
        mockTransactions.add(new SaleTransaction(000003L,"567",new SaleOrder(),new Product(000003L,"003","p3","product3","p3.jpg",40.0),3));
        mockSaleorders.add(new SaleOrder(000001L,"123",mockTransactions));
        when(orderDao.getOrders()).thenReturn(mockSaleorders);
        assertThat(orderService.getSaleOrders(),hasItems(
                new SaleOrder(000001L,"123",mockTransactions)
        ));
    }
}
