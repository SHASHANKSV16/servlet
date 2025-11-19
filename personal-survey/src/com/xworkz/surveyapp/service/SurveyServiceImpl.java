package com.xworkz.surveyapp.service;

import com.xworkz.surveyapp.dto.SurveyDto;
import com.xworkz.surveyapp.exception.DataInvalidException;

public class SurveyServiceImpl implements SurveyService {
    
    @Override
    public void ValidateDetails(SurveyDto surveyDto) throws DataInvalidException {
        Boolean isInValid = false;

        if (surveyDto.getName() == null || surveyDto.getName().length() < 3) isInValid = true;
        else if (surveyDto.getOccupation() == null || surveyDto.getOccupation().length() < 3) isInValid = true;
        else if (surveyDto.getEducation() == null || surveyDto.getEducation().length() < 3) isInValid = true;
        else if (surveyDto.getNativePlace() == null || surveyDto.getNativePlace().length() < 3) isInValid = true;

        else if (surveyDto.getMobile() == null || surveyDto.getMobile() <= 0) isInValid = true;
        else if (surveyDto.getAadhaar() == null || surveyDto.getAadhaar() <= 0) isInValid = true;

        else if (surveyDto.getPan() == null || surveyDto.getPan().length() < 3) isInValid = true;
        else if (surveyDto.getVoterId() == null || surveyDto.getVoterId().length() < 3) isInValid = true;
        else if (surveyDto.getPassport() == null || surveyDto.getPassport().length() < 3) isInValid = true;
        else if (surveyDto.getRation() == null || surveyDto.getRation().length() < 3) isInValid = true;

        else if (surveyDto.getIncome() == null || surveyDto.getIncome() <= 0) isInValid = true;

        else if (surveyDto.getBankAccount() == null || surveyDto.getBankAccount().length() < 3) isInValid = true;
        else if (surveyDto.getFatherName() == null || surveyDto.getFatherName().length() < 3) isInValid = true;
        else if (surveyDto.getMotherName() == null || surveyDto.getMotherName().length() < 3) isInValid = true;
        else if (surveyDto.getMarried() == null || surveyDto.getMarried().length() < 3) isInValid = true;
        else if (surveyDto.getSpouseName() == null || surveyDto.getSpouseName().length() < 3) isInValid = true;

        else if (surveyDto.getChildren() == null || surveyDto.getChildren() <= 0) isInValid = true;
        else if (surveyDto.getFamilyMembers() == null || surveyDto.getFamilyMembers() <= 0) isInValid = true;

        else if (surveyDto.getCaste() == null || surveyDto.getCaste().length() < 3) isInValid = true;
        else if (surveyDto.getReligion() == null || surveyDto.getReligion().length() < 3) isInValid = true;
        else if (surveyDto.getMotherTongue() == null || surveyDto.getMotherTongue().length() < 3) isInValid = true;

        else if (surveyDto.getAge() == null || surveyDto.getAge() <= 0) isInValid = true;

        else if (surveyDto.getDob() == null || surveyDto.getDob().length() < 3) isInValid = true;
        else if (surveyDto.getDiseases() == null || surveyDto.getDiseases().length() < 3) isInValid = true;

        else if (surveyDto.getHeight() == null || surveyDto.getHeight() <= 0) isInValid = true;
        else if (surveyDto.getWeight() == null || surveyDto.getWeight() <= 0) isInValid = true;

        else if (surveyDto.getComplexion() == null || surveyDto.getComplexion().length() < 3) isInValid = true;
        else if (surveyDto.getBloodGroup() == null || surveyDto.getBloodGroup().length() < 3) isInValid = true;

        else if (surveyDto.getShoeSize() == null || surveyDto.getShoeSize() <= 0) isInValid = true;
        else if (surveyDto.getShoeCount() == null || surveyDto.getShoeCount() <= 0) isInValid = true;

        else if (surveyDto.getFriends() == null || surveyDto.getFriends().length() < 3) isInValid = true;

        else if (surveyDto.getBikeNo() == null || surveyDto.getBikeNo().length() < 3) isInValid = true;
        else if (surveyDto.getCarNo() == null || surveyDto.getCarNo().length() < 3) isInValid = true;

        else if (surveyDto.getCycles() == null || surveyDto.getCycles() <= 0) isInValid = true;

        else if (surveyDto.getAcres() == null || surveyDto.getAcres() <= 0) isInValid = true;
        else if (surveyDto.getSites() == null || surveyDto.getSites() <= 0) isInValid = true;

        else if (surveyDto.getRtc() == null || surveyDto.getRtc().length() < 3) isInValid = true;
        else if (surveyDto.getTaxes() == null || surveyDto.getTaxes().length() < 3) isInValid = true;
        else if (surveyDto.getBuildingOwner() == null || surveyDto.getBuildingOwner().length() < 3) isInValid = true;
        else if (surveyDto.getCrop() == null || surveyDto.getCrop().length() < 3) isInValid = true;

        else if (surveyDto.getInsuranceCompany() == null || surveyDto.getInsuranceCompany().length() < 3) isInValid = true;
        else if (surveyDto.getInsuranceNo() == null || surveyDto.getInsuranceNo().length() < 3) isInValid = true;
        else if (surveyDto.getLoanNo() == null || surveyDto.getLoanNo().length() < 3) isInValid = true;

        else if (surveyDto.getLoanBalance() == null || surveyDto.getLoanBalance() <= 0) isInValid = true;

        else if (surveyDto.getLoanType() == null || surveyDto.getLoanType().length() < 3) isInValid = true;
        else if (surveyDto.getShareHolding() == null || surveyDto.getShareHolding().length() < 3) isInValid = true;

        else if (surveyDto.getLaptop() == null || surveyDto.getLaptop().length() < 3) isInValid = true;
        else if (surveyDto.getTv() == null || surveyDto.getTv().length() < 3) isInValid = true;

        else if (surveyDto.getGovtEmployee() == null || surveyDto.getGovtEmployee().length() < 3) isInValid = true;
        else if (surveyDto.getDisabled() == null || surveyDto.getDisabled().length() < 3) isInValid = true;
        else if (surveyDto.getElectricityBill() == null || surveyDto.getElectricityBill().length() < 3) isInValid = true;
        else if (surveyDto.getWaterBill() == null || surveyDto.getWaterBill().length() < 3) isInValid = true;

        else if (surveyDto.getGold() == null || surveyDto.getGold() <= 0) isInValid = true;
        else if (surveyDto.getSilver() == null || surveyDto.getSilver() <= 0) isInValid = true;

        else if (surveyDto.getPet() == null || surveyDto.getPet().length() < 3) isInValid = true;

        else if (surveyDto.getCows() == null || surveyDto.getCows() <= 0) isInValid = true;

        if(isInValid){
            throw new DataInvalidException("Data is Invalid");
        }


    }
}
