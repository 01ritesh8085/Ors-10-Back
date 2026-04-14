package com.rays.ctl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.SubscriptionDTO;
import com.rays.form.SubscriptionForm;
import com.rays.service.SubscriptionServiceInt;

@RestController
@RequestMapping(value = "Subscription")
public class SubscriptionCtl extends BaseCtl<SubscriptionForm, SubscriptionDTO, SubscriptionServiceInt>{

//	@Autowired
//	SubscriptionServiceInt subscriptionService;
	
	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
//		SubscriptionDTO dto = new SubscriptionDTO();
//		List<DropdownList> list = subscriptionService.search(dto, userContext);
//		res.addResult("subscriptionlist", list);
		return res;
	}
}