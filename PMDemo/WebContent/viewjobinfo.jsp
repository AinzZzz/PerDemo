<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html >
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
                <li>
                    <a href="deptlist.jsp">
                        <i class="icon icon-flag"></i> 
                        <span>部门信息管理</span> 
                    </a>
                </li>
                <li class="active">
                    <a href="joblist.jsp">
                        <i class="icon icon-briefcase"></i> 
                        <span>职位信息管理</span> 
                    </a>
                </li>
            </ul>
        </div>
        
        
        
        <div id="content">
			<div id="content-header">
				<h1>查看职位信息</h1>
			</div>
			<div id="breadcrumb">
				<a href="main.jsp" class="tip-bottom">
                	<i class="icon-home"></i>首页
                </a>
				<a href="joblist.jsp">职位列表</a>
				<a href="#" class="current">查看职位</a>
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
							
							<form id="eform" action="${pageContext.request.contextPath }/GetAllJobServlet" class="form-horizontal" method="post" />
	                            <table class="table table-bordered table-striped"> 
	                            	<thead>
	                            	<tr>
	                            		<th>岗位编号</th>
	                            		<th>岗位名称</th>
	                            		<th>岗位类型</th>
	                            		<th>编制</th>
	                            	</tr>
	                            	</thead>  
	                            	<tbody>
	                            		<c:forEach items="${jobinfos }" var="jobinfo" varStatus="status">
	                            		<tr>
	                            		<td>${jobinfo.jobno }</td>
	                            		<td>${jobinfo.job }</td>
	                            		<td>${jobinfo.jtype }</td>
	                            		<td>${jobinfo.weave }</td>
	                            		</tr>
	                            		
	                            		</c:forEach>
	                            	</tbody>      
	                                </form>
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
					<h5>职位员工信息</h5>
				</div>
				<div class="widget-content nopadding">
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
                                <th>员工编号</th>
								<th>姓名</th>
								<th>部门</th>
                                <th>性别</th>
                                <th>年龄</th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1001</td>
								<td>张三</td>
								<td>研发一部</td>
								<td>男</td>
                                <td>26</td>
							</tr>
							<tr>
								<td>1002</td>
								<td>李四</td>
                                <td>研发三部</td>
								<td>男</td>
                                <td>25</td>
							</tr>
                            <tr>
                                <td>1010</td>
                                <td>哈哈</td>
                                <td>研发中心</td>
                                <td>女</td>
                                <td>25</td>
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