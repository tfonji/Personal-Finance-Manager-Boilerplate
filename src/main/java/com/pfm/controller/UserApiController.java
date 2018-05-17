package com.pfm.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pfm.dto.User;

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
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<User>> userAllGet() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {  \"user_id\" : \"user_id\",  \"last_name\" : \"last_name\",  \"investments\" : [ {    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"percentageYield\" : 6.02745618307040320615897144307382404804229736328125,    \"investmentType\" : \"investmentType\",    \"userId\" : \"userId\"  }, {    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"percentageYield\" : 6.02745618307040320615897144307382404804229736328125,    \"investmentType\" : \"investmentType\",    \"userId\" : \"userId\"  } ],  \"first_name\" : \"first_name\"}, {  \"user_id\" : \"user_id\",  \"last_name\" : \"last_name\",  \"investments\" : [ {    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"percentageYield\" : 6.02745618307040320615897144307382404804229736328125,    \"investmentType\" : \"investmentType\",    \"userId\" : \"userId\"  }, {    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"percentageYield\" : 6.02745618307040320615897144307382404804229736328125,    \"investmentType\" : \"investmentType\",    \"userId\" : \"userId\"  } ],  \"first_name\" : \"first_name\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("<null>  <first_name>aeiou</first_name>  <last_name>aeiou</last_name>  <user_id>aeiou</user_id></null>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<User>> userGet(@ApiParam(value = "create a new transaction" ,required=true )  @Valid @RequestBody String body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("[ {  \"user_id\" : \"user_id\",  \"last_name\" : \"last_name\",  \"investments\" : [ {    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"percentageYield\" : 6.02745618307040320615897144307382404804229736328125,    \"investmentType\" : \"investmentType\",    \"userId\" : \"userId\"  }, {    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"percentageYield\" : 6.02745618307040320615897144307382404804229736328125,    \"investmentType\" : \"investmentType\",    \"userId\" : \"userId\"  } ],  \"first_name\" : \"first_name\"}, {  \"user_id\" : \"user_id\",  \"last_name\" : \"last_name\",  \"investments\" : [ {    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"percentageYield\" : 6.02745618307040320615897144307382404804229736328125,    \"investmentType\" : \"investmentType\",    \"userId\" : \"userId\"  }, {    \"date\" : \"2000-01-23T04:56:07.000+00:00\",    \"amount\" : 0.80082819046101150206595775671303272247314453125,    \"percentageYield\" : 6.02745618307040320615897144307382404804229736328125,    \"investmentType\" : \"investmentType\",    \"userId\" : \"userId\"  } ],  \"first_name\" : \"first_name\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        if (accept != null && accept.contains("application/xml")) {
            try {
                return new ResponseEntity<List<User>>(objectMapper.readValue("<null>  <first_name>aeiou</first_name>  <last_name>aeiou</last_name>  <user_id>aeiou</user_id></null>", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/xml", e);
                return new ResponseEntity<List<User>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<User>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> userNewPost(@ApiParam(value = "create a new transaction" ,required=true )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
