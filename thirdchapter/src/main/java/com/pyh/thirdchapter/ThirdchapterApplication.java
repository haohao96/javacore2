package com.pyh.thirdchapter;

import ClassChapter.pojo.Employee;
import lombok.ToString;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

@SpringBootApplication
public class ThirdchapterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdchapterApplication.class, args);
	}

	@Test
	public void test1()
	{
		System.out.printf("now time is:%tc",new Date());
	}

	@Test
	public void	test2() throws IOException {
		FileWriter writer=new FileWriter("src/main/resources/p.txt",true);
		writer.write("woqu");
		PrintWriter printer=new PrintWriter(new FileOutputStream("src/main/resources/p.txt",true));
		printer.write("printer");

		writer.flush();
		printer.flush();

		Scanner in=new Scanner(Paths.get("src/main/resources/p.txt"));
		System.out.println(in.nextLine());
	}

	@Test
	public void test3()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入值：");
		String  i= input.nextLine();
		String m="miao";
		switch (i)
		{
			case "pyh":
				System.out.println(i);
				break;
			case "miao":
				System.out.println(i);
				break;

		}
	}

	@Test
	public void test4()
	{
		double i=0.2+0.1;
		BigDecimal b= BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2));
		System.out.println(i);
		System.out.printf("b:"+b);
	}

	@Test
	public void test5()
	{
		int n=9;
		Boolean arr[] =new Boolean[n];
		arr[0]=true;
		System.out.println(Arrays.toString(arr));
	}


}
