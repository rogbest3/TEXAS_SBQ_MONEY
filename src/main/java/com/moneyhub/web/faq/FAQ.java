package com.moneyhub.web.faq;

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
@Alias("FAQ")
public class FAQ {

	private String faqid, title, content;
}
