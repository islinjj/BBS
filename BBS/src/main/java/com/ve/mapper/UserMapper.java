package com.ve.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ve.entity.User;

/**
 * 用户持久层
 * 1)查找指定用户名;2)查找指定的用户账号;3)注册信息存入数据库
 * 
 * @author thinkpad_ljj
 *
 */
@Mapper
public interface UserMapper {

	/**
	 * 查找指定用户名的用户
	 * 
	 * @param uname 用户名
	 */
	@Select("select uname from user where uname=#{uname}")
	public User findUserName(@Param("uname") String uname);

	/**
	 * 查找指定账号的用户
	 * 
	 * @param uid
	 * @return
	 */
	@Select("select uid from user where uid=#{uid}")
	public User findUserAcc(@Param("uid") String uid);
	
	/**
	 * 注册用户存入数据库
	 * 
	 * @param user
	 */
	@Insert("insert into user(uid,password,uname,email,phonenumber) values(#{uid},#{password},#{uname},#{email},#{phonenumber}) ")
	public void save(User user);
}
