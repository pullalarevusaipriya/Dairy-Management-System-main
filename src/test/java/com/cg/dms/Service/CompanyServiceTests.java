package com.cg.dms.Service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.dms.entities.Company;
import com.cg.dms.exception.CompanyNotFoundException;
import com.cg.dms.repository.ICompanyRepository;
import com.cg.dms.service.ICompanyService;

@SpringBootTest
public class CompanyServiceTests {
	@Autowired
	ICompanyService companyService;
	
	@MockBean
	ICompanyRepository companyRepository;
	
	@Test
	void testInsertCompany() {
	Company c1 = new Company();
	c1.setCompanyName("sdsd");
	c1.setPassword("asdf2123");
	c1.setMobileNumber("818683");
	c1.setEmail("as@123");
	c1.setAddress("wewe");
	 
	Mockito.when(companyRepository.save(c1)).thenReturn(c1);
		
		assertThat(companyService.insertCompany(c1)).isEqualTo(c1);
	}
	@Test
	void testUpdateCompany()  {
		
		Company c1=new Company();
		c1.setCompanyName("xys");
		c1.setPassword("sonnu");
	  	c1.setMobileNumber("81868687");
		c1.setEmail("as@123");
		c1.setAddress("wewe");
		 
		
		
Mockito.when(companyRepository.save(c1)).thenReturn(c1);
		
try {
 	assertEquals(c1,companyService.updateCompany(c1) );
 	} catch
      (   CompanyNotFoundException e) {
 	e.printStackTrace();
 	}
	}
//	@Test
// 	public void viewCustomerTest() throws CustomerNotFoundException {
//		Customer c1=new Customer();
//		c1.setUsername("swathi");
//		c1.setFirstName("sonnu");
//	    c1.setLastName("monu");
//		c1.setPassword("asdf@2123");
//		c1.setMobileNumber(81868687);
//		c1.setEmail("as@123");
//		c1.setMilkunits(20);
//		c1.setUnitprice(30);
//		c1.setCustomerId(1);
//		
//		
//		when(customerRepository.findAll()).thenReturn(customerId);
//	 	assertEquals(customers, customerService.viewCustomers());

		
	//}
// 		@Test
// 		void testviewCustomer()  {
//		
//		Customer c1=new Customer();
//		c1.setUsername("swathi");
//		c1.setFirstName("sonnu");
//	    c1.setLastName("monu");
//		c1.setPassword("asdf@2123");
//		c1.setMobileNumber(81868687);
//		c1.setEmail("as@123");
//		c1.setMilkunits(20);
//		c1.setUnitprice(30);
//		c1.setCustomerId(1);
//		
//		
//Mockito.when(customerRepository.save(c1)).thenReturn(c1);
//		
//try {
// 	assertEquals(c1,customerService.viewCustomer(customerid) );
// 	} catch
//      (   CustomerNotFoundException e) {
// 	e.printStackTrace();
// 	}
//	}
 		@Test
 		void testdeleteCompany() {
 			Company c1=new Company();
 			c1.setCompanyName("mst");
 			c1.setPassword("222");
 		  	c1.setMobileNumber("1313131313");
 			c1.setEmail("mst@gmail.com");
 			c1.setAddress("atp");
 			 
 			
 			Mockito.when(companyRepository.save(c1)).thenReturn(c1);
            try {
				assertThat(companyService.deleteCompany(3)).isEqualTo(c1);
			} catch (CompanyNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
 			}
}