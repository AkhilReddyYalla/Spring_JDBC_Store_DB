package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmpRepository;

@Service
public class EmpService {

	private EmpRepository empRepo;

	@Autowired
	public EmpService(EmpRepository empRepo) {

		this.empRepo = empRepo;
	}
  
	public void saveEmployee() {
		
		System.out.println("Imple class : "+empRepo.getClass().getName());
		
		Employee e = new Employee();
		e.setEid(101);
		e.setEname("akhil");
		e.setEsalary(25000.40);
		
		//inserting record based on given object
		empRepo.save(e);
		System.out.println("record saved successfully");
	}
	
}
