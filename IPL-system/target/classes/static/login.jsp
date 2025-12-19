<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Player Registration</title>
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
    min-height: calc(100vh - 70px); /* navbar height */
    margin-top: 70px;
}
        .required::after {
    content: " *";
    color: red;
    font-weight: bold;
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
    <div class="card shadow-lg p-4" style="width: 28rem; background: rgba(255,255,255,0.85);">
        <div class="card-body">
            <h5 class="card-title text-center mb-4">Player Registration</h5>

            <form action="playerLogin" method="post" class="needs-validation" novalidate>

                <div class="mb-3">
                    <label class="form-label required">Player Name</label>
                    <input type="text" class="form-control" name="playerName" required>
                    <div class="invalid-feedback">Please enter player name</div>
                </div>

                <div class="mb-3">
                    <label class="form-label required">Age</label>
                    <input type="number" class="form-control" name="age" min="10" max="60" required>
                    <div class="invalid-feedback">Age must be between 10 and 60</div>
                </div>

                <div class="mb-3">
                    <label class="form-label required">Player Type</label>
                    <select class="form-select" name="playerType" id="playerType" required>
                        <option value="">Select</option>
                        <option value="Batter">Batter</option>
                        <option value="Bowler">Bowler</option>
                        <option value="Allrounder">Allrounder</option>
                        <option value="Keeper">Keeper</option>
                    </select>
                    <div class="invalid-feedback">Please select player type</div>
                </div>


                <div class="mb-3">
                    <label class="form-label required">State</label>
                    <input type="text" class="form-control" name="state" required>
                    <div class="invalid-feedback">Please enter state</div>
                </div>

                <div class="mb-3" id="battingDiv">
                    <label class="form-label">Batting Average</label>
                    <input type="number" step="0.01" min="0" max="100"
                           class="form-control" name="battingAvg" id="battingAvg">
                    <div class="invalid-feedback">Batting average must be between 0 and 100</div>
                </div>

                <div class="mb-3" id="bowlingDiv">
                    <label class="form-label">Bowling Average</label>
                    <input type="number" step="0.01" min="0" max="100"
                           class="form-control" name="bowlingAvg" id="bowlingAvg">
                    <div class="invalid-feedback">Bowling average must be between 0 and 100</div>
                </div>

                <div class="mb-3" id="stumpsDiv">
                    <label class="form-label">Number of Stumps</label>
                    <input type="number" min="0"
                           class="form-control" name="stumps" id="stumps">
                    <div class="invalid-feedback">Stumps cannot be negative</div>
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">Register</button>
                </div>

            </form>

        </div>
    </div>
</div>
<script>
    (() => {
        'use strict';
        const forms = document.querySelectorAll('.needs-validation');

        Array.from(forms).forEach(form => {
            form.addEventListener('submit', event => {
                if (!form.checkValidity()) {
                    event.preventDefault();
                    event.stopPropagation();
                }
                form.classList.add('was-validated');
            }, false);
        });
    })();

    const playerType = document.getElementById("playerType");

    const battingDiv = document.getElementById("battingDiv");
    const bowlingDiv = document.getElementById("bowlingDiv");
    const stumpsDiv = document.getElementById("stumpsDiv");

    const battingAvg = document.getElementById("battingAvg");
    const bowlingAvg = document.getElementById("bowlingAvg");
    const stumps = document.getElementById("stumps");


    function hideAll() {

    battingDiv.style.display = "none";
    bowlingDiv.style.display = "none";
    stumpsDiv.style.display = "none";


    battingAvg.value = 0;
    bowlingAvg.value = 0;
    stumps.value = 0;


    battingAvg.required = false;
    bowlingAvg.required = false;
    stumps.required = false;
}


    hideAll();

    playerType.addEventListener("change", function () {
        hideAll();

        switch (this.value) {
            case "Batter":
                battingDiv.style.display = "block";
                battingAvg.required = true;
                break;

            case "Bowler":
                bowlingDiv.style.display = "block";
                bowlingAvg.required = true;
                break;

            case "Allrounder":
                battingDiv.style.display = "block";
                bowlingDiv.style.display = "block";
                battingAvg.required = true;
                bowlingAvg.required = true;
                break;

            case "Keeper":
                battingDiv.style.display = "block";
                stumpsDiv.style.display = "block";
                battingAvg.required = true;
                stumps.required = true;
                break;
        }
    });
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
