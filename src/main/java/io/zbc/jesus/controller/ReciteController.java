package io.zbc.jesus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 经文背诵
 * 
 * @author zbc
 *
 */
@RestController
@RequestMapping("/recite")
public class ReciteController {

	/**
	 * 默认显示当天的背诵经文
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String getToday() {
		return "";
	}
}
