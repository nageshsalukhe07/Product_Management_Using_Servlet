<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="css/add.css">
<title>Update page</title>
</head>
<body>

<jsp:include page="navbar.jsp"></jsp:include><br><hr>
<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                        <h3>Welcome</h3>
                        <p>You are 30 seconds away from earning your own money!</p>
                    </div>
                    <div class="col-md-9 register-right">
                       
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">Add Product Details Here</h3>
                                <form action="update-product" method="post">
                                <div class="row register-form">
                                    <div class="col-md-6 offset-md-3">
                                    <div class="form-group">
                                            <input type="number" name="pid" class="form-control" placeholder="Product id *" value="${p.pid}" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="name" class="form-control" placeholder="Product Name *" value="${p.name}" />
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="price" class="form-control" placeholder="Price *" value="${p.price}" />
                                        </div>
                                        <div class="form-group">
                                            <input type="number" name="qty" class="form-control" placeholder="Quantity *" value="${p.qty}" />
                                        </div>
                                        <div class="form-group">
                                            <input type="text" name="category" class="form-control"  placeholder="Category *" value="${p.category}" />
                                        </div>
                                       <button type="submit"  class="btn btn-primary">Update Record</button>
                                    </div>
                                </div>
                                </form>
                            </div>
                           
                        </div>
                    </div>
                </div>

            </div>


</body>
</html>