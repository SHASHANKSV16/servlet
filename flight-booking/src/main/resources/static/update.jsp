<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Flight Booking</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            margin: 0;
            min-height: 100vh;
            background-image: url("https://img.freepik.com/free-photo/airplane_74190-463.jpg?semt=ais_se_enriched&w=740&q=80");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }

        .custom-navbar {
            background: rgba(255, 255, 255, 0.5);
            backdrop-filter: blur(8px);
        }

        .custom-navbar .nav-link,
        .custom-navbar .navbar-brand {
            color: black !important;
            font-weight: 600;
        }

        .custom-navbar .nav-link:hover {
            text-decoration: underline;
        }

        .navbar-toggler {
            border-color: black;
        }

        .navbar-toggler-icon {
            filter: invert(1);
        }

        .hero-card {
            height: calc(100vh - 80px);
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .card-custom {
            background: rgba(255, 255, 255, 0.85);
            border-radius: 15px;
            padding: 30px;
            max-width: 500px;
            width: 100%;
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

<nav class="navbar navbar-expand-lg custom-navbar">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">
            <img src="https://www.freeiconspng.com/thumbs/airplane-icon-png/airplane-icon-png-png-22.png" height="50px">
            S V AIRLINES
        </a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="search.jsp">Search</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="destinationSearch.jsp">Destination Search</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<br>
<br>
<div class="container hero-card">
    <div class="card card-custom shadow">
        <div class="card-body">

            <h4 class="text-center mb-4">Tickets Booking Update Form</h4>

            <form action="flight" method="post" id="bookingForm">

                <div class="mb-3">
                    <label class="form-label">From</label>
                    <input type="text" class="form-control" id="from" name="from" value="${edit.from}" >
                    <small id="fromError" class="text-danger"></small>
                </div>

                <div class="mb-3">
                    <label class="form-label">Destination</label>
                    <input type="text" class="form-control" id="destination" name="destination" value="${edit.destination}">
                    <small id="destinationError" class="text-danger"></small>
                </div>
                <div class="mb-3">
                    <label>Date</label>
                    <input type="text" class="form-control" id="date" name="date" disabled placeholder="DD-MM-YYYY" value="${edit.date}">
                    <small id="dateError" class="error-text"></small>
                </div>

                <div class="mb-3">
                    <label class="form-label">Name</label>
                    <input type="text" class="form-control" id="name" name="name" value="${edit.name}">
                    <small id="nameError" class="text-danger"></small>
                </div>

                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" value="${edit.email}" disabled>
                    <small id="emailError" class="text-danger"></small>
                </div>

                <div class="mb-4">
                    <label class="form-label">Select Airline</label>
                    <select class="form-control" id="airline" name="airline">
                        <option value="">-- Select Airline --</option>
                        <option value="Emirates">Emirates</option>
                        <option value="Indigo">Indigo</option>
                        <option value="Air India">Air India</option>
                    </select>
                    <small id="airlineError" class="text-danger"></small>
                </div>

                <button type="submit" class="btn btn-primary w-100" id="submitBtn">
                    Submit
                </button>


            </form>


        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
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

    function validateFrom() {
        const input = document.getElementById("from");
        const msg = document.getElementById("fromError");

        if (input.value.trim() === "") {
            setError(input, msg, "From is required");
            return false;
        }

        setSuccess(input, msg);
        return true;
    }

    function validateDestination() {
        const input = document.getElementById("destination");
        const msg = document.getElementById("destinationError");

        if (input.value.trim() === "") {
            setError(input, msg, "Destination is required");
            return false;
        }

        setSuccess(input, msg);
        return true;
    }

    function validateDate() {
        const date = document.getElementById("date");
        const msg = document.getElementById("dateError");
        const pattern = /^\d{2}-\d{2}-\d{4}$/;

        if (date.value.trim() === "") {
            setError(date, msg, "Date is required");
            return false;
        }

        if (!pattern.test(date.value.trim())) {
            setError(date, msg, "Use DD-MM-YYYY format");
            return false;
        }

        setSuccess(date, msg);
        return true;
    }

    function validateName() {
        const input = document.getElementById("name");
        const msg = document.getElementById("nameError");

        if (input.value.trim() === "") {
            setError(input, msg, "Name is required");
            return false;
        }

        if (input.value.trim().length < 4) {
            setError(input, msg, "Minimum 4 characters");
            return false;
        }

        setSuccess(input, msg);
        return true;
    }

    function validateEmail() {
        const email = document.getElementById("email");
        const msg = document.getElementById("emailError");
        const pattern = /^[^\s@]+@[^\s@]+\.(com|in)$/;

        if (email.value.trim() === "") {
            setError(email, msg, "Email is required");
            return false;
        }

        if (!pattern.test(email.value.trim())) {
            setError(email, msg, "Invalid email format");
            return false;
        }

        setSuccess(email, msg);
        return true;
    }

    function validateAirline() {
        const select = document.getElementById("airline");
        const msg = document.getElementById("airlineError");

        if (select.value === "") {
            setError(select, msg, "Select an airline");
            return false;
        }

        setSuccess(select, msg);
        return true;
    }

    function toggleSubmit() {
        const isValid =
            validateFrom() &&
            validateDestination() &&
            validateDate() &&
            validateName() &&
            validateEmail() &&
            validateAirline();

        document.getElementById("submitBtn").disabled = !isValid;
    }

    document.getElementById("bookingForm").addEventListener("submit", function (e) {
        toggleSubmit();
        if (document.getElementById("submitBtn").disabled) {
            e.preventDefault();
        }
    });

    document.getElementById("from").addEventListener("input", () => {
        validateFrom(); toggleSubmit();
    });

    document.getElementById("destination").addEventListener("input", () => {
        validateDestination(); toggleSubmit();
    });

    document.getElementById("date").addEventListener("input", () => {
        validateDate(); toggleSubmit();
    });

    document.getElementById("name").addEventListener("input", () => {
        validateName(); toggleSubmit();
    });

    document.getElementById("email").addEventListener("input", () => {
        validateEmail(); toggleSubmit();
    });

    document.getElementById("airline").addEventListener("change", () => {
        validateAirline(); toggleSubmit();
    });
</script>


</body>
</html>
