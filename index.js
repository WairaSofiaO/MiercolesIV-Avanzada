const express = require("express");
const path = require("path");
const app = express();

const bodyParser = require('body-parser');
const productsRouter = require('./routes/products');
const productsApiRouter = require('./routes/api/products');

app.use(bodyParser.urlencoded());
app.use(bodyParser.json());

app.use("/static", express.static(path.join(__dirname, "public")));

app.set("views", path.join(__dirname, "views"));
app.set("view engine", "pug");

// Define routes
app.use("/products", productsRouter);
app.use("/api/products", productsApiRouter);

const server = app.listen(8000, function () {
    console.log(`Listening http://localhost:${server.address().port}`);
});
