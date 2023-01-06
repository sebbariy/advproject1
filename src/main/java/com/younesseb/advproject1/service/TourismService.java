package com.younesseb.advproject1.service;

import com.younesseb.advproject1.model.Tourism;

import java.util.List;
import java.util.Optional;

public interface TourismService {
    public Tourism saveTourism(Tourism tourism);
    public Optional<Tourism> getTourismById(int tourismid);
    public List<Tourism> getAllTourism();
    Tourism updateTourism(int tourismid, Tourism tourism);
    void deleteTourism(int tourismid);
}
