package com.example.lombokdemo.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PropertyService.class);

    private PropertyRepository propertyRepository;

    @Autowired
    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

}
