package dk.frv.aisrecorder.persistence.domain;

import java.util.Date;

public class AisVesselTarget {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_vessel_target.mmsi
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	private Integer mmsi;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_vessel_target.id
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_vessel_target.vessel_class
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	private String vesselClass;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_vessel_target.country
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	private String country;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_vessel_target.source
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	private String source;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_vessel_target.last_received
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	private Date lastReceived;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_vessel_target.valid_to
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	private Date validTo;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ais_vessel_target.created
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	private Date created;

	public AisVesselTarget() {
		this.created = new Date();
	}
	
	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_vessel_target.mmsi
	 * @return  the value of ais_vessel_target.mmsi
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public Integer getMmsi() {
		return mmsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_vessel_target.mmsi
	 * @param mmsi  the value for ais_vessel_target.mmsi
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public void setMmsi(Integer mmsi) {
		this.mmsi = mmsi;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_vessel_target.id
	 * @return  the value of ais_vessel_target.id
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_vessel_target.id
	 * @param id  the value for ais_vessel_target.id
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_vessel_target.vessel_class
	 * @return  the value of ais_vessel_target.vessel_class
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public String getVesselClass() {
		return vesselClass;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_vessel_target.vessel_class
	 * @param vesselClass  the value for ais_vessel_target.vessel_class
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public void setVesselClass(String vesselClass) {
		this.vesselClass = vesselClass == null ? null : vesselClass.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_vessel_target.country
	 * @return  the value of ais_vessel_target.country
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_vessel_target.country
	 * @param country  the value for ais_vessel_target.country
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public void setCountry(String country) {
		this.country = country == null ? null : country.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_vessel_target.source
	 * @return  the value of ais_vessel_target.source
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public String getSource() {
		return source;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_vessel_target.source
	 * @param source  the value for ais_vessel_target.source
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public void setSource(String source) {
		this.source = source == null ? null : source.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_vessel_target.last_received
	 * @return  the value of ais_vessel_target.last_received
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public Date getLastReceived() {
		return lastReceived;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_vessel_target.last_received
	 * @param lastReceived  the value for ais_vessel_target.last_received
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public void setLastReceived(Date lastReceived) {
		this.lastReceived = lastReceived;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_vessel_target.valid_to
	 * @return  the value of ais_vessel_target.valid_to
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public Date getValidTo() {
		return validTo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_vessel_target.valid_to
	 * @param validTo  the value for ais_vessel_target.valid_to
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ais_vessel_target.created
	 * @return  the value of ais_vessel_target.created
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ais_vessel_target.created
	 * @param created  the value for ais_vessel_target.created
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

}