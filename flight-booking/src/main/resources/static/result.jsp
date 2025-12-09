<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Booking Result</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>


        .card-container {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 90vh;
        }
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
            max-width: 450px;
            width: 100%;
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
            </ul>
        </div>
    </div>
</nav>

<div class="card-container">
    <div class="card shadow-lg p-4" style="width: 30rem; background: rgba(255,255,255,0.95);">

        <h3 class="text-center text-success mb-3">
            ${success}
        </h3>

        <h5 class="text-center mb-3">Your Booking Details</h5>

        <table class="table table-bordered text-center">
            <tbody>
            <tr>
                <th>From</th>
                <td>${from}</td>
            </tr>
            <tr>
                <th>Destination</th>
                <td>${destination}</td>
            </tr>
            <tr>
                <th>Date</th>
                <td>${date}</td>
            </tr>
            <tr>
                <th>Airline</th>
                <td>${airline}</td>
            </tr>
            <tr>
                <th>Name</th>
                <td>${name}</td>
            </tr>
            <tr>
                <th>Email</th>
                <td>${email}</td>
            </tr>
            </tbody>
        </table>

        <a href="index.jsp" class="btn btn-primary w-100 mt-3">Book Another Ticket</a>

    </div>
</div>

</body>
</html>
