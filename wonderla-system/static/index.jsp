<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Wonderla</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

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
            height: 90vh;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
       <img src="https://upload.wikimedia.org/wikipedia/kn/1/14/Wonderla_Amusements_Parks_Logo.png" height="45px">

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarMenu">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarMenu">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>


                <li class="nav-item">
                    <a class="nav-link active" href="search.jsp">Search</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="card-container">
    <div class="card shadow-lg" style="width: 30rem;">
        <img src="https://upload.wikimedia.org/wikipedia/kn/1/14/Wonderla_Amusements_Parks_Logo.png" class="card-img-top" alt="Card Image">
        <div class="card-body text-center">
            <h5 class="card-title">PLAN YOUR ADVENTURE</h5>

            <a href="login.jsp" class="btn btn-primary">Book Tickets</a>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
