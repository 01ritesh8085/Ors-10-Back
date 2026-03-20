package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.InquiryDTO;
import com.rays.form.InquiryForm;
import com.rays.service.InquiryServiceInt;

@RestController
@RequestMapping(value = "Inquiry")
public class InquiryCtl extends BaseCtl<InquiryForm, InquiryDTO, InquiryServiceInt> {

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Open");
		map.put(2, "Closed");

		res.addResult("inquirylist", map);
		return res;
	}
}