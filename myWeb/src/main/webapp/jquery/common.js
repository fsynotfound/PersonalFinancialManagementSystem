//全选与全不选:标题行checkbox控制数据行所有的checkbox的选中状态
function fun1(){
    //1.获得标题行checkox的checkted
    var flag = $(":checkbox:first").prop("checked");
    //2.获得所有标题行checkbox,并自动赋值
    $(":checkbox:gt(0)").prop("checked",flag);
}

//全选与全不选:通过数据行控制标题行checkbox
function fun2(){
    //1.获得数据行被选中的checkbox的个数
   var checkedNum =   $(":checkbox:gt(0):checked").length;
    //2.获得数据行所有checkbox的个数
   var ckNum =  $(":checkbox:gt(0)").length;
   //3.判断
    if(checkedNum ==ckNum){
        $(":checkbox:first").prop("checked",true);
    }else{
        $(":checkbox:first").prop("checked",false);
    }
}

//将鼠标悬停的数据行的背景颜色设置为绿色，this表示目标所悬停的对象
function fun3(){
    $(this).css("backgroundColor","green");
}
//将鼠离开的数据行的背景颜色设置为白色
function fun4(){
    $(this).css("backgroundColor","white");
}