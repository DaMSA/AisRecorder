package dk.frv.aisrecorder.persistence.mapper;

import dk.frv.aisrecorder.persistence.domain.AisVesselPosition;

public interface AisVesselPositionMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_position
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	int deleteByPrimaryKey(Integer mmsi);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_position
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	int insert(AisVesselPosition record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_position
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	int insertSelective(AisVesselPosition record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_position
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	AisVesselPosition selectByPrimaryKey(Integer mmsi);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_position
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	int updateByPrimaryKeySelective(AisVesselPosition record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_position
	 * @mbggenerated  Thu Dec 08 09:57:09 CET 2011
	 */
	int updateByPrimaryKey(AisVesselPosition record);
}