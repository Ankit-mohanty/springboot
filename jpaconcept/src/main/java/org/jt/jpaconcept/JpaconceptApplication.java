package org.jt.jpaconcept;

// import org.jt.jpaconcept.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class JpaconceptApplication implements CommandLineRunner {
	private final StudentRepo studentrepo;


	public static void main(String[] args) {
		SpringApplication.run(JpaconceptApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// hrow new UnsupportedOperationException("Unimplemented method 'run'");
		var student1 =new   Student (1, "rahul", 2500.36);
		var student2= new Student(2,"Ankit",29000.23);
		// studentrepo.save(student1);
		System.out.println(studentrepo.findAll());
		//DDL- Data Defination Language(create, filter,drop,return)
		//DmL-data malipulation language(insert, declare,chage)
		// Some annotation of JPA=@Entity-It represnt class replica in database.
		// @Table(name="student")=!st it's find student name table if it is not availavle create student name table.
		// @Column(name="gdy")= name the column
// @GeneratedValue(Startegy=GeneratedType.(auto,identity))=Auto generated value, Identity to auto increment in table, UUID.
// @Lob=Specifies that a persistent property or field should be persisted as a large object to a database-supported large object type. 
// @Temporal= Manage date and time.
// @Transient= If we write transient particular column dose not insert in data base.
// @Enumartion= Value enum value.

	}

}
