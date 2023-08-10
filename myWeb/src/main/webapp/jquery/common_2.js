
$(function (){

    $(":radio").click(function (){

         var value = $(this).val();
         if(value ==1){
             fun1()
         }else{
            fun2()
         }
    })
})

//1.AJAX 获得所有的消费类型

function fun1(){
    var param={
                "url":"/myWeb/consumption/ajax.do",
                "method":"get",
                "dataType":"json",
                 "success":function (comsumptionList){
                     //1.消费类型下拉列表内容清空
                     $("#consumptionId").empty();
                     //2.将消费类型信息作为option标签填充到消费类型下拉列表
                     for(var i=0;i<comsumptionList.length;i++){
                          var  obj = comsumptionList[i];
                          var $option =$("<option></option>");
                          $option.val(obj.id);
                          $option.text(obj.typeName);
                         $("#consumptionId").append($option);
                     }
                     $("tr:eq(1)").show();
                     $("tr:eq(2)").hide();
                     $("td:eq(6)").text("商家")
                  }
              };
    $.ajax(param);
}

//2.AJAX 获得所有的收入类型

function fun2(){
    var param={
        "url":"/myWeb/income/ajax.do",
        "method":"get",
        "dataType":"json",
        "success":function (comsumptionList){
            //1.消费类型下拉列表内容清空
            $("#incomeId").empty();
            //2.将消费类型信息作为option标签填充到消费类型下拉列表
            for(var i=0;i<comsumptionList.length;i++){
                var  obj = comsumptionList[i];
                var $option =$("<option></option>");
                $option.val(obj.id);
                $option.text(obj.name);
                $("#incomeId").append($option);
            }
            $("tr:eq(1)").hide();
            $("tr:eq(2)").show();
            $("td:eq(6)").text("收入来源")
        }
    };
    $.ajax(param);
}