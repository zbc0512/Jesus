package io.zbc.jesus.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ���ı���
 * 
 * @author zbc
 *
 */
@RestController
@RequestMapping("/recite")
public class ReciteController {

	/**
	 * Ĭ����ʾ����ı��о���
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String getToday() {
		return "";
	}
}
