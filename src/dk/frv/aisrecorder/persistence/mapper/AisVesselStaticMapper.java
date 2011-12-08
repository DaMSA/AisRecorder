package dk.frv.aisrecorder.persistence.mapper;

import dk.frv.aisrecorder.persistence.domain.AisVesselStatic;

public interface AisVesselStaticMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_static
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	int deleteByPrimaryKey(Integer mmsi);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_static
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	int insert(AisVesselStatic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_static
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	int insertSelective(AisVesselStatic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_static
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	AisVesselStatic selectByPrimaryKey(Integer mmsi);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_static
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	int updateByPrimaryKeySelective(AisVesselStatic record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table ais_vessel_static
	 * @mbggenerated  Thu Dec 08 11:32:48 CET 2011
	 */
	int updateByPrimaryKey(AisVesselStatic record);
}