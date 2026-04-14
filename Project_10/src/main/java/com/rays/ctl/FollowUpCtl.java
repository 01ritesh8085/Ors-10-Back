package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.FollowUpDTO;
import com.rays.form.FollowUpForm;
import com.rays.service.FollowUpServiceInt;

@RestController
@RequestMapping(value = "FollowUp")
public class FollowUpCtl extends BaseCtl<FollowUpForm, FollowUpDTO, FollowUpServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Pending");
		map.put(2, "Completed");

		res.addResult("statusList", map);

		return res;
	}
}