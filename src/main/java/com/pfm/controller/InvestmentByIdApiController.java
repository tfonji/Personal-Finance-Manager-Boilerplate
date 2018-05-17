package com.pfm.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pfm.dto.Investment;

import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "com.pfm.codegen.languages.SpringCodegen", date = "2018-05-16T23:53:06.850Z")

@Controller
public class InvestmentByIdApiController implements InvestmentByIdApi {

    private static final Logger log = LoggerFactory.getLogger(InvestmentByIdApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InvestmentByIdApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Investment>> investmentByIdGet(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Investment>>(objectMapper.readValue("[ {  \"date\" : \"2000-01-23T04:56:07.000+00:00\",  \"amount\" : 0.80082819046101150206595775671303272247314453125,  \"percentageYield\" : 6.02745618307040320615897144307382404804229736328125,  \"investmentType\" : \"investmentType\",  \"userId\" : \"userId\"}, {  \"date\" : \"2000-01-23T04:56:07.000+00:00\",  \"amount\" : 0.80082819046101150206595775671303272247314453125,  \"percentageYield\" : 6.02745618307040320615897144307382404804229736328125,  \"investmentType\" : \"investmentType\",  \"userId\" : \"userId\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Investment>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<Investment>>(objectMapper.readValue("<null>  <userId>aeiou</userId>  <investmentType>aeiou</investmentType>  <amount>1.3579</amount>  <percentageYield>1.3579</percentageYield>  <date>2000-01-23T04:56:07.000Z</date></null>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<Investment>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Investment>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
