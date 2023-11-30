function memberList(){
    $.ajax({
        type: "GET",
        url: '/user/list',

    }).done(function(response) {

		console.log(response)
        $('#tarea').text(JSON.stringify(response));
    }).fail(function(error) {
        alert("!/js/user.js에서 에러발생: " + error.statusText);
    });
}

function memberInsert(){
    var id = document.getElementById("id")
    var passwd = document.getElementById("passwd")
    var email = document.getElementById("email")


    var userinfo = {
        "username": id.value,
        "passwd": passwd.value,
        "email": email.value
    }

    $.ajax({
        type: "POST",
        url: '/user',
        data: JSON.stringify(userinfo),
        contentType: "application/json; charset=utf-8"
    }).done(function(response) {

        $('#marea').text(response);
    }).fail(function(error) {
        alert("!/js/user.js에서 에러발생: " + error.statusText);
    });
}