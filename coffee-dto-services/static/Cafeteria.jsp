<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Cafeteria</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style="
    background-image: url('https://plus.unsplash.com/premium_photo-1675237625862-d982e7f44696?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D');
    background-size: cover;">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">

        <a class="navbar-brand" href="index.jsp">Coffee App</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">

                <li class="nav-item">
                    <a class="nav-link" href="Coffee.jsp">Coffee</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="CoffeeLand.jsp">Coffee Land</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="Cafeteria.jsp">Cafeteria</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="Customer.jsp">Customer</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="CustomerFeedBack.jsp">Customer Feedback</a>
                </li>

            </ul>
        </div>

    </div>
</nav>

<div class="d-flex justify-content-center mt-5">
    <div class="card" style="width: 25rem">
        <div class="card-header">
            CAFETERIA
        </div>
        <div class="card-body">

            <form method="post" action="cafeteria">

                <div class="mb-3">
                    <label class="form-label">Cafeteria Name</label>
                    <input type="text" name="name" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">Location</label>
                    <input type="text" name="location" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">Type</label>
                    <input type="text" name="type" class="form-control" placeholder="Veg / Non-Veg ">
                </div>

                <div class="mb-3">
                    <label class="form-label">Price</label>
                    <input type="number" name="price" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">Franchise Name</label>
                    <input type="text" name="franchise" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">Owner Name</label>
                    <input type="text" name="owner" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">GST Number</label>
                    <input type="text" name="gst" class="form-control">
                </div>

                <button type="submit" class="btn btn-primary w-100">Submit</button>
            </form>

        </div>
    </div>
</div>

</body>
</html>
