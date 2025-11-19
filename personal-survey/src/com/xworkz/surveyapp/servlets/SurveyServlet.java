package com.xworkz.surveyapp.servlets;

import com.xworkz.surveyapp.dto.SurveyDto;
import com.xworkz.surveyapp.exception.DataInvalidException;
import com.xworkz.surveyapp.service.SurveyService;
import com.xworkz.surveyapp.service.SurveyServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns ="/survey" , loadOnStartup = 1)

public class SurveyServlet extends HttpServlet {
    SurveyService service = new SurveyServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        SurveyDto surveyDto = new SurveyDto();
        surveyDto.setName(req.getParameter("name"));
        surveyDto.setOccupation(req.getParameter("occupation"));
        surveyDto.setEducation(req.getParameter("education"));
        surveyDto.setNativePlace(req.getParameter("nativePlace"));
        surveyDto.setMobile(Long.parseLong(req.getParameter("mobile")));
        surveyDto.setAadhaar(Long.parseLong(req.getParameter("aadhaar")));
        surveyDto.setPan(req.getParameter("pan"));
        surveyDto.setVoterId(req.getParameter("voterId"));
        surveyDto.setPassport(req.getParameter("passport"));
        surveyDto.setRation(req.getParameter("ration"));
        surveyDto.setIncome(Long.parseLong(req.getParameter("income")));
        surveyDto.setBankAccount(req.getParameter("bankAccount"));
        surveyDto.setFatherName(req.getParameter("fatherName"));
        surveyDto.setMotherName(req.getParameter("motherName"));
        surveyDto.setMarried(req.getParameter("married"));
        surveyDto.setSpouseName(req.getParameter("spouseName"));
        surveyDto.setChildren(Long.parseLong(req.getParameter("children")));
        surveyDto.setFamilyMembers(Long.parseLong(req.getParameter("familyMembers")));
        surveyDto.setCaste(req.getParameter("caste"));
        surveyDto.setReligion(req.getParameter("religion"));
        surveyDto.setMotherTongue(req.getParameter("motherTongue"));
        surveyDto.setAge(Long.parseLong(req.getParameter("age")));
        surveyDto.setDob(req.getParameter("dob"));
        surveyDto.setDiseases(req.getParameter("diseases"));
        surveyDto.setHeight(Long.parseLong(req.getParameter("height")));
        surveyDto.setWeight(Long.parseLong(req.getParameter("weight")));
        surveyDto.setComplexion(req.getParameter("complexion"));
        surveyDto.setBloodGroup(req.getParameter("bloodGroup"));
        surveyDto.setShoeSize(Long.parseLong(req.getParameter("shoeSize")));
        surveyDto.setShoeCount(Long.parseLong(req.getParameter("shoeCount")));
        surveyDto.setFriends(req.getParameter("friends"));
        surveyDto.setBikeNo(req.getParameter("bikeNo"));
        surveyDto.setCarNo(req.getParameter("carNo"));
        surveyDto.setCycles(Long.parseLong(req.getParameter("cycles")));
        surveyDto.setAcres(Long.parseLong(req.getParameter("acres")));
        surveyDto.setSites(Long.parseLong(req.getParameter("sites")));
        surveyDto.setRtc(req.getParameter("rtc"));
        surveyDto.setTaxes(req.getParameter("taxes"));
        surveyDto.setBuildingOwner(req.getParameter("buildingOwner"));
        surveyDto.setCrop(req.getParameter("crop"));
        surveyDto.setInsuranceCompany(req.getParameter("insuranceCompany"));
        surveyDto.setInsuranceNo(req.getParameter("insuranceNo"));
        surveyDto.setLoanNo(req.getParameter("loanNo"));
        surveyDto.setLoanBalance(Long.parseLong(req.getParameter("loanBalance")));
        surveyDto.setLoanType(req.getParameter("loanType"));
        surveyDto.setShareHolding(req.getParameter("shareHolding"));
        surveyDto.setLaptop(req.getParameter("laptop"));
        surveyDto.setTv(req.getParameter("tv"));
        surveyDto.setGovtEmployee(req.getParameter("govtEmployee"));
        surveyDto.setDisabled(req.getParameter("disabled"));
        surveyDto.setElectricityBill(req.getParameter("electricityBill"));
        surveyDto.setWaterBill(req.getParameter("waterBill"));
        surveyDto.setGold(Long.parseLong(req.getParameter("gold")));
        surveyDto.setSilver(Long.parseLong(req.getParameter("silver")));
        surveyDto.setPet(req.getParameter("pet"));
        surveyDto.setCows(Long.parseLong(req.getParameter("cows")));

        try {
            service.ValidateDetails(surveyDto);

        req.setAttribute("name",req.getParameter("name"));
        req.setAttribute("occupation",req.getParameter("occupation"));
        req.setAttribute("education",req.getParameter("education"));
        req.setAttribute("nativePlace",req.getParameter("nativePlace"));
        req.setAttribute("mobile",req.getParameter("mobile"));
        req.setAttribute("aadhaar",req.getParameter("aadhaar"));
        req.setAttribute("pan", req.getParameter("pan"));
        req.setAttribute("voterId", req.getParameter("voterId"));
        req.setAttribute("passport", req.getParameter("passport"));
        req.setAttribute("ration", req.getParameter("ration"));
        req.setAttribute("income", req.getParameter("income"));
        req.setAttribute("bankAccount", req.getParameter("bankAccount"));
        req.setAttribute("fatherName", req.getParameter("fatherName"));
        req.setAttribute("motherName", req.getParameter("motherName"));
        req.setAttribute("married", req.getParameter("married"));
        req.setAttribute("spouseName", req.getParameter("spouseName"));
        req.setAttribute("children", req.getParameter("children"));
        req.setAttribute("familyMembers", req.getParameter("familyMembers"));
        req.setAttribute("caste", req.getParameter("caste"));
        req.setAttribute("religion", req.getParameter("religion"));
        req.setAttribute("motherTongue", req.getParameter("motherTongue"));
        req.setAttribute("age", req.getParameter("age"));
        req.setAttribute("dob", req.getParameter("dob"));
        req.setAttribute("diseases", req.getParameter("diseases"));
        req.setAttribute("height", req.getParameter("height"));
        req.setAttribute("weight", req.getParameter("weight"));
        req.setAttribute("complexion", req.getParameter("complexion"));
        req.setAttribute("bloodGroup", req.getParameter("bloodGroup"));
        req.setAttribute("shoeSize", req.getParameter("shoeSize"));
        req.setAttribute("shoeCount", req.getParameter("shoeCount"));
        req.setAttribute("friends", req.getParameter("friends"));
        req.setAttribute("bikeNo", req.getParameter("bikeNo"));
        req.setAttribute("carNo", req.getParameter("carNo"));
        req.setAttribute("cycles", req.getParameter("cycles"));
        req.setAttribute("acres", req.getParameter("acres"));
        req.setAttribute("sites", req.getParameter("sites"));
        req.setAttribute("rtc", req.getParameter("rtc"));
        req.setAttribute("taxes", req.getParameter("taxes"));
        req.setAttribute("buildingOwner", req.getParameter("buildingOwner"));
        req.setAttribute("crop", req.getParameter("crop"));
        req.setAttribute("insuranceCompany", req.getParameter("insuranceCompany"));
        req.setAttribute("insuranceNo", req.getParameter("insuranceNo"));
        req.setAttribute("loanNo", req.getParameter("loanNo"));
        req.setAttribute("loanBalance", req.getParameter("loanBalance"));
        req.setAttribute("loanType", req.getParameter("loanType"));
        req.setAttribute("shareHolding", req.getParameter("shareHolding"));
        req.setAttribute("laptop", req.getParameter("laptop"));
        req.setAttribute("tv", req.getParameter("tv"));
        req.setAttribute("govtEmployee", req.getParameter("govtEmployee"));
        req.setAttribute("disabled", req.getParameter("disabled"));
        req.setAttribute("electricityBill", req.getParameter("electricityBill"));
        req.setAttribute("waterBill", req.getParameter("waterBill"));
        req.setAttribute("gold", req.getParameter("gold"));
        req.setAttribute("silver", req.getParameter("silver"));
        req.setAttribute("pet", req.getParameter("pet"));
        req.setAttribute("cows", req.getParameter("cows"));


        req.setAttribute("succes","Data Added Successfully");
        } catch (DataInvalidException e) {
            System.err.println("Data not Added");
            req.setAttribute("error","Data Not Added SucessFully");
        }
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("result.jsp");
        requestDispatcher.forward(req,resp);


    }
}
