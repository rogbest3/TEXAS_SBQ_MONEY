package com.moneyhub.web.exrate;

import java.util.Date;

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
@Alias("Exrate")
public class Exrate {
	private String seq, bdate, cntcd, crtmem, upmem, udate; 
	private double exrate;
}
