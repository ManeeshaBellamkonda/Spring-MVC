<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
    src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script
    src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
    src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script
    src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
    integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
    crossorigin="anonymous"></script>
<style>
.container {
    max-width: 800px;
    border-radius: 10px;
    padding: 30px 50px
}

body {
    background-size: 100% 100%;
    background-color: azure;
}

a {
    color: yellow;
    font-size: 30px
}

 

@media only screen and (max-width: 600px) {
    body {
        background-image: url("/resources/enfield.jpg");
    }
}
</style>
</head>
<body>
    <div class="container">
        <div class="row" style="padding-top: 50px">
            <div class="col-md-3"></div>
            <div class="col-md-6">
                <h2 style="text-align: center; color: black">CUSTOMER DETAILS</h2>
                <form action="/customer" method="post" name="registration">
                    <div class="form-group">
                        <label for="fullName">Full Name</label> <input type="text"
                            class="form-control" id="fullName"
                            placeholder="Enter Full Name" name="fullName">
                    </div>
                    <div class="form-group">
                        <label for="age">Age</label> <input type="number"
                            class="form-control" id="age" placeholder="Enter Age" name="age">
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                    <a href="/" class="btn btn-primary" role="button">GoBack</a>
                </form>
            </div>
        </div>
    </div>
    <script>
        $.validator.addMethod("alphabetsnspace", function(value, element) {
            return this.optional(element) || /^[a-zA-Z ]*$/.test(value);
        }, "Invalid Name!!!");
        $('form').validate({
            rules : {
                fullName : {
                    required : true,
                    alphabetsnspace : true
                },
                age : {
                    required : true,
                    range : [ 18, 80 ]
                }
            }
        });
    </script>
</body>
</html>