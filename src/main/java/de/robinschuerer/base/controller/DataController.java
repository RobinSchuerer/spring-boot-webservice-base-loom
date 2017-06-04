package de.robinschuerer.base.controller;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.robinschuerer.base.dto.DataDto;

@RestController
@RequestMapping("/data")
public class DataController {

    @GetMapping
    public ResponseEntity<DataDto> getData(){
        return ResponseEntity.ok(new DataDto(UUID.randomUUID().toString()));
    }


}
