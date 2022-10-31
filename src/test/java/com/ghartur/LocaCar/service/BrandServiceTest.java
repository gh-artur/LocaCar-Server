package com.ghartur.LocaCar.service;

import com.ghartur.LocaCar.model.Brand;
import com.ghartur.LocaCar.repository.BrandRepository;
import com.ghartur.LocaCar.service.impl.BrandServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.NoSuchElementException;

@ExtendWith(MockitoExtension.class)
public class BrandServiceTest {

    @Mock
    private BrandRepository brandRepository;

    @InjectMocks
    private BrandServiceImpl brandService;

    private Brand brand;

    @BeforeEach
    public void setup(){
        brand = Brand.builder()
                .id(1L)
                .name("Honda")
                .build();
    }

    @Test
    public void buscaPorMarcaNaoExistente(){
        Assertions.assertThrows(NoSuchElementException.class,()-> brandService.findBrandById(2L));
    }


}
