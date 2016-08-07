
# Thymeleaf Bootstrap
  lib for dialects bootstraps.

#### About
  library that will contain all bootstrap components in a dialect thymeleaf

##Components implemented
  * label

##TODO:
  <b>Documentation:</b> (http://getbootstrap.com/components/)

##Install
    TODO

##Usage

    <!DOCTYPE html>
    <html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
      <head>
      		<!-- Latest compiled and minified CSS -->
    		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"  />
    		<!-- Optional theme -->
    		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"  />
    		<!-- Latest compiled and minified JavaScript -->
    		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      </head>	
      <body>
      	<div class="container">
    		<h1>Bootstrap Label</h1>
    		<bootstrap:label value="default" class="label label-default"></bootstrap:label> 
    		<bootstrap:label value="primary" class="label label-primary"></bootstrap:label> 
    		<bootstrap:label value="success" class="label label-success"></bootstrap:label> 
    		<bootstrap:label value="info" class="label label-info"></bootstrap:label> 
    		<bootstrap:label value="warning" class="label label-warning"></bootstrap:label> 
    		<bootstrap:label value="danger" class="label label-danger"></bootstrap:label> 
      	</div>
      </body>
    </html>


##Create by 
 	SED - 2016(http://www.sedengenharia.com.br/)


