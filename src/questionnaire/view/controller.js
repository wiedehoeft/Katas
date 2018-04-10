var source = document.getElementById("some-template").innerHTML;
var template = Handlebars.compile(source);
var data = {
    questions: [
        {
            question: "Which of these animals is a mammal?",
            answers: ["Ant", "Bee", "Cat"]
        },
        {
            question: "What is the sum of 2+3?", answers: [
                "1", "3", "5"]
        }
    ]
};
document.getElementById("template").innerHTML = template(data);