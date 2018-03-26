

var initialize = function(){
    $("#doLogin").on('click', function(){
        var userCode = $("#userName").val();
        if(userCode == ""){
            $("#userName").css('borderColor','red');
            $("#userName").focus();
            return false;
        }

        var password = $("#password").val();
        if(password == ""){
            $("#password").css('borderColor','red');
            $("#password").focus();
            return false;
        }
    });
}

$(function () {
    new initialize();
});