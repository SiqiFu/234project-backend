package camt.se234.project.service;

import camt.se234.project.dao.ProductDao;
import camt.se234.project.entity.Product;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ProductServiceImplTest {
    ProductDao productDao;
    ProductServiceImpl productService;
    @Before
    public void setup() {
        productDao = mock(ProductDao.class);
        productService = new ProductServiceImpl();
        productService.setProductDao(productDao);
    }

    @Test
    public void testgetAllProducts(){
        List<Product>mockProducts = new ArrayList<>();
        mockProducts.add(new Product(000001L,"001","p1","product1","p1.jpg",100.0));
        mockProducts.add(new Product(000002L,"002","p2","product2","p2.jpg",50.0));
        mockProducts.add(new Product(000003L,"003","p3","product3","p3.jpg",100.0));
        when(productDao.getProducts()).thenReturn(mockProducts);
        assertThat(productService.getAllProducts(),hasItems(
                new Product(000001L,"001","p1","product1","p1.jpg",100.0),
                new Product(000002L,"002","p2","product2","p2.jpg",50.0)
        ));
    }
    @Test
    public void testgetAvailableProducts(){
        List<Product> mockProducts = new ArrayList<>();
        mockProducts.add(new Product(000001L,"001","p1","product1","p1.jpg",100.0));
        mockProducts.add(new Product(000002L,"002","p2","product2","p2.jpg",50.0));
        mockProducts.add(new Product(000003L,"003","p3","product3","p3.jpg",-1));
        when(productDao.getProducts()).thenReturn(mockProducts);
        assertThat(productService.getAvailableProducts(),hasItems(
                new Product(000001L,"001","p1","product1","p1.jpg",100.0),
                new Product(000002L,"002","p2","product2","p2.jpg",50.0)
                //new Product(000003L,"003","P3","product3","p3.jpg",-1)
        ));

    }


}
