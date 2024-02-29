package com.raj.dbtest.controller;

import com.raj.dbtest.dto.request.AddressRequestDto;
import com.raj.dbtest.dto.response.AddressResponseDto;
import com.raj.dbtest.service.AddressService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/address")
public class AddressController {
    private final AddressService addressService;

    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }
    @PostMapping("/save")
    public ResponseEntity<AddressResponseDto> saveAddress(@RequestBody AddressRequestDto address){
        try {
            return new ResponseEntity<>(addressService.saveAddress(address), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);

        }
    }
}
