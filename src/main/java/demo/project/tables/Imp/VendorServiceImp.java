//VendorServiceImp
package demo.project.tables.Imp;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.project.tables.dao.VendorService;
import demo.project.tables.model.Vendor;


@Component
@Transactional
public class VendorServiceImp implements VendorService
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addVendor(Vendor vendor)
	
	{
		try
		{
			sessionFactory.getCurrentSession().save(vendor);
			
			return true;
		}
		
		catch (Exception e) 
		{	
			return false;
			// TODO: handle exception
		}


	}



	@Override
	public boolean deleteVendor(Vendor vendor) {
		try
		{
			sessionFactory.getCurrentSession().delete(vendor);
			
			return true;
		}
		
		catch (Exception e) 
		{	
			return false;
			// TODO: handle exception
		}

	}

	@Override
	public boolean updateVendor(Vendor vendor) {
		try
		{
			sessionFactory.getCurrentSession().update(vendor);
			
			return true;
		}
		
		catch (Exception e) 
		{	
			return false;
			// TODO: handle exception
		}
	}
		@Override
		public Vendor getVendorById(int vid)
		{
			// TODO Auto-generated method stub
			try {
			return (Vendor)sessionFactory.getCurrentSession().get(Vendor.class,vid);
			
			} catch (Exception e) {
				// TODO: handle exception
				return null;
			}
			
		}

		@Override
		public Vendor getVendorByEmail(String email) {
			// TODO Auto-generated method stub
			try {
				return (Vendor)sessionFactory.getCurrentSession().get(Vendor.class,email);
				
				} catch (Exception e) {
					// TODO: handle exception
					return null;
				}
			

	}
}
