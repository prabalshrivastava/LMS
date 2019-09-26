$(function () {
    $(".datepicker").datepicker();
    $("#register-form").validate(ruleObj);
    $("#login-form").validate(ruleObj);
    $("#applyLeave-form").validate(ruleObj);
});
