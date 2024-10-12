package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Memo;
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
	
	@PostMapping("/create")
	public String postMemo(@ModelAttribute("memo") Memo memo) {
		memoService.postMemo(memo);
		return "redirect:/";
	}
}
