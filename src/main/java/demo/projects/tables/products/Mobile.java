package demo.projects.tables.products;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import demo.project.tables.model.Products;
import demo.project.tables.model.Vendor;
@Entity
@Component("mobile")
public class Mobile extends Products
{

	private String inches;
	private String android_version;
	private String ram;
	
	public String getInches() {
		return inches;
	}
	public void setInches(String inches) {
		this.inches = inches;
	}
	public String getAndroid_version() {
		return android_version;
	}
	public void setAndroid_version(String android_version) {
		this.android_version = android_version;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
}
