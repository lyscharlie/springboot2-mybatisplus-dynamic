package com.lyscharlie.biz.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.lyscharlie.SpringbootMybatisplusDynamicApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootMybatisplusDynamicApplication.class)
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void selectCountByRegisterReferId() {
		Long registerReferId = 1L;
		Integer count = this.userMapper.selectCountByRegisterReferId(registerReferId);
		System.out.println(count);
		Assert.assertTrue(count > 0);
	}
}