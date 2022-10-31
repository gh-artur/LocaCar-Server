package com.ghartur.LocaCar.controller;

import com.ghartur.LocaCar.dto.BrandDTO;
import com.ghartur.LocaCar.model.Brand;
import com.ghartur.LocaCar.service.BrandService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/brand")
public class BrandController {

    private final BrandService brandService;
    private final ModelMapper modelMapper;

    @Autowired
    public BrandController(BrandService brandService, ModelMapper modelMapper) {
        this.brandService = brandService;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public List<BrandDTO> findAll() {
        return brandService.findAllBrands().stream()
                .map(brand -> modelMapper.map(brand, BrandDTO.class))
                .collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public ResponseEntity<BrandDTO> findById(@PathVariable Long id){
        Brand brand=brandService.findBrandById(id);
        BrandDTO brandResponse = modelMapper.map(brand,BrandDTO.class);
        return ResponseEntity.ok().body(brandResponse);
    }
    @PostMapping
    public ResponseEntity<BrandDTO> saveBrand(@RequestBody BrandDTO brand){
        Brand saveBrand = modelMapper.map(brand,Brand.class);
        brandService.saveBrand(saveBrand);
        return ResponseEntity.ok().body(brand);
    }
    @PutMapping
    public ResponseEntity<BrandDTO> updateBrand(@RequestBody BrandDTO brand){
        Brand newBrand =modelMapper.map(brand,Brand.class);
        brandService.updateBrand(newBrand);
        return ResponseEntity.ok().body(brand);
    }
    @DeleteMapping("/{id}")
    public HttpStatus deleteBrand(@PathVariable Long id){

        brandService.deleteBrand(id);
        return HttpStatus.ACCEPTED;
    }
}

