package co.develhope.firstapi4.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/headers")
public class HeaderController {

    @GetMapping
    public ResponseEntity<String> getHeaders(HttpServletRequest request) {
        String host = request.getHeader("Host");
        return ResponseEntity.ok("Host name: " + host + " Host port: " + request.getServerPort());
    }
}

