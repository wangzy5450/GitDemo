package cn.tedu.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.entity.CollectionEntity;
import cn.tedu.spring.entity.ValueBean;

public class Test {
	public static void main(String[] args) {
		//加载配置文件，获取Spring容器
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获取所需的对象
		CollectionEntity collectionEntity = ac.getBean("collectionEntity",CollectionEntity.class);
		ValueBean valueBean = ac.getBean("valueBean",ValueBean.class);
		
		//执行测试
		System.out.println("tag属性的值");
		System.out.println(collectionEntity.getTag());
		System.out.println();
		System.out.println("List集合:");
		System.out.println(collectionEntity.getNames().getClass());
		System.out.println(collectionEntity.getNames());
		System.out.println();
		System.out.println("Set集合:");
		System.out.println(collectionEntity.getCities().getClass());
		System.out.println(collectionEntity.getCities());
		System.out.println();
		System.out.println("Map集合");
		System.out.println(collectionEntity.getSession().getClass());
		System.out.println(collectionEntity.getSession());
		System.out.println();
		System.out.println();
		System.out.println("Spring表达式:");
		System.out.println("tagValue="+valueBean.getTagValue());
		System.out.println();
		System.out.println("nameValue="+valueBean.getNameValue());
		System.out.println();
		System.out.println("cityValue="+valueBean.getCityValue());
		System.out.println();
		System.out.println("usernameValue="+valueBean.getUsernameValue());
		System.out.println();
		System.out.println("passwordValue="+valueBean.getPasswordValue());
		//释放资源
		ac.close();
	}
}
