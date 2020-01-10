package aosf.lifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author: liukj
 * @date: 2020/1/9
 * @description：
 */
public class TestLifeCycle implements BeanFactoryAware , BeanNameAware , InitializingBean , DisposableBean {

	private String lifeType;
	private String lifeLength ;
	private BeanFactory beanFactory;
	TestLifeCycle(){
		System.out.println("== 执行到构造方法：TestLifeCycle");
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("== 执行到TestLifeCycle：setBeanFactory");
		boolean testLifeCycle = beanFactory.containsBean("testLifeCycle");
		beanFactory=beanFactory;
		System.out.println("== 执行到TestLifeCycle："+testLifeCycle);
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("== 执行到执行到TestLifeCycle：setBeanName");
		boolean testLifeCycle = beanFactory.containsBean(name);
		System.out.println("== 执行到TestLifeCycle："+testLifeCycle);
	}

	@Override
	public void afterPropertiesSet() throws Exception {

	}

	@Override
	public void destroy() throws Exception {

	}

	public String getLifeType() {
		return lifeType;
	}

	public void setLifeType(String lifeType) {
		this.lifeType = lifeType;
	}

	public String getLifeLength() {
		return lifeLength;
	}

	public void setLifeLength(String lifeLength) {
		this.lifeLength = lifeLength;
	}
}
