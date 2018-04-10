var source = document.getElementById("some-template").innerHTML;
var template = Handlebars.compile(source);
document.getElementById("template").innerHTML = template(MyLib.fillModel());