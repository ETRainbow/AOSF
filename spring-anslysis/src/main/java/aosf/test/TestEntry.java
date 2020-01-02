package aosf.test;

import aosf.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: liukj
 * @date: 2019/12/31
 * @description： 测试启动入口
 */
public class TestEntry {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
		// 从容器中获取注入的bean
		TestBean bean = configApplicationContext.getBean(TestBean.class);
		bean.print();
	}
}
