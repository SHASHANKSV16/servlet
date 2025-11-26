<html>
<head>
    <title>Matrimony JSP</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <script>
        function validateForm() {
            const email = document.getElementById("email").value;
            const forWhom = document.getElementById("forWhom").value;
            const gender = document.querySelector("input[name='gender']:checked");
            const dob = document.getElementById("dob").value;
            const motherTongue = document.getElementById("motherTongue").value;
            const religion = document.getElementById("religion").value;
            const martialStatus = document.getElementById("status").value;
            const height = document.getElementById("height").value;

            const submitBtn = document.getElementById("submitBtn");

            let valid = true;

            const emailReg = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[A-Za-z]{2,}$/;
            if (!emailReg.test(email)) {
            valid = false;
            }

            if (forWhom === "") {
            valid = false;
            }

            if (gender === null){
            valid = false;
            }

            if (dob === "") {
            valid = false;
            }

            if (motherTongue === ""){
            valid = false;
            }

            if (religion === "") {
            valid = false;
            }

            if (martialStatus === ""){
            valid = false;
            }


            if (height < 1 || height > 7) {
            valid = false;
            }

            submitBtn.disabled = !valid;
        }

        function updateLabel() {
            const gender = document.querySelector("input[name='gender']:checked");
            const label = document.getElementById("labelFor");
            if (gender) {
                label.innerHTML = gender.value === "Male" ? "Groom's" : "Bride's";
            }
            validateForm();
        }
    </script>


</head>
<body  oninput="updateLabel()" onchange="validateForm()">
<div class="d-flex justify-content-center mt-5">
    <div class="card" style="width: 28rem;">
        <div class="card-body">
            <div class="center-wrapper">
                <form class="form-box" action="matrimony" method="post">
                    <h1>Registration Page</h1>
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="email" name="email" required>
                    </div>
                    <div class="mb-3">
                        <label for="forWhom" class="form-label">For</label>
                        <select class="form-select" id="forWhom" name="for" required>
                            <option value="" selected disabled>For Whom</option>
                            <option value="Self">Self</option>
                            <option value="Son">Son</option>
                            <option value="Brother">Brother</option>
                            <option value="Sister">Sister</option>
                            <option value="Daughter">Daughter</option>
                        </select>
                    </div>


                    <div class="mb-3">
                        <label class="form-label">Gender</label>
                        <div>
                            <input type="radio" id="male" name="gender" value="Male">
                            <label for="male">Male</label>

                            <input type="radio" id="female" name="gender" value="Female">
                            <label for="female">Female</label>
                        </div>
                    </div>

                    <label id="labelFor" style="font-weight:bold;">Groom's/Bride's</label><br><br>

                    <div class="mb-3">
                        <label for="dob" class="form-label">DOB</label>
                        <input type="date" class="form-control" id="dob" name="dob" required>
                    </div>

                    <div class="mb-3">
                        <label for="motherTongue" class="form-label">Mother Tongue</label>
                        <select class="form-select" id="motherTongue" name="motherTougue" required>
                            <option value="" selected disabled>Select</option>
                            <option value="Kannada">Kannada</option>
                            <option value="Tamil">Tamil</option>
                            <option value="Telugu">Telugu</option>
                            <option value="Hindi">Hindi</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="religion" class="form-label">Religion</label>
                        <select class="form-select" id="religion" name="religion" required>
                            <option value="" selected disabled>Select</option>
                            <option value="Hindu">Hindu</option>
                            <option value="Christian">Christian</option>
                            <option value="Muslim">Muslim</option>
                            <option value="Jain">Jain</option>
                            <option value="Buddhist">Buddhist</option>
                        </select>
                    </div>

                    <div class="mb-3">
                        <label for="status" class="form-label">Martial Status</label>
                        <select class="form-select" id="status" name="martialStatus" required>
                            <option value="" selected disabled>Select</option>
                            <option value="Never Married">Never Married</option>
                            <option value="Widow">Widow</option>
                            <option value="Second Marriage">Second Marriage</option>
                        </select>
                    </div>

                    <div class="mb-3">
                        <label for="height" class="form-label">Height(in cms)</label>
                        <input type="number" class="form-control" id="height" name="height" required>
                    </div>

                    <button type="submit" class="btn btn-primary w-100" id="submitBtn">Submit</button>
                </form>
            </div>
        </div>
    </div>
</div>



</body>
</html>
