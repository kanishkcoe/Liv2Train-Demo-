package com.kunal.liv2train.repository;

import com.kunal.liv2train.model.Address;
import com.kunal.liv2train.model.TrainingCenter;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class MockRepository implements TrainingCenterRepository {

    private List<TrainingCenter> centers;

    public MockRepository() {
        this.centers = new ArrayList<>();
        this.centers.add(new TrainingCenter("ABC test center",
                "ABC123456DEF",
                new Address("Ookhla Industrial Area", "New Delhi", "Delhi", "110036"),
                100,
                new ArrayList<String>(Arrays.asList("Maths", "Science")),
                "abc@gmail.com",
                "9876543210"));
    }

    @Override
    public TrainingCenter saveCenter(TrainingCenter trainingCenter) {
        centers.add(trainingCenter);
        return trainingCenter;
    }

    @Override
    public List<TrainingCenter> retrieveAllCenters() {
        return centers;
    }
}
