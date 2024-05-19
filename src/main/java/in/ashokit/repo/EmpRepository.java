package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.Employee;

@Repository
public interface EmpRepository extends CrudRepository<Employee, Integer> {

}
