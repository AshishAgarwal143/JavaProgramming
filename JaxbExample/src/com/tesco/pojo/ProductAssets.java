/**
 * This is a bean class which is used for ProductAssets Pattern in DigesterRules.
 * @author gbarala Creation Date 03/02/2010 Company:Infosys Technologies Limited
 */
package com.tesco.pojo;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProductAssets")
@XmlAccessorType(XmlAccessType.FIELD)
public class ProductAssets {
	@XmlAttribute(name="id_1")
	private String id_1;
	@XmlAttribute(name="jobId")
	private String jobId;

	@XmlElementWrapper(name = "assets")
	@XmlElement(name = "asset")
	private ArrayList<Asset> assets = new ArrayList<Asset>();

	public ArrayList<Asset> getAsset() {
		return assets;
	}

	public void setAsset(ArrayList<Asset> assets) {
		this.assets = assets;
	}

	public String getId_1() {
		return id_1;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(final String jobId) {
		this.jobId = jobId;
	}

	public void setId_1(final String id_1) {
		this.id_1 = id_1;
	}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.getId_1()+ this.getJobId()+this.getAsset().size();
}
}
