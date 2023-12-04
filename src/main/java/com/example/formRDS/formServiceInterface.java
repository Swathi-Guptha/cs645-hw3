package com.example.formRDS;

import java.util.List;

public interface formServiceInterface {
    public List<formEntity> getAll();
    public void saveSurvey(formEntity survey);
    public formEntity findById(long id);
    public void deleteById(long id);

}
