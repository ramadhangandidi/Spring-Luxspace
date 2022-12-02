package com.example.luxspace.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.luxspace.model.Shipping;
import com.example.luxspace.service.IShippingService;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api/shipping")
public class ShippingController {
	@Autowired
	IShippingService shippingService;
	
	
	@PostMapping("/insert")
	public Shipping insertShipping(@RequestBody Shipping shipping){
		return shippingService.insertShipping(shipping);
	}
	
	@GetMapping("/getAll")
	public List<Shipping> getAllShipping(){
		return shippingService.getAllShipping();
	}
	
	@PutMapping("/update/{id}")
	public Shipping updateShipping(@PathVariable int id, @RequestBody Shipping shipping) {
		return shippingService.updateShipping(id, shipping);
	}
	
	@DeleteMapping("/delete/{id}")
	public Shipping deleteShippin(@PathVariable int id) {
		return shippingService.deleteShipping(id);
	}
}
