package com.codeforgeyt.airportcore.service;

import com.codeforgeyt.airportcore.model.PlaneDto;
import org.springframework.stereotype.Service;

@Service
public class PlaneService {

    public PlaneDto getPlane(){
        return new PlaneDto("Jet Plane - Test 1", 4);
    }
}
