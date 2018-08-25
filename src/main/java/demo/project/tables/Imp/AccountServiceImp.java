package demo.project.tables.Imp;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.project.tables.dao.AccountService;
import demo.project.tables.model.Account;


@Component
@Transactional
public class AccountServiceImp implements AccountService 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addAccount(Account account) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(account);
			
			return true;
		}
		
		catch (Exception e) 
		{	
			return false;
		}
	}

	@Override
	public boolean updateAccount(Account account) {
		try
		{
			sessionFactory.getCurrentSession().update(account);
			
			return true;
		}
		
		catch (Exception e) 
		{	
			return false;
		}

	}

	@Override
	public boolean deleteAccount(Account account) {
		try
		{
			sessionFactory.getCurrentSession().delete(account);
			
			return true;
		}
		
		catch (Exception e) 
		{	
			return false;


		}

	}

}
