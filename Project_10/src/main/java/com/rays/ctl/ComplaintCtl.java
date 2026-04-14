package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ComplaintDTO;
import com.rays.form.ComplaintForm;
import com.rays.service.ComplaintServiceInt;

@RestController
@RequestMapping(value = "Complaint")
public class ComplaintCtl extends BaseCtl<ComplaintForm, ComplaintDTO, ComplaintServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Open");
		map.put(2, "In Progress");
		map.put(3, "Closed");

		res.addResult("statusList", map);

		return res;
	}
}