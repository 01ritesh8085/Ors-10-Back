package com.rays.ctl;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.FeedbackDTO;
import com.rays.form.FeedbackForm;
import com.rays.service.FeedbackServiceInt;

@RestController
@RequestMapping(value = "Feedback")
public class FeedbackCtl extends BaseCtl<FeedbackForm, FeedbackDTO, FeedbackServiceInt>{

    @GetMapping("/preload")
    public ORSResponse preload() {

        ORSResponse res = new ORSResponse(true);

        // Example dropdown data
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Excellent");
        map.put(2, "Good");
        map.put(3, "Average");
        map.put(4, "Poor");

        res.addResult("feedbackList", map);

        return res;
    }
}