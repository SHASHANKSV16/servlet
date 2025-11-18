<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
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
    <div class="card " style="width : 25rem">
        <div class="card-header">
            COFFEE
        </div>
        <div class="card-body">
            <form method="post" action="coffee">
                <div class="mb-3">
                    <label  class="form-label"> Coffee Type</label>
                    <input type="text" class="form-control" name="type" placeholder="Enter Type">
                </div>
                <div class="mb-3">
                    <label class="form-label"> Coffee Price</label>
                    <input type="text" class="form-control" name="price" placeholder="Enter Price">
                </div>
                <div class="mb-3">
                    <label  class="form-label"> Quantity</label>
                    <input type="number" class="form-control" name="qty" placeholder="Enter Quantity">
                </div>
                <div class="mb-3">
                    <label  class="form-label"> Farmer</label>
                    <input type="text" class="form-control" name="farmer" placeholder="Enter Farmer">
                </div>
                <div class="mb-3">
                    <label  class="form-label"> Location</label>
                    <input type="text" class="form-control" name="loc" placeholder="Enter Location">
                </div>
                <button type ="submit"> Submit </button>
            </form>


        </div>
    </div>
</div>

</body>
</html>