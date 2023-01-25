package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;


//	@Override
//	public void run(String... args) throws Exception{
//		Employee employee = new Employee();
//		employee.setFirstName("ShivaSai");
//		employee.setLastName("Gampa");
//		employee.setEmaiId("ss@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Sunny");
//		employee1.setLastName("Ch");
//		employee1.setEmaiId("ch@gmail.com");
//		employeeRepository.save(employee1);
//
//}
}
