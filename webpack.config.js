var path = require('path');

module.exports = {
    entry: './src/questionnaire/QuestionnairePersistence.js',
    output: {
        filename: 'bundle.js',
        path: path.resolve(__dirname, 'dist'),
        library: 'MyLib'
    },
    mode : 'development'
};