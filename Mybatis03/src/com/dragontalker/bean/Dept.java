package com.dragontalker.bean;

public class Dept {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.did
     *
     * @mbggenerated Tue Jul 13 09:44:32 EDT 2021
     */
    private Integer did;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dname
     *
     * @mbggenerated Tue Jul 13 09:44:32 EDT 2021
     */
    private String dname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.did
     *
     * @return the value of dept.did
     *
     * @mbggenerated Tue Jul 13 09:44:32 EDT 2021
     */
    public Integer getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.did
     *
     * @param did the value for dept.did
     *
     * @mbggenerated Tue Jul 13 09:44:32 EDT 2021
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dname
     *
     * @return the value of dept.dname
     *
     * @mbggenerated Tue Jul 13 09:44:32 EDT 2021
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dname
     *
     * @param dname the value for dept.dname
     *
     * @mbggenerated Tue Jul 13 09:44:32 EDT 2021
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
}