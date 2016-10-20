//define namespace.
var WebPage = WebPage || {};

//define class
var CategoryController = function () {
    //this will be reference to the controller
    var controller = {};

    //  callback function for successful call with Data parameter in response;

    function onSuccess(dbData) {
        var $tableBody = $("#allCategoryItems");
        $tableBody.empty();
        dbData.forEach(function (value) {
            var $tableRow = $("<tr>");
            $tableRow.append($("<td>").text(value.categoryName));
            $tableBody.append($tableRow);
        });
    }

    function loadDBdata() {
        $.get("getOverallCategoryList", onSuccess);
    }

    controller.init = function () {
        loadDBdata();
    };

    return controller;
};

//Function that will executed after document loaded;

$(function () {
    //create element in namespace
    WebPage.categoryController = CategoryController();
    //call public method
    WebPage.categoryController.init();
});


