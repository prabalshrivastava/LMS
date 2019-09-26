<jsp:include page="common/head.jsp" />
<body>
    <div class="signup-form">
        <form action="" method="post" id="register-form">
            <h2>Register</h2>
            <div class="form-group">
                <input type="text" class="form-control" name="name" placeholder="Name" required>
            </div>
            <div class="form-group">
                <input type="email" class="form-control" name="email" placeholder="Email" required>
            </div>
            <div class="form-group">
                <input type="tel" class="form-control" name="mobile" placeholder="Mobile No" required>
            </div>
            <div class="form-group">
                <input type="date" class="form-control" name="dob" placeholder="Date Of Birth" required>
            </div>
            <div class="form-group">
                <select class="form-control" name="team" placeholder="Select Team">
                    <option disabled selected>Select Team</option>
                    <option>Java</option>
                    <option>Full Stack</option>
                    <option>Sales</option>
                </select>
            </div>
            <div class="form-group">
                <input type="password" class="form-control" name="password" placeholder="Password" required>
            </div>
            <div class="form-group">
                <input type="password" class="form-control" name="confirmPassword" placeholder="Confirm Password" required>
            </div>
            <div class="form-group">
                <label class="checkbox-inline"><input type="checkbox"> I accept the <a href="#">Terms of Use</a> &amp; <a href="#">Privacy Policy</a></label>
            </div>
            <div class="form-group">
                <button type="" class="btn btn-success btn-lg btn-block">Register Now</button>
            </div>
        </form>
        <div class="text-center">Already have an account? <a href="/">Sign in</a></div>
    </div>
</body>
</html>