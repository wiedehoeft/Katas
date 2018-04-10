var questions = require("./Questions");
var fileHelper = require("./FileHelper");

function fillModel() {
    var questionnaire = Object.create(Questionnaire);
    questionnaire = JSON.parse('{\n' +
        '  "questions": [\n' +
        '    {\n' +
        '      "Question": "?Which of these animals is a mammal",\n' +
        '      "answers": [\n' +
        '        "Ant",\n' +
        '        "Bee",\n' +
        '        "*Cat"\n' +
        '      ]\n' +
        '    },\n' +
        '    {\n' +
        '      "Question": "?What is the sum of 2+3",\n' +
        '      "answers": [\n' +
        '        "2",\n' +
        '        "*5",\n' +
        '        "6"\n' +
        '      ]\n' +
        '    }\n' +
        '  ]\n' +
        '}');

    questionnaire.questions.forEach(function (data) {
        data.correctAnswer = fileHelper.extractLineWith(data, "*");
    });

    return questionnaire;
}

var Questionnaire = {
    questions: Question
};

var Question = {
    answers: undefined,
    correctAnswer: undefined
};

module.exports = {
    fillModel: fillModel
};

