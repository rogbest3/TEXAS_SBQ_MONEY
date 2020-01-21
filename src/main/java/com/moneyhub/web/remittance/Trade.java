package com.moneyhub.web.remittance;

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
@Alias("TRD")
public class Trade {

	private String faqid, title, content;
}
