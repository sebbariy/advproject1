package com.younesseb.advproject1.controller;

import com.younesseb.advproject1.model.Business;
import com.younesseb.advproject1.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/business")
@CrossOrigin("*")
public class BusinessController {
    @Autowired
    private BusinessService businessService;

    @PostMapping("/addBusiness")
    public String add(@RequestBody Business business){
        businessService.saveBusiness(business);
        return "New information has been added";
    }
    @GetMapping("/getAll")
    public List<Business> list(){
        return businessService.getAllBusiness();
    }
    @GetMapping("/{busid}")
    public Optional<Business> getBusinessById(@PathVariable int busid){
        return businessService.getBusinessById(busid);
    }

    @PutMapping("/{busid}")
    public Business updateBusiness(@PathVariable int busid,@RequestBody Business business){
        return businessService.updateBusiness(busid, business);
    }

    @DeleteMapping("/{busid}")
    public void deleteBusiness(@PathVariable int busid){
        businessService.deleteBusiness(busid);
    }
}
