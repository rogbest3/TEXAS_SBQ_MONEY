package com.moneyhub.web.mappers;

import org.springframework.stereotype.Repository;

import com.moneyhub.web.enums.SQL;
import com.moneyhub.web.member.Customer;

@Repository
public interface SchemaMapper {
	public int existRow(String table);
	public Customer login(Customer param);
	public int showCreateTable(String sql);
	public void dropTable(SQL sql);
//	public int pwdCheck(Customer param);
	public void createNewDb(String sql);
}
