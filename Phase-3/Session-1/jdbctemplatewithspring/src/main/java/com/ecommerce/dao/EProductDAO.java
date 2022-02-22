package com.ecommerce.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ecommerce.entity.EProductEntity;

public class EProductDAO {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public List<EProductEntity> getProducts()
	{
		return template.query("select * from eproduct", 
				new RowMapper<EProductEntity>() {

					public EProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
						EProductEntity e= new EProductEntity();
						e.setID(rs.getInt(1));
						e.setName(rs.getString(2));
						e.setPrice(rs.getBigDecimal(3));
						e.setDateAdded(rs.getDate(4));
						return e;
					}
			
		});
	}
}
