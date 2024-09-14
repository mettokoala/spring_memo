package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.MemoService;

@Controller
public class MemoController {
	private final MemoService memoService;

	private MemoController(MemoService memoService) {
		this.memoService = memoService;
	}
	
	@GetMapping("/")
	public String getMemo(Model model) {
		model.addAttribute("memos", memoService.getMemos());
		return "index";
	}
}
