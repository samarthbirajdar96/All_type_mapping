package com.example.All_type_mapping.Service;

import com.example.All_type_mapping.Model.Address;
import com.example.All_type_mapping.Model.Student;
import com.example.All_type_mapping.Repo.AddressRepo;
import com.example.All_type_mapping.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepo addressRepo;



    public String addaddress(Address address) {
        addressRepo.save(address);
        return "address" +"added";
    }

    public List<Address> getalladdress() {
        return addressRepo.findAll();
    }

    public String updateaddressbyid(Long id, String landmark) {
        Address myaddress=addressRepo.findById(id).orElse(null);
        if (myaddress!=null){
            myaddress.setLandmark(landmark);
             addressRepo.save(myaddress);
             return "update";
        }else{
            return null;
        }

    }


    public String deleteaddressbyid(Long id) {
        addressRepo.deleteById(id);
        return "deleted";
    }
}
