package com.example.luxspace.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.luxspace.model.Shipping;
import com.example.luxspace.repository.IShippingRepository;
import com.example.luxspace.service.IShippingService;

@Service
public class ShippingService implements IShippingService{
	
	@Autowired
	IShippingRepository shippingRepository;

	@Override
	public Shipping insertShipping(Shipping shipping) {
		// TODO Auto-generated method stub
		return shippingRepository.insertShipping(shipping);
	}

	@Override
	public List<Shipping> getAllShipping() {
		// TODO Auto-generated method stub
		return shippingRepository.getAllShipping();
	}

	@Override
	public Shipping updateShipping(int id, Shipping shipping) {
		// TODO Auto-generated method stub
		return shippingRepository.updateShipping(id, shipping);
	}

	@Override
	public Shipping deleteShipping(int id) {
		// TODO Auto-generated method stub
		return shippingRepository.deleteShipping(id);
	}

}
