//AppTest
package demo.project.tables;

import static org.junit.Assert.assertEquals;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import demo.project.tables.Imp.VendorServiceImp;
import demo.project.tables.dao.AccountService;
import demo.project.tables.dao.AddressService;
import demo.project.tables.dao.CategoryService;
import demo.project.tables.dao.ProductService;
import demo.project.tables.dao.SubCategoryService;
import demo.project.tables.dao.VendorService;
import demo.project.tables.model.Account;
import demo.project.tables.model.Address;
import demo.project.tables.model.Category;
import demo.project.tables.model.Products;
import demo.project.tables.model.SubCategory;
import demo.project.tables.model.Vendor;
import demo.project.tables.productsDao.LaptopService;
import demo.projects.tables.products.Laptop;
import demo.projects.tables.products.Mobile;

@SpringJUnitConfig(classes={HibernateConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
public class AppTest
{
	@Autowired
	private Vendor vendor;
	@Autowired
	private Address address; 
	@Autowired
	private Products products;
	@Autowired
	private Account account;
	@Autowired
	private Category category;
	@Autowired
	private SubCategory subCategory;
	@Autowired
	private Laptop laptop;
	
	
	
	@Autowired
	private VendorService vendorSevice;
	@Autowired
	private AddressService addressService;
	@Autowired
	private ProductService productService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private SubCategoryService subCategoryService;
	@Autowired
	private LaptopService laptopService;
	

	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	@Before
	public  void setUp()
	{
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new  AnnotationConfigApplicationContext(HibernateConfig.class);
		
	
		vendor.setName("alex");
		vendor.setEmail("alex@gmail.com");
		vendor.setMobile("9202233220");
		vendor.setCompanyName("Amazon");
		
		
		address.setStreet("3");
		address.setCity("Hyderabad");
		address.setState("Telangana");
		address.setPin(500080);
		address.setCountry("INDIA");
		address.setVendor(vendor);
		

		products.setBrand("Samsung");
		products.setColor("cream");
		products.setWarrantyPeriod(12);
		products.setVendor(vendor);
		
		
		account.setAcc_num(101631);
		account.setBranch("Basheer Bagh");
		account.setVendor(vendor);
	
		
		laptop.setRam("8gb");
		laptop.setRom("4gb");
		laptop.setProcessor("i7");
		
	}
	
	
	
	@Test
	public void Test()
	{
		assertEquals("Test vendor adding Failed",true,vendorSevice.addVendor(vendor));
	}
	
	@Test
	public void updateVendor()
	{
		vendorSevice.addVendor(vendor);
		vendor.setName("White");
		vendor.setEmail("white@gmail.com");
		vendor.setMobile("9123456780");
		vendor.setCompanyName("FlipKart");
		assertEquals("test vendor updation failed",true,vendorSevice.updateVendor(vendor));
	}
	
	@After
	public void deleteVendor()
	{
		assertEquals("deletion not done",true,vendorSevice.deleteVendor(vendor));
	}
	
	
	
	//Test the Address
	@Test
	public void addAddress()
	{
		vendorSevice.addVendor(vendor);
		assertEquals("Test Address Insertion failed",true,addressService.addAddress(address));
		deleteAddress();
	}
	public void deleteAddress()
	{
		addressService.deleteAddress(address);
	}
	public void updateAddress()
	{
		assertEquals("updation completed",true,addressService.updateAddress(address));
	}
	
	
	
	//Test the Products
	@Test
	public void addProducts()
	{
		vendorSevice.addVendor(vendor);
		assertEquals("Test product Insertion failed",true,productService.addProducts(products));
		deleteProducts();
	}
	public void deleteProducts()
	{
		productService.deleteProducts(products);
	}
	
	
	
	//Test the Account
	@Test
	public void addAccount()
	{
		vendorSevice.addVendor(vendor);
		assertEquals("Test account Insertion failed",true,accountService.addAccount(account));
		deleteAccount();
	}
	public void deleteAccount()
	{
		accountService.deleteAccount(account);
	}

	
	
	//Test the Laptop
	@Test
	public void addLaptop()
	{
		subCategory=subCategoryService.getSubCategory(1);
		vendorSevice.addVendor(vendor);
		laptop.setVendor(vendor);
		laptop.setSubCategory(subCategory);
		assertEquals("Test Insertion laptop failed",true,laptopService.addLaptop(laptop));
		deleteLaptop();
	}
	private void deleteLaptop() 
	{
	laptopService.deleteLaptop(laptop);
		
	}
}