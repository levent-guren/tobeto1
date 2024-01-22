package com.tobeto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tobeto.entity.Computer;
import com.tobeto.repository.ComputerRepository;

@Service
public class ComputerService {
	@Autowired
	private ComputerRepository computerRepository;

	public List<Computer> getComputers() {
		return computerRepository.getComputers();
	}

	public Optional<Computer> getComputer(String marka, String model) {
		return computerRepository.getComputer(marka, model);
	}

	public void deleteComputer(String marka, String model) {
		computerRepository.deleteComputer(marka, model);
	}

	public void saveComputer(String marka, String model, int ram) {
		computerRepository.saveComputer(new Computer(marka, model, ram));
	}

	public void updateComputer(String marka, String model, int ram) {
		computerRepository.updateComputer(marka, model, ram);
	}
}
