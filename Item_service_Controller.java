package com.tns.Itemservice;
import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Item_service_Controller
{
	@Autowired(required=true)
	private Item_Service service;
	
	@GetMapping("/itemservice")
	public java.util.List<Item> list()
	{
		return service.listAll();
	}
	
	@GetMapping("/itemservice/{i_no}")
	public ResponseEntity<Item> get(@PathVariable Integer I_no)
	{
		try
		{
			Item itm=service.get(I_no);
			return new ResponseEntity<Item>(itm,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/itemservice")
	public void add(@RequestBody Item itm)
	{
		service.save itm);
	}
	
	@PutMapping("/itemservice/{i_no}")
	public ResponseEntity<?> update(@RequestBody Item itm, @PathVariable Integer I_no)
	{
		Item existitm=service.get(I_no);
		service.save(existitm);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/itemservice/{i_no}")
	public void delete(@PathVariable Integer i_no)
	{
		service.delete(i_no);
	}
}
