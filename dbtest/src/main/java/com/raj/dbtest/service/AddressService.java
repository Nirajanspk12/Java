package com.raj.dbtest.service;
import com.raj.dbtest.dto.request.AddressRequestDto;
import com.raj.dbtest.dto.response.AddressResponseDto;

public interface AddressService {
    AddressResponseDto saveAddress(AddressRequestDto address);
}
