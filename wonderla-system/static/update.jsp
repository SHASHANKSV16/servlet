<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Wonderla</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            margin: 0;
            padding: 0;
            min-height: 100vh;
            background-image: url("https://www.explorebees.com/uploads/wonderla%20bangalore%20(3).jpg");
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }

        .card-container {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 90vh;
        }

        .valid-input {
            border: 2px solid green !important;
        }

        .invalid-input {
            border: 2px solid red !important;
        }

        .error-text {
            color: red;
            font-size: 14px;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <img src="https://upload.wikimedia.org/wikipedia/kn/1/14/Wonderla_Amusements_Parks_Logo.png" height="45px">

        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item"><a class="nav-link active" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link active" href="search.jsp">Search</a></li>

            </ul>
        </div>
    </div>
</nav>

<div class="card-container">
    <div class="card shadow-lg p-4" style="width: 28rem; background: rgba(255,255,255,0.95);">

        <h4 class="text-center mb-3">Park Timings</h4>

        <table class="table table-bordered text-center">
            <thead class="table-primary">
            <tr>
                <th></th>
                <th>Park</th>
                <th>Water</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td><b>Weekdays</b></td>
                <td>11 AM - 6 PM</td>
                <td>12:30 PM - 5 PM</td>
            </tr>
            <tr>
                <td><b>Weekends</b></td>
                <td>11 AM - 7 PM</td>
                <td>12 PM - 6 PM</td>
            </tr>
            </tbody>
        </table>

        <form id="edit" class="mt-3" method="post" action="wonder">

            <div class="mb-2">
                <label>Date</label>
                <input type="text" class="form-control" id="date" value="${edit.date}" disabled name="date" placeholder="DD-MM-YYYY">
                <small id="dateError" class="error-text"></small>
            </div>

            <div class="mb-2">
                <label>Type of Ticket</label>
                <select class="form-select" id="ticketType"name="ticketType">
                    <option value="">Select</option>
                    <option value="regular">Regular</option>
                    <option value="fasttrack">Fast Track</option>
                </select>
                <small id="ticketTypeError" class="error-text"></small>
            </div>

            <div class="mb-2">
                <label>No of Adults</label>
                <input type="number" class="form-control" id="adults" name="adults" value="${edit.adults}">
                <small id="adultsError" class="error-text"></small>
            </div>

            <div class="mb-2">
                <label>No of Children</label>
                <input type="number" class="form-control" id="children" name="children" value="${edit.children}">
                <small id="childrenError" class="error-text"></small>
            </div>

            <div class="mb-2">
                <label>Name</label>
                <input type="text" class="form-control" id="name" name="name" value=" ${edit.name}">
                <small id="nameError" class="error-text"></small>
            </div>

            <div class="mb-3">
                <label>Email</label>
                <input type="email" class="form-control" id="email" name="email" value="${edit.email}" disabled>
                <small id="emailError" class="error-text"></small>
            </div>
            <div>
                <h4 class="text-center mb-3 text-danger"style="color:red";>${dataError} </h4>
                <h4 class="text-center mb-3 text-danger" style="color:red;">${emailError} </h4>
            </div>


            <button type="submit" class="btn btn-primary w-100 mt-2">Update Booking Details</button>

        </form>

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

    function validateDate() {
        const date = document.getElementById("date");
        const msg = document.getElementById("dateError");
        const pattern = /^\d{2}-\d{2}-\d{4}$/;

        if (date.value.trim() === "") return setError(date, msg, "Date is required"), false;
        if (!pattern.test(date.value.trim())) return setError(date, msg, "Use DD-MM-YYYY format"), false;

        setSuccess(date, msg);
        return true;
    }

    function validateTicketType() {
        const select = document.getElementById("ticketType");
        const msg = document.getElementById("ticketTypeError");

        if (select.value === "") return setError(select, msg, "Select ticket type"), false;

        setSuccess(select, msg);
        return true;
    }

    function validateAdults() {
        const input = document.getElementById("adults");
        const msg = document.getElementById("adultsError");
        const value = parseInt(input.value);

        if (input.value.trim() === "") return setError(input, msg, "Adults is required"), false;
        if (value < 1) return setError(input, msg, "At least 1 adult required"), false;

        setSuccess(input, msg);
        return true;
    }

    function validateChildren() {
        const input = document.getElementById("children");
        const msg = document.getElementById("childrenError");
        const value = parseInt(input.value);

        if (input.value.trim() === "") return setError(input, msg, "Children is required"), false;
        if (value < 0) return setError(input, msg, "Invalid children count"), false;

        setSuccess(input, msg);
        return true;
    }

    function validateTotalTickets() {
        const adults = parseInt(document.getElementById("adults").value || 0);
        const children = parseInt(document.getElementById("children").value || 0);
        const msg = document.getElementById("childrenError");

        if ((adults + children) <= 0) {
            msg.innerHTML = "At least one ticket is required";
            return false;
        }
        return true;
    }

    function validateName() {
        const name = document.getElementById("name");
        const msg = document.getElementById("nameError");

        if (name.value.trim() === "") return setError(name, msg, "Name is required"), false;
        if (name.value.trim().length < 4) return setError(name, msg, "Minimum 4 characters"), false;

        setSuccess(name, msg);
        return true;
    }

    function validateEmail() {
        const email = document.getElementById("email");
        const msg = document.getElementById("emailError");
        const pattern = /^[^\s@]+@[^\s@]+\.(com|in)$/;

        if (email.value.trim() === "") return setError(email, msg, "Email is required"), false;
        if (!pattern.test(email.value.trim())) return setError(email, msg, "Invalid email format"), false;

        setSuccess(email, msg);
        return true;
    }

    document.getElementById("ticketForm").addEventListener("submit", function (e) {
        if (
            !validateDate() ||
            !validateTicketType() ||
            !validateAdults() ||
            !validateChildren() ||
            !validateTotalTickets() ||
            !validateName() ||
            !validateEmail()
        ) {
            e.preventDefault();
        }
    });

    document.getElementById("date").addEventListener("input", validateDate);
    document.getElementById("ticketType").addEventListener("change", validateTicketType);
    document.getElementById("adults").addEventListener("input", validateAdults);
    document.getElementById("children").addEventListener("input", () => {
        validateChildren();
        validateTotalTickets();
    });
    document.getElementById("name").addEventListener("input", validateName);
    document.getElementById("email").addEventListener("input", validateEmail);
</script>

</body>
</html>
