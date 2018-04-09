var source = document.getElementById("some-template").innerHTML;
var template = Handlebars.compile(source);
var data = {
    users: [
        {username: "alan", firstName: "Alan", lastName: "Johnson", email: "alan@test.com"},
        {username: "allison", firstName: "Allison", lastName: "House", email: "allison@test.com"},
        {username: "ryan", firstName: "Ryan", lastName: "Carson", email: "ryan@test.com"}
    ]
};
var result = template(data);

document.getElementById("template").innerHTML = template(data);

// $("#content-placeholder").html(template(data));