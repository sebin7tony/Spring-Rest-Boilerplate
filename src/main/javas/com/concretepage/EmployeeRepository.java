package com.concretepage;

import java.util.Map;

public interface EmployeeRepository {
     Map<String,String> getEmpDetail(String id);
}