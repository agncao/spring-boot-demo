$(function () {
    /***************************************************************************************************/
    //iframe层
    $(".checkInfo").click(function () {
        var param_id = $(this).parent().parent().children("td.orderId").text();
        var url = "/prodorder/purchaserexp/view.do?id="+param_id;
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
            },
        });
    });
});
