package com.ghartur.LocaCar.controller;

import com.ghartur.LocaCar.dto.SpecificationDTO;
import com.ghartur.LocaCar.model.Specification;
import com.ghartur.LocaCar.service.SpecificationService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/specification")
public class SpecificationController {
    private final SpecificationService specificationService;
    private final ModelMapper modelMapper;

    @Autowired
    public SpecificationController(SpecificationService specificationService, ModelMapper modelMapper) {
        this.specificationService = specificationService;
        this.modelMapper = modelMapper;
    }

    //saveSpecification
    @PostMapping
    public ResponseEntity<SpecificationDTO> saveSpecification(@RequestBody SpecificationDTO newSpecification){
        Specification specification = modelMapper.map(newSpecification, Specification.class);
        specificationService.saveSpecification(specification);
        return ResponseEntity.ok().body(newSpecification);
    }
    //findSpecificationById
    @GetMapping("/{id}")
    public ResponseEntity<SpecificationDTO> findById(@PathVariable Long id){
        Specification specification=specificationService.findSpecificationById(id);
        SpecificationDTO specificationResponse = modelMapper.map(specification,SpecificationDTO.class);
        return ResponseEntity.ok().body(specificationResponse);
    }
    //findAllSpecifications
    @GetMapping
    public List<SpecificationDTO> findAll() {
        return specificationService.findAllSpecifications().stream()
                .map(specification -> modelMapper.map(specification, SpecificationDTO.class))
                .collect(Collectors.toList());
    }
    //deleteSpecification
    @DeleteMapping("/{id}")
    public HttpStatus deleteSpecification(@PathVariable Long id){
        Specification specificationById = specificationService.findSpecificationById(id);
        specificationService.deleteSpecification(specificationById.getId());
        return HttpStatus.ACCEPTED;
    }
    //updateSpecification
    @PutMapping
    public ResponseEntity<SpecificationDTO> updateSpecification(@RequestBody SpecificationDTO specification){
        Specification newSpecification =modelMapper.map(specification,Specification.class);
        specificationService.updateSpecification(newSpecification);
        return ResponseEntity.ok().body(specification);
    }
}
