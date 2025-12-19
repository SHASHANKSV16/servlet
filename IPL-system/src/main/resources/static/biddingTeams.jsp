<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <title>IPL Bidding</title>
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
            min-height: 90vh;
        }
    </style>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <div class="container-fluid">
        <img src="https://documents.iplt20.com//ipl/assets/images/ipl-logo-new-old.png" height="45px">
        <ul class="navbar-nav ms-auto">
            <li class="nav-item">
                <a class="nav-link active" href="index.jsp">Home</a>
            </li>
        </ul>
    </div>
</nav>

<div class="card-container">
    <div class="card shadow-lg p-4" style="width: 34rem; background: rgba(255,255,255,0.9);">

        <h5 class="text-center mb-3">Select Player Type</h5>

        <!-- SEARCH FORM -->
        <form action="searchPlayer" method="post" class="mb-4">
            <div class="mb-3">
                <select name="playerType" class="form-select" required>
                    <option value="">Select</option>
                    <option value="Batter">Batter</option>
                    <option value="Bowler">Bowler</option>
                    <option value="Allrounder">Allrounder</option>
                    <option value="Keeper">Keeper</option>
                </select>
            </div>

            <div class="d-grid">
                <button type="submit" class="btn btn-primary">Search</button>
            </div>
        </form>


        <c:if test="${not empty playerList}">
            <h6 class="text-success text-center">Available Players</h6>

            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Age</th>
                    <th>Type</th>
                    <th>State</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${playerList}" var="p">
                    <tr>
                        <td>${p.playerName}</td>
                        <td>${p.age}</td>
                        <td>${p.playerType}</td>
                        <td>${p.state}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </c:if>



    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
