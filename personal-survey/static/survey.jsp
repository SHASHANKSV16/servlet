<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Survey Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="
    background-image: url('https://img.freepik.com/premium-vector/survey-business-concept-with-icon-set-with-big-word-text-center-vector-illustration_25156-749.jpg');
    background-repeat: no-repeat;
    background-size: cover;

">
<div class="container mt-4 mb-4">
    <h2 class="text-center mb-4">Survey Form</h2>
    <form action="survey" method="post">

        <div class="card mb-3">
            <div class="card-header bg-primary text-white">Personal Information</div>
            <div class="card-body">
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Name</label><input type="text" class="form-control" name="name"></div>
                    <div class="col-md-4 mb-3"><label>Occupation</label><input type="text" class="form-control" name="occupation"></div>
                    <div class="col-md-4 mb-3"><label>Education</label><input type="text" class="form-control" name="education"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Native Place</label><input type="text" class="form-control" name="nativePlace"></div>
                    <div class="col-md-4 mb-3"><label>Mobile No</label><input type="number" class="form-control" name="mobile"></div>
                    <div class="col-md-4 mb-3"><label>Aadhaar No</label><input type="number" class="form-control" name="aadhaar"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>PAN Card</label><input type="text" class="form-control" name="pan"></div>
                    <div class="col-md-4 mb-3"><label>Voter ID</label><input type="text" class="form-control" name="voterId"></div>
                    <div class="col-md-4 mb-3"><label>Passport No</label><input type="text" class="form-control" name="passport"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Ration Card No</label><input type="text" class="form-control" name="ration"></div>
                    <div class="col-md-4 mb-3"><label>Income</label><input type="number" class="form-control" name="income"></div>
                    <div class="col-md-4 mb-3"><label>Bank Account</label><input type="text" class="form-control" name="bankAccount"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Father Name</label><input type="text" class="form-control" name="fatherName"></div>
                    <div class="col-md-4 mb-3"><label>Mother Name</label><input type="text" class="form-control" name="motherName"></div>
                    <div class="col-md-4 mb-3"><label>Married</label><input type="text" class="form-control" name="married"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Wife/Husband Name</label><input type="text" class="form-control" name="spouseName"></div>
                    <div class="col-md-4 mb-3"><label>No of Children</label><input type="number" class="form-control" name="children"></div>
                    <div class="col-md-4 mb-3"><label>No of Family Members</label><input type="number" class="form-control" name="familyMembers"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Caste</label><input type="text" class="form-control" name="caste"></div>
                    <div class="col-md-4 mb-3"><label>Religion</label><input type="text" class="form-control" name="religion"></div>
                    <div class="col-md-4 mb-3"><label>Mother Tongue</label><input type="text" class="form-control" name="motherTongue"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Age</label><input type="number" class="form-control" name="age"></div>
                    <div class="col-md-4 mb-3"><label>Date of Birth</label><input type="text" class="form-control" name="dob"></div>
                    <div class="col-md-4 mb-3"><label>Known Diseases</label><input type="text" class="form-control" name="diseases"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Height (cm)</label><input type="number" class="form-control" name="height"></div>
                    <div class="col-md-4 mb-3"><label>Weight (kg)</label><input type="number" class="form-control" name="weight"></div>
                    <div class="col-md-4 mb-3"><label>Complexion</label><input type="text" class="form-control" name="complexion"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Blood Group</label><input type="text" class="form-control" name="bloodGroup"></div>
                    <div class="col-md-4 mb-3"><label>Shoe Size</label><input type="number" class="form-control" name="shoeSize"></div>
                    <div class="col-md-4 mb-3"><label>No of Shoes</label><input type="number" class="form-control" name="shoeCount"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Friends Name</label><input type="text" class="form-control" name="friends"></div>
                    <div class="col-md-4 mb-3"><label>Govt Employee</label><input type="text" class="form-control" name="govtEmployee"></div>
                    <div class="col-md-4 mb-3"><label>Disabled</label><input type="text" class="form-control" name="disabled"></div>

                </div>
            </div>
        </div>

        <div class="card mb-3">
            <div class="card-header bg-warning text-dark">Vehicle Details</div>
            <div class="card-body">
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Bike Number</label><input type="text" class="form-control" name="bikeNo"></div>
                    <div class="col-md-4 mb-3"><label>Car Number</label><input type="text" class="form-control" name="carNo"></div>
                    <div class="col-md-4 mb-3"><label>No of Cycles</label><input type="number" class="form-control" name="cycles"></div>

                </div>

            </div>
        </div>

        <div class="card mb-3">
            <div class="card-header bg-success text-white">Land Details</div>
            <div class="card-body">
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Land in Acres</label><input type="number" class="form-control" name="acres"></div>
                    <div class="col-md-4 mb-3"><label>Total Sites</label><input type="number" class="form-control" name="sites"></div>
                    <div class="col-md-4 mb-3"><label>RTC No</label><input type="text" class="form-control" name="rtc"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Taxes Paid</label><input type="text" class="form-control" name="taxes"></div>
                    <div class="col-md-4 mb-3"><label>Building Owner Name</label><input type="text" class="form-control" name="buildingOwner"></div>
                    <div class="col-md-4 mb-3"><label>Crop</label><input type="text" class="form-control" name="crop"></div>
                </div>
            </div>
        </div>

        <div class="card mb-3">
            <div class="card-header bg-info text-white">Finance & Insurance</div>
            <div class="card-body">
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Insurance Company</label><input type="text" class="form-control" name="insuranceCompany"></div>
                    <div class="col-md-4 mb-3"><label>Insurance No</label><input type="text" class="form-control" name="insuranceNo"></div>
                    <div class="col-md-4 mb-3"><label>Loan No</label><input type="text" class="form-control" name="loanNo"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Loan Balance</label><input type="number" class="form-control" name="loanBalance"></div>
                    <div class="col-md-4 mb-3"><label>Loan Type</label><input type="text" class="form-control" name="loanType"></div>
                    <div class="col-md-4 mb-3"><label>Share Holding</label><input type="text" class="form-control" name="shareHolding"></div>
                </div>
            </div>
        </div>

        <div class="card mb-3">
            <div class="card-header bg-secondary text-white">Electronics</div>
            <div class="card-body">
                <div class="row">
                    <div class="col-md-6 mb-3"><label>Laptop Model</label><input type="text" class="form-control" name="laptop"></div>
                    <div class="col-md-6 mb-3"><label>TV Model</label><input type="text" class="form-control" name="tv"></div>
                </div>
            </div>
        </div>

        <div class="card mb-3">
            <div class="card-header bg-dark text-white">Home Details</div>
            <div class="card-body">

                <div class="row">
                    <div class="col-md-4 mb-3"><label>Water Bill No</label><input type="text" class="form-control" name="waterBill"></div>
                    <div class="col-md-4 mb-3"><label>Gold (gms)</label><input type="number" class="form-control" name="gold"></div>
                    <div class="col-md-4 mb-3"><label>Silver (gms)</label><input type="number" class="form-control" name="silver"></div>
                </div>
                <div class="row">
                    <div class="col-md-4 mb-3"><label>Electricity Bill No</label><input type="text" class="form-control" name="electricityBill"></div>
                    <div class="col-md-4 mb-3"><label>Pet Name</label><input type="text" class="form-control" name="pet"></div>
                    <div class="col-md-4 mb-3"><label>No of Cows</label><input type="number" class="form-control" name="cows"></div>
                    </div>
            </div>
        </div>

        <button type="submit" class="btn btn-success w-100 mt-3">Submit</button>
    </form>
</div>
</body>
</html>