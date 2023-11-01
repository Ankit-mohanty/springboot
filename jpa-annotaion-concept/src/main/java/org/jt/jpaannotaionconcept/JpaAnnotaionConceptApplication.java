package org.jt.jpaannotaionconcept;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class JpaAnnotaionConceptApplication implements CommandLineRunner {
	private final EmployeeRepo employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaAnnotaionConceptApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var emp = Employee.builder()
		// .employeeId(null)
				.employeeName("Rahul")
				.employeeDescription("Very talented")
				.doj(LocalDateTime.now())
				.previousSalary(2500.36)
				.status(EmployeeStatus.ACTIVE)
				.build();
				employeeRepo.save(emp);
	}

}
