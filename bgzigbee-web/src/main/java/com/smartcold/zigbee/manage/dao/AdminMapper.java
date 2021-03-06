package com.smartcold.zigbee.manage.dao;

import java.util.List;
import com.smartcold.zigbee.manage.entity.AdminEntity;
import org.apache.ibatis.annotations.Param;
/**
 * 
 *@author Kaiqiang Jiang
 *@date:2016-6-22 上午11:11:51
 *@Description: Admin Mapper
 */
public interface AdminMapper {

	AdminEntity findAdmin(@Param("adminname") String adminname, @Param("adminpwd") String adminpwd);

	AdminEntity findAdminByName(@Param("adminname") String adminname);

	AdminEntity findAdminById(@Param("id") int id);
	
	List<AdminEntity> findAllAdmin();

	void insertAdmin(AdminEntity adminEntity);
}
