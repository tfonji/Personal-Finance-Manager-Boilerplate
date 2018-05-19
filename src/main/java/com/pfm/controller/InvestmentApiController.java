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
@javax.annotation.Generated(value = "com.pfm.codegen.languages.SpringCodegen", date = "2018-05-19T00:16:19.389Z")

@Controller
public class InvestmentApiController implements InvestmentApi {

    private static final Logger log = LoggerFactory.getLogger(InvestmentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public InvestmentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> investmentDeleteDelete(@ApiParam(value = "investment object to delete from database." ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Investment>> investmentNewPost(@ApiParam(value = "investment object to add to database." ,required=true )  @Valid @RequestBody Investment body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Investment>>(objectMapper.readValue("[ {  \"end_date\" : \"2000-01-23\",  \"current_investment\" : 1.46581298050294517310021547018550336360931396484375,  \"investment_type\" : \"investment_type\",  \"initial_investment\" : 6.02745618307040320615897144307382404804229736328125,  \"rate\" : 5.962133916683182377482808078639209270477294921875,  \"investment_id\" : 0.80082819046101150206595775671303272247314453125,  \"investor_id\" : \"investor_id\",  \"transactions\" : [ {    \"current_amount\" : 5.63737665663332876420099637471139430999755859375,    \"date\" : \"2000-01-23\",    \"previous_amount\" : 2.3021358869347654518833223846741020679473876953125,    \"investment_id\" : \"investment_id\",    \"description\" : \"description\",    \"time\" : \"time\",    \"investor_id\" : \"investor_id\",    \"transaction_type\" : true  }, {    \"current_amount\" : 5.63737665663332876420099637471139430999755859375,    \"date\" : \"2000-01-23\",    \"previous_amount\" : 2.3021358869347654518833223846741020679473876953125,    \"investment_id\" : \"investment_id\",    \"description\" : \"description\",    \"time\" : \"time\",    \"investor_id\" : \"investor_id\",    \"transaction_type\" : true  } ],  \"investment_details\" : [ \"{}\", \"{}\" ],  \"start_date\" : \"2000-01-23\"}, {  \"end_date\" : \"2000-01-23\",  \"current_investment\" : 1.46581298050294517310021547018550336360931396484375,  \"investment_type\" : \"investment_type\",  \"initial_investment\" : 6.02745618307040320615897144307382404804229736328125,  \"rate\" : 5.962133916683182377482808078639209270477294921875,  \"investment_id\" : 0.80082819046101150206595775671303272247314453125,  \"investor_id\" : \"investor_id\",  \"transactions\" : [ {    \"current_amount\" : 5.63737665663332876420099637471139430999755859375,    \"date\" : \"2000-01-23\",    \"previous_amount\" : 2.3021358869347654518833223846741020679473876953125,    \"investment_id\" : \"investment_id\",    \"description\" : \"description\",    \"time\" : \"time\",    \"investor_id\" : \"investor_id\",    \"transaction_type\" : true  }, {    \"current_amount\" : 5.63737665663332876420099637471139430999755859375,    \"date\" : \"2000-01-23\",    \"previous_amount\" : 2.3021358869347654518833223846741020679473876953125,    \"investment_id\" : \"investment_id\",    \"description\" : \"description\",    \"time\" : \"time\",    \"investor_id\" : \"investor_id\",    \"transaction_type\" : true  } ],  \"investment_details\" : [ \"{}\", \"{}\" ],  \"start_date\" : \"2000-01-23\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Investment>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Investment>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
