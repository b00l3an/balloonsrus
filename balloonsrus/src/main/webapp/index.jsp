<%-- 
    Document   : index.jsp
    Created on : Nov 19, 2022, 11:37:48 AM
    Author     : Brendan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/balloonsrus.css"
        <title>Balloons'R'Us Page</title>
    </head>
    <body>
        <div id="main">
            <div id="header">
                <div id='widgetBar'>
                    <div class='headerWidget'>
                        [Shopping Cart]
                    </div>
                    <div class='headerWidget'>
                        [Administrator]
                    </div>                    
                </div>
                <a href="#">
                    <img src='#' id='logo' alt="Balloons'R'Us Logo"><!--# is Placeholder -->
                </a>
                
                <img src='#' id='logoText' alt="Balloons'R'Us"><!--# is Placeholder -->

            </div>
            <div id="indexLeftColumn">
                <div id='WelcomeText'>
                    <p> [Welcome Text] </p>
                </div>
            </div>
            
            <div id="indexRightColumn">
                <div class="categoryBox">
                    <a href="#">
                        <span class="categoryLabelText">Latex Balloons</span>
                    </a>
                </div>
                <div class="categoryBox">
                    <a href="#">
                        <span class="categoryLabelText">Mylar Balloons</span>
                    </a>
                </div>
                <div class="categoryBox">
                    <a href="#">
                        <span class="categoryLabelText">Vinyl Balloons</span>
                    </a>
                </div>
                <div class="categoryBox">
                    <a href="#">
                        <span class="categoryLabelText">Outdoor Balloons</span>
                    </a>
                </div>
            </div>
            <div id="footer">
                <hr>
                <p id='footerText'>
                    [ Footer Text]
                </p>
            </div>
            
        </div>
    </body>
</html>
