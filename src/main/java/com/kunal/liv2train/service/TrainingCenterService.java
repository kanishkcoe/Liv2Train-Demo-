package com.kunal.liv2train.service;

import com.kunal.liv2train.model.TrainingCenter;

import java.util.List;

public interface TrainingCenterService {
    TrainingCenter save(TrainingCenter trainingCenter);
    List<TrainingCenter> getAll();
}
