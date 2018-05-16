package com.cmr.springboot.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@RequestMapping(value="/hello/{demoId}", method={RequestMethod.GET})
	String home(@PathVariable("demoId") int id) {
		return "Hello World!" + id;
	}
}
