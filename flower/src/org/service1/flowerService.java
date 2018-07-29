package org.service1;

import java.util.List;

import org.entity.flower;

public interface flowerService {
	public List<flower> list();			//查找所有花卉
	
	public int insert(flower f);				//增加花卉
}
