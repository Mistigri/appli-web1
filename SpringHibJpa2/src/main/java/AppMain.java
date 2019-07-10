import java.math.BigDecimal;

import org.joda.time.LocalDate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;




import com.wha.spring.configuration.AppConfig;
import com.wha.spring.model.Address;
import com.wha.spring.model.Employee;
import com.wha.spring.service.EmployeeService;

public class AppMain {

public static void main(String args[]) {
   AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

   EmployeeService service = (EmployeeService)context.getBean("employeeService");

   Address address1 = new Address();
   address1.setRue("3 rue Nain");
   address1.setCp(59100);  
   address1.setVille("Roubaix");
   
   Address address2 = new Address();
   address2.setRue("34 allée des Hêtres");
   address2.setCp(59420);  
   address2.setVille("Mouvaux");
   
   
/*
 * Create Employee1
 */
   Employee employee1 = new Employee();
   employee1.setName("Han Yenn");
   employee1.setJoiningDate(new LocalDate(2010, 10, 10));
   employee1.setSalary(new BigDecimal(10000));
   employee1.setSsn("ssn00000001");
   employee1.setAddress(address1);

/*
 * Create Employee2
 */
   Employee employee2 = new Employee();
   employee2.setName("Dan Thomas");
   employee2.setJoiningDate(new LocalDate(2012, 11, 11));
   employee2.setSalary(new BigDecimal(20000));
   employee2.setSsn("ssn00000002");
   employee2.setAddress(address2);

/*
 * Persist both Employees
 */
   service.saveEmployee(employee1);
   service.saveEmployee(employee2);
        context.close();
   }
}
