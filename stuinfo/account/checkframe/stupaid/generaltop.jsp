<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<style type="text/css">



.mg1{ padding: 4px; padding-top: 50px; padding-bottom: 0px; font-family: arial, verdana, serif;  TEXT-DECORATION: none; color: rgb(0,0,0);  
		background-image: url('/shopping/image/bg1.jpg'); font-size: 35px;color:magenta; border: #feaaee solid 0px; }


.border{ padding: 0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif;  TEXT-DECORATION: none; color: rgb(0,0,0);  
		background-image: url(''); font-size: 14px;color:red; border: lightgray solid 0px; }


.mainstyle{ padding: 0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif;  TEXT-DECORATION: none; color: rgb(0,0,0);  
		background-image: url(''); font-size: 24px;color:white; border: #feaaee solid 0px; }


.manucolor{ padding: 0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif;  TEXT-DECORATION: none; color: rgb(0,0,0);  
		background-image: url('/msged/stuinfo/button_image/22.jpg '); font-size: 24px;color:red; border: #feaaee solid 0px; }


.hiox{color: #227722; font-size: 32px; font-weight: bolder; padding-left: 0px; text-decoration: none;}


.mainstyle1{ padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif;  TEXT-DECORATION: none; color: rgb(0,0,0);  
		background-image: url(''); font-size: 15px;color:white; border: #feaaee solid 1px; }


.mainstyle1{ padding:0px; padding-top: 0px; padding-bottom: 0px; font-family: arial, verdana, serif;  TEXT-DECORATION: none; color: rgb(0,0,0);  
		background-image: url(''); font-size: 15px;color:red; border: #feaaee solid 1px; }


.mainstyle:hover{ color: #77aa66;}


</style>

</head>






















<body  style="margin: 0px; font-family: Serif,Arial,Times,serif;">
<table  align="center">
<!-- The First Row -->






<!-- Header Second Row -->
	  <style>
.tab{font-family: arial, verdana, san-serif; font-size: 14px;}
.asd{text-decoration: none; cursor: pointer; font-family: arial, verdana, san-serif; font-size: 12px; color: red;}
.row1{background-color: lightgray;}
.row2{background-color: lightgray;}
</style>

<script language="javascript">
var color1 = "lightgray";
var color2 = "lightgray";
var mouseocolor = "yellow";
var sitename = "";

window.onerror = null;
var bName = navigator.appName;
var bVer = parseInt(navigator.appVersion);
var IE4 = (bName == "Microsoft Internet Explorer" && bVer >= 4);
var menuActive = 0;
var menuOn = 0;
var onLayer;
var timeOn = null;
var url = window.location;
var title = document.title;
var colnow = color1;

function bookmark(title,url){
	if(window.sidebar) 
          window.sidebar.addPanel(title,url,"");
	else if(window.opera && window.print){
          var elem = document.createElement('a');
          elem.setAttribute('href',url);
          elem.setAttribute('title',title);
          elem.setAttribute('rel','sidebar');
          elem.click();
	}
	else if(os == "ie")
          window.external.AddFavorite(url,title);
}

function showLayer(layerName,aa){
	var x =document.getElementById(aa);
	var tt =findPosX(x);
	var ww =findPosY(x)+23;
	
	//alert(tt+"---"+ww);

	if (timeOn != null) {
	clearTimeout(timeOn);
	hideLayer(onLayer);
	}
	if (IE4) {
	var layers = eval('document.all["'+layerName+'"].style');
	layers.left = tt;
	layers.top = ww;
	eval('document.all["'+layerName+'"].style.visibility="visible"');
	}
	else {
		if(document.getElementById){
		var elementRef = document.getElementById(layerName);
		if((elementRef.style)&& (elementRef.style.visibility!=null)){
		elementRef.style.visibility = 'visible';
		elementRef.style.left = tt;
		elementRef.style.top = ww;
		}
		}
	}
	onLayer = layerName
}

function hideLayer(layerName){
	if (menuActive == 0)
	{
		if (IE4){
		eval('document.all["'+layerName+'"].style.visibility="hidden"');
		}
		else{
			if(document.getElementById){
				var elementRef = document.getElementById(layerName);
				if((elementRef.style)&& (elementRef.style.visibility!=null)){
					elementRef.style.visibility = 'hidden';
				}
			}
		}
	}
}

function btnTimer() {
	timeOn = setTimeout("btnOut()",600)
}

function btnOut(layerName){
	if (menuActive == 0){
	hideLayer(onLayer)
	}
}

var item;
function menuOver(itemName){
	item=itemName;
	itemName.style.backgroundColor = mouseocolor; //background color change on mouse over
	clearTimeout(timeOn);
	menuActive = 1
}

function menuOut(itemName,iid){
	if(iid == 1)
		colnow = color1;
	else
		colnow = color2;

	if(item)
		itemName.style.backgroundColor = colnow;
	menuActive = 0
	timeOn = setTimeout("hideLayer(onLayer)", 100)
}

function findPosX(obj)
{
var curleft = 0;
if (obj.offsetParent)
{
while (obj.offsetParent)
{
curleft += obj.offsetLeft
obj = obj.offsetParent;
}
}
else if (obj.x)
curleft += obj.x;
return curleft;
}

function findPosY(obj)
{
var curtop = 0;
if (obj.offsetParent)
{
while (obj.offsetParent)
{
curtop += obj.offsetTop
obj = obj.offsetParent;
}
}
else if (obj.y)
curtop += obj.y;
return curtop;
}



</script>


<!------------------------------------>

<tr><td>


<!--GetInvolved Start-->
<center>
<div id="Menu251" style="border: 0px solid rgb(0, 0, 0); position: absolute; visibility: hidden; z-index: 1;  top: 113px;">
<table style="border-collapse: collapse;" cellpadding="0" cellspacing="0">
<tbody>

<tr style="background-color: rgb(230, 245, 230);" class="row9" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="center">&nbsp;&nbsp; <a class="asd" href="/msged/stuinfo/account/checkframe/semister.jsp" target="/msged/stuinfo/account/checkframe/stupaid/window.jsp"></a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td> <td align="left">&nbsp;&nbsp; <a class="asd" href="/msged/stuinfo/account/checkframe/stupaid/course.jsp" target="/msged/stuinfo/account/checkframe/stupaid/window.jsp"></a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
<td align="left">&nbsp;&nbsp; <a class="asd" href="/msged/stuinfo/account/checkframe/stupaid/thesis.jsp" target="/msged/stuinfo/account/checkframe/stupaid/window.jsp"></a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

</tr>


</tbody></table></div>
<!--GetInvolved end-->
</center>


<!--GetInvolved Start-->
<div id="Menu252" style="border: 0px solid rgb(0, 0, 0); position: absolute; visibility: hidden; z-index: 1;  top: 113px;">
<table style="border-collapse: collapse;" cellpadding="0" cellspacing="0">
<tbody>
<tr style="background-color: rgb(230, 245, 230);" class="row9" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="asd" href="/msged/stuinfo/account/checkframe/stupaid/view.jsp" target="/msged/stuinfo/account/checkframe/stupaid/window.jsp"></a> &nbsp;&nbsp;</td><td align="left">&nbsp;&nbsp; <a class="asd" href="/msged/servlet/chequedis" target="/msged/stuinfo/account/checkframe/checkdisplay.jsp"></a> &nbsp;&nbsp;</td></tr>
</tbody></table></div>
<!--GetInvolved end-->


<!--GetInvolved Start-->
<div id="Menu253" style="border: 0px solid rgb(0, 0, 0); position: absolute; visibility: hidden; z-index: 1;  top: 113px;">
<table style="border-collapse: collapse;" cellpadding="0" cellspacing="0">
<tbody>
<tr style="background-color: rgb(230, 245, 230);" class="row9" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="asd" href="/msged/stuinfo/account/checkframe/updatecashview.jsp" target="/msged/stuinfo/account/checkframe/checkdisplay.jsp">Update Cash Book</a> &nbsp;&nbsp;</td></tr>
</tbody></table></div>
<!--GetInvolved end-->

<!--GetInvolved Start-->
<div id="Menu254" style="border: 0px solid rgb(0, 0, 0); position: absolute; visibility: hidden; z-index: 1;  top: 113px;">
<table style="border-collapse: collapse;" cellpadding="0" cellspacing="0">
<tbody>
<tr style="background-color: rgb(230, 245, 230);" class="row9" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="asd" href="/msged/stuinfo/account/query/queryframe.jsp" target="/msged/stuinfo/account/checkframe/checkdisplay.jsp">Query</a> &nbsp;&nbsp;</td></tr>
</tbody></table></div>
<!--GetInvolved end-->


<!--GetInvolved Start-->
<div id="Menu255" style="border: 0px solid rgb(0, 0, 0); position: absolute; visibility: hidden; z-index: 1;  top: 113px;">
<table style="border-collapse: collapse;" cellpadding="0" cellspacing="0">
<tbody>
<tr style="background-color: rgb(230, 245, 230);" class="row9" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="asd" href="/msged/stuinfo/account/checkframe/808_account_frame.jsp" target="/msged/stuinfo/account/checkframe/checkdisplay.jsp">0200008995808</a> &nbsp;&nbsp;</td><td align="left">&nbsp;&nbsp; <a class="asd" href="/msged/stuinfo/account/checkframe/709_account_frame.jsp" target="/msged/stuinfo/account/checkframe/checkdisplay.jsp">0200008995709</a> &nbsp;&nbsp;</td>
</tr>
</tbody></table></div>
<!--GetInvolved end-->



<!--GetInvolved Start-->
<div id="Menu256" style="border: 0px solid rgb(0, 0, 0); position: absolute; visibility: hidden; z-index: 1;  top: 113px;">
<table style="border-collapse: collapse;" cellpadding="0" cellspacing="0">
<tbody>
<tr style="background-color: rgb(230, 245, 230);" class="row9" onmouseout="menuOut(this,1)" onmouseover="menuOver(this)" height="22">
<td align="left">&nbsp;&nbsp; <a class="asd" href="/msged/stuinfo/account/checkframe/studentpaidframe.jsp" target="/msged/stuinfo/account/checkframe/checkdisplay.jsp">Batch</a> &nbsp;&nbsp;</td><td align="left">&nbsp;&nbsp; <a class="asd" href="/msged/stuinfo/account/checkframe/studentpaid.jsp" target="/msged/stuinfo/account/checkframe/checkdisplay.jsp"></a> &nbsp;&nbsp;</td>
</tr>
</tbody></table></div>
<!--GetInvolved end-->





<!-- Manu start  background-color: rgb(230, 245, 230);"-->

<table align="center">
<tbody  bgcolor="blue"><tr>

<td align="center" >
<a id="251" onmouseout="btnTimer()" onmouseover="showLayer(&quot;Menu251&quot;,'251')" href="" target="" class="manucolor">General Documents&nbsp;</a>


<a id="25_2" onmouseout="btnTimer()" onmouseover="showLayer(&quot;Menu25_2&quot;,'252')" href="/msged/stuinfo/account/checkframe/stupaid/view.jsp" target="/msged/stuinfo/account/checkframe/stupaid/window.jsp" class="mainstyle">View &nbsp;</a>

<a id="25_3" onmouseout="btnTimer()" onmouseover="showLayer(&quot;Menu25_3&quot;,'25_3')" href="" target="" class="mainstyle"> &nbsp;</a>
</td>




<td>

 </td>
</tr></tbody></table>

</div>


<!--view: /msged/stuinfo/account/checkframe/stupaid/view.jsp    target="/msged/stuinfo/account/checkframe/stupaid/window.jsp"-->
<!--Insert: href="/msged/stuinfo/account/checkframe/stupaid/course.jsp" target="/msged/stuinfo/account/checkframe/stupaid/window.jsp"-->




























</td></tr>



<!-- ********************************************Last HTML***********************************-->
</table></body></html>
