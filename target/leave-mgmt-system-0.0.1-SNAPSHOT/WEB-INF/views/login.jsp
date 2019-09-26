<jsp:include page="common/head.jsp" />
<body>
    <div class="login-form">
        <form action="login" method="post" id="login-form">
            <h2>Login</h2>
            <p class="hint-text">Please enter your Username and password.</p>
            <div class="form-group">
                <input type="email" class="form-control" name="email" placeholder="Email" required="required">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" name="password" placeholder="Password" required="required">
            </div>
            <div class="form-group">
                <label class="checkbox-inline"><input type="checkbox" required="required"> I accept the <a href="#">Terms of Use</a> &amp; <a href="#">Privacy Policy</a></label>
            </div>
            <div class="form-group">
                <button type="" class="btn btn-success btn-lg btn-block">Login Now</button>
            </div>
        </form>
        <div class="text-center">New User? <a href="fetchSignUp">Register</a></div>
    </div>
</body>
</html>