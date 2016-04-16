<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%--
  Created by IntelliJ IDEA.
  User: TianyuanPan
  Date: 4/11/16
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--
Design by Free CSS Templates
http://www.freecsstemplates.org
Released for free under a Creative Commons Attribution 2.5 License

Name       : Perfect Blemish
Description: A two-column, fixed-width design with dark color scheme.
Version    : 1.0
Released   : 20100729

-->
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
  <meta name="keywords" content="" />
  <meta name="description" content="" />
  <meta http-equiv="content-type" content="text/html; charset=utf-8" />
  <title>Blogs GoNaLi</title>
  <link  href="/pages/css/index/style.css" rel="stylesheet" type="text/css" media="screen" />
  <script type="text/javascript" src="/pages/js/common/jquery-1.9.1.min.js"></script>
  <script type="text/javascript" charset="utf-8" src="/pages/js/index/jquery.leanModal.min.js"></script>
  <script type="text/javascript" charset="utf-8" src="/pages/js/index/navigation.js"></script>
</head>

<script type="text/javascript">
  $(function(){
//    $('#loginform').submit(function(e){
//      return false;
//    });
    $('#topbar_li01_a02').leanModal({ top: 110, overlay: 0.45/*, closeButton: ".hidemodal" */});
  });
</script>

<script type="text/javascript">
  window.onload = getNavigation;
</script>

<body>

<div id="top-bar">
  <div>
   <ul>
     <li id="topbar_li01"><a  id="topbar_li01_a01" href="/access/register">注 册</a></li>
     <li id="topbar_li02"><a  id="topbar_li01_a02" href="#loginmodal" >登 陆</a></li>
     <%--${loginStatus}--%>
   </ul>
  </div>
</div>

<div id="loginmodal" style="display:none;">
  <h1>用 户 登 录</h1>
  <br/>
  <form id="loginform" name="loginform" method="post" action="/access/login">
    <label for="userno">登录号码:</label>
    <input type="text" name="userno" id="userno" class="txtfield" tabindex="1">

    <label for="password">登录密码:</label>
    <input type="password" name="password" id="password" class="txtfield" tabindex="2">

    <div class="center">
      <input type="submit" name="loginbtn" id="loginbtn" class="flatbtn-blu hidemodal" value="登 陆" tabindex="3">
    </div>
  </form>
</div>

<div id="wrapper">
  <div id="header-wrapper">
    <div id="header">
      <div id="logo">
        <h1><a href="/"><span>GONALI</span>Articles</a></h1>
      </div>
      <div id="menu">

        <ul>

          <li class="current_page_item"><a href="/">Home</a></li>
          <li><a id="navi01" href="#">Blog</a></li>
          <li><a id="navi02" href="#">Photos</a></li>
          <li><a id="navi03" href="#">About</a></li>
          <li><a id="navi04" href="#">Links</a></li>
          <li><a id="navi05" href="#">Contact</a></li>
        </ul>


      </div>
    </div>
  </div>
  <!-- end #header -->

  <div id="page">
    <div id="content">
      <div class="post">
        <h2 class="title"><a href="#">最 新 文 章</a></h2><br/>
<%--
        <p class="meta">
          <span class="author">
            <a href="#">Someone</a>
          </span>
          <span class="date">
            July 07, 2010
          </span>&nbsp;
          <span class="links">
            <a href="#" title="">Comments</a>
          </span>
        </p>

        <div class="entry">
          <p></p>
        </div>
--%>
        ${newArticles}

      </div>

      <div class="post">
        <h2 class="title"><a href="#">最 热 文 章</a></h2><br/>
<%--
        <p class="meta">
          <span class="author"><a href="#">Someone</a>
          </span>
          <span class="date">July 07, 2010
          </span>&nbsp;
          <span class="links">
            <a href="#" title="">Comments</a>
          </span>
        </p>

        <div class="entry">
          <p><a href="#"></a>
            <a href="#">dapibus semper urna</a>.
          </p>
        </div>
--%>
        ${hotArticles}
      </div>

      <div class="post">
        <h2 class="title"><a href="#">爬 虫 文 章</a></h2>
        <p class="meta"><span class="author"><a href="#">Someone</a></span> <span class="date">July 07, 2010</span>&nbsp;<span class="links"><a href="#" title="">Comments</a></span></p>
        <div class="entry">
          <p>Sed lacus. Donec lectus. Nullam pretium nibh ut turpis. Nam bibendum. In nulla tortor, elementum vel, tempor at, varius non, purus. Mauris vitae nisl nec metus placerat consectetuer. Donec ipsum. Proin imperdiet est. Phasellus <a href="#">dapibus semper urna</a>. Pellentesque ornare, orci in consectetuer hendrerit, urna elit eleifend nunc, ut consectetuer nisl felis ac diam. Etiam non felis. Donec ut ante. In id eros. Suspendisse lacus turpis, cursus egestas at sem.  Mauris quam enim, molestie in, rhoncus ut, lobortis a, est. Pellentesque ornare, orci in consectetuer hendrerit, urna elit eleifend nunc, ut consectetuer nisl felis ac diam. Etiam non felis. Donec ut ante. In id eros. Suspendisse lacus turpis, cursus egestas at sem.  Mauris quam enim, molestie in, rhoncus ut, lobortis a, est.</p>
        </div>
      </div>
    </div>
    <!-- end #content -->


    <div id="sidebar">
      <ul>
        <li>
          <h2>Search</h2>
          <div id="search" >
            <form method="get" action="#">
              <div>
                <input type="text" name="s" id="search-text" value="" />
                <input type="submit" id="search-submit" value="GO" />
              </div>
            </form>
          </div>
          <div style="clear: both;">&nbsp;</div>
        </li>
        <li>
          <h2>Aliquam tempus</h2>
          <p>Mauris vitae nisl nec metus placerat perdiet est. Phasellus dapibus semper consectetuer hendrerit.</p>
        </li>
        <li>
          <h2>Categories</h2>
          <ul>
            <li><a href="#">Aliquam libero</a></li>
            <li><a href="#">Consectetuer adipiscing elit</a></li>
            <li><a href="#">Metus aliquam pellentesque</a></li>
            <li><a href="#">Suspendisse iaculis mauris</a></li>
            <li><a href="#">Urnanet non molestie semper</a></li>
            <li><a href="#">Proin gravida orci porttitor</a></li>
          </ul>
        </li>
        <li>
          <h2>Blogroll</h2>
          <ul>
            <li><a href="#">Aliquam libero</a></li>
            <li><a href="#">Consectetuer adipiscing elit</a></li>
            <li><a href="#">Metus aliquam pellentesque</a></li>
            <li><a href="#">Suspendisse iaculis mauris</a></li>
            <li><a href="#">Urnanet non molestie semper</a></li>
            <li><a href="#">Proin gravida orci porttitor</a></li>
          </ul>
        </li>
        <li>
          <h2>Archives</h2>
          <ul>
            <li><a href="#">Aliquam libero</a></li>
            <li><a href="#">Consectetuer adipiscing elit</a></li>
            <li><a href="#">Metus aliquam pellentesque</a></li>
            <li><a href="#">Suspendisse iaculis mauris</a></li>
            <li><a href="#">Urnanet non molestie semper</a></li>
            <li><a href="#">Proin gravida orci porttitor</a></li>
          </ul>
        </li>
      </ul>
    </div>
    <!-- end #sidebar -->
    <div style="clear: both;">&nbsp;</div>
  </div>
  <!-- end #page -->
</div>
<div id="footer">
  <p>Copyright (c) 2008 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/"> CSS Templates</a>.</p>
</div>
<!-- end #footer -->
</body>
</html>

