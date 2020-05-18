/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.cts.events.api;

import com.cts.events.model.Dashboard;
import com.cts.events.model.Event;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.swagger.annotations.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

import java.util.Optional;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-03-11T17:23:10.822+05:30")

@Api(value = "all", description = "the all API")
public interface AllApi {

    Logger log = LoggerFactory.getLogger(AllApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "", nickname = "allGet", notes = "get all Events", response = Event.class, tags={ "Dashboard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "fetch", response = Event.class),
        @ApiResponse(code = 404, message = "No DataFound") })
    @RequestMapping(value = "/all",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default Flux<ResponseEntity<Event>> allGet() {
//        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
//            if (getAcceptHeader().get().contains("application/json")) {
//                try {
//                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"eventId\" : \"eventId\",  \"empId\" : 0.85837319046101150206595775671303272247314453125,  \"businessUnit\" : \"businessUnit\",  \"livesImpacted\" : 5,  \"travelHours\" : 1,  \"councilName\" : \"councilName\",  \"baseLocation\" : \"baseLocation\",  \"beneficiaryName\" : \"beneficiaryName\",  \"empName\" : \"empName\",  \"volunteerHours\" : 6,  \"eventDescription\" : \"eventDescription\",  \"iiepCategory\" : \"iiepCategory\",  \"eventName\" : \"eventName\",  \"summaryId\" : 5,  \"eventDate\" : \"2000-01-23\",  \"status\" : \"status\"}", Event.class), HttpStatus.NOT_IMPLEMENTED);
//                } catch (IOException e) {
//                    log.error("Couldn't serialize response for content type application/json", e);
//                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//                }
//            }
//        } else {
//            log.warn("ObjectMapper or HttpServletRequest not configured in default AllApi interface so no example is generated");
//        }
        return Flux.just(new ResponseEntity<>(HttpStatus.ACCEPTED));
    }

    @GetMapping("/dashboard")
    default Mono<ResponseEntity<Dashboard>> getDashBoardDetails() {
        return Mono.just(new ResponseEntity<>(HttpStatus.ACCEPTED));
    }
}