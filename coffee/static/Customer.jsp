<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">

        <a class="navbar-brand" href="#">Coffee App</a>

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
            CUSTOMER DETAILS
        </div>
        <div class="card-body">

            <form method="post" action="customer">

                <div class="mb-3">
                    <label class="form-label">Customer Name</label>
                    <input type="text" name="name" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">Mobile Number</label>
                    <input type="text" name="mobile" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">Coffee Flavour</label>
                    <input type="text" name="flavour" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">Quantity</label>
                    <input type="number" name="quantity" class="form-control">
                </div>

                <div class="mb-3">
                    <label class="form-label">Payment Mode</label>
                    <input type="text" name="payment" class="form-control" placeholder="UPI / Cash / Card">
                </div>

                <button type="submit" class="btn btn-primary w-100">Submit</button>
            </form>

        </div>
    </div>
</div>

</body>
</html>
