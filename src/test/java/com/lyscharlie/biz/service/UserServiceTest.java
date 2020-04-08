package com.lyscharlie.biz.service;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lyscharlie.SpringbootMybatisplusDynamicApplication;
import com.lyscharlie.biz.entity.UserDO;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisplusDynamicApplication.class)
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void testSaveOrUpdate() {

		UserDO user = new UserDO();
		user.setUserId(7L);
		user.setUserName("test_001");
		user.setPassword(DigestUtils.md5Hex("123456"));
		user.setEmail("test@test.com");
		user.setMobile("13012345678");
		user.setRegisterReferId(1L);
		user.setLastLoginTime(new Date());
		user.setIsDelete(0);
		user.setGmtCreate(new Date());
		user.setGmtModified(new Date());

		System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));

		Assert.assertTrue(this.userService.saveOrUpdate(user));
	}

	@Test
	public void testRemoveById() {
		long userId = 3L;
		Assert.assertTrue(this.userService.removeById(userId));
	}

	@Test
	public void testRandomUser() {
		UserDO user = this.userService.randomUser();
		Assert.assertTrue(null != user);
	}

	@Test
	public void testFindUserByNameAndPassword() {
		String userName = "abc";
		String password = "123456";

		UserDO user = this.userService.findUserByNameAndPassword(userName, password);
		Assert.assertTrue(null != user);
	}
}