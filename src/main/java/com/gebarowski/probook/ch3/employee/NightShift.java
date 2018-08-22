package com.gebarowski.probook.ch3.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("nightshift")
public class NightShift implements Shift {

    Employee employee;

    @Autowired
    public NightShift(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String checkShiftCapability() {
        return employee.getProfesion();
    }
}
