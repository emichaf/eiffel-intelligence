
package com.ericsson.ei.controller;

import com.ericsson.ei.controller.model.ParseInstanceInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Provides interaction with InstanceInfo resource
 * 
 * (Generated with springmvc-raml-parser v.0.8.6)
 * 
 */
@RestController
@RequestMapping(value = "/information", produces = "application/json")
public interface InformationController {


    /**
     * List of all instance information
     * 
     * 
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<ParseInstanceInfo> getInformation();

}
