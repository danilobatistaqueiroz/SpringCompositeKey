package br.com.labs.services;

import org.springframework.data.rest.core.config.Projection;

@Projection(
  name = "product", 
  types = { Employee.class }) 
public interface Products { 
    String getIdClient();
}