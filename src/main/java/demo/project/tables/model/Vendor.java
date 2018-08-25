
package demo.project.tables.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Component;

import demo.projects.tables.products.Laptop;
import demo.projects.tables.products.Mobile;

@Entity
@Component("vendor")
public class Vendor 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int vid;
	@Column(unique=true)
	private String name;
	@Column(unique=true)
	private String email;
	@Column(unique=true)
	private String mobile;
	private String companyName;
	
	@OneToMany(mappedBy="vendor")
	private Set<Address> Addresses;
	
	
	@OneToMany(mappedBy="vendor")
	private List<Products> Productss;
	
	
	@OneToMany(mappedBy="vendor")
	private Set<Account> Accounts;
	
	

	
	
	public int getVid() 
	{
		return vid;
	}
	public void setVid(int vid) 
	{
		this.vid = vid;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getMobile() 
	{
		return mobile;
	}
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}
	public String getCompanyName() 
	{
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public Set<Address> getAddresses() {
		return Addresses;
	}
	public void setAddresses(Set<Address> addresses) {
		Addresses = addresses;
	}
	public List<Products> getProductss() {
		return Productss;
	}
	public void setProductss(List<Products> productss) {
		Productss = productss;
	}
	public Set<Account> getAccounts() {
		return Accounts;
	}
	public void setAccounts(Set<Account> accounts) {
		Accounts = accounts;
	}
	@Override
	public String toString() {
		return "Vendor [vid=" + vid + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", companyName="
				+ companyName + "]";
	}
}


