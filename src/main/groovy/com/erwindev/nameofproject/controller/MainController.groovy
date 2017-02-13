package com.erwindev.nameofproject.controller

import static org.springframework.http.HttpStatus.*

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import groovy.util.logging.Slf4j

import com.erwindev.nameofproject.util.ApplicationSettings

import com.wordnik.swagger.annotations.Api

@RestController
@RequestMapping(value="/api/template/v1", produces=MediaType.APPLICATION_JSON_VALUE)
@Api(value = "/api/template/v1", description = "Starter Template API")
@Slf4j
class MainController {

	@Autowired
	ApplicationSettings applicationSettings

	@RequestMapping(method=RequestMethod.GET,value="/test", produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> test() {
		return new ResponseEntity<String>('{"This":"is a test.."}', OK)
	}
}
