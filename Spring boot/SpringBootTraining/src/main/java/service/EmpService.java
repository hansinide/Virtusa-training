package service;

import org.springframework.stereotype.Service;

import modal.Employee;

@Service
public interface EmpService {

	Employee save(Employee emp);
}
