package com.banktype.exc.Control;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.banktype.exc.model.BankTable;
import com.banktype.exc.service.MainService;

@RestController
public class BankCompact {
	@Autowired
	MainService mainService;


	@GetMapping(value = "/getByFrontDeskId")
	public ResponseEntity<Map<String, Object>> Extract(@RequestParam String frontDeskId,@RequestParam String date) {
		System.out.println(frontDeskId+date);
		Map<String, Object> listT = mainService.findByFrontTaskId(frontDeskId,date);
		return ResponseEntity.status(HttpStatus.OK).body(listT);
		
	}
	@GetMapping(value = "/allRecs")
	public ResponseEntity<List<BankTable>> getRecs() {
		List<BankTable> listT = mainService.getAllRecs();
		
		return ResponseEntity.status(HttpStatus.OK).body(listT);
		
	}
}
