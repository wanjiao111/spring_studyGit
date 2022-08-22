package com.hotmaxx.controller;

import com.hotmaxx.model.query.EmployeeQuery;
import com.hotmaxx.model.vo.EmployeeQueryVO;
import com.hotmaxx.service.EmployeeQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employeeQuery")
public class EmployeeQueryController {
    @Autowired
    EmployeeQueryService employeeQueryService;
    @GetMapping("/query")
    public List<EmployeeQueryVO> query(EmployeeQuery employeequery){
       return employeeQueryService.query(employeequery);
    }


//    @PostMapping("/query")
//    public List<EmployeeQueryVO> postQuery(@RequestBody EmployeeQuery employeequery){
//        return employeeQueryService.query(employeequery);
//    }
}
