package com.cts.attendance.repository;

import org.springframework.data.repository.CrudRepository;

import com.cts.attendance.entity.UserCred;

public interface UserRepository extends CrudRepository<UserCred, String>
{

	UserCred findByLoginName(String loginName) ;
	

}
