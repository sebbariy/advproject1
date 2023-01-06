package com.younesseb.advproject1.service;

import com.younesseb.advproject1.model.Tourism;
import com.younesseb.advproject1.repository.TourismRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TourismServiceImpl implements TourismService {

    @Autowired
    private TourismRepository tourismRepository;

    @Override
    public Tourism saveTourism(Tourism tourism) {
        return tourismRepository.save(tourism);
    }

    @Override
    public Optional<Tourism> getTourismById(int tourismid) {
        return tourismRepository.findById(tourismid);
    }
    @Override
    public List<Tourism> getAllTourism() {
        return tourismRepository.findAll();
    }

    @Override
    public Tourism updateTourism(int tourismid, Tourism tourism) {
        Tourism tourismToUpdate = tourismRepository.findById(tourismid).orElseThrow();
        tourismToUpdate.setTourismType(tourism.getTourismType());
        tourismToUpdate.setTourismname(tourism.getTourismname());
        tourismToUpdate.setLocation(tourism.getLocation());
        tourismToUpdate.setLink(tourism.getLink());
        tourismToUpdate.setDescription(tourism.getDescription());
        return tourismRepository.save(tourismToUpdate);
    }

    @Override
    public void deleteTourism(int tourismid) {
        tourismRepository.deleteById(tourismid);
    }
}
