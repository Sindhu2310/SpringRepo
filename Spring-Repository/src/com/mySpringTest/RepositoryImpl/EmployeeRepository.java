package com.mySpringTest.RepositoryImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mySpringTest.Employee;
import com.mySpringTest.Repository.ObjectRepository;

@Repository
public class EmployeeRepository implements ObjectRepository<Employee> {

	private Map<Integer,Employee> repository;
	
	public EmployeeRepository() {
		this.repository=new HashMap<Integer,Employee>();
	}
	@Override
	public void store(Employee e) {
		// TODO Auto-generated method stub
		repository.put(e.getId(),e);
	}

	@Override
	public Employee retrieve(int id) {
		// TODO Auto-generated method stub
		return repository.get(id);
	}

	@Override
	public ArrayList<Employee> search(String name) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList=new ArrayList<Employee>();
		for(Integer i:repository.keySet()) {
			if(repository.get(i).getFirstName().contains(name) || repository.get(i).getLastName().contains(name)) {
				empList.add(repository.get(i));
			}
		}
		return empList;
	}

	@Override
	public Employee delete(int id) {
		// TODO Auto-generated method stub
		Employee rec=repository.get(id);
		return rec;
	}

}
