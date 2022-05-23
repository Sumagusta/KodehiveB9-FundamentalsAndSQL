package com.project.day6.generic;

public class GenericClass<T> {

	T obj;
	public GenericClass(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
	
}
