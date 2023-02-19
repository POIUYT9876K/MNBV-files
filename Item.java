package com.tns.Itemservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item
{
	private Integer I_no;
	private String I_name;
	
	
	public Item() 
	{
		super();
	}
	
	public Item(Integer i_no, String i_name)
	{
		super();
		I_no = i_no;
		I_name = i_name;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getI_no() {
		return I_no;
	}
	public void setI_no(Integer i_no) {
		I_no = i_no;
	}
	public String getI_name() {
		return I_name;
	}
	public void setI_name(String i_name)
	{
		I_name = i_name;
	}
	@Override
	public String toString()
	{
		return "Item[Itemt no:"+I_no+" Itemname"+I_name+"]";
	}
}

