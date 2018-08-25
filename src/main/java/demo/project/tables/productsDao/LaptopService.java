package demo.project.tables.productsDao;

import demo.projects.tables.products.Laptop;

public interface LaptopService
{
	public abstract boolean addLaptop(Laptop laptop);
	public abstract boolean deleteLaptop(Laptop laptop);

}
