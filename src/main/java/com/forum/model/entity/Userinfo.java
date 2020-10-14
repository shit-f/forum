package com.forum.model.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Userinfo implements Cloneable{
	@Override 
    public Object clone() {
        Userinfo user = null;  
        try{  
            user = (Userinfo)super.clone();  
        }catch(CloneNotSupportedException e) {  
            e.printStackTrace();  
        }  
        return user;  
    }
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userid
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    private Integer userid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.username
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userpassword
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    private String userpassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userbirthday
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date userbirthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.usersex
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    private String usersex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userregdate
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd") 
    private Date userregdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.userimage
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    private String userimage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userinfo.useremail
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    private String useremail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userid
     *
     * @return the value of userinfo.userid
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userid
     *
     * @param userid the value for userinfo.userid
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.username
     *
     * @return the value of userinfo.username
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.username
     *
     * @param username the value for userinfo.username
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userpassword
     *
     * @return the value of userinfo.userpassword
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public String getUserpassword() {
        return userpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userpassword
     *
     * @param userpassword the value for userinfo.userpassword
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword == null ? null : userpassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userbirthday
     *
     * @return the value of userinfo.userbirthday
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public Date getUserbirthday() {
        return userbirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userbirthday
     *
     * @param userbirthday the value for userinfo.userbirthday
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setUserbirthday(Date userbirthday) {
        this.userbirthday = userbirthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.usersex
     *
     * @return the value of userinfo.usersex
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public String getUsersex() {
        return usersex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.usersex
     *
     * @param usersex the value for userinfo.usersex
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setUsersex(String usersex) {
        this.usersex = usersex == null ? null : usersex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userregdate
     *
     * @return the value of userinfo.userregdate
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public Date getUserregdate() {
        return userregdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userregdate
     *
     * @param userregdate the value for userinfo.userregdate
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setUserregdate(Date userregdate) {
        this.userregdate = userregdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.userimage
     *
     * @return the value of userinfo.userimage
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public String getUserimage() {
        return userimage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.userimage
     *
     * @param userimage the value for userinfo.userimage
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setUserimage(String userimage) {
        this.userimage = userimage == null ? null : userimage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userinfo.useremail
     *
     * @return the value of userinfo.useremail
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public String getUseremail() {
        return useremail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userinfo.useremail
     *
     * @param useremail the value for userinfo.useremail
     *
     * @mbg.generated Tue Oct 06 18:48:59 CST 2020
     */
    public void setUseremail(String useremail) {
        this.useremail = useremail == null ? null : useremail.trim();
    }

	@Override
	public String toString() {
		return "Userinfo [userid=" + userid + ", username=" + username + ", userpassword=" + userpassword
				+ ", userbirthday=" + userbirthday + ", usersex=" + usersex + ", userregdate=" + userregdate
				+ ", userimage=" + userimage + ", useremail=" + useremail + "]";
	}

	public Userinfo(Integer userid, String username, String userpassword, Date userbirthday, String usersex,
			Date userregdate, String userimage, String useremail) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpassword = userpassword;
		this.userbirthday = userbirthday;
		this.usersex = usersex;
		this.userregdate = userregdate;
		this.userimage = userimage;
		this.useremail = useremail;
	}

	public Userinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}