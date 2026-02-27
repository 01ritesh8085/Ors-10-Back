package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.SettingDTO;
import com.rays.form.SettingForm;
import com.rays.service.SettingServiceInt;

@RestController
@RequestMapping(value = "Setting")
public class SettingCtl extends BaseCtl<SettingForm, SettingDTO, SettingServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Active");
		map.put(2, "Inactive");

		res.addResult("settinglist", map);
		return res;
	}
}