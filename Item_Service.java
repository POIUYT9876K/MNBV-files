package com.tns.Itemservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Item_Service 
{
	@Autowired
	private Item_Service_Repository repo;
	
	public List<Item> listAll()
	{
		return repo.findAll();
	}
	
	public void save(Item itm)
	{
		repo.save(itm);
	}
	
	public Item get(Integer i_no)
	{
		return repo.findById(i_no).get();
	}
	public void delete(Integer i_no)
	{
		repo.deleteById(i_no);
	}
	
}

