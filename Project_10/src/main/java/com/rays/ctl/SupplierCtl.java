package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.SupplierDTO;
import com.rays.form.SupplierForm;
import com.rays.service.SupplierServiceInt;

@RestController
@RequestMapping(value = "Supplier")
public class SupplierCtl extends BaseCtl<SupplierForm, SupplierDTO, SupplierServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Basic");
		map.put(2, "Standard");
		map.put(3, "Premium");

		res.addResult("supplierlist", map);
		return res;
	}
}