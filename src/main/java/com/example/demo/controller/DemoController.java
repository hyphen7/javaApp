package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.service.WorkItemService;

@RestController
@RequestMapping(value = "/api/v1/work-items", produces = "application/json;charset=UTF-8")
public class DemoController {

	@Autowired
	WorkItemService workItemService;

	@GetMapping
	public List<Item> workItems() {
		return workItemService.getItems();
	}

	@GetMapping("{id}")
	public Item workItem(@PathVariable("id") String id) {
		return workItemService.getItems(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void createItem(@RequestBody Item item) {
		workItemService.putItems(item);
	}

	@PutMapping
	public ResponseEntity<Object> update(@RequestBody Item item) {
		HttpStatus status = workItemService.checkItems(item)
				? HttpStatus.NO_CONTENT
				: HttpStatus.CREATED;
		workItemService.putItems(item);
		System.out.println(status);
		return ResponseEntity.status(status).body(null);
	}

	@DeleteMapping("{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable("id") String id) {
		workItemService.deleteItems(id);
	}
}