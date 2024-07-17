<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<meta name="viewport" content="width=device-width,initial-scale=1.0">
<link rel="stylesheet" href="css/index.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<div class="container-fluid">
		<div class="container   shadow p-3 mb-5 bg-body rounded">
			<h2 class="form-title">----Student Entry Form----</h2>
			<div class="registration-form">
				<form action="./register" method="post">

					<div class="form-group  col-sm-4 offset-sm-1">
						<div class="row">
							<input type="text" name="name" id="name" placeholder="Your Name" />
						</div>
					</div>
					<div class="form-group  col-sm-4 offset-sm-1">
						<div class="row">
							<input type="email" name="email" id="email"
								placeholder="Your Email" />
						</div>
					</div>
					<div class="form-group  col-sm-4 offset-sm-1">
						<div class="row">

							<input type="password" name="pass" id="pass"
								placeholder="Password" />
						</div>
					</div>
					<div class="form-group  col-sm-4 offset-sm-1">
						<div class="row">
							<input type="password" name="re_pass" id="re_pass"
								placeholder="Repeat your password" />
						</div>
					</div>
					<div class="form-group col-sm-4 offset-sm-1">
						<div class="row">
							<input type="text" name="contact" id="contact"
								placeholder="Contact no" />
						</div>
					</div>
					<div class="form-group">
						<div class="row">
							<input type="checkbox" name="agree-term" id="agree-term"
								class="offset-sm-3"><span class=" mt-4 "
								style="margin-left: 110px">I agree all statements in <a
								href="#" class="term-service">Terms of service</a>
							</span>
						</div>
					</div>
					<div class="form-group col-sm-3 offset-sm-2">
						<div class="row">
							<input type="submit" name="register" id="register"
								class="form-submit btn btn-primary" value="Submit" />
						</div>
					</div>
				</form>
				<div class="signup-image position-realtiove offset-sm-6">
					<figure>
						<img src="images/image.png" alt="sign-up image"
							class="position-absolute top-0">
					</figure>
					<a href="./viewDetails"
						class="signup-image-link position-absolute top-0">I am already
						member</a>
				</div>

			</div>
			
		</div>
	</div>
	

</body>
</html>