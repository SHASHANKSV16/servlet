<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Survey Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="
    background-image: url('https://img.freepik.com/premium-vector/survey-business-concept-with-icon-set-with-big-word-text-center-vector-illustration_25156-749.jpg');
    background-repeat: no-repeat;
    background-size: cover;

">
<div class="container mt-4 mb-4">
    <h2 class="text-center mb-4">Survey Submitted Details</h2>
    <h2 class="text-center mb-4" style="color:green">${succes}</h2>
    <h2 class="text-center mb-4" style="color : red">${error}</h2>

    <div class="card mb-3">
        <div class="card-header bg-primary text-white">Personal Information</div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Name:</strong> ${name}</div>
                <div class="col-md-4 mb-2"><strong>Occupation:</strong> ${occupation}</div>
                <div class="col-md-4 mb-2"><strong>Education:</strong> ${education}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Native Place:</strong> ${nativePlace}</div>
                <div class="col-md-4 mb-2"><strong>Mobile:</strong> ${mobile}</div>
                <div class="col-md-4 mb-2"><strong>Aadhaar:</strong> ${aadhaar}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>PAN:</strong> ${pan}</div>
                <div class="col-md-4 mb-2"><strong>Voter ID:</strong> ${voterId}</div>
                <div class="col-md-4 mb-2"><strong>Passport No:</strong> ${passport}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Ration Card:</strong> ${ration}</div>
                <div class="col-md-4 mb-2"><strong>Income:</strong> ${income}</div>
                </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Father Name:</strong> ${fatherName}</div>
                <div class="col-md-4 mb-2"><strong>Mother Name:</strong> ${motherName}</div>
                <div class="col-md-4 mb-2"><strong>Married:</strong> ${married}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Spouse Name:</strong> ${spouseName}</div>
                <div class="col-md-4 mb-2"><strong>No of Children:</strong> ${children}</div>
                <div class="col-md-4 mb-2"><strong>Family Members:</strong> ${familyMembers}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Caste:</strong> ${caste}</div>
                <div class="col-md-4 mb-2"><strong>Religion:</strong> ${religion}</div>
                <div class="col-md-4 mb-2"><strong>Mother Tongue:</strong> ${motherTongue}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Age:</strong> ${age}</div>
                <div class="col-md-4 mb-2"><strong>DOB:</strong> ${dob}</div>
                <div class="col-md-4 mb-2"><strong>Diseases:</strong> ${diseases}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Height:</strong> ${height} </div>
                <div class="col-md-4 mb-2"><strong>Weight:</strong> ${weight} </div>
                <div class="col-md-4 mb-2"><strong>Complexion:</strong> ${complexion}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Blood Group:</strong> ${bloodGroup}</div>
                <div class="col-md-4 mb-2"><strong>Shoe Size:</strong> ${shoeSize}</div>
                <div class="col-md-4 mb-2"><strong>No of Shoes:</strong> ${shoeCount}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Govt Employee:</strong> ${govtEmployee}</div>
                <div class="col-md-4 mb-2"><strong>Disabled:</strong> ${disabled}</div>
                <div class="col-md-4 mb-2"><strong>Friends Name:</strong> ${friends}</div>
            </div>
        </div>
    </div>

    <div class="card mb-3">
        <div class="card-header bg-warning text-dark">Vehicle Details</div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Bike No:</strong> ${bikeNo}</div>
                <div class="col-md-4 mb-2"><strong>Car No:</strong> ${carNo}</div>
                <div class="col-md-4 mb-2"><strong>No of Cycles:</strong> ${cycles}</div>
            </div>

        </div>
    </div>

    <div class="card mb-3">
        <div class="card-header bg-success text-white">Land Details</div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Acres:</strong> ${acres}</div>
                <div class="col-md-4 mb-2"><strong>Total Sites:</strong> ${sites}</div>
                <div class="col-md-4 mb-2"><strong>RTC No:</strong> ${rtc}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Taxes Paid:</strong> ${taxes}</div>
                <div class="col-md-4 mb-2"><strong>Building Owner:</strong> ${buildingOwner}</div>
                <div class="col-md-4 mb-2"><strong>Crop:</strong> ${crop}</div>
            </div>
        </div>
    </div>

    <div class="card mb-3">
        <div class="card-header bg-info text-white">Finance & Insurance</div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Bank Account:</strong> ${bankAccount}</div>
                <div class="col-md-4 mb-2"><strong>Insurance Company:</strong> ${insuranceCompany}</div>
                <div class="col-md-4 mb-2"><strong>Insurance No:</strong> ${insuranceNo}</div>
                <div class="col-md-4 mb-2"><strong>Loan No:</strong> ${loanNo}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Loan Balance:</strong> ${loanBalance}</div>
                <div class="col-md-4 mb-2"><strong>Loan Type:</strong> ${loanType}</div>
                <div class="col-md-4 mb-2"><strong>Share Holding:</strong> ${shareHolding}</div>
            </div>
        </div>
    </div>

    <div class="card mb-3">
        <div class="card-header bg-secondary text-white">Electronics</div>
        <div class="card-body">
            <div class="row">
                <div class="col-md-6 mb-2"><strong>Laptop:</strong> ${laptop}</div>
                <div class="col-md-6 mb-2"><strong>TV:</strong> ${tv}</div>
            </div>
        </div>
    </div>

    <div class="card mb-3">
        <div class="card-header bg-dark text-white">Home Details</div>
        <div class="card-body">
            <div class="row">

                <div class="col-md-4 mb-2"><strong>Electricity Bill No:</strong> ${electricityBill}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Water Bill No:</strong> ${waterBill}</div>
                <div class="col-md-4 mb-2"><strong>Gold (gms):</strong> ${gold}</div>
                <div class="col-md-4 mb-2"><strong>Silver (gms):</strong> ${silver}</div>
            </div>
            <div class="row">
                <div class="col-md-4 mb-2"><strong>Pet Name:</strong> ${pet}</div>
                <div class="col-md-4 mb-2"><strong>No of Cows:</strong> ${cows}</div>
            </div>
        </div>
    </div>

    <a href="survey.jsp" class="btn btn-primary w-100">Back</a>

</div>
</body>
</html>
