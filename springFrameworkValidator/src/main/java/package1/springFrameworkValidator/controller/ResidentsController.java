package package1.springFrameworkValidator.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import package1.springFrameworkValidator.model.Residents;
import package1.springFrameworkValidator.service.ResidentsService;

@RestController
public class ResidentsController {
	
	@Autowired
	ResidentsService residentsService;
	
	@RequestMapping (value = "/notrees", method = RequestMethod.POST)
	public String saveResident(@RequestBody @Valid Residents residents, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {	
		return "This data has a problem" + bindingResult.getAllErrors();
	}
		residentsService.saveResident(residents);
		return "You have succesfully saved your data" + residents;
	}

}
