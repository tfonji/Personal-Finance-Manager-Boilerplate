/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.pfm.controller;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "com.pfm.codegen.languages.SpringCodegen", date = "2018-05-15T20:09:14.699Z")

@Api(value = "investments", description = "the investments API")
public interface InvestmentsApi {

    @ApiOperation(value = "Fetch all investments for a user", nickname = "investmentsGet", notes = "", tags={ "investment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ok. Successfully retrievev all investments"),
        @ApiResponse(code = 400, message = "Bad Request. Invalid user Id") })
    @RequestMapping(value = "/investments",
        method = RequestMethod.GET)
    ResponseEntity<Void> investmentsGet(@ApiParam(value = "fetch all investments for given user" ,required=true )  @Valid @RequestBody String body);

}
