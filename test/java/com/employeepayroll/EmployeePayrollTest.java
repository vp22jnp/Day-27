package com.employeepayroll;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

//import com.employeepayrollservice.EmployeePayrollService.IOStream;

import junit.framework.TestCase;

public class EmployeePayrollTest extends TestCase {
    @Test
    public void writeEmpDataToFile() {
        EmployeePayroll[] empsData = { new EmployeePayroll(1, "vaibhav", 100000),
                new EmployeePayroll(2, "aryan", 200000),
                new EmployeePayroll(4, "anurag", 400000),
                new EmployeePayroll(3, "prakarsh", 300000), };

        EmployeePayrollService empService = new EmployeePayrollService(empsData);
        empService.writeEmpPayrollData(EmployeePayrollService.IOStream.FILE_IO);
        long count = empService.countEntries();
        System.out.println("Number of entries : " + count);
        assertEquals(4, count);
        // empService.readEmpPayrollData(IOStream.FILE_IO);
    }

    @Test
    public void getEmpPayrollDataFromFile() {
        EmployeePayrollFileService fileService = new EmployeePayrollFileService();
        System.out.println(fileService.getEmpPayrollData());
        assertEquals(4, fileService.getEmpPayrollData().size());
    }
}


