package org.dao;

import java.util.List;

import org.entity.flower;

public interface flowerDao {
	public List<flower> list();			//�������л���
	
	public int insert(flower f);				//���ӻ���
}
