package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Memo;
import com.example.demo.repository.MemoRepository;

@Service
public class MemoService {
	private final MemoRepository memoRepository;
	
	private MemoService(MemoRepository memoRepository) {
		this.memoRepository = memoRepository;
	}
	
	public List<Memo> getMemos() {
		return memoRepository.findAll();
	}

}
