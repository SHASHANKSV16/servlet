<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Flight Search</title>

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
.table td, .table th {
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    max-width: 150px;
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


    <div class="card-container">   <div class="card shadow-lg p-4" style="width: 90%; max-width: 1100px; background: rgba(255,255,255,0.95);">

        <h4 class="text-center mb-3">Enter Date and Email</h4>



        <form id="flight" class="mt-3" method="post" action="destinationSearch" >

            <div class="mb-3">
                <label class="form-label">Destination</label>
                <input type="text" class="form-control" id="destination" name="destination">
                <small id="destinationError" class="text-danger"></small>
            </div>


            <div>

                <c:if test="${dto !=null}">



                        <table class="table table-bordered table-striped text-center align-middle">
                            <thead class="table-dark">
                            <tr>
                                <th>From</th>
                                <th>Destination</th>
                                <th>Date</th>
                                <th>Airlines</th>
                                <th>Name</th>
                                <th>Email</th>
                                <th>Action</th>
                            </tr>
                            </thead>

                            <tbody>
                            <c:forEach items="${dto}" var="d">
                                <tr>
                                    <td>${d.from}</td>
                                    <td>${d.destination}</td>
                                    <td>${d.date}</td>
                                    <td>${d.airline}</td>
                                    <td>${d.name}</td>
                                    <td>${d.email}</td>
                                    <td>
                                        <a href="edit?date=${d.date}&email=${d.email}"
                                           class="btn btn-warning btn-sm">
                                            Edit
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>


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
    function validateDestination() {
        const input = document.getElementById("destination");
        const msg = document.getElementById("destinationError");

        if (input.value.trim() === "") {
            setError(input, msg, "Destination is required");
            return false;
        }



    document.getElementById("ticketForm").addEventListener("submit", function (e) {
        if (
            !validateDestination()
        ) {
            e.preventDefault();
        }
    });

    document.getElementById("destination").addEventListener("input", validateDestination);

</script>

</body>
</html>
