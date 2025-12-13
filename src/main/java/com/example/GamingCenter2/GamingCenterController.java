package com.example.GamingCenter2;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GamingCenterController {
    PcStatusService service;

    public GamingCenterController(PcStatusService service) {
        this.service = service;
    }


    @PostMapping
    public PcStatusEntity createOrUpdate(@RequestBody PcStatusEntity pcStatus) {
        return service.save(pcStatus);
    }


    @GetMapping
    public List<PcStatusEntity> getAll() {
        return service.getAll();
    }
}
