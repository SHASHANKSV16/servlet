<!DOCTYPE html>
<html>
<head>
    <title>Matrimony JSP</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .error-text {
            color: red;
            font-size: 14px;
            margin-top: 3px;
        }

        .valid-input {
            border: 2px solid green;
        }

        .invalid-input {
            border: 2px solid red;
        }
    </style>
</head>

<body>

<div class="d-flex justify-content-center mt-5">
    <div class="card" style="width: 28rem;">
        <div class="card-body">

            <form id="matriForm" action="matrimony" method="post">

                <h3 class="text-center mb-3">Registration Page</h3>

                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email">
                    <span id="emailError" class="error-text"></span>
                </div>

                <div class="mb-3">
                    <label class="form-label">For</label>
                    <select class="form-select" id="forWhom" name="for">
                        <option value="" selected disabled>Select</option>
                        <option value="Self">Self</option>
                        <option value="Son">Son</option>
                        <option value="Brother">Brother</option>
                        <option value="Sister">Sister</option>
                        <option value="Daughter">Daughter</option>
                    </select>
                    <span id="forWhomError" class="error-text"></span>
                </div>

                <div class="mb-3">
                    <label class="form-label">Gender</label><br>
                    <input type="radio" id="male" name="gender" value="Male">
                    <label for="male">Male</label>

                    <input type="radio" id="female" name="gender" value="Female" class="ms-3">
                    <label for="female">Female</label>

                    <span id="genderError" class="error-text"></span>
                </div>

                <label id="labelFor" class="fw-bold">Groom's / Bride's Details</label>
                <br><br>

                <div class="mb-3">
                    <label class="form-label">DOB</label>
                    <input type="date" class="form-control" id="dob" name="dob">
                    <span id="dobError" class="error-text"></span>
                </div>

                <div class="mb-3">
                    <label class="form-label">Mother Tongue</label>
                    <select class="form-select" id="motherTongue" name="motherTougue">
                        <option value="" selected disabled>Select</option>
                        <option value="Kannada">Kannada</option>
                        <option value="Tamil">Tamil</option>
                        <option value="Telugu">Telugu</option>
                        <option value="Hindi">Hindi</option>
                    </select>
                    <span id="mtError" class="error-text"></span>
                </div>

                <div class="mb-3">
                    <label class="form-label">Religion</label>
                    <select class="form-select" id="religion" name="religion">
                        <option value="" selected disabled>Select</option>
                        <option value="Hindu">Hindu</option>
                        <option value="Christian">Christian</option>
                        <option value="Muslim">Muslim</option>
                        <option value="Jain">Jain</option>
                        <option value="Buddhist">Buddhist</option>
                    </select>
                    <span id="religionError" class="error-text"></span>
                </div>

                <div class="mb-3">
                    <label class="form-label">Marital Status</label>
                    <select class="form-select" id="status" name="martialStatus">
                        <option value="" selected disabled>Select</option>
                        <option value="Never Married">Never Married</option>
                        <option value="Widow">Widow</option>
                        <option value="Second Marriage">Second Marriage</option>
                    </select>
                    <span id="statusError" class="error-text"></span>
                </div>

                <div class="mb-3">
                    <label class="form-label">Height (ft)</label>
                    <input type="number" class="form-control" id="height" name="height">
                    <span id="heightError" class="error-text"></span>
                </div>

                <button type="submit" class="btn btn-primary w-100">Submit</button>
                <button type="reset" id="clear" class="btn btn-secondary w-100 mt-2">Clear</button>

            </form>

        </div>
    </div>
</div>

<script>
    function setError(input, msgBox, message) {
        input.classList.remove("valid-input");
        input.classList.add("invalid-input");
        msgBox.innerHTML = message;
    }

    function setSuccess(input, msgBox) {
        input.classList.remove("invalid-input");
        input.classList.add("valid-input");
        msgBox.innerHTML = "";
    }

    function updateLabelByGender() {
        const male = document.getElementById("male").checked;
        const female = document.getElementById("female").checked;
        const label = document.getElementById("labelFor");

        if (male) label.textContent = "Groom Details";
        else if (female) label.textContent = "Bride Details";
        else label.textContent = "Groom's / Bride's Details";
    }

    document.getElementById("male").addEventListener("change", updateLabelByGender);
    document.getElementById("female").addEventListener("change", updateLabelByGender);

    function validateEmail() {
        const email = document.getElementById("email");
        const msg = document.getElementById("emailError");
        const pattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (email.value.trim() === "") return setError(email, msg, "Email is required"), false;
        if (!pattern.test(email.value.trim())) return setError(email, msg, "Invalid email format"), false;

        setSuccess(email, msg);
        return true;
    }

    function validateDropdown(id, msgId, message) {
        const select = document.getElementById(id);
        const msg = document.getElementById(msgId);

        if (select.value === "") return setError(select, msg, message), false;

        setSuccess(select, msg);
        return true;
    }

    function validateGender() {
        const male = document.getElementById("male").checked;
        const female = document.getElementById("female").checked;
        const msg = document.getElementById("genderError");

        if (!male && !female) {
            msg.innerHTML = "Please select gender";
            return false;
        }

        msg.innerHTML = "";
        return true;
    }

    function validateDOB() {
        const dob = document.getElementById("dob");
        const msg = document.getElementById("dobError");

        if (dob.value === "") return setError(dob, msg, "DOB is required"), false;

        setSuccess(dob, msg);
        return true;
    }

    function validateHeight() {
        const h = document.getElementById("height");
        const msg = document.getElementById("heightError");
        const v = parseFloat(h.value);

        if (h.value.trim() === "") return setError(h, msg, "Height is required"), false;
        if (v < 2 || v > 7) return setError(h, msg, "Height must be between 2 ft and  7 ft"), false;

        setSuccess(h, msg);
        return true;
    }

    document.getElementById("matriForm").addEventListener("submit", function (e) {
        if (
            !validateEmail() ||
            !validateDropdown("forWhom", "forWhomError", "Select For Whom") ||
            !validateGender() ||
            !validateDOB() ||
            !validateDropdown("motherTongue", "mtError", "Select Mother Tongue") ||
            !validateDropdown("religion", "religionError", "Select Religion") ||
            !validateDropdown("status", "statusError", "Select Marital Status") ||
            !validateHeight()
        ) {
            e.preventDefault();
        }
    });

    document.getElementById("email").addEventListener("input", validateEmail);
    document.getElementById("forWhom").addEventListener("change", () => validateDropdown("forWhom", "forWhomError", "Select For Whom"));
    document.getElementById("dob").addEventListener("change", validateDOB);
    document.getElementById("motherTongue").addEventListener("change", () => validateDropdown("motherTongue", "mtError", "Select Mother Tongue"));
    document.getElementById("religion").addEventListener("change", () => validateDropdown("religion", "religionError", "Select Religion"));
    document.getElementById("status").addEventListener("change", () => validateDropdown("status", "statusError", "Select Marital Status"));
    document.getElementById("height").addEventListener("input", validateHeight);
</script>

</body>
</html>
