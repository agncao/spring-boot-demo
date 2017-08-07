/**
 * 扩展jquery: from to json
 */
(function($){
    $.fn.serializeJson=function(){
        var serializeObj={};
        var array=this.serializeArray();
        $(array).each(function(){
            if(serializeObj[this.name]){
                if($.isArray(serializeObj[this.name])){
                    serializeObj[this.name].push(this.value);
                }else{
                    serializeObj[this.name]=[serializeObj[this.name],this.value];
                }
            }else{
                serializeObj[this.name]=this.value;
            }
        });
        return serializeObj;
    };
})(jQuery);

/**
 * 扩展 String 将html 的内容 转了原生字符
 */
String.prototype.stripHtml=function() {
    // remove html tags and space chars
    return this.replace(/<.[^<>]*?>/g, ' ').replace(/&nbsp;|&#160;/gi, ' ')
        // remove punctuation
        .replace(/[.(),;:!?%#$'"_+=\/\-]*/g,'');
}

/**
 * 清除数组 的元素
 * @param elem
 * @returns {Array}
 */
Array.prototype.remove = function(elem) {
    var size=this.length;
    for(var i=0;i<size;i++){
        if(this[i]==elem){
            this.splice(i,1)
        }
    }
}

/**
 * 判断元素是否存在
 * @param elem
 * @returns {*|boolean}
 */
Array.prototype.contains = function(elem){
    return $.inArray(elem, this)!=-1 ;
};