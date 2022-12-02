package com.example.luxspace.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.luxspace.model.Shipping;
import com.example.luxspace.repository.IShippingRepository;

@Repository
public class ShippingRepository implements IShippingRepository{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public Shipping insertShipping(Shipping shipping) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tb_shipping(first_name, last_name, email, phone_number, city, postal_code, address) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(query, new Object[] {shipping.getFirst_name(), shipping.getLast_name(), shipping.getEmail(),
				shipping.getPhone_number(), shipping.getCity(), shipping.getPostal_code(), shipping.getAddress()});
		return shipping;
	}

	@Override
	public List<Shipping> getAllShipping() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_shipping";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(Shipping.class));
	}

	@Override
	public Shipping updateShipping(int id, Shipping shipping) {
		// TODO Auto-generated method stub
		String query = "UPDATE tb_shipping SET first_name = ?, last_name = ?, email = ?, phone_number = ?, "
				+ "city = ?, postal_code = ?, address = ? WHERE id = ?";
		
		jdbcTemplate.update(query, new Object[] {shipping.getFirst_name(), shipping.getLast_name(), shipping.getEmail(),
				shipping.getPhone_number(), shipping.getCity(), shipping.getPostal_code(), shipping.getAddress(), id});
		
		return shipping;
	}

	@Override
	public Shipping deleteShipping(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_shipping WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(Shipping.class), id);
		
		query = "DELETE FROM tb_shipping WHERE id = ?";
		jdbcTemplate.update(query, id);
		
		return result;
	}

}
