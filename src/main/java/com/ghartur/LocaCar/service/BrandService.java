package com.ghartur.LocaCar.service;

import com.ghartur.LocaCar.model.Brand;

import java.util.List;


public interface BrandService {

    Brand saveBrand(Brand brand);
    List<Brand> findAllBrands();
    Brand updateBrand(Brand brand);
    void deleteBrand(Long id);
    Brand findBrandById(Long id);

}
