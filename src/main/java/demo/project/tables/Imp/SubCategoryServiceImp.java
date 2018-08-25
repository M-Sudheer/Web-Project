package demo.project.tables.Imp;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demo.project.tables.dao.SubCategoryService;
import demo.project.tables.model.SubCategory;

@Component
@Transactional
public class SubCategoryServiceImp implements SubCategoryService{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public SubCategory getSubCategory(int subc_id) {
		
		
		try 
		{
			SubCategory subCategory=sessionFactory.getCurrentSession().get(SubCategory.class,1);
			return subCategory;
			
		}
		catch (Exception e) 
		{
			return null;
		}

	}
}
