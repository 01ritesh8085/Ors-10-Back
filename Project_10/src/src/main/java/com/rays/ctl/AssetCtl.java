package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.AssetDTO;
import com.rays.form.AssetForm;
import com.rays.service.AssetServiceInt;

@RestController
@RequestMapping(value = "Asset")
public class AssetCtl extends BaseCtl<AssetForm, AssetDTO, AssetServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Activ");
		map.put(2, "Inactive");

		res.addResult("assetlist", map);
		return res;
	}
}