package Hrms.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import Hrms.hrms.business.abstracts.denemeService;
import Hrms.hrms.core.utilities.results.DataResult;
import Hrms.hrms.core.utilities.results.Result;
import Hrms.hrms.entities.concretes.Deneme;

@RestController
@RequestMapping("/api/deneme")
public class denemeController {

	
		private denemeService denemeService;
		@Autowired
		public denemeController(Hrms.hrms.business.abstracts.denemeService denemeService) {
			super();
			this.denemeService = denemeService;
		}
		
		@PostMapping("/add")
		public Result add(@RequestBody Deneme deneme) {
			return this.denemeService.add(deneme);
		
	}

		@GetMapping("/getall")
		public DataResult<List<Deneme>> getAll(){
			return this.denemeService.getAll();
		}
		
	

	
	
		}
