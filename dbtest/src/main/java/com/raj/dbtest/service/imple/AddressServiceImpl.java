package com.raj.dbtest.service.imple;

import com.raj.dbtest.repository.AddressRepo;
import com.raj.dbtest.dto.request.AddressRequestDto;
import com.raj.dbtest.dto.response.AddressResponseDto;
import org.springframework.stereotype.Service;
import com.raj.dbtest.entity.Address;
import com.raj.dbtest.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;

    public AddressServiceImpl(AddressRepo addrRepo){
        this.addressRepo = addrRepo;
    }

    @Override
    public AddressResponseDto saveAddress(AddressRequestDto address) {
        Address add1 = new Address();
        add1.setState(address.getState());
        add1.setDistrict(address.getDistrict());

        Address savedAddress = addressRepo.save(add1);

        AddressResponseDto addressResponseDto = new AddressResponseDto(savedAddress);
        return addressResponseDto;

    }
}
