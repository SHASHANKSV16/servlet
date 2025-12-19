<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>IPL</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            margin: 0;
            padding: 0;
            min-height: 100vh;
            background-image: url("https://png.pngtree.com/thumb_back/fh260/background/20241102/pngtree-captivating-evening-scene-of-a-cricket-field-image_16496531.jpg");
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
        <img src="https://documents.iplt20.com//ipl/assets/images/ipl-logo-new-old.png" height="45px">

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarMenu">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarMenu">
            <ul class="navbar-nav ms-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp">Home</a>
                </li>


                <li class="nav-item">
                    <a class="nav-link active" href="bidding.jsp">Search</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<div class="card-container">
    <div class="card shadow-lg p-4" style="width: 28rem; background: rgba(255,255,255,0.8);">
        <img src="https://cleverharvey.com/wp-content/uploads/2022/04/259-2595872_https-fantasy-iplt20-cricket-attax-2018-19.png" height="450px" class="card-img-top" alt="Card Image">
        <div class="card-body text-center">
            <h5 class="card-title">Player Registration</h5>

            <a href="login.jsp" class="btn btn-primary">Register Here</a>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
