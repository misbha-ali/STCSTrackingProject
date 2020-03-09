package com.ibm.stcs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ibm/stcs")
public class RestDemoController {
	
	@GetMapping
	public String getMap() {
		return "Hello from Map";
	}
	/*
	 * @GetMapping public String getMapRoute(String lat,String log) { return
	 * "Hello from Map"; }
	 */

}
