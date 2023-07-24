package com.solvd.laba.carina.employees.api;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/delete/2", methodType = HttpMethodType.DELETE)
@ResponseTemplatePath(path = "api/employees/_delete/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class DeleteEmployeeMethod extends AbstractApiMethodV2 {

    public DeleteEmployeeMethod() {
        super(null, "api/employees/_delete/rs.json", "api/employees/employee.properties");
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}