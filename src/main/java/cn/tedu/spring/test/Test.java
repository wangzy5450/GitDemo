package cn.tedu.spring.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.spring.entity.CollectionEntity;
import cn.tedu.spring.entity.ValueBean;

public class Test {
	public static void main(String[] args) {
		//���������ļ�����ȡSpring����
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//��ȡ����Ķ���
		CollectionEntity collectionEntity = ac.getBean("collectionEntity",CollectionEntity.class);
		ValueBean valueBean = ac.getBean("valueBean",ValueBean.class);
		
		//ִ�в���
		System.out.println("tag���Ե�ֵ");
		System.out.println(collectionEntity.getTag());
		System.out.println();
		System.out.println("List����:");
		System.out.println(collectionEntity.getNames().getClass());
		System.out.println(collectionEntity.getNames());
		System.out.println();
		System.out.println("Set����:");
		System.out.println(collectionEntity.getCities().getClass());
		System.out.println(collectionEntity.getCities());
		System.out.println();
		System.out.println("Map����");
		System.out.println(collectionEntity.getSession().getClass());
		System.out.println(collectionEntity.getSession());
		System.out.println();
		System.out.println();
		System.out.println("Spring���ʽ:");
		System.out.println("tagValue="+valueBean.getTagValue());
		System.out.println();
		System.out.println("nameValue="+valueBean.getNameValue());
		System.out.println();
		System.out.println("cityValue="+valueBean.getCityValue());
		System.out.println();
		System.out.println("usernameValue="+valueBean.getUsernameValue());
		System.out.println();
		System.out.println("passwordValue="+valueBean.getPasswordValue());
		//�ͷ���Դ
		ac.close();
	}
}
