<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
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

        .card-container {
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 90vh;
}

.error-text {
    color: red;
    font-size: 14px;
}

.valid-input {
    border: 2px solid green !important;
}

.invalid-input {
    border: 2px solid red !important;
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


    </div>
</nav>

<div class="card-container">
    <div class="card shadow-lg p-4" style="width: 28rem; background: rgba(255,255,255,0.95);">

        <h4 class="text-center mb-3">Enter Date and Email</h4>



        <form id="flight" class="mt-3" method="get" action="flight" >

            <div class="mb-2">
                <label>Date</label>
                <input type="text" class="form-control" id="date" name="date" placeholder="DD-MM-YYYY">
                <small id="dateError" class="error-text"></small>
            </div>

            <div class="mb-3">
                <label>Email</label>
                <input type="email" class="form-control" id="email" name="email">
                <small id="emailError" class="error-text"></small>
            </div>
            <div>

                <c:if test="${dto !=null}">
                    <h4 class="text-center mb-3 text-success">From: ${dto.from} </h4>
                    <h4 class="text-center mb-3 text-success">Destination: ${dto.destination} </h4>
                    <h4 class="text-center mb-3 text-success">Date: ${dto.date} </h4>
                    <h4 class="text-center mb-3 text-success">Airlines: ${dto.airline} </h4>
                    <h4 class="text-center mb-3 text-success">Name: ${dto.name} </h4>
                    <h4 class="text-center mb-3 text-success">Email: ${dto.email} </h4>
                    <div>
                    <a href="edit?date=${dto.date}&email=${dto.email}"
                       class="btn btn-warning w-100">
                        Edit
                    </a>
                    </div>

                </c:if>
                <h4 class="text-center mb-3 text-danger">${msg} </h4>
            </div>


            <button type="submit" class="btn btn-primary w-100 mt-2">Search</button>

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
            !validateEmail()
        ) {
            e.preventDefault();
        }
    });

    document.getElementById("date").addEventListener("input", validateDate);
   document.getElementById("email").addEventListener("input", validateEmail);
</script>

</body>
</html>
