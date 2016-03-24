package com.longrise.dsass.hib.bo;

import java.sql.Timestamp;

/**
 * Leapcodetype entity. @author MyEclipse Persistence Tools
 */
@SuppressWarnings("serial")
public class Leapcodetype implements java.io.Serializable{
	// Fields
	private String		id;
	private String		parentcodetypename;
	private String		rootcodetypename;
	private Integer		codelevel;
	private Integer		codeleveldeep;
	private String		codetypename;
	private String		codetypeenname;
	private String		codetablecnname;
	private String		codefieldid;
	private String		valuefieldid;
	private Integer		linktype;
	private Integer		linkagetype;
	private String		codeparentfieldid;
	private Integer		codesize;
	private String		sqlexpression;
	private String		orderexpression;
	private String		valueexpression;
	private String		schemaname;
	private String		dbname;
	private String		datasource;
	private String		fromsource;
	private String		remarks;
	private String		leapprojectid;
	private Integer		cloudappid;
	private String		creator;
	private Timestamp	createtime;
	private String		updater;
	private Timestamp	updatetime;
	private Integer		codecount;
	private String		codegroup;
	private String		ownersys;

	/** default constructor */
	public Leapcodetype(){
	}

	/** minimal constructor */
	public Leapcodetype(String id){
		this.id = id;
	}

	/** full constructor */
	public Leapcodetype(String id, String parentcodetypename, String rootcodetypename, Integer codelevel, Integer codeleveldeep, String codetypename, String codetypeenname, String codetablecnname, String codefieldid, String valuefieldid, Integer linktype, Integer linkagetype, String codeparentfieldid, Integer codesize, String sqlexpression, String orderexpression, String valueexpression,
			String schemaname, String dbname, String datasource, String fromsource, String remarks, String leapprojectid, Integer cloudappid, String creator, Timestamp createtime, String updater, Timestamp updatetime, Integer codecount, String codegroup, String ownersys){
		this.id = id;
		this.parentcodetypename = parentcodetypename;
		this.rootcodetypename = rootcodetypename;
		this.codelevel = codelevel;
		this.codeleveldeep = codeleveldeep;
		this.codetypename = codetypename;
		this.codetypeenname = codetypeenname;
		this.codetablecnname = codetablecnname;
		this.codefieldid = codefieldid;
		this.valuefieldid = valuefieldid;
		this.linktype = linktype;
		this.linkagetype = linkagetype;
		this.codeparentfieldid = codeparentfieldid;
		this.codesize = codesize;
		this.sqlexpression = sqlexpression;
		this.orderexpression = orderexpression;
		this.valueexpression = valueexpression;
		this.schemaname = schemaname;
		this.dbname = dbname;
		this.datasource = datasource;
		this.fromsource = fromsource;
		this.remarks = remarks;
		this.leapprojectid = leapprojectid;
		this.cloudappid = cloudappid;
		this.creator = creator;
		this.createtime = createtime;
		this.updater = updater;
		this.updatetime = updatetime;
		this.codecount = codecount;
		this.codegroup = codegroup;
		this.ownersys = ownersys;
	}

	// Property accessors
	public String getId(){
		return this.id;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getParentcodetypename(){
		return this.parentcodetypename;
	}

	public void setParentcodetypename(String parentcodetypename){
		this.parentcodetypename = parentcodetypename;
	}

	public String getRootcodetypename(){
		return this.rootcodetypename;
	}

	public void setRootcodetypename(String rootcodetypename){
		this.rootcodetypename = rootcodetypename;
	}

	public Integer getCodelevel(){
		return this.codelevel;
	}

	public void setCodelevel(Integer codelevel){
		this.codelevel = codelevel;
	}

	public Integer getCodeleveldeep(){
		return this.codeleveldeep;
	}

	public void setCodeleveldeep(Integer codeleveldeep){
		this.codeleveldeep = codeleveldeep;
	}

	public String getCodetypename(){
		return this.codetypename;
	}

	public void setCodetypename(String codetypename){
		this.codetypename = codetypename;
	}

	public String getCodetypeenname(){
		return this.codetypeenname;
	}

	public void setCodetypeenname(String codetypeenname){
		this.codetypeenname = codetypeenname;
	}

	public String getCodetablecnname(){
		return this.codetablecnname;
	}

	public void setCodetablecnname(String codetablecnname){
		this.codetablecnname = codetablecnname;
	}

	public String getCodefieldid(){
		return this.codefieldid;
	}

	public void setCodefieldid(String codefieldid){
		this.codefieldid = codefieldid;
	}

	public String getValuefieldid(){
		return this.valuefieldid;
	}

	public void setValuefieldid(String valuefieldid){
		this.valuefieldid = valuefieldid;
	}

	public Integer getLinktype(){
		return this.linktype;
	}

	public void setLinktype(Integer linktype){
		this.linktype = linktype;
	}

	public Integer getLinkagetype(){
		return this.linkagetype;
	}

	public void setLinkagetype(Integer linkagetype){
		this.linkagetype = linkagetype;
	}

	public String getCodeparentfieldid(){
		return this.codeparentfieldid;
	}

	public void setCodeparentfieldid(String codeparentfieldid){
		this.codeparentfieldid = codeparentfieldid;
	}

	public Integer getCodesize(){
		return this.codesize;
	}

	public void setCodesize(Integer codesize){
		this.codesize = codesize;
	}

	public String getSqlexpression(){
		return this.sqlexpression;
	}

	public void setSqlexpression(String sqlexpression){
		this.sqlexpression = sqlexpression;
	}

	public String getOrderexpression(){
		return this.orderexpression;
	}

	public void setOrderexpression(String orderexpression){
		this.orderexpression = orderexpression;
	}

	public String getValueexpression(){
		return this.valueexpression;
	}

	public void setValueexpression(String valueexpression){
		this.valueexpression = valueexpression;
	}

	public String getSchemaname(){
		return this.schemaname;
	}

	public void setSchemaname(String schemaname){
		this.schemaname = schemaname;
	}

	public String getDbname(){
		return this.dbname;
	}

	public void setDbname(String dbname){
		this.dbname = dbname;
	}

	public String getDatasource(){
		return this.datasource;
	}

	public void setDatasource(String datasource){
		this.datasource = datasource;
	}

	public String getFromsource(){
		return this.fromsource;
	}

	public void setFromsource(String fromsource){
		this.fromsource = fromsource;
	}

	public String getRemarks(){
		return this.remarks;
	}

	public void setRemarks(String remarks){
		this.remarks = remarks;
	}

	public String getLeapprojectid(){
		return this.leapprojectid;
	}

	public void setLeapprojectid(String leapprojectid){
		this.leapprojectid = leapprojectid;
	}

	public Integer getCloudappid(){
		return this.cloudappid;
	}

	public void setCloudappid(Integer cloudappid){
		this.cloudappid = cloudappid;
	}

	public String getCreator(){
		return this.creator;
	}

	public void setCreator(String creator){
		this.creator = creator;
	}

	public Timestamp getCreatetime(){
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime){
		this.createtime = createtime;
	}

	public String getUpdater(){
		return this.updater;
	}

	public void setUpdater(String updater){
		this.updater = updater;
	}

	public Timestamp getUpdatetime(){
		return this.updatetime;
	}

	public void setUpdatetime(Timestamp updatetime){
		this.updatetime = updatetime;
	}

	public Integer getCodecount(){
		return this.codecount;
	}

	public void setCodecount(Integer codecount){
		this.codecount = codecount;
	}

	public String getCodegroup(){
		return this.codegroup;
	}

	public void setCodegroup(String codegroup){
		this.codegroup = codegroup;
	}

	public String getOwnersys(){
		return this.ownersys;
	}

	public void setOwnersys(String ownersys){
		this.ownersys = ownersys;
	}
}