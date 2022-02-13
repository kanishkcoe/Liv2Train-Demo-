package com.kunal.liv2train.controller;

import com.kunal.liv2train.exception.ApiRequestException;
import com.kunal.liv2train.model.TrainingCenter;
import com.kunal.liv2train.service.TrainingCenterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class TrainingCenterController {

    private final TrainingCenterService service;

    public TrainingCenterController(TrainingCenterService service) {
        this.service = service;
    }

    @PostMapping("save")
    ResponseEntity<?> saveTrainingCenter(@RequestBody TrainingCenter trainingCenter) {
        try {
            if(service.save(trainingCenter) != null) {
                return new ResponseEntity<TrainingCenter>(trainingCenter, HttpStatus.CREATED);
            } else {
                throw new ApiRequestException("Bad Request, Check your JSON request");
            }
        } catch (Exception exception) {
            return new ResponseEntity<String>("Invalid Request, check again.", HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("centers")
    ResponseEntity<?> getAllTrainingCenters() {
        return new ResponseEntity<List<TrainingCenter>>(service.getAll(), HttpStatus.OK);
    }
}
