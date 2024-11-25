package com.shopping;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shopping.config.Config;
import com.shopping.dao.CartDao;
import com.shopping.dao.CustomerDao;
import com.shopping.dao.OrdersDao;
import com.shopping.dao.PaymentDao;
import com.shopping.dao.ProductDao;
import com.shopping.entity.Cart;
import com.shopping.entity.Customer;
import com.shopping.entity.Orders;
import com.shopping.entity.Payment;
import com.shopping.entity.Product;

public class App 
{
    

	static ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	static ProductDao productDao=context.getBean(ProductDao.class);
	static CustomerDao customerDao=context.getBean(CustomerDao.class);
	static CartDao cartDao=context.getBean(CartDao.class);
	static OrdersDao ordersDao=context.getBean(OrdersDao.class);
	static PaymentDao paymentDao=context.getBean(PaymentDao.class);
	static ArrayList<Product> purchasedProducts=new ArrayList<Product>();
	static ArrayList<Orders> orders=new ArrayList<>();
	static List<Orders> saveOrderList = ordersDao.addOrder(orders);
	static List<Product> products=productDao.productDetailes();
	static Scanner sc=new Scanner(System.in);
	public static void main( String[] args )
    {
    	
    	System.out.println("**********^^^^^^^^^^^^^^^^^^^^^^^^^**************************");
    	System.out.println("**^^^^^^*** WELCOME TO E-SHOPPING  ****^^^^^^^***");
    	System.out.println("**********^^^^^^^^^^^^^^^^^^^^^^^^^**************************");
    	System.out.println("press 1 --> Customer Registrastion   \npress 2 --> customer login");
    	boolean isValid=true;
    	System.out.println("choose option");
    	while(isValid)
    	{
    		
    		int n=sc.nextInt();
        	switch(n)
        	{
    	    	case 1 :customerRegistration();isValid=false;
    	 
    	    	break;
    	    	case 2 :customerLogin();isValid=false;
    	    	break;
    	    	default: System.err.println("please enter valid option");
        	}
    	}
    }
	
	public static void loginAfter(Customer customer)
	{
		
		System.out.println("1 --> cart detailes\n2 --> product detailes\nenter your choice");
		boolean isValid=true;
    	System.out.println("choose option");
		while(isValid)
		{
			switch(sc.nextInt())
			{
				case 1:  cartDetailes(customer);isValid=false;
				break;
				case 2 : productDetailes(customer);isValid=false;
				break;
				default: System.err.println("please enter valid option");
				
			}
		}
		
	}
	public static void cartDetailes(Customer customer)
	{
		List<Cart> cartDetailes = cartDao.getCustomerCartDetailesByID(customer.getCustomerid());
		if(cartDetailes.size()==0)
		{
			System.err.println("Oops ! no Carts Are Available");
			System.out.println("please choose products");
			 productDetailes(customer);
		}
		else
		{
			int sno=1;
			System.out.println("****^^^^** All Cart detailes ****^^^^********");
			System.out.println("SNO  product  price");

			for(Cart cart:cartDetailes)
			{
				System.out.println(sno+++"    "+cart.getProductname()+"    "+cart.getProductprice());
			}
			
			if(cartDetailes.size()>1)
			{
				boolean oneMore=true;
				while(oneMore)
				{
					System.out.println("1 --> buy \n2 --> remove");
					int n=sc.nextInt();
					switch (n) 
					{
						case 1:
						{
							buyFromCart(cartDetailes, customer);	
						}
						break;
						case 2:
						{
							deleteFromCart(cartDetailes);
							
						}
					}
					System.out.println("if you to continue Yes ? No");
					String data=sc.next();
					if("yes".equalsIgnoreCase(data))
					{
						oneMore=true;;
					}
					else
					{
						oneMore=false;
						
						double totalAmount=purchasedProductsAmount();
						
						orderDetailes();
						
						System.out.println("your total bill : "+totalAmount);
						payment(totalAmount);
					}
				}
			}
			else
			{
				System.out.println("1 --> buy \n2 --> remove");
				int n=sc.nextInt();
				switch (n) 
				{
					case 1:
					{
						buyFromCart(cartDetailes, customer);	
					}
					break;
					case 2:
					{
						deleteFromCart(cartDetailes);
						System.out.println("delete successfully");
		
						
					}
				}
			}
		}
	}
	public static void deleteFromCart(List<Cart> cartDetailes)
	{
		boolean isPresent=true;
		while(isPresent)
		{
			System.out.println("select serail number");
			int s=sc.nextInt();
			if(s<=cartDetailes.size())
			{
				isPresent=false;
				Cart cart=cartDetailes.get(s-1);
				cartDao.deleteCart(cart.getCartid());	
				
			}
			else
			{
				System.err.println("please enter valid sno");
			}
		}
	}
	public static void productDetailes(Customer customer)
	{
		productDetailes();
		
		boolean status=true;
		while(status)
		{
			System.out.println("enter serail number");
			int sno=sc.nextInt();
			boolean isSnoPresent=true;
			while(isSnoPresent)
			{
				
				if(sno<=products.size())
				{
					isSnoPresent=false;
					Product p=products.get(sno-1);
					int totalQuantity=p.getQuantity();
					if(p.getQuantity()==0)
					{
						System.out.println("stock availability : "+p.getQuantity());
						System.err.println("please choose another product ");
						break;
					}
					
					boolean isPresent=true;
					while(isPresent)
					{
						System.out.println("enter quantity");
						int quantity=sc.nextInt();
						if(quantity<=totalQuantity )
						{
							p.setQuantity(totalQuantity-quantity);
							
							productDao.updateQuantity(p);
							p.setQuantity(quantity);
							double price = p.getPrice();
							p.setPrice(p.getPrice());
							purchasedProducts.add(p);
							System.out.println(p);
							
							p.setPrice(p.getQuantity()*p.getPrice());
							saveOrder(customer, p);
							p.setPrice(price);
							isPresent=false;
						}
						else
						{
							System.err.println("out of stock");
							System.out.println("stock availability : "+p.getQuantity());
						
						}
					}
					
					System.out.println("if you to continue Yes ? No");
					String data=sc.next();
					if("yes".equalsIgnoreCase(data))
					{
						status=true;;
					}
					else
					{
						status=false;
						System.out.println("enter : \n1 --> purchase\n2 --> Add to Cart");
						int n=sc.nextInt();
						switch(n)
						{
							case 1:
							{
								double totalPrice=purchasedProductsAmount();
		
								orderDetailes();
								System.out.println("your total bill : "+totalPrice);
								payment(totalPrice);
								
								
							}
							break;
						}
					}
					
					
				}
				else
				{
					System.err.println("please enter valid Sno");
					System.out.println("enter valid sno");
					sno=sc.nextInt();
				}
				
			}
			
		}
		
	}
	static void buyFromCart(List<Cart> cartDetailes,Customer customer)
	{
		boolean isPresent=true;
		while(isPresent)
		{
			System.out.println("select serail number");
			int s=sc.nextInt();
			if(s<=cartDetailes.size())
			{
				isPresent=false;
				
				Cart cart=cartDetailes.get(s-1);
				Optional<Product> product = productDao.productByid(cart.getProductid());
				Product p = product.get();
				int totalQuantity=p.getQuantity();
				if(totalQuantity==0)
				{
					System.out.println("stock availability : "+totalQuantity);
					if(totalQuantity==0)
					{
						System.err.println("please choose another product ");
						break;
					}
				}
				boolean isAvailable=true;
				while(isAvailable)
				{
					System.out.println("enter quantity");
					int quantity=sc.nextInt();
					if(quantity<=totalQuantity)
					{
						p.setQuantity(totalQuantity-quantity);
						
						productDao.updateQuantity(p);
						p.setQuantity(quantity);
						p.setPrice(p.getPrice());
						purchasedProducts.add(p);
						saveOrder(customer, p);
						
						System.out.println(p);
						
						isAvailable=false;
					}
					else
					{
					
						System.err.println("out of stock");
						System.out.println("stock availability : "+totalQuantity);
						
					}
				}
			}
			else
			{
				System.err.println("please enter valid sno");
			}
			
		}
		
	}
	static void payment(double totalPrice)
	{
		System.out.println("enter amount to pay");
		Double amount=sc.nextDouble();
		boolean isCorrect=true;
		while(isCorrect)
		{
			
			if(amount==totalPrice)
			{
				if(saveOrderList!=null)
				{
					
					System.out.println("order placed succesfully");
					Payment payment=new Payment();
					payment.setAmout(amount);
					payment.setDate(Date.valueOf(LocalDate.now()));
					payment.setType("online");
					payment.setTime(Time.valueOf(LocalTime.now())+"");
					
				
					Payment savePayment = paymentDao.savePayment(payment);
					if(savePayment!=null)
					{
						
						System.out.println("payment successfull");
					}
				}
				
				isCorrect=false;
			}
			else
			{
				System.err.println("invalid amount");
				System.out.println("your total bill : "+totalPrice);
				
				System.out.println("enter valid amount");
				amount=sc.nextDouble();
				
			}
		}
	}
	public static void customerRegistration()
	{
		Customer customer=new Customer();
		System.out.println("enter address");
    	customer.setAddress(sc.next());
    	System.out.println("enter data fromat : yyy-mm-dd");
    	customer.setDateofbirth(Date.valueOf(sc.next()));
    	System.out.println("enter first name");
    	customer.setFirstname(sc.next());
    	System.out.println("enter mail");
    	customer.setEmailid(sc.next());
    	System.out.println("enter mail");
    	customer.setMobilenumber(sc.next());
    	System.out.println("set password");
    	customer.setPassword(sc.next());
    	System.out.println("enter gender");
    	customer.setGender(sc.next());
    	System.out.println("enter lastname");
    	customer.setLastname(sc.next());
    	customerDao.cutomerRegistratin(customer);
	}
	public static void customerLogin()
	{
		boolean isValid=true;
		while(isValid)
		{
			isValid=false;
			System.out.println("enter email or mobile and password");
    		Customer customerLogin = customerDao.findByCustomerMobileOrEmailAndPassword(sc.next(),sc.next());
			if(customerLogin!=null)
    		{
    			if(customerLogin.getGender().equalsIgnoreCase("male"))
    			{
    				System.out.println("***** --> Hello Mr ! "+customerLogin.getFirstname()+" <---*****");
    				loginAfter(customerLogin);
    				
    				
    			}
    			else
    			{
    				System.out.println("***** --> Hello Ms ! "+customerLogin.getFirstname()+" <---*****");
    				loginAfter(customerLogin);
    				
    			}
    			
    		}
    		else
    		{
    			System.out.println("email id and password mis match");
    		}
		}
	}
	public static void productDetailes()
	{
		System.out.println("****^^^^** All Product detailes ****^^^^********");
		System.out.println("SNO  producname  product price");
		for(Product i:products)
		{
			System.out.println(i.getProductid()+"          "+i.getName()+"    "+i.getPrice());
			
		}
	}
	public static void saveOrder(Customer customer,Product p)
	{
		Orders order=new Orders();
		order.setCustomerid(customer.getCustomerid());
		order.setDate(Date.valueOf(LocalDate.now()));
		
		order.setPrice(p.getPrice()*p.getQuantity());
		order.setProductid(p.getProductid());
		order.setQuantity(p.getQuantity());
		order.setTime(Time.valueOf(LocalTime.now())+"");
		order.setAddress(customer.getAddress());
		order.setStatus("order placed");						
		
		orders.add(order);
	}
	public static double purchasedProductsAmount()
	{
		double totalAmount=0;
		System.out.println("***** purchased Products ****");
		for(Product product:purchasedProducts)
		{
			product.setPrice(product.getPrice()*product.getQuantity());
			System.out.println(product);
			totalAmount+=product.getPrice();
		}
		return totalAmount;
	}
	public static void orderDetailes()
	{
		System.out.println("*****^^^^  ordered prodcuts ***** ^^^^^^");
		orders.forEach((i)->{
			System.out.println(i);
			ordersDao.addOrder(orders);
		});
	}
}
