package com.pyh.thirdchapter;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.Scanner;

@SpringBootTest
class ThirdchapterApplicationTests {

	@Test
	void contextLoads() {

	}

	@Test
	public void test1()
	{
		System.out.printf("now time is:%tc",new Date());
	}

	@Test
	public void test3()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入值：");
		int i= input.nextInt();
		System.out.println(i);
	}

}
