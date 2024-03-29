<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>企业人事管理平台</title>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
        <link rel="stylesheet" href="css/colorpicker.css" />
        <link rel="stylesheet" href="css/datepicker.css" />
		<link rel="stylesheet" href="css/uniform.css" />	
		<link rel="stylesheet" href="css/unicorn.main.css" />
		<link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />	          
		<script src="js/jquery.min.js"></script>
       	<script src="js/jquery.ui.custom.js"></script>
       	<script src="js/bootstrap.min.js"></script>
       	<script src="js/bootstrap-colorpicker.js"></script>
       	<script src="js/bootstrap-datepicker.js"></script>
       	<script src="js/jquery.uniform.js"></script>
       	<script src="js/unicorn.js"></script>
		<script type="text/javascript" language="javascript">
			$(document).ready(function(){
				$('input[type=checkbox],input[type=radio],input[type=file]').uniform();
				$('.datepicker').datepicker();
			});
		</script>
	</head>	
	<body>
		<div id="header"><h1></h1></div>
		<div id="user-nav" class="navbar navbar-inverse">
            <ul class="nav btn-group">
                <li class="btn btn-inverse">
                    <a href="#">
                        <i class="icon icon-user"></i>
                        <span class="text">
                            张三
                        </span>
                    </a>
                </li>
                <li class="btn btn-inverse">
                    <a href="login.jsp">
                        <i class="icon icon-share-alt"></i>
                        <span class="text">注销</span>
                    </a>
                </li>
            </ul>
        </div>
        <div id="sidebar">
            <ul>
                <li>
                    <a href="main.jsp">
                        <i class="icon icon-home"></i> 
                        <span>首页</span>
                    </a>
                </li>
                <li>
                    <a href="empinfo.jsp">
                        <i class="icon icon-tag"></i> 
                        <span>查看个人信息</span>
                    </a>
                </li>
                <li>
                    <a href="changepassword.jsp">
                        <i class="icon icon-ok-circle"></i> 
                        <span>修改登录密码</span>
                    </a>
                </li>
                
                <li>
                    <a href="emplist.jsp">
                        <i class="icon icon-user"></i> 
                        <span>员工信息管理</span> 
                    </a>
                </li>
                <li class="active">
                    <a href="deptlist.jsp">
                        <i class="icon icon-flag"></i> 
                        <span>部门信息管理</span> 
                    </a>
                </li>
                <li>
                    <a href="joblist.jsp">
                        <i class="icon icon-briefcase"></i> 
                        <span>职位信息管理</span> 
                    </a>
                </li>
            </ul>
        </div>
        
		<div id="content">
			<div id="content-header">
				<h1>部门信息管理</h1>
			</div>
			<div id="breadcrumb">
				<a href="main.jsp" class="tip-bottom">
                	<i class="icon-home"></i>
                                                    首页
                </a>
				<a href="#" class="current">部门信息管理</a>
			</div>
			<form action="#" method="post" name="searchForm">
			<input type="hidden" name="pagenum" id="pagenum"/>
			<div class="container-fluid">
				<div class="row-fluid">
					<div class="control-group">
						<span class="span3">
							名称：<input id="ename" name="ename" type="text" style="width:65%"/>
						</span>
						<span class="span3">
							状态：<select id="eflag" name="eflag" style="width:70%">
									<option value="-1">=请选择=</option>
									<option value="1">活动</option>
                                    <option value="2">撤销</option>
								</select>
						</span>
                        <span class="span3">
							<button class="btn btn-info" onclick="submitForm(1);">
								<i class="icon-white icon-search"></i>
								查询
							</button>
							<button type="button" class="btn btn-info" onclick="resetForm();">
								<i class="icon-white icon-repeat"></i>
								重置
							</button>
						</span>
					</div>
				</div>
			</div>
			</form>
			<hr/>
			<div class="row-fluid">
				<div class="span12" style="padding-left:30px;">
					<button class="btn btn-info" onclick="addDept();">
						<i class="icon-white icon-plus"></i>
						新增
					</button>
					<script type="text/javascript">
						function addDept(){
							location.href="addDept.jsp";
						}
					</script>
				</div>
				<div class="span12">
					<div class="widget-box">
						<div class="widget-content nopadding">
							<table class="table table-bordered table-striped">
								<thead>
									<tr>
										<th>编号</th>
										<th>部门名称</th>
										<th>负责人姓名</th>
										<th>部门编制</th>
										<th>状态</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
                                    <tr>
                                        <td>101</td>
                                        <td>研发一部</td>
                                        <td>李建国</td>
                                        <td>50</td>
                                        <td>活动</td>
                                        <td>
                                            <button class="btn btn-info" onclick="allmessage()">
                                                <i class="icon-white icon-eye-open"></i>
                                                查看
                                            </button>
                                            <button class="btn btn-warning" onclick="gotomodify()">
                                                <i class="icon-white icon-refresh"></i>
                                                修改
                                            </button>
                                            
                                            <script type="text/javascript">
											  function allmessage(){
                                                   location.href="viewdeptinfo.jsp";
                                               }
                                              function gotomodify(){
                                                  location.href="modifydept.jsp";
                                              }
                                            </script>
                                            <button class="btn btn-danger">
                                                <i class="icon-white icon-minus"></i>
                                                撤销
                                            </button>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>102</td>
                                        <td>研发二部</td>
                                        <td>王五六</td>
                                        <td>40</td>
                                        <td>撤销</td>
                                        <td>
                                            <button class="btn btn-info" onclick="allmessage()">
                                                <i class="icon-white icon-eye-open"></i>
                                                查看
                                            </button>
                                            <button class="btn btn-warning" onclick="gotomodify()">
                                                <i class="icon-white icon-refresh"></i>
                                                修改
                                            </button>
                                            <button class="btn btn-info">
                                                <i class="icon-white icon-plus"></i>
                                                恢复
                                            </button>
                                        </td>
                                    </tr>
								</tbody>
							</table>							
						</div>
					</div>
				</div>
			</div>
			
		</div>		
        <div class="row-fluid">&nbsp;</div>
        <div class="row-fluid">
            <div id="footer" class="span12">
                2016 &copy; 企业人事管理平台
            </div>
        </div>
		
	</body>
</html>
