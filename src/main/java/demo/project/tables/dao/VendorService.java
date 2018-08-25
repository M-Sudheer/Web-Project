//VendorService
package demo.project.tables.dao;

import demo.project.tables.model.Vendor;

public interface VendorService
{
	public abstract boolean addVendor(Vendor vendor);
	public abstract boolean deleteVendor(Vendor vendor);
	public abstract boolean updateVendor(Vendor vendor);
	public abstract Vendor getVendorById(int vid);
	public abstract Vendor getVendorByEmail(String email);
}
