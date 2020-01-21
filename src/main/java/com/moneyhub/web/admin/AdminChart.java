package com.moneyhub.web.admin;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Lazy
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@Alias("adminChart")
public class AdminChart {
	
	private String cemail, cpwd, cno, age;
	

}
