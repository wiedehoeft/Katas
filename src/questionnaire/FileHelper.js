exports.extractLineWith = function (data, sign) {
    return data.answers.filter(function (value) {
        return value.startsWith(sign)
    })[0];
};