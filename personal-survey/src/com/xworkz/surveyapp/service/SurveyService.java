package com.xworkz.surveyapp.service;

import com.xworkz.surveyapp.dto.SurveyDto;
import com.xworkz.surveyapp.exception.DataInvalidException;

public interface SurveyService {
    void ValidateDetails(SurveyDto surveyDto) throws DataInvalidException;
}
