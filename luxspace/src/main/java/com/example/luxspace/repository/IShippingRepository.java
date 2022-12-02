package com.example.luxspace.repository;

import java.util.List;

import com.example.luxspace.model.Shipping;

public interface IShippingRepository {
	public Shipping insertShipping(Shipping shipping);
	public List<Shipping> getAllShipping();
	public Shipping updateShipping(int id, Shipping shipping);
	public Shipping deleteShipping(int id);
}
