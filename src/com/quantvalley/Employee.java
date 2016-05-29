/**
 * 
 */
package com.quantvalley;

/**
 * @author ashraf_sarhan
 * 
 */
public class Employee implements Comparable<Employee> {

	private String name;

	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	 @Override
	 public int compareTo(Employee o) {
	
	 //ascending order
	 return this.age - o.getAge();
	 
	 //descending order
	 //return o.getAge() - this.age;
	 
	 }

//	@Override
//	public int compareTo(Employee o) {
//		return this.getName().compareTo(o.getName());
//	}

	// @Override
	// public int compareTo(Bean o) {
	// return o.getName().compareTo(this.getName());
	// }

}
