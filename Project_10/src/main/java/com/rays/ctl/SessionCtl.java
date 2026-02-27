package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.SessionDTO;
import com.rays.form.SessionForm;
import com.rays.service.SessionServiceInt;

@RestController
@RequestMapping(value = "Session")
public class SessionCtl extends BaseCtl<SessionForm, SessionDTO, SessionServiceInt>{

	@GetMapping("/preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		return res;
	}
}