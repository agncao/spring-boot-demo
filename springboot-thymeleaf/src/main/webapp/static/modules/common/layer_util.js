/**
 * 刷新 列表  交互 样式
 * @param msg
 */
function flushList(msg,target){
    msg=msg||'正在刷新列表...';
    if(target){
        //layer.getChildFrame(target).msg(msg, {icon: 16,shade: [0.1, '#f5f5f5'],scrollbar: false,offset: '200px', time:100000}) ;
        return target.layer.msg(msg, {icon: 16,shade: [0.5, '#f5f5f5'],scrollbar: false,offset: '200px', time:100000}) ;

    }else{
        return layer.msg(msg, {icon: 16,shade: [0.5, '#f5f5f5'],scrollbar: false,offset: '200px', time:100000}) ;
    }
}

/**
 * 基于layer的Ajax交互封装
 * @param options
 */
function ajaxLayer(options){
    options = $.extend(true, {}, {
        beforeSend: function () {
            this.loadIndex = layer.load(1, {
                shade: [0.5,'#f5f5f5'] //0.5透明度的白色背景
            });
        },
        error:function(){
            alertl("操作异常,请稍后再试！");
        },
        complete:function(){
            layer.close(this.loadIndex)
        }
    },options);
    $.ajax(options);
}

/**
 * 扩展的form 表单AJAX提交
 */
$.fn.extend({
    ajaxLayerForm: function(options) {
        options = $.extend(true, {}, {
            beforeSend: function () {
                this.loadIndex = layer.msg(options.loadMsg?options.loadMsg:"正在处理中。。。", {icon: 16,shade: [0.5, '#f5f5f5'],scrollbar: false,offset: '200px', time:100000});
            },
            error:function(){
                alertl("处理异常,请稍后再试！");
            },
            complete:function(){
                layer.close(this.loadIndex)
            }
        },options);
        $(this).ajaxSubmit(options);
    },

});

/**
 * 基于layer 警告对话框
 * @param msg
 */
function alertl(msg){
    msg=msg||"操作失败"
    top.layer.alert(msg,{
        icon: 5,
        time: 4000 //1.5s后自动关闭
    })
}
/**
 * 交互成功 提示   大部分操作在 操作成功 后会进行 跳转 故将提示改在 最上层 正上方 位置 晃动 提示
 * @param msg
 */
function showSuc(msg){
    msg=msg||"操作成功"
    layer.msg(msg,{
        offset: 0,
        shift: 6,
        icon: 6,
        time: 4000 //2.5s后自动关闭
    })
}

/**
 * 统一 图片预览
 * @param imageUrl  图片的url路径
 * @param title     弹出窗的标题 默认:图片查看
 * @param shadeEnable 是否摭罩   默认:false
 */
function showImage(imageUrl,title,shadeEnable){
    layer.open({
        type: 2,
        title: title?title:"图片查看",
        shadeClose: true,
        shade: shadeEnable?[0.5,'#f5f5f5']:false,
        maxmin: true, //开启最大化最小化按钮
        area: ['550px',"470px"],
        content: [ctxStatic+"/modules/common/image_show.html?v="+jsVersion,"no"],
        success: function(layero, index){
            var iframeWin = window[layero.find('iframe')[0]['name']]; //得到iframe页的窗口对象，执行iframe页的方法：iframeWin.method();

            $("input",iframeWin.document).hide();//隐藏操作按钮
            var loadImageIndex=iframeWin.flushList("图片正在加载中...")
            layer.getChildFrame('#focusphoto', index).attr("src",imageUrl)
                .load(
                    function(){
                        // 加载完成事件
                        layer.iframeAuto(index);
                        $(this).show();
                        $("input",iframeWin.document).show();
                        iframeWin.PhotoSize.init();
                        iframeWin.layer.close(loadImageIndex);
                    }
                ).error(
                function(){
                    //加载失败事件
                    $(this).hide();
                    iframeWin.layer.close(loadImageIndex);
                    iframeWin.layer.msg('图片加载失败!', {
                        offset: 0,
                        shift: 6
                    });
                }
            );;
        }
    });
}

/**
 * 判断文件名是否在 支持的文件列表中
 * @param fileName 文件名
 * @param suppotFiles 支持的文件扩展名
 * @returns {boolean}
 */
function fileSuppot(fileName,suppotFiles){
    if(fileName!=null && fileName !=""&&suppotFiles!=null && suppotFiles !=""){
        //lastIndexOf如果没有搜索到则返回为-1
        if (fileName.lastIndexOf(".")!=-1) {
            var fileType = (fileName.substring(fileName.lastIndexOf(".")+1,fileName.length)).toLowerCase();
            var suppotFiles = typeof file == "string" ? [suppotFiles] : suppotFiles;
            for (var i =0;i<suppotFiles.length;i++) {
                if (suppotFiles[i]==fileType) {
                    return true;
                } else{
                    continue;
                }
            }
            return false;
        } else{
            return false;
        }
    }
}

/**
 * 是否支持excle
 * @param fileName
 * @returns {boolean}
 */
function fileSuppotExcle(fileName){
    return fileSuppot(fileName,["xlsx","xls"])
}
