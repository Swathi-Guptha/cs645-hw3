package com.example.formRDS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class formController {

    @Autowired
    private formService methodCall;

    @GetMapping("/displayAll")
    public List<formEntity> surveyData()
    {
        return methodCall.getAll();
    }

    @PostMapping("/postSurvey")
    public formEntity surveyData(@RequestBody formEntity survey)
    {
        methodCall.saveSurvey(survey);
        return survey;
    }

    @GetMapping("/survey/{id}")
    public formEntity getByID(@PathVariable Long id)
    {
        return methodCall.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id)
    {
        methodCall.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public void updateById(@PathVariable Long id, @RequestBody formEntity updated_survey)
    {
        //formEntity original_survey = methodCall.findById(id);
        methodCall.saveSurvey(updated_survey);
    }
}
