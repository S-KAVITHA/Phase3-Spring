package com.example.demo.repository;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Products;


@SuppressWarnings("unused")
@Repository
public class ProductsRepositoryImpl implements ProductsRepository {

	// Just need to autowire JdbcTemplate, spring boot will
	// do auto configure
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int save(Products product) {
		return jdbcTemplate.update("insert into products (prodname, price) values(?,?)", product.getProd_name(),
				product.getPrice());
	}

	 @Override
	    public int update(Products product) {
	        return jdbcTemplate.update(
	                "update Products set price = ? where id = ?",
	                product.getPrice(), product.getPid());
	    }


	    @Override
	    public int deleteById(int id) {
	    	System.out.println(id);
	        return jdbcTemplate.update(
	                "delete from Products where id = ?",
	                id);
	    }

	    @Override
	    public List<Products> findAll() {
	        return jdbcTemplate.query(
	                "select * from Products",
	                (rs, rowNum) ->
	                        new Products(
	                                rs.getInt("id"),
	                                rs.getString("prodName"),
	                                rs.getInt("price")
	                        )
	        );
	    }

	    public Optional<Products> findById(Long id) {
	        return jdbcTemplate.queryForObject(
	                "select * from products where id = ?",
	                new Object[]{id},
	                (rs, rowNum) ->
	                        Optional.of(new Products(
	                                rs.getInt("id"),
	                                rs.getString("prodName"),
	                                rs.getInt("price")
	                        ))
	        );
	    }
}
