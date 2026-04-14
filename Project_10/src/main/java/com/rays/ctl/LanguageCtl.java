package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.LanguageDTO;
import com.rays.form.LanguageForm;
import com.rays.service.LanguageServiceInt;

@RestController
@RequestMapping(value = "Language")
public class LanguageCtl extends BaseCtl<LanguageForm, LanguageDTO, LanguageServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		// Status Dropdown
		HashMap<Integer, String> statusMap = new HashMap<>();
		statusMap.put(1, "ACTIVE");
		statusMap.put(2, "INACTIVE");

		// Region Dropdown
		HashMap<Integer, String> regionMap = new HashMap<>();
		regionMap.put(1, "INDIA");
		regionMap.put(2, "USA");
		regionMap.put(3, "UK");
		regionMap.put(4, "OTHER");

		res.addResult("statusList", statusMap);
		res.addResult("regionList", regionMap);

		return res;
	}
}