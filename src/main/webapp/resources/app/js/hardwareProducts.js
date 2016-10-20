//define namespace.
var WebPage = WebPage || {};

//define class
var HardwareController = function () {
    //this will be reference to the controller
    var controller = {};

    //  callback function for successful call with Data parameter in response;

    function onSuccess(dbData) {
        var $tableBody = $("#allProductItems");
        $tableBody.empty();
        dbData.forEach(function (value) {
            var $tableRow = $("<tr>");
            $tableRow.append($("<td>").text(value.computerName))
                .append($("<td>").text(value.computerPrice))
                .append($("<td>").text(value.computerSupplier))
                .append($("<td>").text(value.supplierAddress))
                .append($("<td>").text(value.computerCustomer));
            $tableBody.append($tableRow);
        });
    }

    function loadDBdata() {
        $.get("getOverallProductList", onSuccess);
    }

    controller.init = function () {
        loadDBdata();
    };

    return controller;
};


//Function that will executed after document loaded;

$(function () {
    //create element in namespace
    WebPage.hardwareController = HardwareController();
    //call public method
    WebPage.hardwareController.init();
});

