var calculator = require("./Calculator"),
    expect = require('chai').expect;

describe("Calculate model", function () {

    it("should calculate percentage score", function () {
        var result = calculator.calcPercentage(20, 10);
        expect(result).equal("50%");

    });

    it("should only calculate whole numbers and round rest", function () {
        var result = calculator.calcPercentage(30, 10);
        expect(result).equal("33%");
    });
});