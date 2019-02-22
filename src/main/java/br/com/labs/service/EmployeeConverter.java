package br.com.labs.services;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.core.convert.converter.Converter;

class EmployeeConverter implements Converter<String, EmployeePK> {

    @Override
    public EmployeePK convert(String id) {
        String[] ids = id.split("-");
        Long cdSector = Long.valueOf(ids[0]);
        Long cdProduct = Long.valueOf(ids[1]);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime dtEmployee = LocalDateTime.parse(ids[2], formatter);
        Integer cdStatusEmployee = Integer.valueOf(ids[3]);
        return new EmployeePK(cdSector, cdProduct, dtEmployee, cdStatusEmployee);
    }
}