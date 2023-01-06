package com.younesseb.advproject1.service;

import com.younesseb.advproject1.model.Business;
import com.younesseb.advproject1.repository.BusinessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessServiceImpl implements BusinessService {
    @Autowired
    private BusinessRepository businessRepository;

    @Override
    public Business saveBusiness(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public Optional<Business> getBusinessById(int busid) {
        return businessRepository.findById(busid);
    }

    @Override
    public List<Business> getAllBusiness() {
        return businessRepository.findAll();
    }

    @Override
    public Business updateBusiness(int busid, Business business) {
        Business businessToUpdate = businessRepository.findById(busid).orElseThrow();
        businessToUpdate.setType(business.getType());
        businessToUpdate.setBusname(business.getBusname());
        businessToUpdate.setLink(business.getLink());
        businessToUpdate.setDescription(business.getDescription());
        return businessRepository.save(businessToUpdate);

    }

    @Override
    public void deleteBusiness(int busid) {
        businessRepository.deleteById(busid);
    }
}

