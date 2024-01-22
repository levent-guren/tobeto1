package com.tobeto.controller;

import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tobeto.dto.ComputerDTO;
import com.tobeto.entity.Computer;
import com.tobeto.service.ComputerService;

@RestController
@RequestMapping("/bilgisayar")
public class ComputerController {
	@Autowired
	private ComputerService computerService;
	@Autowired
	private ModelMapper mapper;

	@GetMapping
	public List<ComputerDTO> getComputers() {
		return computerService.getComputers().stream().map(c -> mapper.map(c, ComputerDTO.class)).toList();
//		List<Computer> computers = computerService.getComputers();
//		List<ComputerDTO> sonuc = new ArrayList<ComputerDTO>();
//		for (Computer c : computers) {
////			ComputerDTO d = new ComputerDTO();
////			d.setMarka(c.getMarka());
////			d.setModel(c.getModel());
////			sonuc.add(d);
//			ComputerDTO dto = mapper.map(c, ComputerDTO.class);
//			sonuc.add(dto);
//		}
//		return sonuc;
	}

	@GetMapping("/{marka}/{model}")
	public Optional<Computer> getComputer(@PathVariable String marka, @PathVariable String model) {
		return computerService.getComputer(marka, model);
	}

	@DeleteMapping(path = "/{marka}/{model}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String deleteComputer(String marka, String model) {
		computerService.deleteComputer(marka, model);
		JSONObject sonuc = new JSONObject();
		sonuc.put("mesaj", "Computer deleted");
		return sonuc.toString();
	}

	@PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public String saveComputer(@RequestBody Computer computer) {
		computerService.saveComputer(computer.getMarka(), computer.getModel(), computer.getRam());
		JSONObject sonuc = new JSONObject();
		sonuc.put("mesaj", "Computer created");
		return sonuc.toString();
	}

	@PutMapping(path = "/{marka}/{model}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String updateComputer(String marka, String model, int ram) {
		computerService.updateComputer(marka, model, ram);
		JSONObject sonuc = new JSONObject();
		sonuc.put("mesaj", "Computer updated");
		return sonuc.toString();
	}
}
