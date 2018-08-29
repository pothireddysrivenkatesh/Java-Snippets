const express = require('express');
const app = express();
var MongoClient = require('mongodb').MongoClient;
var url = "mongodb://localhost:27017/";

app.post('/login',(req,res,next)=>{
   var usr = req.query.username;
   var psd = req.query.password;
   var msg ="";
   MongoClient.connect(url, function(err, db) {
    if (err) throw err;
    var dbo = db.db("local");
    var query = { username: usr ,password:psd};
    dbo.collection("users").find(query).toArray(function(err, result) {
      if (err) throw err;
      console.log(result);
      if(result.length==0){
         res.send("User Doesnt Exist please register by using /register link");
      }
      else{
          res.send("Sucecess");
      }

      db.close();
    });
  });
});
app.post('/register',(req,res,next)=>{
    var usr = req.query.username;
    var psd = req.query.password;
    var msg ="";
    MongoClient.connect(url, function(err, db) {
        if (err) throw err;
        var dbo = db.db("local");
        var myobj = { username: usr, password: psd};
        dbo.collection("users").insertOne(myobj, function(err, res) {
          if (err) throw err;
          res.send("User Created Successfully");
          db.close();
        });
      });
   });
app.get('/getAllUsers',(req,res,next)=>{
    MongoClient.connect(url, function(err, db) {
        if (err) throw err;
        var dbo = db.db("local");
        dbo.collection("users").find({}).toArray(function(err, result) {
          if (err) throw err;
          res.send(result);
          db.close();
        });
      });
});
app.get('/getUser',(req,res,next)=>{
    res.send('getUser Page');
});
app.put('/UpdateUser',(req,res,next)=>{
    res.send('UpdateUser Page');
});


app.listen(3000);