<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

	<%@ page isELIgnored="false" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Form</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>
<body>

	
<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card shadow p-4" style="width: 450px;">
    	
        <h2 class="text-center mb-4">Contact Form</h2>

         <form action="processform" method="post">
			
			<hr>
            <!-- Name -->
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text"
                       class="form-control"
                       id="name"
                       placeholder="Enter your name"
                       name ="name">
            </div>

            <!-- Mobile Number -->
            <div class="mb-3">
                <label for="mobile" class="form-label">Mobile Number</label>
                <input type="tel"
                       class="form-control"
                       id="mobile"
                       placeholder="Enter your mobile number"
                       name = "mob">
            </div>

            <!-- Email -->
            <div class="mb-3">
                <label for="email" class="form-label">Email Address</label>
                <input type="email"
                       class="form-control"
                       id="email"
                       placeholder="Enter your email"
                       name = "email">
            </div>

            <!-- Password -->
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password"
                       class="form-control"
                       id="password"
                       placeholder="Enter your password" 
                       name = "password">
            </div>

            <!-- Checkbox -->
            <div class="mb-3 form-check">
                <input type="checkbox"
                       class="form-check-input"
                       id="check">
                <label class="form-check-label" for="check">
                    Check me out
                </label>
            </div>

            <!-- Submit Button -->
            <button type="submit" class="btn btn-primary w-100">
                Submit
            </button>
        </form>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>