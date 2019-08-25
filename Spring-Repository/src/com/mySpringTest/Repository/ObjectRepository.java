package com.mySpringTest.Repository;

import java.util.ArrayList;

public interface ObjectRepository<T> {
	
	
	public void store(T t);
	
	public T retrieve(int id);
	
	public ArrayList<T> search(String name);
	
	public T delete(int id);

}
