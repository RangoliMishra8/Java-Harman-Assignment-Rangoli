package a;

public class Employeedetails {
	

		public static void main(String[] args) {
			Employee employee=new Employee(1, "Divya", "Sahu", 50000);
			
			employee.raiseSalary(10);
			System.out.println(employee);
		}
	}

