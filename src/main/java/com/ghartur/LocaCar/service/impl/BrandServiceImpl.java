package com.ghartur.LocaCar.service.impl;

import com.ghartur.LocaCar.model.Brand;
import com.ghartur.LocaCar.repository.BrandRepository;
import com.ghartur.LocaCar.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public Brand saveBrand(Brand brand) {
        return brandRepository.save(brand);
    }
    @Override
    public Brand findBrandById(Long id){
        return brandRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("Brand not found! Id: "+id));
    }
    @Override
    public List<Brand> findAllBrands() {
        return brandRepository.findAll();
    }

    @Override
    public Brand updateBrand(Brand brandRequest) {

        Brand brand = brandRepository.findById(brandRequest.getId())
                            .orElseThrow(()->new NoSuchElementException("Brand not found! Id: "+brandRequest.getId()));
        brand.setName(brandRequest.getName());
        return brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(Long id) {
        brandRepository.deleteById(id);
    }
}
