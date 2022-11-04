package com.ghartur.LocaCar;

import com.ghartur.LocaCar.model.Brand;
import com.ghartur.LocaCar.model.Car;
import com.ghartur.LocaCar.model.Category;
import com.ghartur.LocaCar.model.Specification;
import com.ghartur.LocaCar.ui.HomePage;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.*;
import java.awt.*;
import java.security.DomainLoadStoreParameter;
import java.time.LocalDate;

@SpringBootApplication
public class LocaCarApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(LocaCarApplication.class, args);
		HomePage home = new HomePage();
		home.setVisible(true);

	}

	private void config(){
		Brand brand1 = new Brand(null, "Volks", LocalDate.now());
		Brand brand2 = new Brand(null, "Ford", LocalDate.now());

		Specification specification1 = new Specification(null,"4 Portas","duas portas na frente e duas atrás", LocalDate.now(),null);
		Specification specification2 = new Specification(null,"8 Portas","quatro portas na frente e quatro atrás", LocalDate.now(),null);

		Category category1 = new Category(null,"Hatch","Carro compacto pro dia a dia",LocalDate.now(),null);
		Category category2 = new Category(null,"Sedan","Carro espaçoso pro dia a dia",LocalDate.now(),null);

		Car car1 = new Car((Long) null,"Gol","carro confortável pra vida",10,true,"1234",brand1,category1,new Color(0,0,0),LocalDate.now(),null,null,null);
		Car car2 = new Car((Long) null,"Ka","carro confortável pra vida",10,true,"1235",brand2,category2,new Color(0,0,0),LocalDate.now(),null,null,null);
	}

}

