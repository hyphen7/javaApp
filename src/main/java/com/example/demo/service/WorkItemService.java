package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;

@Service
public interface WorkItemService {

	public List<Item> getItems();
	
	public Item getItems(String id);
	
	public void putItems(Item items);
	
	public boolean checkItems(Item items);
	
	public void deleteItems(String id);
}
