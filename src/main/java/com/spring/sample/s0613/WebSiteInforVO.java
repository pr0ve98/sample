package com.spring.sample.s0613;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter
@Setter
//@RequiredArgsConstructor // 전부 입력하겠다
@ToString
public class WebSiteInforVO {
	private String driver;
	private String url;
	private String user;
	private String password;
	
	public WebSiteInforVO() {}
	
	public WebSiteInforVO(String driver, String url, String user, String password) {
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.password = password;
	}
	
}
