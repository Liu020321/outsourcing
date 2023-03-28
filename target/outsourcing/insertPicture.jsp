<%--
  Created by IntelliJ IDEA.
  User: 12140
  Date: 2023/3/27
  Time: 21:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Quixlab - Bootstrap Admin Dashboard Template by Themefisher.com</title>
    <!-- Favicon icon -->
    <link rel="icon" type="theme/theme/image/png" sizes="16x16" href="theme/theme/images/favicon.png">
    <!-- Pignose Calender -->
    <link href="theme/theme/plugins/pg-calendar/css/pignose.calendar.min.css" rel="stylesheet">
    <!-- Chartist -->
    <link rel="stylesheet" href="theme/theme/plugins/chartist/css/chartist.min.css">
    <link rel="stylesheet" href="theme/theme/plugins/chartist-plugin-tooltips/css/chartist-plugin-tooltip.css">
    <!-- Custom Stylesheet -->
    <link href="theme/theme/css/style.css" rel="stylesheet">

</head>

<%--判断文件类型是否符合要求--%>
<Script>
    function verificationPicFile(myFile){
        // 题目中的要求的上传的文件类型
        var fileTypes=[".nii",".nii.gz",".mhd",".raw",".dcm"];
        //获取到上传的文件绝对路径
        var filePath=document.getElementById("myFile").value();

        if(filePath){
            var isNext=false;
            var fileEnd=filePath.substring(filePath.indexOf("."));//截取其后缀名
            for(var i=0;i<fileTypes.length;i++){
                if(fileTypes[i].equals(fileEnd)){//在要求的里面找到了该文件类型--true
                    isNext=true;
                    break;
                }
            }

            //没找到可接受的文件类型
            if(isNext.equals(false)){
                alert("不接受此文件类型！");
                //找不到之后，设置上传的文件为空
                document.getElementById("myFile").value="";
                return false;
            }

            return true;
        }else{
            return false;
        }
    }
</Script>

<body>

<!--*******************
    Preloader start
********************-->
<div id="preloader">
    <div class="loader">
        <svg class="circular" viewBox="25 25 50 50">
            <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="3" stroke-miterlimit="10" />
        </svg>
    </div>
</div>
<!--*******************
    Preloader end
********************-->


<!--**********************************
    Main wrapper start
***********************************-->
<div id="main-wrapper">

    <!--**********************************
        Nav header start
    ***********************************-->
    <div class="nav-header">
        <div class="brand-logo">
            <a href="index.jsp">
                <b class="logo-abbr"><img src="theme/theme/images/logo.png" alt=""> </b>
                <span class="logo-compact"><img src="theme/theme/images/logo-compact.png" alt=""></span>
                <span class="brand-title">
                        <img src="theme/theme/images/logo-text.png" alt="">
                    </span>
            </a>
        </div>
    </div>
    <!--**********************************
        Nav header end
    ***********************************-->

    <!--**********************************
        Header start
    ***********************************-->
    <div class="header">
        <div class="header-content clearfix">

            <div class="nav-control">
                <div class="hamburger">
                    <span class="toggle-icon"><i class="icon-menu"></i></span>
                </div>
            </div>
            <div class="header-left">
                <div class="input-group icons">
                    <div class="input-group-prepend">
                        <span class="input-group-text bg-transparent border-0 pr-2 pr-sm-3" id="basic-addon1"><i class="mdi mdi-magnify"></i></span>
                    </div>
                    <input type="search" class="form-control" placeholder="Search Dashboard" aria-label="Search Dashboard">
                    <div class="drop-down animated flipInX d-md-none">
                        <form action="#">
                            <input type="text" class="form-control" placeholder="Search">
                        </form>
                    </div>
                </div>
            </div>
            <div class="header-right">
                <ul class="clearfix">
                    <li class="icons dropdown"><a href="javascript:void(0)" data-toggle="dropdown">
                        <i class="mdi mdi-email-outline"></i>
                        <span class="badge badge-pill gradient-1">3</span>
                    </a>
                        <div class="drop-down animated fadeIn dropdown-menu">
                            <div class="dropdown-content-heading d-flex justify-content-between">
                                <span class="">3 New Messages</span>
                                <a href="javascript:void()" class="d-inline-block">
                                    <span class="badge badge-pill gradient-1">3</span>
                                </a>
                            </div>
                            <div class="dropdown-content-body">
                                <ul>
                                    <li class="notification-unread">
                                        <a href="javascript:void()">
                                            <img class="float-left mr-3 avatar-img" src="theme/theme/images/avatar/1.jpg" alt="">
                                            <div class="notification-content">
                                                <div class="notification-heading">Saiful Islam</div>
                                                <div class="notification-timestamp">08 Hours ago</div>
                                                <div class="notification-text">Hi Teddy, Just wanted to let you ...</div>
                                            </div>
                                        </a>
                                    </li>
                                    <li class="notification-unread">
                                        <a href="javascript:void()">
                                            <img class="float-left mr-3 avatar-img" src="theme/theme/images/avatar/2.jpg" alt="">
                                            <div class="notification-content">
                                                <div class="notification-heading">Adam Smith</div>
                                                <div class="notification-timestamp">08 Hours ago</div>
                                                <div class="notification-text">Can you do me a favour?</div>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void()">
                                            <img class="float-left mr-3 avatar-img" src="theme/theme/images/avatar/3.jpg" alt="">
                                            <div class="notification-content">
                                                <div class="notification-heading">Barak Obama</div>
                                                <div class="notification-timestamp">08 Hours ago</div>
                                                <div class="notification-text">Hi Teddy, Just wanted to let you ...</div>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void()">
                                            <img class="float-left mr-3 avatar-img" src="theme/theme/images/avatar/4.jpg" alt="">
                                            <div class="notification-content">
                                                <div class="notification-heading">Hilari Clinton</div>
                                                <div class="notification-timestamp">08 Hours ago</div>
                                                <div class="notification-text">Hello</div>
                                            </div>
                                        </a>
                                    </li>
                                </ul>

                            </div>
                        </div>
                    </li>
                    <li class="icons dropdown"><a href="javascript:void(0)" data-toggle="dropdown">
                        <i class="mdi mdi-bell-outline"></i>
                        <span class="badge badge-pill gradient-2">3</span>
                    </a>
                        <div class="drop-down animated fadeIn dropdown-menu dropdown-notfication">
                            <div class="dropdown-content-heading d-flex justify-content-between">
                                <span class="">2 New Notifications</span>
                                <a href="javascript:void()" class="d-inline-block">
                                    <span class="badge badge-pill gradient-2">5</span>
                                </a>
                            </div>
                            <div class="dropdown-content-body">
                                <ul>
                                    <li>
                                        <a href="javascript:void()">
                                            <span class="mr-3 avatar-icon bg-success-lighten-2"><i class="icon-present"></i></span>
                                            <div class="notification-content">
                                                <h6 class="notification-heading">Events near you</h6>
                                                <span class="notification-text">Within next 5 days</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void()">
                                            <span class="mr-3 avatar-icon bg-danger-lighten-2"><i class="icon-present"></i></span>
                                            <div class="notification-content">
                                                <h6 class="notification-heading">Event Started</h6>
                                                <span class="notification-text">One hour ago</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void()">
                                            <span class="mr-3 avatar-icon bg-success-lighten-2"><i class="icon-present"></i></span>
                                            <div class="notification-content">
                                                <h6 class="notification-heading">Event Ended Successfully</h6>
                                                <span class="notification-text">One hour ago</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="javascript:void()">
                                            <span class="mr-3 avatar-icon bg-danger-lighten-2"><i class="icon-present"></i></span>
                                            <div class="notification-content">
                                                <h6 class="notification-heading">Events to Join</h6>
                                                <span class="notification-text">After two days</span>
                                            </div>
                                        </a>
                                    </li>
                                </ul>

                            </div>
                        </div>
                    </li>
                    <li class="icons dropdown d-none d-md-flex">
                        <a href="javascript:void(0)" class="log-user"  data-toggle="dropdown">
                            <span>English</span>  <i class="fa fa-angle-down f-s-14" aria-hidden="true"></i>
                        </a>
                        <div class="drop-down dropdown-language animated fadeIn  dropdown-menu">
                            <div class="dropdown-content-body">
                                <ul>
                                    <li><a href="javascript:void()">English</a></li>
                                    <li><a href="javascript:void()">Dutch</a></li>
                                </ul>
                            </div>
                        </div>
                    </li>
                    <li class="icons dropdown">
                        <div class="user-img c-pointer position-relative"   data-toggle="dropdown">
                            <span class="activity active"></span>
                            <img src="theme/theme/images/user/1.png" height="40" width="40" alt="">
                        </div>
                        <div class="drop-down dropdown-profile animated fadeIn dropdown-menu">
                            <div class="dropdown-content-body">
                                <ul>
                                    <li>
                                        <a href="theme/theme/app-profile.html"><i class="icon-user"></i> <span>Profile</span></a>
                                    </li>
                                    <li>
                                        <a href="javascript:void()">
                                            <i class="icon-envelope-open"></i> <span>Inbox</span> <div class="badge gradient-3 badge-pill gradient-1">3</div>
                                        </a>
                                    </li>

                                    <hr class="my-2">
                                    <li>
                                        <a href="theme/theme/page-lock.html"><i class="icon-lock"></i> <span>Lock Screen</span></a>
                                    </li>
                                    <li><a href="theme/theme/page-login.html"><i class="icon-key"></i> <span>Logout</span></a></li>
                                </ul>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!--**********************************
        Header end ti-comment-alt
    ***********************************-->

    <!--**********************************
        Sidebar start
    ***********************************-->
    <div class="nk-sidebar">
        <div class="nk-nav-scroll">
            <ul class="metismenu" id="menu">
                <li class="nav-label">Dashboard</li>
                <li>
                    <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="icon-speedometer menu-icon"></i><span class="nav-text">Dashboard</span>
                    </a>
                    <ul aria-expanded="false">
                        <li><a href="theme/theme/index.html">Home 1</a></li>
                        <!-- <li><a href="./index-2.html">Home 2</a></li> -->
                    </ul>
                </li>
                <li class="mega-menu mega-menu-sm">
                    <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="icon-globe-alt menu-icon"></i><span class="nav-text">Layouts</span>
                    </a>
                    <ul aria-expanded="false">
                        <li><a href="theme/theme/layout-blank.html">Blank</a></li>
                        <li><a href="theme/theme/layout-one-column.html">One Column</a></li>
                        <li><a href="theme/theme/layout-two-column.html">Two column</a></li>
                        <li><a href="theme/theme/layout-compact-nav.html">Compact Nav</a></li>
                        <li><a href="theme/theme/layout-vertical.html">Vertical</a></li>
                        <li><a href="theme/theme/layout-horizontal.html">Horizontal</a></li>
                        <li><a href="theme/theme/layout-boxed.html">Boxed</a></li>
                        <li><a href="theme/theme/layout-wide.html">Wide</a></li>


                        <li><a href="theme/theme/layout-fixed-header.html">Fixed Header</a></li>
                        <li><a href="theme/theme/layout-fixed-sidebar.html">Fixed Sidebar</a></li>
                    </ul>
                </li>
                <li class="nav-label">Apps</li>
                <li>
                    <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="icon-envelope menu-icon"></i> <span class="nav-text">Email</span>
                    </a>
                    <ul aria-expanded="false">
                        <li><a href="theme/theme/email-inbox.html">Inbox</a></li>
                        <li><a href="theme/theme/email-read.html">Read</a></li>
                        <li><a href="theme/theme/email-compose.html">Compose</a></li>
                    </ul>
                </li>
                <li>
                    <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="icon-screen-tablet menu-icon"></i><span class="nav-text">Apps</span>
                    </a>
                    <ul aria-expanded="false">
                        <li><a href="theme/theme/app-profile.html">Profile</a></li>
                        <li><a href="theme/theme/app-calender.html">Calender</a></li>
                    </ul>
                </li>
                <li>
                    <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="icon-graph menu-icon"></i> <span class="nav-text">Charts</span>
                    </a>
                    <ul aria-expanded="false">
                        <li><a href="theme/theme/chart-flot.html">Flot</a></li>
                        <li><a href="theme/theme/chart-morris.html">Morris</a></li>
                        <li><a href="theme/theme/chart-chartjs.html">Chartjs</a></li>
                        <li><a href="theme/theme/chart-chartist.html">Chartist</a></li>
                        <li><a href="theme/theme/chart-sparkline.html">Sparkline</a></li>
                        <li><a href="theme/theme/chart-peity.html">Peity</a></li>
                    </ul>
                </li>
                <li class="nav-label">UI Components</li>
                <li>
                    <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="icon-grid menu-icon"></i><span class="nav-text">UI Components</span>
                    </a>
                    <ul aria-expanded="false">
                        <li><a href="theme/theme/ui-accordion.html">Accordion</a></li>
                        <li><a href="theme/theme/ui-alert.html">Alert</a></li>
                        <li><a href="theme/theme/ui-badge.html">Badge</a></li>
                        <li><a href="theme/theme/ui-button.html">Button</a></li>
                        <li><a href="theme/theme/ui-button-group.html">Button Group</a></li>
                        <li><a href="theme/theme/ui-cards.html">Cards</a></li>
                        <li><a href="theme/theme/ui-carousel.html">Carousel</a></li>
                        <li><a href="theme/theme/ui-dropdown.html">Dropdown</a></li>
                        <li><a href="theme/theme/ui-list-group.html">List Group</a></li>
                        <li><a href="theme/theme/ui-media-object.html">Media Object</a></li>
                        <li><a href="theme/theme/ui-modal.html">Modal</a></li>
                        <li><a href="theme/theme/ui-pagination.html">Pagination</a></li>
                        <li><a href="theme/theme/ui-popover.html">Popover</a></li>
                        <li><a href="theme/theme/ui-progressbar.html">Progressbar</a></li>
                        <li><a href="theme/theme/ui-tab.html">Tab</a></li>
                        <li><a href="theme/theme/ui-typography.html">Typography</a></li>
                        <!-- </ul>
                    </li>
                    <li>
                        <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                            <i class="icon-layers menu-icon"></i><span class="nav-text">Components</span>
                        </a>
                        <ul aria-expanded="false"> -->
                        <li><a href="theme/theme/uc-nestedable.html">Nestedable</a></li>
                        <li><a href="theme/theme/uc-noui-slider.html">Noui Slider</a></li>
                        <li><a href="theme/theme/uc-sweetalert.html">Sweet Alert</a></li>
                        <li><a href="theme/theme/uc-toastr.html">Toastr</a></li>
                    </ul>
                </li>
                <li>
                    <a href="theme/theme/widgets.html" aria-expanded="false">
                        <i class="icon-badge menu-icon"></i><span class="nav-text">Widget</span>
                    </a>
                </li>
                <li class="nav-label">Forms</li>
                <li>
                    <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="icon-note menu-icon"></i><span class="nav-text">Forms</span>
                    </a>
                    <ul aria-expanded="false">
                        <li><a href="theme/theme/form-basic.html">Basic Form</a></li>
                        <li><a href="theme/theme/form-validation.html">Form Validation</a></li>
                        <li><a href="theme/theme/form-step.html">Step Form</a></li>
                        <li><a href="theme/theme/form-editor.html">Editor</a></li>
                        <li><a href="theme/theme/form-picker.html">Picker</a></li>
                    </ul>
                </li>
                <li class="nav-label">Table</li>
                <li>
                    <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="icon-menu menu-icon"></i><span class="nav-text">Table</span>
                    </a>
                    <ul aria-expanded="false">
                        <li><a href="theme/theme/table-basic.html" aria-expanded="false">Basic Table</a></li>
                        <li><a href="theme/theme/table-datatable.html" aria-expanded="false">Data Table</a></li>
                    </ul>
                </li>
                <li class="nav-label">Pages</li>
                <li>
                    <a class="has-arrow" href="javascript:void()" aria-expanded="false">
                        <i class="icon-notebook menu-icon"></i><span class="nav-text">Pages</span>
                    </a>
                    <ul aria-expanded="false">
                        <li><a href="theme/theme/page-login.html">Login</a></li>
                        <li><a href="theme/theme/page-register.html">Register</a></li>
                        <li><a href="theme/theme/page-lock.html">Lock Screen</a></li>
                        <li><a class="has-arrow" href="javascript:void()" aria-expanded="false">Error</a>
                            <ul aria-expanded="false">
                                <li><a href="theme/theme/page-error-404.html">Error 404</a></li>
                                <li><a href="theme/theme/page-error-403.html">Error 403</a></li>
                                <li><a href="theme/theme/page-error-400.html">Error 400</a></li>
                                <li><a href="theme/theme/page-error-500.html">Error 500</a></li>
                                <li><a href="theme/theme/page-error-503.html">Error 503</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
    <!--**********************************
        Sidebar end
    ***********************************-->

    <!--**********************************
        Content body start
    ***********************************-->
    <div class="content-body">

                <!-- row -->

                <div class="container-fluid">
                    <div class="row">
                        <div class="col-12">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="card-title">输入文件功能</h4>
                                    <div class="table-responsive">
                                        <form action="insertPictureServlet" method="post">
                                        <table class="table table-striped table-bordered zero-configuration">
                                            <tbody>
                                            <tr>
                                                <td>选择图片上传：</td>
                                                <td>
                                                    <div class="rounded-button">
                                                        <input type="file" class="btn mb-1 btn-rounded btn-outline-info" name="myFile" id="myFile" value="浏览" onchange="verificationPicFile(this)"/>
                                                    </div>
                                                </td>
                                            </tr>

                                            <tr>
                                                <td colspan="2" align="center">
                                                    <div class="rounded-button">
                                                    <input type="submit" class="btn mb-1 btn-rounded btn-outline-info" value="上传"/>
                                                </div></td>
                                            </tr>

                                        </table>

                                            <div class="col-lg-12">
                                                <div class="card">
                                                    <div class="card-body">

                                                    </div>
                                                </div>
                                            </div>
                                    </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>




        <!-- #/ container -->
    </div>
    <!--**********************************
        Content body end
    ***********************************-->


    <!--**********************************
        Footer start
    ***********************************-->
    <div class="footer">
        <div class="copyright">
            <p>Copyright &copy; Designed & Developed by <a href="https://themeforest.net/user/quixlab">Quixlab</a> 2018</p>
        </div>
    </div>
    <!--**********************************
        Footer end
    ***********************************-->
</div>
<!--**********************************
    Main wrapper end
***********************************-->

<!--**********************************
    Scripts
***********************************-->
<script src="theme/theme/plugins/common/common.min.js"></script>
<script src="theme/theme/js/custom.min.js"></script>
<script src="theme/theme/js/settings.js"></script>
<script src="theme/theme/js/gleek.js"></script>
<script src="theme/theme/js/styleSwitcher.js"></script>

<!-- Chartjs -->
<script src="theme/theme/plugins/chart.js/Chart.bundle.min.js"></script>
<!-- Circle progress -->
<script src="theme/theme/plugins/circle-progress/circle-progress.min.js"></script>
<!-- Datamap -->
<script src="theme/theme/plugins/d3v3/index.js"></script>
<script src="theme/theme/plugins/topojson/topojson.min.js"></script>
<script src="theme/theme/plugins/datamaps/datamaps.world.min.js"></script>
<!-- Morrisjs -->
<script src="theme/theme/plugins/raphael/raphael.min.js"></script>
<script src="theme/theme/plugins/morris/morris.min.js"></script>
<!-- Pignose Calender -->
<script src="theme/theme/plugins/moment/moment.min.js"></script>
<script src="theme/theme/plugins/pg-calendar/js/pignose.calendar.min.js"></script>
<!-- ChartistJS -->
<script src="theme/theme/plugins/chartist/js/chartist.min.js"></script>
<script src="theme/theme/plugins/chartist-plugin-tooltips/js/chartist-plugin-tooltip.min.js"></script>



<script src="./js/dashboard/dashboard-1.js"></script>

</body>

</html>

<html>
<head>
    <title>插入图片界面</title>
</head>


<body>
<center>
  <form action="insertPictureServlet" method="post">
    <table border="1">

    </table>
  </form>
</center>
</body>
</html>
