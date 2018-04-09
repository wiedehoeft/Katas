var fileHelper = require("./FileHelper"),
    expect = require('chai').expect;

describe("Functions to extract data from JSON file", function () {

    it("should return line with asterisk", function () {

        var data = {
            answers: [
                "1",
                "*5",
                "42"
            ]
        };

        var result = fileHelper.extractLineWith(data, "*");

        expect(result).to.be.equal("*5");
    });
});
