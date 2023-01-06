package com.younesseb.advproject1.controller;

import com.younesseb.advproject1.model.Tourism;
import com.younesseb.advproject1.service.TourismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tourism")
@CrossOrigin("*")
public class TourismController {
    @Autowired
    private TourismService tourismService;

    @PostMapping("/addTourism")
    public String add(@RequestBody Tourism tourism){
        tourismService.saveTourism(tourism);
        return "New touristic area is added";
    }
    @GetMapping("/getAll")
    public List<Tourism> list(){
        return tourismService.getAllTourism();
    }
    @GetMapping("/{id}")
    public Optional<Tourism> getTourismById(@PathVariable int tourismid){
        return tourismService.getTourismById(tourismid);
    }

    @PutMapping("/{id}")
    public Tourism updateTourism(@PathVariable int tourismid, @RequestBody Tourism tourism){
        return tourismService.updateTourism(tourismid, tourism);
    }

    @DeleteMapping("/{id}")
    public void deleteTourism(@PathVariable int tourismid){
        tourismService.deleteTourism(tourismid);
    }

}