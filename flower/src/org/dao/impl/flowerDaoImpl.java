package org.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.dao.*;
import org.entity.flower;

public class flowerDaoImpl extends BaseDao implements flowerDao{

	@Override
	public List<flower> list() {
		String sql="SELECT * FROM flower";			//查询sql语句
		ResultSet rs=null;
		flower f=null;
		rs=this.exceuteQuery(sql);
		List<flower> list=new ArrayList<flower>();	//接收花卉信息
		try {
			while (rs.next()) {				//循环添加信息
				f=new flower();
				f.setId(rs.getInt("id"));
				f.setName(rs.getString("name"));
				f.setAnothername(rs.getString("anothername"));
				f.setProduction(rs.getString("production"));
				f.setPrice(rs.getFloat("Price"));
				f.setProperty(rs.getString("Property"));
				list.add(f);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int insert(flower f) {
		String sql="INSERT INTO flower(`name`,`anothername`,property,price,production) "
				+ "VALUE(?,?,?,?,?)";
		int num=this.exceuteUpdate(sql, f.getName(),f.getAnothername(),f.getProperty(),f.getPrice(),f.getProduction());
		
		return num;
	}

}
