package com.ghartur.LocaCar.controller;

import com.ghartur.LocaCar.dto.CustomerDTO;
import com.ghartur.LocaCar.model.Customer;
import com.ghartur.LocaCar.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    private final CustomerService customerService;
    private final ModelMapper modelMapper;

    @Autowired
    public CustomerController(CustomerService customerService, ModelMapper modelMapper) {
        this.customerService = customerService;
        this.modelMapper = modelMapper;
    }
    //createCustomer
    @PostMapping
    public ResponseEntity<CustomerDTO> createCustomer(@RequestBody CustomerDTO newCustomer){
        Customer customer=modelMapper.map(newCustomer,Customer.class);
        if (customerService.customerExists(customer)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Customer already exists!!");
        }else {
            customerService.createCustomer(customer);
            return ResponseEntity.status(HttpStatus.CREATED).body(newCustomer);
        }
    }
    //findCustomer
    @GetMapping("/{id}")
    public ResponseEntity<CustomerDTO> findCustomer(@PathVariable Long id){
        Customer customer = customerService.findCustomer(id);
        CustomerDTO customerResponse = modelMapper.map(customer,CustomerDTO.class);
        return ResponseEntity.ok().body(customerResponse);
    }
    //listCustomers
    @GetMapping
    public List<CustomerDTO> listCustomers(){
        return customerService.listCustomers().stream()
                .map(customerList -> modelMapper.map(customerList, CustomerDTO.class))
                .collect(Collectors.toList());
    }
    //updateCustomer
    @PutMapping
    public void updateCustomer(@RequestBody CustomerDTO customerDTO){
        Customer customer = modelMapper.map(customerDTO,Customer.class);
        customerService.updateCustomer(customer);
    }
    //deleteCustomer
    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }
}
