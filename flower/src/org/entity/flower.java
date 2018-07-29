package org.entity;


/**
 * 花卉实体类
 * @author Gentleman
 *
 */
public class flower {
	private int id=0;					//编号
	private String name="";				//花卉名称
	private String anothername="";		//花卉别称
	private String property="";			//科属
	private float price=0;				//价格
	private String production="";		//原产地
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
