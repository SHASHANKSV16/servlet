<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            margin: 0;
            padding: 0;
            min-height: 100vh;
            background: #f2f2f2;
        }

        .card-container {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 90vh;
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
                <li class="nav-item">
        <span class="nav-link text-white fw-bold">
            Hi ${sessionName}
        </span>

            </ul>
        </div>
    </div>
</nav>
<div class="card-container">
    <div class="card shadow-lg p-4" style="width: 28rem; background: rgba(255,255,255,0.95);">

        <h4 class="text-center mb-3 text-success" style="color:green;">${success} </h4>


        <table class="table table-bordered">
            <tr>
                <th>Date</th>
                <td>${date}</td>
            </tr>
            <tr>
                <th>Ticket Type</th>
                <td>${ticketType}</td>
            </tr>
            <tr>
                <th>No. of Adults</th>
                <td>${adults}</td>
            </tr>
            <tr>
                <th>No. of Children</th>
                <td>${children}</td>
            </tr>
            <tr>
                <th>Name</th>
                <td>${name}</td>
            </tr>
            <tr>
                <th>Email</th>
                <td>${email}</td>
            </tr>
        </table>

        <div class="text-center">
            <a href="index.jsp" class="btn btn-primary mt-2">Back to Home</a>
            <a href="login.jsp" class="btn btn-success mt-2 ms-2">Book Again</a>
        </div>

    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>


</body>
</html>