package com.example.All_type_mapping.Controller;

import com.example.All_type_mapping.Model.Address;
import com.example.All_type_mapping.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;


    @PostMapping("address")

    public String addaddress(@RequestBody Address address){
        return addressService.addaddress(address);
    }

    @GetMapping("address")
    public List<Address> gtelladdress(){
        return addressService.getalladdress();

    }

    @PutMapping("address/id/{id}")
    public String updateaddressbyid(@PathVariable Long id,@RequestParam String landmark){
        return  addressService.updateaddressbyid(id,landmark);
    }

    @DeleteMapping("address/id/{id}")
    public String deleteaddressbyid(@PathVariable Long id){
        return addressService.deleteaddressbyid(id);
    }


}
