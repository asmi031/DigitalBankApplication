package com.banktype.exc.queryoccurance;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.banktype.exc.model.BankTable;


@Repository
public interface BankQuery extends CrudRepository<BankTable, Integer> {
	@Query(value =  "select * from TRADE_MODEL",nativeQuery = true)
	public List<BankTable> getAllRecs();
	
	@Query(value =  "select * from TRADE_MODEL t where t.FRONT_DESK_OFF_ID=? and t.TRADE_DATE_TIME=?",nativeQuery = true)
	public List<BankTable> findByFrontTaskId(String frontDeskOfficerId, String date);
}
