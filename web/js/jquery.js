$(document).ready(function () {
    $.ajax("http://localhost:8084/AngularVsJQuery/api/members", {
        type: 'GET',
        statusCode: {
            200: function (res) {
                for (var i = 0, max = res.length; i < max; i++) {
                    $('#dataBody').append(
                            '<tr>'
                            + '<td>' + res[i].id + '</td>'
                            + '<td>' + res[i].age + '</td>'
                            + '<td>' + res[i].eyeColor + '</td>'
                            + '<td>' + res[i].name + '</td>'
                            + '<td>' + res[i].email + '</td>'
                            + '</tr>'
                            );
                }
            }
        }
    });
});