package com.bnp.Spring;

public class XMLImplements {

}

class Employee {
	int cd;
	String name;
	Address add;
}
class Address {
	String city;
	String location;
}


/*
 <bean id="employee" class="com.bnp.Spring.Employee">
		<property name="cd" value="121"/>
		<property name="name" value="Amit"/>
		<property name="add">
			<bean ref="address"/>
		</property>
</bean>

 <bean id="address" class="com.bnp.Spring.Address">
		<property name="city" value="Mumbai"/>
		<property name="location" value="Santacruz"/>
			
</bean>
  
 
*/