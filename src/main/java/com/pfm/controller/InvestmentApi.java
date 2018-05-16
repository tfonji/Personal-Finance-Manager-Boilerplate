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

import com.pfm.dto.Investment;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "com.pfm.codegen.languages.SpringCodegen", date = "2018-05-15T20:09:14.699Z")

@Api(value = "investment", description = "the investment API")
public interface InvestmentApi {

    @ApiOperation(value = "Delete investment", nickname = "investmentDeleteDelete", notes = "", tags={ "investment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Investment deleted successfully"),
        @ApiResponse(code = 400, message = "Bad request.") })
    @RequestMapping(value = "/investment/delete",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> investmentDeleteDelete(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);


    @ApiOperation(value = "create a new investment", nickname = "investmentNewPost", notes = "", tags={ "investment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "investment created succesfully"),
        @ApiResponse(code = 400, message = "bad request. invalid input") })
    @RequestMapping(value = "/investment/new",
        method = RequestMethod.POST)
    ResponseEntity<Void> investmentNewPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Investment body);


    @ApiOperation(value = "Fetch all transactions for a given investment", nickname = "investmentTransactionsGet", notes = "", tags={ "investment", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Investment transactions fetched successfully"),
        @ApiResponse(code = 400, message = "Bad request. Invalid input") })
    @RequestMapping(value = "/investment/transactions",
        method = RequestMethod.GET)
    ResponseEntity<Void> investmentTransactionsGet(@ApiParam(value = "" ,required=true )  @Valid @RequestBody String body);

}