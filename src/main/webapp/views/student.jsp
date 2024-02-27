<%@page language="java" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container col-sm-4 mx-auto mt-3">
        <h1 class="text-center" >Enter Student Details</h1>
        <form action="addStudent">
            <div class="mb-3">
                <label for="sname" class="form-label"> Name </label>
                <input type="text" class="form-control" id="sname" name="sname">
            </div>
            <div class="mb-3">
                <label for="sroll" class="form-label"> Roll No </label>
                <input type="number" class="form-control" id="sroll" name="sroll">
            </div>
            <input type="submit" value="Submit" class="btn btn-primary" >
<%--            <button type="submit" class="btn btn-primary">Submit</button>--%>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
