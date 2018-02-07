package kr.or.dgit.mybatis_study.code;

import org.apache.ibatis.session.SqlSessionFactory;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;


import kr.or.dgit.mybatis_study.util.MybatisSqlSessionFactory;

public class MybatisSqlSessionFactoryTest {

		private static SqlSessionFactory factory;
		
		@BeforeClass
		public static  void setUpBeforeClass() throws Exception {
			factory = MybatisSqlSessionFactory.getSqlSessionFactory();
}
		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			factory = null;
		}
		@Test
		public void test() {
			Assert.assertNotNull(factory);
		}
}
