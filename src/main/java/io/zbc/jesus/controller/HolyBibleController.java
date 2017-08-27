package io.zbc.jesus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.zbc.jesus.model.HolyBibleHGB;
import io.zbc.jesus.repository.HolyBibleHGBRepository;

@RestController
public class HolyBibleController {

	@Autowired
	HolyBibleHGBRepository holyBibleHGBRepository;

	@RequestMapping("/hgb")
	public Iterable<HolyBibleHGB> getToday() {
		return holyBibleHGBRepository.findAll();
	}
}
