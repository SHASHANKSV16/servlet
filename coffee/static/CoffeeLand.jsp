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
            COFFEE LAND
        </div>
        <div class="card-body">
            <form method="post" action="coffeeLand">
                <div class="mb-3">
                    <label  class="form-label"> Acre</label>
                    <input type="text" class="form-control" name="acre" placeholder="">
                </div>
                <div class="mb-3">
                    <label class="form-label"> Total Plants</label>
                    <input type="number" class="form-control" name="totalPlants" placeholder="">
                </div>
                <div class="mb-3">
                    <label  class="form-label"> Expenditure</label>
                    <input type="text" class="form-control" name="expenditure" placeholder="">
                </div>
                <div class="mb-3">
                    <label  class="form-label"> Total Yeild</label>
                    <input type="text" class="form-control" name="totalYield" placeholder="">
                </div>
                <div class="mb-3">
                    <label  class="form-label"> Profit</label>
                    <input type="text" class="form-control" name="profit" placeholder="">
                </div>
                <div class="mb-3">
                    <label  class="form-label"> Fertilizer Quantity</label>
                    <input type="text" class="form-control" name="fertilizerQuantity" placeholder="">
                </div>
                <button type ="submit"> Submit </button>
            </form>


        </div>
    </div>
</div>

</body>
</html>