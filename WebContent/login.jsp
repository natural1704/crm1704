<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.3/themes/default/easyui.css">   
<link rel="stylesheet" type="text/css" href="js/jquery-easyui-1.4.3/themes/icon.css">   
<script type="text/javascript" src="js/jquery-easyui-1.4.3/jquery.min.js"></script>   
<script type="text/javascript" src="js/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/jquery-easyui-1.4.3/locale/easyui-lang-zh_CN.js"></script>  
</head>
<body>
<body class="easyui-layout">
		<div id="w" class="easyui-window" title="用户登录" collapsible="false"
			minimizable="false" maximizable="false" icon="icon-save"
			style="width: 450px; height: 330px; padding: 30px; background: #fafafa;"
			data-options="closable:false,draggable:false">
			<form id="formlogin" method="post">
			<!-- menulogin -->
				<div style="margin-bottom: 20px">
					<input class="easyui-textbox" id="loginname" name="usercode"
						prompt="请输入用户名" iconWidth="28" 
						data-options="label:'用户名:',required:true,iconCls:'icon-man'"
						style="width: 300px; height: 34px; padding: 10px;">
				</div>
				<div style="margin-bottom: 20px">
					<input class="easyui-textbox" type="password" id="password" name="password"
						prompt="请输入密码" iconWidth="28"
						data-options="label:'密码:',required:true,iconCls:'icon-lock'"
						style="width: 300px; height: 34px; padding: 10px">
				</div>
				<%-- <div style="margin-bottom: 20px">
					 <input class="easyui-textbox" id="icaptcha" name="captcha"
						prompt="验证码" iconWidth="28"
						data-options="label:'验证码:',required:true,missingMessage:''"
						style="width: 200px; height: 30px;">
					 <img src="${ctp }/genCaptcha"/>
				</div> --%>
			</form>
			<div style="text-align: center; padding: 5px 0">
				<a href="javascript:void(0)" id="login-submit-btn"
					class="easyui-linkbutton" style="width: 80px" 
					data-options="iconCls:'icon-ok'">登录</a>
				<a href="javascript:void(0)" class="easyui-linkbutton"
					onclick="clearForm()" style="width: 80px"
				    data-options="iconCls:'icon-cancel'">取消</a>
			</div>
		</div>
		<script>
			$(function() { 
				if("${msg }"!=""){ 
					//$.messager.alert('提示',"${msg }");
					var showmsg="${msg }";
					$.messager.show({
						title:'提示',
						msg:showmsg
					});
				}
				/*获取焦点*/
				$('#loginname').textbox('textbox').focus(); 
				/** 给登录按钮绑定点击事件  */
				$("#login-submit-btn").on("click", function() {
					/** 校验登录参数 ctrl+K */
					var loginname = $("#loginname").val();
					var password = $("#password").val();
					if($("#formlogin").form('validate')){
						var msg = ""; 
						if (!/^\w{1,20}$/.test(loginname)) {
							msg = "登录名长度必须是1~20之间";
						} else if (!/^\w{1,20}$/.test(password)) {
							msg = "密码长度必须是1~20之间";
						}
						if (msg != "") {
							$.messager.alert('用户名密码错误',msg,'info');
							return;
						}
						$("#formlogin").submit();
					}
					/*
					 * $.ajax({
						url:'menudologin',
						type='post',
						data:{usercode:loginname,password:password},
						error:function(){
							$.messager.alert('提示','请求失败!')
						},
						success:function(res){
							if(res.strresult=='OK'){
							}else{
								$.messager.alert('提示','用户名或者密码错误');
								window.location.href='userlogin.jsp';
							}
						}
					});*/
				});
				//相应输入框的回车键
				/* $('#formlogin').find('input').on('keyup',function(event){
					if(event.keyCode=='13'){
						$('#formlogin').submit();
					}
				}) */
				
				/** 按了回车键 */
				$(document).keydown(function(event) {
					if (event.keyCode == 13) {
						$("#login-submit-btn").trigger("click");
					}
				})
			})
			function clearForm() {
				$('#formlogin').form('clear');
			}
		</script>
	</body>

</body>
</html>