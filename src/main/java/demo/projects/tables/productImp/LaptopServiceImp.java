package demo.projects.tables.productImp;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.project.tables.productsDao.LaptopService;
import demo.projects.tables.products.Laptop;

@Component
@Transactional
public class LaptopServiceImp implements LaptopService
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addLaptop(Laptop laptop) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(laptop);
			return true;
		}
		
		catch (Exception e) 
		{	
			return false;
		}
	}

	@Override
	public boolean deleteLaptop(Laptop laptop) 
	{
		try
		{
			sessionFactory.getCurrentSession().delete(laptop);
			
			return true;
		}
		
		catch (Exception e) 
		{	
			return false;
		}
	}

}
