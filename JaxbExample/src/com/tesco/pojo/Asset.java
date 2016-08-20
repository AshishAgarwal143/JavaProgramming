/**
 * This is a bean class which is used for Asset Pattern in DigesterRules.
 * @author gbarala Creation Date 03/02/2010 Company:Infosys Technologies Limited
 */
package com.tesco.pojo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Asset {

	@XmlElement
	private String assetstatus;
	@XmlElement
	private String sourcepath;
	@XmlElement
	private String destinationrelativepath;
	@XmlElement(name="AssetName")
	private String assetname;
	@XmlElement
	private String originalName;
	@XmlElement
	private String host;
	@XmlElement
	private String defaultimage;
	@XmlElement
	private Metadata metadata = new Metadata();
	@XmlAttribute
	private String id;
	@XmlAttribute
	private String type;
	
	
	public String getType() {
		return type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}
	public Metadata getMetadata() {
		return metadata;
	}

	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}

	public String getDefaultimage() {
		return defaultimage;
	}

	public void setDefaultimage(String defaultimage) {
		this.defaultimage = defaultimage;
	}

	private String MBAssetId;

	/**
	 * @return the mBAssetId
	 */
	public String getMBAssetId() {
		return MBAssetId;
	}

	/**
	 * @param assetId
	 *            the mBAssetId to set
	 */
	public void setMBAssetId(String assetId) {
		MBAssetId = assetId;
	}
	
	public String getAssetname() {
		return assetname;
	}

	public void setAssetname(final String assetname) {
		this.assetname = assetname;
	}

	public String getHost() {
		return host;
	}

	public void setHost(final String host) {
		this.host = host;
	}

	public String getAssetstatus() {
		return assetstatus;
	}

	public void setAssetstatus(final String assetstatus) {
		this.assetstatus = assetstatus;
	}

	public String getSourcepath() {
		return sourcepath;
	}

	public void setSourcepath(final String sourcepath) {
		this.sourcepath = sourcepath;
	}

	public String getDestinationrelativepath() {
		return destinationrelativepath;
	}

	public void setDestinationrelativepath(final String destinationrelativepath) {
		this.destinationrelativepath = destinationrelativepath;
	}

	/**
	 * @return the originalName
	 */
	public String getOriginalName() {
		return originalName;
	}

	/**
	 * @param originalName
	 *            the originalName to set
	 */
	public void setOriginalName(String originalName) {
		this.originalName = originalName;
	}

}
