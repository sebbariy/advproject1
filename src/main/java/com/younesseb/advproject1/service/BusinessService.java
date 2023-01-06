package com.younesseb.advproject1.service;

import com.younesseb.advproject1.model.Business;

import java.util.List;
import java.util.Optional;

public interface BusinessService {
    public Business saveBusiness(Business business);
    public Optional<Business> getBusinessById(int busid);
    public List<Business> getAllBusiness();
    Business updateBusiness(int busid,Business business);
    void deleteBusiness(int busid);
}
