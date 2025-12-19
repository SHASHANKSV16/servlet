<!doctype html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en" xmlns:c="http://www.w3.org/1999/XSL/Transform">
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
    <div class="card shadow-lg p-4" style="width: 28rem; background: rgba(255,255,255,0.8);">

        <img src="https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/9c3773cb-5629-4145-b044-4ef6f9090376/df0pxkt-cbc20ad7-b514-43f5-99bd-31a3a351520a.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiIvZi85YzM3NzNjYi01NjI5LTQxNDUtYjA0NC00ZWY2ZjkwOTAzNzYvZGYwcHhrdC1jYmMyMGFkNy1iNTE0LTQzZjUtOTliZC0zMWEzYTM1MTUyMGEucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.LzBRueroy0MTKOIN6eDRobryO9mebL42p3n_XNw5wvg"
             height="300px" class="card-img-top mb-3" alt="Card Image">

        <div class="card-body">


            <form action="email" method="post" class="needs-validation" novalidate>

                <div class="mb-3">
                    <label class="form-label required">Email</label>
                    <input type="email"
                           class="form-control"
                           name="email"
                           placeholder="Enter email"
                           required>
                    <div class="invalid-feedback">
                        Please enter a valid email address
                    </div>
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-primary">
                        Continue
                    </button>
                </div>
                <c:if test="${not empty error}">
                    <div class="alert alert-danger text-center">
                        ${error}
                    </div>
                </c:if>


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
</script>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
