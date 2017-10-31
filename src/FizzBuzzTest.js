"use strict";

import {expect} from "chai";

class FizzBuzz {
    convertString(userInput) {
        if (userInput % 3 == 0) {
            return "Fizz";
        }
        return userInput;
    }
}

describe("We want to create a FizzBuzz-Kata TDD with modern JS", () => {

    it("Should return Fizz when digit is dividable by three", () => {
        expect(new FizzBuzz().convertString("3")).to.equal("Fizz");
    });

    it("Should return digit if it is not dividiable by three or five", () => {
        expect(new FizzBuzz().convertString("1")).to.equal("1");
    });

});