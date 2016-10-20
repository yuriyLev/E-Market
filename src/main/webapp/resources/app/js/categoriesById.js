//define namespace.
var WebPage = WebPage || {};

//define class
var CategoryController = function () {
    var initObj = {};

    //  callback function for successful call with Data parameter in response;
    function HardwareTableOnSuccess(data) {
        var $tableBody = $("#allProductItemsByCategoryId");
        $tableBody.empty();
        data.forEach(function (value) {
            var $tableRow = $("<tr>");
            $tableRow.append($("<td>").text(value.computerName))
                .append($("<td>").text(value.computerPrice))
                .append($("<td>").text(value.computerSupplier))
                .append($("<td>").text(value.supplierAddress))
                .append($("<td>").text(value.computerCustomer));
            $tableBody.append($tableRow);
        });
    }

    function loadHardwareItemsByCategory(categoryId) {
        $.get('getProductListByCategoryId', {categoryId: categoryId}, HardwareTableOnSuccess)
    }

    function tableHandlerOnSuccess() {
        var $tableBody = $("#allCategoryItems");
        $tableBody.find("[data-category-id]").on('click', function (event) {
            event.preventDefault();
            event.stopPropagation();
            var categoryId = $(this).data('category-id');
            loadHardwareItemsByCategory(categoryId);
        });
    }

    function DataLoadOnSuccess(data) {
        var $tableBody = $("#allCategoryItems");
        $tableBody.empty();
        data.forEach(function (value) {
            var $tableRow = $("<tr>");
            $tableRow.append($("<td>").attr('data-category-id', value.categoryId).text(value.categoryName));
            $tableBody.append($tableRow);
        });
        tableHandlerOnSuccess();
    }

    function DataLoad() {
        $.get("getOverallCategoryList", DataLoadOnSuccess);
    }

    initObj.init = function () {
        DataLoad();
    };

    return initObj;
};

//Function that will executed after document loaded;
$(function () {
    //create element in namespace
    WebPage.categoryController = CategoryController();
    //call public method
    WebPage.categoryController.init();
});
