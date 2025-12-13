package com.example.GamingCenter2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PcStatusService  {

    private final PcStatusRepository repository;

    public PcStatusService(PcStatusRepository repository) {
        this.repository = repository;

    }

    public List<PcStatusEntity> getAll() {
        return repository.findAll();
    }

    public PcStatusEntity save(PcStatusEntity pcStatus) {
        PcStatusEntity pcStatusEntity = this.repository.findById(pcStatus.getId()).get();
        pcStatusEntity.setTimestamp(pcStatus.getTimestamp());
        return repository.save(pcStatusEntity);
    }
}
