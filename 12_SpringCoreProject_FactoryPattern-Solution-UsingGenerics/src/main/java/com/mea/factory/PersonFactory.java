package com.mea.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.mea.comp.AadharDetails;
import com.mea.comp.Customer;
import com.mea.comp.Employee;
import com.mea.comp.Person;
import com.mea.comp.Student;

public class PersonFactory {

	// static factory method - having generic/common return type
	public static <T extends Person> T getPerson(Class<T> clazz) throws Exception{

		AadharDetails details = null;
		Object object;
		
		Constructor[] constructors = clazz.getDeclaredConstructors();

		if (clazz==Employee.class) {
			details = new AadharDetails(12345L, 20, 829955L);
			object = constructors[0].newInstance("raja", "new delhi", details, "HCL", 56099.0);
		} else if (clazz==Customer.class) {
			details = new AadharDetails(23456L, 30, 829966L);
			object = constructors[0].newInstance("ravi", "Sultanpur", details, 1234, 9099.0);
		} else if (clazz==Student.class) {
			details = new AadharDetails(34567L, 22, 829977L);
			object = constructors[0].newInstance("manish", "dubai", details, 139, "JAVA");
		} else {
			throw new IllegalArgumentException("Invalid Person Type");
		}
		return (T)object;
	}

}
