package com.raj.dbtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.raj.dbtest.entity.Address;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepo  extends JpaRepository<Address, Integer> {
    @Query(
        nativeQuery=true,
            value = "select * from address_data where id = ?1"
    )
    Address getBYId(Integer id);
}
