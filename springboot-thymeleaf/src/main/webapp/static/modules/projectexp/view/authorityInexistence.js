$(function () {
    /***************************************************************************************************/
    //iframe层
    $('.checkInfo').click(function () {
        var param_id = $(this).parent().parent().children('td.orderId').text();
        var url = '/prodorder/projectexp/view.do?id='+param_id;
        layer.open({
            type: 2,
            title: '直通车推广查看',
            area: ['730px', '90%'],
            btn: false,
            skin: 'layui-layer-rim', //加上边框
            content: [url, 'yes'],
            yes: function (index) {
                layer.close(index);
            }
        });
    });
});
