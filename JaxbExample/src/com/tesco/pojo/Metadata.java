/**
 * This is a bean class which is used for MetaData Pattern in DigesterRules.
 * @author gbarala Creation Date 03/02/2010 Company:Infosys Technologies Limited
 */
package com.tesco.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Metadata
{
	@XmlElement
	private String imagetype;
	@XmlElement
	private String shot;
	@XmlElement
	private String copyright;
	@XmlElement
	private String productname;
	@XmlElement
	private String category;
	@XmlElement
	private String subcategory;
	@XmlElement
	private String imagestore;
	@XmlElement
	private String Scene7;
	

	
	
	public String getScene7() {
		return Scene7;
	}

	public void setScene7(final String scene7) {
		Scene7 = scene7;
	}

	public String getImagestore() {
		return imagestore;
	}

	public void setImagestore(final String imagestore) {
		this.imagestore = imagestore;
	}

	public String getImagetype() 
	{
		return imagetype;
	}

	public void setImagetype(final String imagetype) 
	{
		this.imagetype = imagetype;
	}

	public String getShot()
	{
		return shot;
	}

	public void setShot(final String shot)
	{
		this.shot = shot;
	}

	public String getCopyright()
	{
		return copyright;
	}

	public void setCopyright(final String copyright)
	{
		this.copyright = copyright;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(final String category)
	{
		this.category = category;
	}

	public String getSubcategory()
	{
		return subcategory;
	}

	public void setSubcategory(final String subcategory) 
	{
		this.subcategory = subcategory;
	}
	
		public String getProductname()
	{
		return productname;
	}

	public void setProductname(final String productname) 
	{
		this.productname = productname;
	}

}
