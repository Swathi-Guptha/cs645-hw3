package com.example.formRDS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class formService implements formServiceInterface
{
    @Autowired
    private formRepository formRepo;

    @Override
    public List<formEntity> getAll()
    {
        return (List<formEntity>) formRepo.findAll();
    }

    @Override
    public void saveSurvey(formEntity survey)
    {
        formRepo.save(survey);
    }

    @Override
    public formEntity findById(long id)
    {
        Optional<formEntity> searchResult = formRepo.findById(id);

        formEntity survey = null;
        if(searchResult.isPresent())
        {
            survey = searchResult.get();
        }
        return survey;
    }

    @Override
    public void deleteById(long id) {
        formRepo.deleteById(id);
    }

}
