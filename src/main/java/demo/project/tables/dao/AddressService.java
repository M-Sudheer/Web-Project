//AddressService
package demo.project.tables.dao;

import demo.project.tables.model.Address;
import demo.project.tables.model.Vendor;

public interface AddressService
{	
	public abstract boolean addAddress(Address address);
	public abstract boolean deleteAddress(Address address);
	public abstract boolean updateAddress(Address address);
}
