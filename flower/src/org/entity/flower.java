package org.entity;


/**
 * ����ʵ����
 * @author Gentleman
 *
 */
public class flower {
	private int id=0;					//���
	private String name="";				//��������
	private String anothername="";		//���ܱ��
	private String property="";			//����
	private float price=0;				//�۸�
	private String production="";		//ԭ����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnothername() {
		return anothername;
	}
	public void setAnothername(String anothername) {
		this.anothername = anothername;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	
	
}
