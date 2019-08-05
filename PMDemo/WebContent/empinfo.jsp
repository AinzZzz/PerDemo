<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>企业人事管理平台</title>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
		<link rel="stylesheet" href="css/uniform.css" />	
		<link rel="stylesheet" href="css/unicorn.main.css" />
		<link rel="stylesheet" href="css/unicorn.grey.css" class="skin-color" />	        <style>
			tr{
				height:40px;
			}
		</style>
		<script src="js/jquery.min.js"></script>
       	<script src="js/jquery.ui.custom.js"></script>
       	<script src="js/bootstrap.min.js"></script>
       	<script src="js/bootstrap-colorpicker.js"></script>
       	<script src="js/bootstrap-datepicker.js"></script>
       	<script src="js/jquery.uniform.js"></script>
       	<script src="js/unicorn.js"></script>
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
                    <a href="login.html">
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
                <li class="active">
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
                <li>
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
				<h1>查看个人信息</h1>
			</div>
			<div id="breadcrumb">
				<a href="main.jsp" class="tip-bottom">
                	<i class="icon-home"></i>
                    首页
                </a>
				<a href="#" class="current">查看个人信息</a>
			</div>
        	<div class="container-fluid">
				<div class="row-fluid">
					<div class="span12">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>									
								</span>
								<h5>基础信息</h5>
							</div>
                            <table width="100%">
                            	<tr>
                                	<td width="15%" align="right">员工姓名:</td>
                                    <td width="60%" align="left">
                                    	&nbsp;&nbsp;
                                    	张三
                                    </td>
                                    <td width="200px" rowspan="5">
                                    	<img src="img/head.jpg" width="200" height="160"></img>
                                    </td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td align="right">所属部门:</td>
                                    <td align="left">
                                    	&nbsp;&nbsp;
                                    	研发一部
                                    </td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td align="right">职位:</td>
                                    <td align="left">
                                    	&nbsp;&nbsp;
                                    	高级软件工程师(4级)
                                    </td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td align="right">性别:</td>
                                    <td align="left">
                                    	&nbsp;&nbsp;
                                    	男
                                    </td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td align="right">用工形式:</td>
                                    <td align="left">
                                    	&nbsp;&nbsp;
                                    	正式员工
                                    </td>
                                    <td></td>
                                </tr>   
                                <tr>
                                	<td align="right">联系电话:</td>
                                    <td align="left">
                                    	&nbsp;&nbsp;
                                    	1516824654
                                    </td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td align="right">email:</td>
                                    <td align="left">
                                    	&nbsp;&nbsp;
                                    	1516824654@163.com
                                    </td>
                                    <td></td>
                                    <td></td>
                                </tr>
                                <tr>
                                	<td align="right">状态:</td>
                                    <td align="left">
                                    	&nbsp;&nbsp;
                                    	在职
                                    </td>
                                    <td></td>
                                    <td></td>
                                </tr>
                               
                            </table>
						</div>			
					</div>
				</div>	
			</div>
        	<hr/>
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon">
						<i class="icon-th"></i>
					</span>
					<h5>部门履历信息</h5>
				</div>
				<div class="widget-content nopadding">
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>员工姓名</th>
								<th>部门名称</th>
								<th>开始日期</th>
								<th>结束日期</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>张三</td>
								<td>研发二部</td>
								<td>2015年7月5日</td>
								<td>2015年11月30日</td>
							</tr>
							<tr>
								<td>张三</td>
								<td>研发一部</td>
								<td>2015年12月1日</td>
								<td></td>
							</tr>
						</tbody>
					</table>							
				</div>
			</div>
        	<hr/>
			<div class="widget-box">
				<div class="widget-title">
					<span class="icon">
						<i class="icon-th"></i>
					</span>
					<h5>职位履历信息</h5>
				</div>
				<div class="widget-content nopadding">
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>员工姓名</th>
								<th>职位名称</th>
								<th>开始日期</th>
								<th>结束日期</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>张三</td>
								<td>软件工程师</td>
								<td>2015年7月5日</td>
								<td>2016年2月29日</td>
							</tr>
							<tr>
								<td>张三</td>
								<td>高级软件工程师</td>
								<td>2016年3月1日</td>
								<td></td>
							</tr>
						</tbody>
					</table>							
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

