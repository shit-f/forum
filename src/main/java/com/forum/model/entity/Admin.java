package com.forum.model.entity;

public class Admin {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.adminid
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    private Integer adminid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.adminname
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    private String adminname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.adminpassword
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    private String adminpassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.adminid
     *
     * @return the value of admin.adminid
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.adminid
     *
     * @param adminid the value for admin.adminid
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.adminname
     *
     * @return the value of admin.adminname
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.adminname
     *
     * @param adminname the value for admin.adminname
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.adminpassword
     *
     * @return the value of admin.adminpassword
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public String getAdminpassword() {
        return adminpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.adminpassword
     *
     * @param adminpassword the value for admin.adminpassword
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

	@Override
	public String toString() {
		return "Admin [adminid=" + adminid + ", adminname=" + adminname + ", adminpassword=" + adminpassword + "]";
	}

	public Admin(Integer adminid, String adminname, String adminpassword) {
		super();
		this.adminid = adminid;
		this.adminname = adminname;
		this.adminpassword = adminpassword;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}