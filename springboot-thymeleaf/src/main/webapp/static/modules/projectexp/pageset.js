$(function () {
    //初始化分页信息
    $(".paginationPage").createPage({
        pageCount: $("#pageCount").val(),
        current: $("#pageNum").val(),
        backFn: function (currentPage) {
            //点击页数触发事件
            page(currentPage, $("#pageSize").val());
        }
    });
    //设置当前页数 与 每页条数的失去焦点功能
    $("#setPageNum").change(function () {
        var pageNum = $(this).val();
        //点击页数触发事件
        page(pageNum, $("#pageSize").val());
    });
    $("#setPageSize").change(function(){
        var pageSize = $(this).val();
        page(1,pageSize);
    });
});

function page(n,s) {
    if (n) $("#pageNum").val(n);
    if (s) $("#pageSize").val(s);
    $("#searchForm").submit();
    return false;
}