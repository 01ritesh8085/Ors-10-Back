package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.CompensationDTO;
import com.rays.form.CompensationForm;
import com.rays.service.CompensationServiceInt;

@RestController
@RequestMapping(value = "Compensation")
public class CompensationCtl extends BaseCtl<CompensationForm, CompensationDTO, CompensationServiceInt> {

	
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Active");
		map.put(2, "Inactive");

		res.addResult("compensationlist", map);
		return res;
	}
}