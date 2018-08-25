package demo.project.tables.dao;

import demo.project.tables.model.Account;

public interface AccountService {
	
	public abstract boolean addAccount(Account account);
	public abstract boolean updateAccount(Account account);
	public abstract boolean deleteAccount(Account account);

}
