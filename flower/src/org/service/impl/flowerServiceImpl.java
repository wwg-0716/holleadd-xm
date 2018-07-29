package org.service.impl;

import java.util.List;

import org.dao.impl.flowerDaoImpl;
import org.entity.flower;
import org.service1.flowerService;

public class flowerServiceImpl implements flowerService{

	@Override
	public List<flower> list() {
		return new flowerDaoImpl().list();
	}

	@Override
	public int insert(flower f) {
		return new flowerDaoImpl().insert(f);
	}

}
