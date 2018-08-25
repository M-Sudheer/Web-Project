package demo.projects.tables.productImp;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.project.tables.productsDao.MobileService;
import demo.projects.tables.products.Mobile;

@Component
@Transactional
public class MobileServiceImp implements MobileService{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addMobile(Mobile mobile) {
		try
		{
			sessionFactory.getCurrentSession().save(mobile);
			
			return true;
		}
		
		catch (Exception e) 
		{	
			return false;
		}

	}

	@Override
	public boolean deleteMobile(Mobile mobile) {
		try
		{
			sessionFactory.getCurrentSession().delete(mobile);
			
			return true;
		}
		
		catch (Exception e) 
		{	
			return false;


		}

	}

}
