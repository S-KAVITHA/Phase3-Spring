package com.example.demo.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Products;


import com.example.demo.repository.ProductsRepository;

@SuppressWarnings("unused")
@Repository
public class ProductsRepositoryImpl implements ProductsRepository {

	// Just need to autowire JdbcTemplate, spring boot will
	// do auto configure
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Products product) {
		return jdbcTemplate.update("insert into products (prod_name, price) values(?,?)", product.getProd_name(),
				product.getPrice());
	}

	 @Override
	    public int update(Products product) {
	        return jdbcTemplate.update(
	                "update Products set price = ? where pid = ?",
	                product.getPrice(), product.getPid());
	    }


	    public int deleteById(int id) {
	    	System.out.println(id);
	        return jdbcTemplate.update(
	                "delete from Products where pid = ?",
	                id);
	    }

	    public List<Products> findAll() {
	        return jdbcTemplate.query(
	                "select * from Products",
	                (rs, rowNum) ->
	                        new Products(
	                                rs.getInt("pid"),
	                                rs.getString("prod_name"),
	                                rs.getInt("price")
	                        )
	        );
	    }

	    public Optional<Products> findById(int id) {
	        return jdbcTemplate.queryForObject(
	                "select * from products where pid = ?",
	                new Object[]{id},
	                (rs, rowNum) ->
	                        Optional.of(new Products(
	                                rs.getInt("pid"),
	                                rs.getString("prod_name"),
	                                rs.getInt("price")
	                        ))
	        );
	    }
}
