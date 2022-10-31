package com.ghartur.LocaCar.service.impl;

import com.ghartur.LocaCar.model.Specification;
import com.ghartur.LocaCar.repository.SpecificationRepository;
import com.ghartur.LocaCar.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
@Service
public class SpecificationServiceImpl implements SpecificationService {

    final SpecificationRepository specificationRepository;

    @Autowired
    public SpecificationServiceImpl(SpecificationRepository specificationRepository) {
        this.specificationRepository = specificationRepository;
    }

    @Override
    public Specification saveSpecification(Specification specification) {
        return specificationRepository.save(specification);
    }

    @Override
    public Specification findSpecificationById(Long id) {
        return specificationRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Specification not found! Id: " + id));
    }

    @Override
    public List<Specification> findAllSpecifications() {
        return specificationRepository.findAll();
    }

    @Override
    public void deleteSpecification(Long id) {
        Specification specification = specificationRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Specification not found! Id: " + id));
        specificationRepository.delete(specification);
    }

    @Override
    public Specification updateSpecification(Specification specification) {
        Specification spec = specificationRepository.findById(specification.getId())
                .orElseThrow(() -> new NoSuchElementException("Specification not found! Id: " + specification.getId()));
        spec.setName(specification.getName());
        spec.setDescription(specification.getDescription());
        specificationRepository.save(spec);

        return spec;
    }

}

