package com.kunal.liv2train.repository;

import com.kunal.liv2train.model.TrainingCenter;

import java.util.List;

public interface TrainingCenterRepository {

    TrainingCenter saveCenter(TrainingCenter trainingCenter);
    List<TrainingCenter> retrieveAllCenters();
}
