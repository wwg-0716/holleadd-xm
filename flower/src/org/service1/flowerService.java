package org.service1;

import java.util.List;

import org.entity.flower;

public interface flowerService {
	public List<flower> list();			//�������л���
	
	public int insert(flower f);				//���ӻ���
}
