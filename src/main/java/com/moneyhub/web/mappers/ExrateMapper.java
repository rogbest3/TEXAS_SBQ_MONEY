package com.moneyhub.web.mappers;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

import com.moneyhub.web.exrate.Exrate;

@Repository
public interface ExrateMapper {
	
	public void createExrate(HashMap<String, String> map);
	public void deleteExrate(HashMap<String, String> map);
	public void truncateExrate(HashMap<String, String> map);	
	public void insertExrate(Exrate exrate);
	
	public ArrayList<Exrate> searchExrate(String s);
}
