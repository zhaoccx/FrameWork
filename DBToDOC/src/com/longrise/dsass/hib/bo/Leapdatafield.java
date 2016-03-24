package com.longrise.dsass.hib.bo;

import java.sql.Timestamp;

/**
 * Leapdatafield entity. @author MyEclipse Persistence Tools
 */

public class Leapdatafield implements java.io.Serializable {

	// Fields

	private String id;
	private String tablename;
	private String name;
	private String cnname;
	private String code;
	private Integer datatype;
	private String defalutvalue;
	private String measuerunit;
	private Integer minsize;
	private Integer maxsize;
	private String codetype;
	private Integer isnullable;
	private Integer ispk;
	private Integer generatortype;
	private Integer isunique;
	private Integer isunionunique;
	private Integer generatorruntime;
	private String remarks;
	private Integer numericscale;
	private Integer rn;
	private Integer orderid;
	private Integer cloudappid;
	private String fieldtype;
	private String creator;
	private Timestamp createtime;
	private String updater;
	private Timestamp updatetime;
	private Integer canfulltextsearch;
	private String sourcefield;
	private String sourcetable;
	private Integer issourcepk;

	// Constructors

	/** default constructor */
	public Leapdatafield() {
	}

	/** minimal constructor */
	public Leapdatafield(String id) {
		this.id = id;
	}

	/** full constructor */
	public Leapdatafield(String id, String tablename, String name,
			String cnname, String code, Integer datatype, String defalutvalue,
			String measuerunit, Integer minsize, Integer maxsize,
			String codetype, Integer isnullable, Integer ispk,
			Integer generatortype, Integer isunique, Integer isunionunique,
			Integer generatorruntime, String remarks, Integer numericscale,
			Integer rn, Integer orderid, Integer cloudappid, String fieldtype,
			String creator, Timestamp createtime, String updater,
			Timestamp updatetime, Integer canfulltextsearch,
			String sourcefield, String sourcetable, Integer issourcepk) {
		this.id = id;
		this.tablename = tablename;
		this.name = name;
		this.cnname = cnname;
		this.code = code;
		this.datatype = datatype;
		this.defalutvalue = defalutvalue;
		this.measuerunit = measuerunit;
		this.minsize = minsize;
		this.maxsize = maxsize;
		this.codetype = codetype;
		this.isnullable = isnullable;
		this.ispk = ispk;
		this.generatortype = generatortype;
		this.isunique = isunique;
		this.isunionunique = isunionunique;
		this.generatorruntime = generatorruntime;
		this.remarks = remarks;
		this.numericscale = numericscale;
		this.rn = rn;
		this.orderid = orderid;
		this.cloudappid = cloudappid;
		this.fieldtype = fieldtype;
		this.creator = creator;
		this.createtime = createtime;
		this.updater = updater;
		this.updatetime = updatetime;
		this.canfulltextsearch = canfulltextsearch;
		this.sourcefield = sourcefield;
		this.sourcetable = sourcetable;
		this.issourcepk = issourcepk;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTablename() {
		return this.tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCnname() {
		return this.cnname;
	}

	public void setCnname(String cnname) {
		this.cnname = cnname;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getDatatype() {
		return this.datatype;
	}

	public void setDatatype(Integer datatype) {
		this.datatype = datatype;
	}

	public String getDefalutvalue() {
		return this.defalutvalue;
	}

	public void setDefalutvalue(String defalutvalue) {
		this.defalutvalue = defalutvalue;
	}

	public String getMeasuerunit() {
		return this.measuerunit;
	}

	public void setMeasuerunit(String measuerunit) {
		this.measuerunit = measuerunit;
	}

	public Integer getMinsize() {
		return this.minsize;
	}

	public void setMinsize(Integer minsize) {
		this.minsize = minsize;
	}

	public Integer getMaxsize() {
		return this.maxsize;
	}

	public void setMaxsize(Integer maxsize) {
		this.maxsize = maxsize;
	}

	public String getCodetype() {
		return this.codetype;
	}

	public void setCodetype(String codetype) {
		this.codetype = codetype;
	}

	public Integer getIsnullable() {
		return this.isnullable;
	}

	public void setIsnullable(Integer isnullable) {
		this.isnullable = isnullable;
	}

	public Integer getIspk() {
		return this.ispk;
	}

	public void setIspk(Integer ispk) {
		this.ispk = ispk;
	}

	public Integer getGeneratortype() {
		return this.generatortype;
	}

	public void setGeneratortype(Integer generatortype) {
		this.generatortype = generatortype;
	}

	public Integer getIsunique() {
		return this.isunique;
	}

	public void setIsunique(Integer isunique) {
		this.isunique = isunique;
	}

	public Integer getIsunionunique() {
		return this.isunionunique;
	}

	public void setIsunionunique(Integer isunionunique) {
		this.isunionunique = isunionunique;
	}

	public Integer getGeneratorruntime() {
		return this.generatorruntime;
	}

	public void setGeneratorruntime(Integer generatorruntime) {
		this.generatorruntime = generatorruntime;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getNumericscale() {
		return this.numericscale;
	}

	public void setNumericscale(Integer numericscale) {
		this.numericscale = numericscale;
	}

	public Integer getRn() {
		return this.rn;
	}

	public void setRn(Integer rn) {
		this.rn = rn;
	}

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getCloudappid() {
		return this.cloudappid;
	}

	public void setCloudappid(Integer cloudappid) {
		this.cloudappid = cloudappid;
	}

	public String getFieldtype() {
		return this.fieldtype;
	}

	public void setFieldtype(String fieldtype) {
		this.fieldtype = fieldtype;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public String getUpdater() {
		return this.updater;
	}

	public void setUpdater(String updater) {
		this.updater = updater;
	}

	public Timestamp getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime) {
		this.updatetime = updatetime;
	}

	public Integer getCanfulltextsearch() {
		return this.canfulltextsearch;
	}

	public void setCanfulltextsearch(Integer canfulltextsearch) {
		this.canfulltextsearch = canfulltextsearch;
	}

	public String getSourcefield() {
		return this.sourcefield;
	}

	public void setSourcefield(String sourcefield) {
		this.sourcefield = sourcefield;
	}

	public String getSourcetable() {
		return this.sourcetable;
	}

	public void setSourcetable(String sourcetable) {
		this.sourcetable = sourcetable;
	}

	public Integer getIssourcepk() {
		return this.issourcepk;
	}

	public void setIssourcepk(Integer issourcepk) {
		this.issourcepk = issourcepk;
	}

}