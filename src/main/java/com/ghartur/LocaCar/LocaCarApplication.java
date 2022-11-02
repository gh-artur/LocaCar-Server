package com.ghartur.LocaCar;

import com.ghartur.LocaCar.ui.HomePage;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.swing.*;

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

}

