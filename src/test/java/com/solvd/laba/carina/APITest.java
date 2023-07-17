package com.solvd.laba.carina;

import com.solvd.laba.carina.employees.api.*;
import com.zebrunner.carina.api.AbstractApiMethodV2;
import kong.unirest.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import java.lang.invoke.MethodHandles;

import static org.testng.Assert.assertEquals;

public class APITest implements IAbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private static final String EMPLOYEE_PROPERTIES = "api/employees/employee.properties";

    @Test()
    @MethodOwner(owner = "hhan")
    public void testPostEmployee() {
        LOGGER.info("Post test");
        PostEmployeeMethod apiMethod = new PostEmployeeMethod();
        String responseStr = apiMethod.callAPI().asString();
        JSONObject responseJSON = new JSONObject(responseStr);

        assertEquals("success", responseJSON.getString("status"), "Status does not match");
        assertEquals("Successfully! Record has been added.", responseJSON.getString("message"),
                "Message does not match");

        JSONObject responseData = responseJSON.getJSONObject("data");
        assertEquals("Alex Smith", responseData.getString("employee_name"),
                "Employee name does not match");
        assertEquals(100000, responseData.getInt("employee_salary"),
                "Employee salary does not match");
        assertEquals(28, responseData.getInt("employee_age"), "Employee age does not match");
    }

    @Test()
    @MethodOwner(owner = "hhan")
    public void testGetEmployee() {
        executeApiMethod(new GetEmployeeMethod(), "GET test");
    }

    @Test()
    @MethodOwner(owner = "hhan")
    public void testGetEmployeeById() {
        executeApiMethod(new GetEmployeeByIdMethod(), "GET by ID test");
    }

    @Test()
    @MethodOwner(owner = "hhan")
    public void testUpdateEmployee() {
        executeApiMethod(new UpdateEmployeeMethod(), "PUT test");
    }

    @Test()
    @MethodOwner(owner = "hhan")
    public void testDeleteEmployee() {
        executeApiMethod(new DeleteEmployeeMethod(), "DELETE test");
    }

    private void executeApiMethod(AbstractApiMethodV2 api, String message) {
        LOGGER.info(message);
        api.setProperties(EMPLOYEE_PROPERTIES);
        api.callAPIExpectSuccess();
        api.validateResponse();
    }
}