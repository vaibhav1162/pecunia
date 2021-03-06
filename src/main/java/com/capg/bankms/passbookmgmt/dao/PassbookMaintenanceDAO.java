package com.capg.bankms.passbookmgmt.dao;

import java.time.LocalDate;
import java.util.List;

import com.capg.bankms.accountmgmt.entities.Account;
import com.capg.bankms.transmgmt.entities.Transaction;

public interface PassbookMaintenanceDAO {

	public List<Transaction> updatePassboook(String account);

	public List<Transaction> accountSummary(String account, LocalDate fromDate, LocalDate toDate);

	public boolean accountValidation(Account account);

	public boolean updateLastUpdated(Account account);
}
