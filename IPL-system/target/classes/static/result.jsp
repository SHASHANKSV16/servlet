<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Player Registration Result</title>

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
        <img src="https://documents.iplt20.com//ipl/assets/images/ipl-logo-new-old.png" height="45px">

        <div class="collapse navbar-collapse">
            <ul class="navbar-nav ms-auto">
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
    <div class="card shadow-lg p-4" style="width: 28rem; background: rgba(255,255,255,0.95);">

        <h4 class="text-center mb-3 text-success">
            ${success}
        </h4>

        <table class="table table-bordered">
            <tr>
                <th>Player Name</th>
                <td>${playerName}</td>
            </tr>

            <tr>
                <th>Age</th>
                <td>${age}</td>
            </tr>

            <tr>
                <th>Player Type</th>
                <td>${playerType}</td>
            </tr>

            <tr>
                <th>State</th>
                <td>${state}</td>
            </tr>

            <c:if test="${battingAvg != 0}">
                <tr>
                    <th>Batting Average</th>
                    <td>${battingAvg}</td>
                </tr>
            </c:if>

            <c:if test="${bowlingAvg != 0}">
                <tr>
                    <th>Bowling Average</th>
                    <td>${bowlingAvg}</td>
                </tr>
            </c:if>

            <c:if test="${stumps != 0}">
                <tr>
                    <th>Number of Stumps</th>
                    <td>${stumps}</td>
                </tr>
            </c:if>

        </table>

        <div class="text-center">
            <a href="index.jsp" class="btn btn-primary mt-2">Back to Home</a>
            <a href="login.jsp
" class="btn btn-success mt-2 ms-2">Register Another Player</a>
        </div>

    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
