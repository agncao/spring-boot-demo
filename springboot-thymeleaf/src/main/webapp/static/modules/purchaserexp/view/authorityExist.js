$(function () {

    /***************************************************************************************************/
    //有权限 详情弹窗
    $(".checkInfo").click(function () {
        var param_id = $(this).parent().parent().children("td.orderId").text();
        var url = "/prodorder/purchaserexp/view.do?id=" + param_id;

        var orderStatusInfo = $(this).parent().parent().children().eq(3).children("span.orderStatusInfo").text();
        if (orderStatusInfo == 5) {
            //iframe层
            layer.open({
                type: 2,
                title: "直通车查看",
                area: ['730px', '90%'],
                btn: ['关停产品', '取消'],
                skin: 'layui-layer-rim', //加上边框
                content: [url, 'yes'],
                yes: function (index) {
                    //确定按钮，事件
                    doDialog(param_id);
                },
                btn2: function (index) {
                    //取消按钮事件
                    layer.close(index);
                },
            });
        } else {
            //iframe层
            layer.open({
                type: 2,
                title: "直通车查看",
                area: ['730px', '90%'],
                btn: ['取消'],
                skin: 'layui-layer-rim', //加上边框
                content: [url, 'yes'],
                yes: function (index) {
                    //取消按钮事件
                    layer.close(index);
                }
            });
        }
    });
});


function doDialog(param_id) {
    layer.open({
        type: 1,
        title: "直通车关停",
        closeBtn: 1,
        btn: ['确定'],
        shade: [0.5, '#f5f5f5'],
        area: ['350px'],
        shift: 1,
        yes: function (index) {
            //确定按钮，事件
            ajaxLayer
            ({
                url: "/prodorder/purchaserexp/stop.do",
                dataType: "json",
                type: "post",
                data: {id: param_id},
                success: function (res) {
                    layer.close(index);
                    if (res.success == true) {
                        showSuc(res.message);
                    } else {
                        alertl(res.message);
                    }
                    window.setTimeout(function () {
                        window.location = "/prodorder/purchaserexp/activeList.do";
                        flushList();
                    }, 1000);
                }
            });
        },
        btn2: function (index) {
            //取消按钮事件
            layer.close(index);
        },
        content: $("#stopProduct")
    });
}

