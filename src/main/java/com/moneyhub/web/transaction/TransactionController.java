package com.moneyhub.web.transaction;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moneyhub.web.proxy.Box;
import com.moneyhub.web.proxy.CrawlingProxy;

@RestController
@RequestMapping("/tx")
public class TransactionController {
	
	@Autowired CrawlingProxy crawler;
	@Autowired TransactionService transactionService;
	@Autowired Box<Object> box;
	
	@GetMapping("/crawling/kakaofaq")
	public Map<?, ?> faqCrawling() {
		System.out.println("FAQ 크롤링 진입");
		transactionService.crawling();
		box.clear();
		box.put("result", "SUCCESS");
		return box.get();
	}
	
	@GetMapping("/insert/faqlist")
	public Map<?, ?> faqInsert(){
		System.out.println("Tx FAQ insert 진입");
		transactionService.insertFAQStore();
		box.put("result", "SUCCESS");
		return box.get();
	}
	
	@GetMapping("/insert/exratelist")
	public Map<?, ?> exrateInsert(){
		System.out.println("Tx EXRATE insert 진입");
		transactionService.insertExrateStore();
		box.put("result", "SUCCESS");
		return box.get();
	}
}
