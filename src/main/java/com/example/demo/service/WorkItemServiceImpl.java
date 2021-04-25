package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;

@Service
public class WorkItemServiceImpl implements WorkItemService {

	private Map<String, Item> items = new HashMap<>() {
		private static final long serialVersionUID = 1L;
		{
			put("1", new Item(1, "テスト", "調査", "2021/03/26", "事故調査", "田中太郎"));
			put("2", new Item(2, "テスト", "調査", "2021/03/27", "影響調査", "鈴木次郎"));
		}
	};
		
	public List<Item> getItems() {
		return new ArrayList<Item> (items.values());
	}
	
	public Item getItems(String id) {
		return items.get(id);
	}
	
	public void putItems(Item items) {
		String id = Integer.valueOf(items.getId()).toString();
		this.items.put(id, items);
	}
	
	public boolean checkItems(Item items) {
		String id = Integer.valueOf(items.getId()).toString();
		return this.items.containsKey(id);
	}
	
	public void deleteItems(String id) {
		items.remove(id);
	}
}
