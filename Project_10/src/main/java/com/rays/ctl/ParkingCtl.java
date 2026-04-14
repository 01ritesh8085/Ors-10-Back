package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.ParkingDTO;
import com.rays.form.ParkingForm;
import com.rays.service.ParkingServiceInt;

@RestController
@RequestMapping(value = "Parking")
public class ParkingCtl extends BaseCtl<ParkingForm, ParkingDTO, ParkingServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);

		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Available");
		map.put(2, "Full");

		res.addResult("statusList", map);

		return res;
	}
}