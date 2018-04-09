exports.calcPercentage = function (all, part) {
    var percentage = part / all * 100;
    return Math.round(percentage) + "%";
};
