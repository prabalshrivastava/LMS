var ruleObj = {
    // Specify validation rules
    rules: {
        // The key name on the left side is the name attribute
        // of an input field. Validation rules are defined
        // on the right side
        name: "required",
        email: {
            required: true,
            // Specify that email should be validated
            // by the built-in "email" rule
            email: true
        },
        mobile: "required",
        dob: "required",
        team: "required",
        password: {
            required: true,
            minlength: 8
        },
        confirmPassword: {
            equalTo:"#password"
        }
    },
    // Specify validation error messages
    messages: {
        name: "Please enter your name",
        email: "Please enter a valid email address",
        mobile: "Please enter your mobile",
        dob: "Please enter your Date of Birth",
        team: "Please Select your Team",
        password: {
            required: "Please provide a password",
            minlength: "Your password must be at least 8 characters long"
        },
        confirmPassword: {
            equalTo: "Please Enter the same password as above"
        }
    },
    // Make sure the form is submitted to the destination defined
    // in the "action" attribute of the form when valid
    submitHandler: function(form) {
        console.log("inside submitHandler");
        form.submit();
    },
    errorPlacement: function(label, element) {
        label.addClass('arrow');
        label.insertAfter(element);
    },
    wrapper: 'span'
};
