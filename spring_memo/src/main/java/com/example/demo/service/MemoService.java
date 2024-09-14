package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Memo;

@Service
public class MemoService {
	public List<Memo> getMemos() {
		List<Memo> memos = new ArrayList<>();
		
		Memo memo1 = new Memo();
		memo1.setTitle("タイトル1");
		memo1.setContent("内容1");
		Memo memo2 = new Memo();
		memo2.setTitle("タイトル2");
		memo2.setContent("内容2");
		memos.add(memo1);
		memos.add(memo2);
		
		return memos;
	}

}
