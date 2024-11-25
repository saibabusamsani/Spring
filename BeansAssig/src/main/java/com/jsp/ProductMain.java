package com.jsp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsp.product.Product;
import com.jsp.product.ProductDetailes;

import java.util.Collections;
import java.util.LinkedList;
public class ProductMain
{
	static LinkedList<Product> products=new LinkedList<Product>();
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/jsp/file/productConfig.xml");
        Product p1=context.getBean(Product.class);
        p1.setProductId(1);
        p1.setProductName("laptop");
        p1.setProductPrice(674);
        p1.setProductQuantity(4);
        p1.setProductBrand("acer");
        products.add(p1);
        
        Product p2=context.getBean(Product.class);
        p2.setProductId(2);
        p2.setProductName("watch");
        p2.setProductPrice(872);
        p2.setProductQuantity(2);
        p2.setProductBrand("fast track");
        
        products.add(p2);
        
        
        Product p3=context.getBean(Product.class);
        p3.setProductId(3);
        p3.setProductName("bag");
        p3.setProductPrice(991);
        p3.setProductQuantity(2);
        p3.setProductBrand("sky");
        products.add(p3);
        
        Product p4=context.getBean(Product.class);
        p4.setProductId(4);
        p4.setProductName("pen");
        p4.setProductPrice(15);
        p4.setProductQuantity(3);
        p4.setProductBrand("speed radium");
        products.add(p4);
        
        
        Product p5=context.getBean(Product.class);
        p5.setProductId(5);
        p5.setProductName("laptop");
        p5.setProductPrice(872231);
        p5.setProductQuantity(2);
        p5.setProductBrand("hp");
        products.add(p5);
       
        
        
        ProductDetailes p=context.getBean(ProductDetailes.class);
        
        p.sortingByPrice(products);
       System.out.println("********************************************");
        p.productIdEven(products);
        System.out.println("********************************************");
        p.productPriceByReverse(products);
        
    }
    
}
