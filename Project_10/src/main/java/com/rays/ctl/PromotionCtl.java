package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.PromotionDTO;
import com.rays.form.PromotionForm;
import com.rays.service.PromotionServiceInt;

@RestController
@RequestMapping(value = "Promotion")
public class PromotionCtl extends BaseCtl<PromotionForm, PromotionDTO, PromotionServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Activ");
		map.put(2, "Inactive");

		res.addResult("Promotiionlist", map);
		return res;
	}
}