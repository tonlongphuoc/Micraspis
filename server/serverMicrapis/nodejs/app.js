const express = require('express');
const app = express();
const port = 3000;
const getInfo = require('./readJson.js');

app.use(function (req, res, next) {
    var data = '';
    req.setEncoding('utf8');
    req.on('data', function (chunk) {
        data += chunk;
    });

    req.on('end', function () {
        req.body = data;
        next();
    });
});

app.get('/', (req, res) => {
    var temp = req.query.temp;
    console.log(temp);
    var array = getInfo.ReadFile().Status;
    var result = "";
    for (var index in array) {
        if (temp >= array[index].Min && temp <= array[index].Max){
            result = array[index].Action;
            break;
        }
    }
    if (result == "") {
        res.status(400).send("Invalid value");
    }
    else { 
        console.log(result);
        res.send(result);
    }
})

app.post('/', function (req, res) {
    var temp = parseInt(req.body);
    var array = getInfo.ReadFile().Status;
    var result = "";
    for (var index in array) {
        if (temp >= array[index].Min && temp <= array[index].Max){
            result = array[index].Action;
            break;
        }
    }
    if (result == "") {
        res.status(400).send("Invalid value");
    }
    else { 
        res.send(result);
    }
})
app.listen(port, () => console.log(`Example app listening on port ${port}!`))
