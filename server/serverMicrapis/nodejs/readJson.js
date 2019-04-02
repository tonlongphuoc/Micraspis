const fs = require('fs');

exports.ReadFile = function () {
    var content = '';
   content = fs.readFileSync('sickInfo.json', (err, data) => {
        if (err) throw err;
        let infor = JSON.parse(data);
    })
    return JSON.parse(content);
};
