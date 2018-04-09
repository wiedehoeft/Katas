var questionnairePersistence = require("./QuestionnairePersistence"),
    expect = require('chai').expect;

describe("Calculate model", function () {

    it("should fill model from json file", function () {
        var result = questionnairePersistence.fillModel();
        expect(result.questions).not.to.be.undefined;
        expect(result.questions).to.have.lengthOf(2);
    });

    it("Questions should have multiple answers", function () {
        var result = questionnairePersistence.fillModel();
        expect(result.questions[0].answers).not.to.be.undefined;
        expect(result.questions[0].answers).to.have.lengthOf(3);
    });

    it("Parses correct answer to model", function () {
        var result = questionnairePersistence.fillModel();
        expect(result.questions[0].correctAnswer).not.to.be.undefined;
    });
});
