package aosf.test;

import org.springframework.stereotype.Component;

/**
 * @author: liukj
 * @date: 2019/12/31
 * @description： 测试对象
 */
@Component
public class TestBean {

	public void print(){
		System.out.println("这里测试一下依赖编译环境的情况！");
	}
}
