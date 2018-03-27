// $.post("verificationCode",
//     function (result) {
//         if (result) {
//
//
//         }
// });

var initialize = function () {
    $("#doLogin").on('click', function () {
        var userCode = $("#userName").val();
        if (userCode == "") {
            $("#userName").css('borderColor', 'red');
            $("#userName").focus();
            return false;
        }

        var password = $("#password").val();
        if (password == "") {
            $("#password").css('borderColor', 'red');
            $("#password").focus();
            return false;
        }
        var param = {};
        param['userCode'] = userCode;
        param['password'] = password;
        $.ajax({
            type : "POST",
            url : "/login",
            data : param,
            dataType : "json",
            success : function(data) {
                if (data.result == "1") {
                    window.location.href ="/learn";
                } else {
                    alert("！");
                }
            }
        });

    });

}

$(function () {
    new initialize();
});