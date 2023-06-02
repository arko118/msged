//package com.journaldev.servlet;
  
import java.io.File;
import java.io.IOException;
  
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
  
@WebServlet("/image_update")
@MultipartConfig(fileSizeThreshold=1024*1024*10,    // 10 MB
                 maxFileSize=1024*1024*50,          // 50 MB
                 maxRequestSize=1024*1024*100)      // 100 MB
public class image_update extends HttpServlet {


 private static final long serialVersionUID = 205242440643911308L;

//********************************************************************************5th Batch***********************************************************************************************************
String b5_1="181001";String b5_2="181002";String b5_3="181003";String b5_4="181004";String b5_5="181005";String b5_6="181006";String b5_7="181007";String b5_8="181008";String b5_9="181009";String b5_10="181010";
String b5_11="181011";String b5_12="181012";String b5_13="181013";String b5_14="181014";String b5_15="181015";String b5_16="181016";String b5_17="181017";String b5_18="181018";String b5_19="181019";String b5_20="181020";
String b5_21="181021";String b5_22="181022";String b5_23="181023";String b5_24="181024";String b5_25="181025";String b5_26="181026";String b5_27="181027";String b5_28="181028";String b5_29="181029";String b5_30="181030";
String b5_31="181031";String b5_32="181032";String b5_33="181033";String b5_34="181034";String b5_35="181035";

private static final String B5_1 = "/Slip/5/181001";private static final String B5_2 = "/Slip/5/181002";private static final String B5_3 = "/Slip/5/181003";private static final String B5_4 = "/Slip/5/181004";private static final String B5_5 = "/Slip/5/181005";private static final String B5_6 = "/Slip/5/181006";private static final String B5_7 = "/Slip/5/181007";private static final String B5_8 = "/Slip/5/181008";private static final String B5_9 = "/Slip/5/181009";private static final String B5_10 = "/Slip/5/181010";
private static final String B5_11 = "/Slip/5/181011";private static final String B5_12 = "/Slip/5/181012";private static final String B5_13 = "/Slip/5/181013";private static final String B5_14 = "/Slip/5/181014";private static final String B5_15 = "/Slip/5/181015";private static final String B5_16 = "/Slip/5/181016";private static final String B5_17 = "/Slip/5/181017";private static final String B5_18 = "/Slip/5/181018";private static final String B5_19 = "/Slip/5/181019";private static final String B5_20 = "/Slip/5/181020";
private static final String B5_21 = "/Slip/5/181021";private static final String B5_22 = "/Slip/5/181022";private static final String B5_23 = "/Slip/5/181023";private static final String B5_24 = "/Slip/5/181024";private static final String B5_25 = "/Slip/5/181025";private static final String B5_26 = "/Slip/5/181026";private static final String B5_27 = "/Slip/5/181027";private static final String B5_28 = "/Slip/5/181028";private static final String B5_29 = "/Slip/5/181029";private static final String B5_30 = "/Slip/5/181030";
private static final String B5_31 = "/Slip/5/181031";private static final String B5_32 = "/Slip/5/181032";private static final String B5_33 = "/Slip/5/181033";private static final String B5_34 = "/Slip/5/181034";private static final String B5_35 = "/Slip/5/181035"; 
//*******************************************************************************************************************************************************************************************


//********************************************************************************6th Batch***********************************************************************************************************
String b6_1="182101";String b6_2="182102";String b6_3="182103";String b6_4="182104";String b6_5="182105";String b6_6="182106";String b6_7="182107";String b6_8="182108";String b6_9="182109";String b6_10="182110";
String b6_11="182111";String b6_12="182112";String b6_13="182113";String b6_14="182114";String b6_15="182115";String b6_16="182116";String b6_17="182117";String b6_18="182118";String b6_19="182119";String b6_20="182120";
String b6_21="182121";String b6_22="182122";String b6_23="182123";String b6_24="182124";String b6_25="182125";String b6_26="182126";String b6_27="182127";String b6_28="182128";String b6_29="182129";String b6_30="182130";
String b6_31="182131";String b6_32="182132";String b6_33="182133";String b6_34="182134";String b6_35="182135";String b6_36="182136";

private static final String B6_1 = "/Slip/6/182101";private static final String B6_2 = "/Slip/6/182102";private static final String B6_3 = "/Slip/6/182103";private static final String B6_4 = "/Slip/6/182104";private static final String B6_5 = "/Slip/6/182105";private static final String B6_6 = "/Slip/6/182106";private static final String B6_7 = "/Slip/6/182107";private static final String B6_8 = "/Slip/6/182108";private static final String B6_9 = "/Slip/6/182109";private static final String B6_10 = "/Slip/6/182110";
private static final String B6_11 = "/Slip/6/182111";private static final String B6_12 = "/Slip/6/182112";private static final String B6_13 = "/Slip/6/182113";private static final String B6_14 = "/Slip/6/182114";private static final String B6_15 = "/Slip/6/182115";private static final String B6_16 = "/Slip/6/182116";private static final String B6_17 = "/Slip/6/182117";private static final String B6_18 = "/Slip/6/182118";private static final String B6_19 = "/Slip/6/182119";private static final String B6_20 = "/Slip/6/182120";
private static final String B6_21 = "/Slip/6/182121";private static final String B6_22 = "/Slip/6/182122";private static final String B6_23 = "/Slip/6/182123";private static final String B6_24 = "/Slip/6/182124";private static final String B6_25 = "/Slip/6/182125";private static final String B6_26 = "/Slip/6/182126";private static final String B6_27 = "/Slip/6/182127";private static final String B6_28 = "/Slip/6/182128";private static final String B6_29 = "/Slip/6/182129";private static final String B6_30 = "/Slip/6/182130";
private static final String B6_31 = "/Slip/6/182131";private static final String B6_32 = "/Slip/6/182132";private static final String B6_33 = "/Slip/6/182133";private static final String B6_34 = "/Slip/6/182134";private static final String B6_35 = "/Slip/6/182135"; private static final String B6_36 = "/Slip/6/182136"; 

//**********************************************************************************7Batch*********************************************************************************************************
String b7_1="183101";String b7_2="183102";String b7_3="183103";String b7_4="183104";String b7_5="183105";String b7_6="183106";String b7_7="183107";String b7_8="183108";
String b7_9="183109";String b7_10="183110";String b7_11="183111";String b7_12="183112";String b7_13="183113";String b7_14="183114";String b7_15="183115";String b7_16="183116";
String b7_17="183117";String b7_18="183118";String b7_19="183119";String b7_20="183120";String b7_21="183121";String b7_22="183122";String b7_23="183123";

private static final String B7_1 = "/Slip/7/183101";private static final String B7_2 = "/Slip/7/183102";private static final String B7_3 = "/Slip/7/183103";private static final String B7_4 = "/Slip/7/183104";
private static final String B7_5 = "/Slip/7/183105";private static final String B7_6 = "/Slip/7/183106";private static final String B7_7 = "/Slip/7/183107";private static final String B7_8 = "/Slip/7/183108";
private static final String B7_9 = "/Slip/7/183109";private static final String B7_10 = "/Slip/7/183110";private static final String B7_11 = "/Slip/7/183111";private static final String B7_12 = "/Slip/7/183112";
private static final String B7_13 = "/Slip/7/183113";private static final String B7_14 = "/Slip/7/183114";private static final String B7_15 = "/Slip/7/183115";private static final String B7_16 = "/Slip/7/183116";
private static final String B7_17 = "/Slip/7/183117";private static final String B7_18 = "/Slip/7/183118";private static final String B7_19 = "/Slip/7/183119";private static final String B7_20 = "/Slip/7/183120";
private static final String B7_21 = "/Slip/7/183121";private static final String B7_22 = "/Slip/7/183122";private static final String B7_23 = "/Slip/7/183123";

//************************************************************************************8 Batch*******************************************************************************************************
String b8_1="191101";String b8_2="191102";String b8_3="191103";String b8_4="191104";String b8_5="191105";String b8_6="191106";String b8_7="191107";String b8_8="191108";
String b8_9="191109";String b8_10="191110";String b8_11="191111";String b8_12="191112";String b8_13="191113";String b8_14="191114";String b8_15="191115";String b8_16="191116";
String b8_17="191117";String b8_18="191118";String b8_19="191119";String b8_20="191120";String b8_21="191121";String b8_22="191122";String b8_23="191123";String b8_24="191124";
String b8_25="191125";String b8_26="191126";String b8_27="191127";String b8_28="191128";String b8_29="191129";String b8_30="191130";

private static final String B8_1 = "/Slip/8/191101";private static final String B8_2 = "/Slip/8/191102";private static final String B8_3 = "/Slip/8/191103";private static final String B8_4 = "/Slip/8/191104";
private static final String B8_5 = "/Slip/8/191105";private static final String B8_6 = "/Slip/8/191106";private static final String B8_7 = "/Slip/8/191107";private static final String B8_8 = "/Slip/8/191108";
private static final String B8_9 = "/Slip/8/191109";private static final String B8_10 = "/Slip/8/191110";private static final String B8_11 = "/Slip/8/191111";private static final String B8_12 = "/Slip/8/191112";
private static final String B8_13 = "/Slip/8/191113";private static final String B8_14 = "/Slip/8/191114";private static final String B8_15 = "/Slip/8/191115";private static final String B8_16 = "/Slip/8/191116";
private static final String B8_17 = "/Slip/8/191117";private static final String B8_18 = "/Slip/8/191118";private static final String B8_19 = "/Slip/8/191119";private static final String B8_20 = "/Slip/8/191120";
private static final String B8_21 = "/Slip/8/191121";private static final String B8_22 = "/Slip/8/191122";private static final String B8_23 = "/Slip/8/191123";private static final String B8_24 = "/Slip/8/191124";
private static final String B8_25 = "/Slip/8/191125";private static final String B8_26 = "/Slip/8/191126";private static final String B8_27 = "/Slip/8/191127";private static final String B8_28 = "/Slip/8/191128";
private static final String B8_29 = "/Slip/8/191129";private static final String B8_30 = "/Slip/8/191130";

//************************************************************************************9 
String b9_1="192101";String b9_2="192102";String b9_3="192103";String b9_4="192104";String b9_5="192105";String b9_6="192106";String b9_7="192107";String b9_8="192108";
String b9_9="192109";String b9_10="192110";String b9_11="192111";String b9_12="192112";String b9_13="192113";String b9_14="192114";String b9_15="192115";String b9_16="192116";
String b9_17="192117";String b9_18="192118";String b9_19="192119";String b9_20="192120";String b9_21="192121";String b9_22="192122";String b9_23="192123";String b9_24="192124";
String b9_25="192125";String b9_26="192126";String b9_27="192127";String b9_28="192128";String b9_29="192129";String b9_30="192130";

private static final String B9_1 = "/Slip/9/192101";private static final String B9_2 = "/Slip/9/192102";private static final String B9_3 = "/Slip/9/192103";private static final String B9_4 = "/Slip/9/192104";
private static final String B9_5 = "/Slip/9/192105";private static final String B9_6 = "/Slip/9/192106";private static final String B9_7 = "/Slip/9/192107";private static final String B9_8 = "/Slip/9/192108";
private static final String B9_9 = "/Slip/9/192109";private static final String B9_10 = "/Slip/9/192110";private static final String B9_11 = "/Slip/9/192111";private static final String B9_12 = "/Slip/9/192112";
private static final String B9_13 = "/Slip/9/192113";private static final String B9_14 = "/Slip/9/192114";private static final String B9_15 = "/Slip/9/192115";private static final String B9_16 = "/Slip/9/192116";
private static final String B9_17 = "/Slip/9/192117";private static final String B9_18 = "/Slip/9/192118";private static final String B9_19 = "/Slip/9/192119";private static final String B9_20 = "/Slip/9/192120";
private static final String B9_21 = "/Slip/9/192121";private static final String B9_22 = "/Slip/9/192122";private static final String B9_23 = "/Slip/9/192123";private static final String B9_24 = "/Slip/9/192124";
private static final String B9_25 = "/Slip/9/192125";private static final String B9_26 = "/Slip/9/192126";private static final String B9_27 = "/Slip/9/192127";private static final String B9_28 = "/Slip/9/192128";
private static final String B9_29 = "/Slip/9/192129";private static final String B9_30 = "/Slip/9/192130";

//************************************************************************************10Batch**********************************
String b10_1="193101";String b10_9="193109";String b10_17="193117";String b10_25="193125";String b10_33="193133";String b10_41="193141";String b10_49="193149";
String b10_2="193102";String b10_10="193110";String b10_18="193118";String b10_26="193126";String b10_34="193134";String b10_42="193142";String b10_50="193150";
String b10_3="193103";String b10_11="193111";String b10_19="193119";String b10_27="193127";String b10_35="193135";String b10_43="193143";String b10_51="193151";
String b10_4="193104";String b10_12="193112";String b10_20="193120";String b10_28="193128";String b10_36="193136";String b10_44="193144";String b10_52="193152";
String b10_5="193105";String b10_13="193113";String b10_21="193121";String b10_29="193129";String b10_37="193137";String b10_45="193145";String b10_53="193153";
String b10_6="193106";String b10_14="193114";String b10_22="193122";String b10_30="193130";String b10_38="193138";String b10_46="193146";String b10_54="193154";
String b10_7="193107";String b10_15="193115";String b10_23="193123";String b10_31="193131";String b10_39="193139";String b10_47="193147";String b10_55="193155";
String b10_8="193108";String b10_16="193116";String b10_24="193124";String b10_32="193132";String b10_40="193140";String b10_48="193148";String b10_56="193156";


private static final String B10_1 = "/Slip/10/193101";private static final String B10_17 = "/Slip/10/193117";private static final String B10_33 = "/Slip/10/193133";
private static final String B10_2 = "/Slip/10/193102";private static final String B10_18 = "/Slip/10/193118";private static final String B10_34 = "/Slip/10/193134";
private static final String B10_3 = "/Slip/10/193103";private static final String B10_19 = "/Slip/10/193119";private static final String B10_35 = "/Slip/10/193135";
private static final String B10_4 = "/Slip/10/193104";private static final String B10_20 = "/Slip/10/193120";private static final String B10_36 = "/Slip/10/193136";
private static final String B10_5 = "/Slip/10/193105";private static final String B10_21 = "/Slip/10/193121";private static final String B10_37 = "/Slip/10/193137";
private static final String B10_6 = "/Slip/10/193106";private static final String B10_22 = "/Slip/10/193122";private static final String B10_38 = "/Slip/10/193138";
private static final String B10_7 = "/Slip/10/193107";private static final String B10_23 = "/Slip/10/193123";private static final String B10_39 = "/Slip/10/193139";
private static final String B10_8 = "/Slip/10/193108";private static final String B10_24 = "/Slip/10/193124";private static final String B10_40 = "/Slip/10/193140";
private static final String B10_9 = "/Slip/10/193109";private static final String B10_25 = "/Slip/10/193125";private static final String B10_41 = "/Slip/10/193141";
private static final String B10_10 = "/Slip/10/193110";private static final String B10_26 = "/Slip/10/193126";private static final String B10_42 = "/Slip/10/193142";
private static final String B10_11 = "/Slip/10/193111";private static final String B10_27 = "/Slip/10/193127";private static final String B10_43= "/Slip/10/193143";
private static final String B10_12 = "/Slip/10/193112";private static final String B10_28 = "/Slip/10/193128";private static final String B10_44 = "/Slip/10/193144";
private static final String B10_13 = "/Slip/10/193113";private static final String B10_29 = "/Slip/10/193129";private static final String B10_45 = "/Slip/10/193145";
private static final String B10_14 = "/Slip/10/193114";private static final String B10_30 = "/Slip/10/193130";private static final String B10_46 = "/Slip/10/193146";
private static final String B10_15 = "/Slip/10/193115";private static final String B10_31 = "/Slip/10/193131";private static final String B10_47 = "/Slip/10/193147";
private static final String B10_16 = "/Slip/10/193116";private static final String B10_32= "/Slip/10/193132";private static final String B10_48 = "/Slip/10/193148";

//**********************************************************11***********************************************************************************


String b11_1="201101";String b11_9="201109";String b11_17="201117";String b11_25="201125";String b11_33="201133";String b11_41="201141"; 
String b11_2="201102";String b11_10="201110";String b11_18="201118";String b11_26="201126";String b11_34="201134";String b11_42="201142"; 
String b11_3="201103";String b11_11="201111";String b11_19="201119";String b11_27="201127";String b11_35="201135";String b11_43="201143"; 
String b11_4="201104";String b11_12="201112";String b11_20="201120";String b11_28="201128";String b11_36="201136";String b11_44="201144"; 
String b11_5="201105";String b11_13="201113";String b11_21="201121";String b11_29="201129";String b11_37="201137";String b11_45="201145"; 
String b11_6="201106";String b11_14="201114";String b11_22="201122";String b11_30="201130";String b11_38="201138";String b11_46="201146"; 
String b11_7="201107";String b11_15="201115";String b11_23="201123";String b11_31="201131";String b11_39="201139";String b11_47="201147"; 
String b11_8="201108";String b11_16="201116";String b11_24="201124";String b11_32="201132";String b11_40="201140";String b11_48="201148";
String b11_49="201149";String b11_50="201150";

private static final String B11_1 = "/Slip/11/201101";private static final String B11_17 = "/Slip/11/201117";private static final String B11_33 = "/Slip/11/201133";
private static final String B11_2 = "/Slip/11/201102";private static final String B11_18 = "/Slip/11/201118";private static final String B11_34 = "/Slip/11/201134";
private static final String B11_3 = "/Slip/11/201103";private static final String B11_19 = "/Slip/11/201119";private static final String B11_35 = "/Slip/11/201135";
private static final String B11_4 = "/Slip/11/201104";private static final String B11_20 = "/Slip/11/201120";private static final String B11_36 = "/Slip/11/201136";
private static final String B11_5 = "/Slip/11/201105";private static final String B11_21 = "/Slip/11/201121";private static final String B11_37 = "/Slip/11/201137";
private static final String B11_6 = "/Slip/11/201106";private static final String B11_22 = "/Slip/11/201122";private static final String B11_38 = "/Slip/11/201138";
private static final String B11_7 = "/Slip/11/201107";private static final String B11_23 = "/Slip/11/201123";private static final String B11_39 = "/Slip/11/201139";
private static final String B11_8 = "/Slip/11/201108";private static final String B11_24 = "/Slip/11/201124";private static final String B11_40 = "/Slip/11/201140";
private static final String B11_9 = "/Slip/11/201109";private static final String B11_25 = "/Slip/11/201125";private static final String B11_41 = "/Slip/11/201141";
private static final String B11_10 = "/Slip/11/201110";private static final String B11_26 = "/Slip/11/201126";private static final String B11_42 = "/Slip/11/201142";
private static final String B11_11 = "/Slip/11/201111";private static final String B11_27 = "/Slip/11/201127";private static final String B11_43= "/Slip/11/201143";
private static final String B11_12 = "/Slip/11/201112";private static final String B11_28 = "/Slip/11/201128";private static final String B11_44 = "/Slip/11/201144";
private static final String B11_13 = "/Slip/11/201113";private static final String B11_29 = "/Slip/11/201129";private static final String B11_45 = "/Slip/11/201145";
private static final String B11_14 = "/Slip/11/201114";private static final String B11_30 = "/Slip/11/201130";private static final String B11_46 = "/Slip/11/201146";
private static final String B11_15 = "/Slip/11/201115";private static final String B11_31 = "/Slip/11/201131";private static final String B11_47 = "/Slip/11/201147";
private static final String B11_16 = "/Slip/11/201116";private static final String B11_32= "/Slip/11/201132";private static final String B11_48 = "/Slip/11/201148";

private static final String B11_49= "/Slip/11/201149";private static final String B11_50= "/Slip/11/201150";

//************************************************************************************12Batch*******************************************************************************************************
String b12_1="202101";String b12_9="202109";String b12_17="202117";String b12_25="202125";String b12_33="202133";String b12_41="202141"; 
String b12_2="202102";String b12_10="202110";String b12_18="202118";String b12_26="202126";String b12_34="202134";String b12_42="202142"; 
String b12_3="202103";String b12_11="202111";String b12_19="202119";String b12_27="202127";String b12_35="202135";String b12_43="202143"; 
String b12_4="202104";String b12_12="202112";String b12_20="202120";String b12_28="202128";String b12_36="202136";String b12_44="202144"; 
String b12_5="202105";String b12_13="202113";String b12_21="202121";String b12_29="202129";String b12_37="202137";String b12_45="202145"; 
String b12_6="202106";String b12_14="202114";String b12_22="202122";String b12_30="202130";String b12_38="202138";String b12_46="202146"; 
String b12_7="202107";String b12_15="202115";String b12_23="202123";String b12_31="202131";String b12_39="202139";String b12_47="202147"; 
String b12_8="202108";String b12_16="202116";String b12_24="202124";String b12_32="202132";String b12_40="202140";String b12_48="202148";


private static final String B12_1 = "/Slip/12/202101";private static final String B12_17 = "/Slip/12/202117";private static final String B12_33 = "/Slip/12/202133";
private static final String B12_2 = "/Slip/12/202102";private static final String B12_18 = "/Slip/12/202118";private static final String B12_34 = "/Slip/12/202134";
private static final String B12_3 = "/Slip/12/202103";private static final String B12_19 = "/Slip/12/202119";private static final String B12_35 = "/Slip/12/202135";
private static final String B12_4 = "/Slip/12/202104";private static final String B12_20 = "/Slip/12/202120";private static final String B12_36 = "/Slip/12/202136";
private static final String B12_5 = "/Slip/12/202105";private static final String B12_21 = "/Slip/12/202121";private static final String B12_37 = "/Slip/12/202137";
private static final String B12_6 = "/Slip/12/202106";private static final String B12_22 = "/Slip/12/202122";private static final String B12_38 = "/Slip/12/202138";
private static final String B12_7 = "/Slip/12/202107";private static final String B12_23 = "/Slip/12/202123";private static final String B12_39 = "/Slip/12/202139";
private static final String B12_8 = "/Slip/12/202108";private static final String B12_24 = "/Slip/12/202124";private static final String B12_40 = "/Slip/12/202140";
private static final String B12_9 = "/Slip/12/202109";private static final String B12_25 = "/Slip/12/202125";private static final String B12_41 = "/Slip/12/202141";
private static final String B12_10 = "/Slip/12/202110";private static final String B12_26 = "/Slip/12/202126";private static final String B12_42 = "/Slip/12/202142";
private static final String B12_11 = "/Slip/12/202111";private static final String B12_27 = "/Slip/12/202127";private static final String B12_43= "/Slip/12/202143";
private static final String B12_12 = "/Slip/12/202112";private static final String B12_28 = "/Slip/12/202128";private static final String B12_44 = "/Slip/12/202144";
private static final String B12_13 = "/Slip/12/202113";private static final String B12_29 = "/Slip/12/202129";private static final String B12_45 = "/Slip/12/202145";
private static final String B12_14 = "/Slip/12/202114";private static final String B12_30 = "/Slip/12/202130";private static final String B12_46 = "/Slip/12/202146";
private static final String B12_15 = "/Slip/12/202115";private static final String B12_31 = "/Slip/12/202131";private static final String B12_47 = "/Slip/12/202147";
private static final String B12_16 = "/Slip/12/202116";private static final String B12_32= "/Slip/12/202132";private static final String B12_48 = "/Slip/12/202148";


//************************************************************************************12Batch*******************************************************************************************************


//************************************************************************************13Batch*******************************************************************************************************
String b13_1="203101";String b13_9="203109";String b13_17="203117";String b13_25="203125";String b13_33="203133";String b13_41="203141"; 
String b13_2="203102";String b13_10="203110";String b13_18="203118";String b13_26="203126";String b13_34="203134";String b13_42="203142"; 
String b13_3="203103";String b13_11="203111";String b13_19="203119";String b13_27="203127";String b13_35="203135";String b13_43="203143"; 
String b13_4="203104";String b13_12="203112";String b13_20="203120";String b13_28="203128";String b13_36="203136";String b13_44="203144"; 
String b13_5="203105";String b13_13="203113";String b13_21="203121";String b13_29="203129";String b13_37="203137";String b13_45="203145"; 
String b13_6="203106";String b13_14="203114";String b13_22="203122";String b13_30="203130";String b13_38="203138";String b13_46="203146"; 
String b13_7="203107";String b13_15="203115";String b13_23="203123";String b13_31="203131";String b13_39="203139";String b13_47="203147"; 
String b13_8="203108";String b13_16="203116";String b13_24="203124";String b13_32="203132";String b13_40="203140";String b13_48="203148";


private static final String B13_1 = "/Slip/13/203101";private static final String B13_17 = "/Slip/13/203117";private static final String B13_33 = "/Slip/13/203133";
private static final String B13_2 = "/Slip/13/203102";private static final String B13_18 = "/Slip/13/203118";private static final String B13_34 = "/Slip/13/203134";
private static final String B13_3 = "/Slip/13/203103";private static final String B13_19 = "/Slip/13/203119";private static final String B13_35 = "/Slip/13/203135";
private static final String B13_4 = "/Slip/13/203104";private static final String B13_20 = "/Slip/13/203120";private static final String B13_36 = "/Slip/13/203136";
private static final String B13_5 = "/Slip/13/203105";private static final String B13_21 = "/Slip/13/203121";private static final String B13_37 = "/Slip/13/203137";
private static final String B13_6 = "/Slip/13/203106";private static final String B13_22 = "/Slip/13/203122";private static final String B13_38 = "/Slip/13/203138";
private static final String B13_7 = "/Slip/13/203107";private static final String B13_23 = "/Slip/13/203123";private static final String B13_39 = "/Slip/13/203139";
private static final String B13_8 = "/Slip/13/203108";private static final String B13_24 = "/Slip/13/203124";private static final String B13_40 = "/Slip/13/203140";
private static final String B13_9 = "/Slip/13/203109";private static final String B13_25 = "/Slip/13/203125";private static final String B13_41 = "/Slip/13/203141";
private static final String B13_10 = "/Slip/13/203110";private static final String B13_26 = "/Slip/13/203126";private static final String B13_42 = "/Slip/13/203142";
private static final String B13_11 = "/Slip/13/203111";private static final String B13_27 = "/Slip/13/203127";private static final String B13_43= "/Slip/13/203143";
private static final String B13_12 = "/Slip/13/203112";private static final String B13_28 = "/Slip/13/203128";private static final String B13_44 = "/Slip/13/203144";
private static final String B13_13 = "/Slip/13/203113";private static final String B13_29 = "/Slip/13/203129";private static final String B13_45 = "/Slip/13/203145";
private static final String B13_14 = "/Slip/13/203114";private static final String B13_30 = "/Slip/13/203130";private static final String B13_46 = "/Slip/13/203146";
private static final String B13_15 = "/Slip/13/203115";private static final String B13_31 = "/Slip/13/203131";private static final String B13_47 = "/Slip/13/203147";
private static final String B13_16 = "/Slip/13/203116";private static final String B13_32= "/Slip/13/203132";private static final String B13_48 = "/Slip/13/203148";


//************************************************************************************13Batch*******************************************************************************************************



    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

String B9_30_30 = "/Slip/9/192130";

String id=request.getParameter("id"); 
String month=request.getParameter("month"); 
String batch=request.getParameter("batch"); 

String picture_id=request.getParameter("id"); 

String imagename=request.getParameter("filename"); 
	
//*****************************************************************************************5batchs******************************************************************************
if(id.equals(b5_1)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_1;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_1=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_1);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_2)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_2;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_2=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_2);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_3)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_3;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_3=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_3);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_4)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_4;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_4=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_4);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_5)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_5;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_5=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_5);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_6)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_6;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_6=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_6);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_7)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_7;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_7=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_7);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_8)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_8;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_8=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_8);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_9)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_9;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_9=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_9);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_10)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_10;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_10=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_10);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_11)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_11;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_11=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_11);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_12)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_12;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_12=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_12);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_13)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_13;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_13=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_13);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_14)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_14;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_14=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_14);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_15)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_15;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_15=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_15);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_16)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_16;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_16=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_16);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_17)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_17;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_17=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_17);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_18)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_18;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_18=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_18);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_19)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_19;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_19=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_19);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_20)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_20;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_20=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_20);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_21)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_21;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_21=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_21);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_22)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_22;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_22=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_22);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_23)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_23;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_23=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_23);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_24)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_24;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_24=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_24);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_25)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_25;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_25=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_25);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_26)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_26;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_26=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_26);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_27)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_27;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_27=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_27);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_28)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_28;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_28=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_28);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_29)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_29;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_29=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_29);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_30)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_30;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_30=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_30);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_31)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_31;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_31=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_31);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_32)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_32;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_32=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_32);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_33)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_33;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_33=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_33);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_34)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_34;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_34=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_34);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b5_35)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B5_35;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B5_35=""+month+".jpg";part.write(uploadFilePath + File.separator + B5_35);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
//*****************************************************************************************6batchs******************************************************************************

if(id.equals  (b6_1)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_1;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_1=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_1);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_2)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_2;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_2=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_2);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_3)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_3;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_3=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_3);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_4)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_4;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_4=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_4);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_5)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_5;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_5=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_5);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_6)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_6;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_6=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_6);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_7)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_7;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_7=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_7);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_8)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_8;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_8=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_8);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_9)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_9;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_9=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_9);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_10)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_10;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_10=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_10);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_11)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_11;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_11=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_11);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_12)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_12;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_12=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_12);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_13)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_13;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_13=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_13);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_14)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_14;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_14=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_14);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_15)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_15;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_15=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_15);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_16)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_16;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_16=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_16);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_17)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_17;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_17=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_17);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_18)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_18;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_18=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_18);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_19)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_19;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_19=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_19);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_20)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_20;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_20=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_20);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_21)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_21;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_21=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_21);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_22)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_22;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_22=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_22);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_23)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_23;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_23=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_23);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_24)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_24;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_24=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_24);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_25)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_25;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_25=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_25);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_26)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_26;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_26=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_26);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_27)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_27;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_27=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_27);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_28)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_28;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_28=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_28);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_29)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_29;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_29=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_29);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_30)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_30;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_30=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_30);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_31)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_31;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_31=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_31);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_32)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_32;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_32=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_32);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_33)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_33;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_33=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_33);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_34)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_34;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_34=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_34);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_35)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_35;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_35=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_35);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b6_36)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B6_36;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B6_36=""+month+".jpg";part.write(uploadFilePath + File.separator + B6_36);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if

//*****************************************************************************************7batchs******************************************************************************
if(id.equals  (b7_1)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_1;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_1=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_1);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_2)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_2;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_2=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_2);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_3)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_3;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_3=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_3);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_4)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_4;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_4=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_4);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_5)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_5;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_5=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_5);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_6)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_6;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_6=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_6);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_7)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_7;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_7=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_7);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_8)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_8;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_8=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_8);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_9)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_9;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_9=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_9);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_10)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_10;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_10=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_10);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_11)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_11;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_11=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_11);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_12)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_12;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_12=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_12);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_13)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_13;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_13=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_13);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_14)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_14;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_14=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_14);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_15)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_15;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_15=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_15);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_16)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_16;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_16=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_16);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_17)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_17;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_17=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_17);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_18)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_18;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_18=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_18);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_19)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_19;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_19=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_19);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_20)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_20;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_20=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_20);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_21)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_21;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_21=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_21);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_22)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_22;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_22=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_22);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals  (b7_23)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B7_23;        File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B7_23=""+month+".jpg";part.write(uploadFilePath + File.separator + B7_23);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if


//*****************************************************************************************8batchs******************************************************************************
if(id.equals(b8_1)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_1;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_1=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_1);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_2)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_2;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_2=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_2);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_3)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_3;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_3=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_3);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_4)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_4;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_4=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_4);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_5)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_5;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_5=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_5);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_6)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_6;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_6=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_6);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_7)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_7;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_7=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_7);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_8)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_8;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_8=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_8);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_9)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_9;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_9=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_9);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_10)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_10;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_10=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_10);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_11)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_11;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_11=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_11);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_12)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_12;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_12=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_12);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_13)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_13;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_13=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_13);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_14)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_14;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_14=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_14);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_15)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_15;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_15=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_15);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_16)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_16;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_16=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_16);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_17)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_17;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_17=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_17);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_18)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_18;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_18=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_18);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_19)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_19;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_19=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_19);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_20)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_20;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_20=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_20);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_21)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_21;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_21=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_21);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_22)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_22;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_22=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_22);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_23)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_23;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_23=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_23);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_24)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_24;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_24=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_24);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_25)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_25;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_25=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_25);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_26)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_26;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_26=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_26);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_27)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_27;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_27=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_27);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_28)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_28;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_28=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_28);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_29)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_29;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_29=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_29);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b8_30)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B8_30;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B8_30=""+month+".jpg";part.write(uploadFilePath + File.separator + B8_30);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if

//*****************************************************************************************9batchs******************************************************************************
if(id.equals(b9_1)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_1;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_1=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_1);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_2)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_2;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_2=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_2);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_3)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_3;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_3=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_3);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_4)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_4;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_4=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_4);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_5)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_5;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_5=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_5);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_6)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_6;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_6=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_6);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_7)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_7;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_7=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_7);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_8)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_8;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_8=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_8);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_9)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_9;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_9=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_9);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_10)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_10;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_10=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_10);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_11)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_11;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_11=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_11);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_12)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_12;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_12=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_12);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_13)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_13;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_13=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_13);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_14)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_14;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_14=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_14);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_15)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_15;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_15=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_15);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_16)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_16;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_16=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_16);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_17)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_17;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_17=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_17);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_18)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_18;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_18=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_18);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_19)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_19;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_19=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_19);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_20)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_20;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_20=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_20);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_21)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_21;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_21=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_21);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_22)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_22;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_22=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_22);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_23)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_23;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_23=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_23);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_24)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_24;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_24=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_24);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_25)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_25;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_25=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_25);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_26)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_26;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_26=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_26);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_27)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_27;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_27=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_27);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_28)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_28;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_28=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_28);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_29)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_29;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_29=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_29);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b9_30)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_30;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_30=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_30);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if

//*****************************************************************************************10batchs******************************************************************************
//if(id.equals(b9_30)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B9_30;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B9_30=""+month+".jpg";part.write(uploadFilePath + File.separator + B9_30);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if


if(id.equals(b10_1)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_1;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_1=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_1);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if

if(id.equals(b10_2)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_2;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_2=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_2);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_3)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_3;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_3=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_3);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_4)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_4;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_4=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_4);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_5)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_5;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_5=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_5);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_6)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_6;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_6=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_6);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_7)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_7;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_7=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_7);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_8)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_8;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_8=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_8);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_9)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_9;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_9=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_9);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_10)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_10;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_10=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_10);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_11)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_11;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_11=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_11);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_12)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_12;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_12=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_12);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_13)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_13;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_13=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_13);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_14)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_14;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_14=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_14);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_15)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_15;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_15=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_15);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_16)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_16;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_16=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_16);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_17)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_17;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_17=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_17);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_18)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_18;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_18=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_18);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_19)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_19;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_19=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_19);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_20)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_20;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_20=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_20);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_21)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_21;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_21=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_21);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_22)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_22;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_22=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_22);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_23)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_23;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_23=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_23);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_24)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_24;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_24=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_24);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_25)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_25;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_25=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_25);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_26)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_26;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_26=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_26);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_27)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_27;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_27=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_27);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_28)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_28;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_28=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_28);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_29)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_29;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_29=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_29);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_30)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_30;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_30=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_30);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_31)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_31;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_31=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_31);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_32)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_32;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_32=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_32);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_33)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_33;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_33=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_33);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_34)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_34;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_34=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_34);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_35)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_35;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_35=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_35);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_36)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_36;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_36=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_36);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_37)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_37;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_37=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_37);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_38)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_38;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_38=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_38);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_39)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_39;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_39=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_39);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_40)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_40;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_40=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_40);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_41)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_41;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_41=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_41);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_42)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_42;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_42=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_42);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_43)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_43;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_43=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_43);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_44)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_44;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_44=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_44);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_45)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_45;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_45=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_45);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_46)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_46;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_46=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_46);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_47)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_47;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_47=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_47);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if
if(id.equals(b10_48)){String applicationPath = request.getServletContext().getRealPath("");String uploadFilePath = applicationPath + File.separator + B10_48;  File fileSaveDir = new File(uploadFilePath);if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts()){String B10_48=""+month+".jpg";part.write(uploadFilePath + File.separator + B10_48);} request.setAttribute("message", fileName + " File uploaded successfully!");response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); }//if

//**************************************************************11******************************************************************

if(id.equals(b11_1)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_1; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_1=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_1);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if
if(id.equals(b11_2)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_2; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_2=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_2);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_3)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_3; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_3=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_3);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_4)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_4; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_4=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_4);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_5)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_5; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_5=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_5);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_6)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_6; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_6=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_6);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_7)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_7; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_7=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_7);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_8)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_8; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_8=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_8);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_9)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_9; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_9=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_9);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_10)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_10; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_10=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_10);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_11)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_11; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_11=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_11);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_12)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_12; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_12=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_12);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_13)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_13; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_13=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_13);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_14)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_14; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_14=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_14);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_15)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_15; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_15=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_15);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_16)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_16; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_16=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_16);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_17)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_17; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_17=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_17);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_18)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_18; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_18=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_18);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_19)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_19; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_19=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_19);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_20)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_20; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_20=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_20);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_21)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_21; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_21=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_21);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if


if(id.equals(b11_22)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_22; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_22=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_22);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b11_23)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_23; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_23=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_23);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}


if(id.equals(b11_24)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_24; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_24=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_24);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_25)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_25; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_25=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_25);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_26)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_26; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_26=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_26);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_27)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_27 ; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_27=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_27);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_28)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_28; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_28=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_28);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_29)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_29; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_29=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_29);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_30)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_30; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_30=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_30);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
if(id.equals(b11_31)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_31; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_31=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_31);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_32)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_32; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_32=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_32);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_33)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_33; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_33=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_33);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_34)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_34; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_34=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_34);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_35)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_35; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_35=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_35);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_36)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_36; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_36=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_36);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_37)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_37; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_37=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_37);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_38)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_38; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_38=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_38);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_39)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_39; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_39=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_39);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}


if(id.equals(b11_40)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_40; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_40=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_40);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_41)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_41; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_41=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_41);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_42)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_42; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_42=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_42);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
if(id.equals(b11_43)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_43; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_43=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_43);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_44)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_44; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_44=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_44);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_45)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_45; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_45=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_45);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_46)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_46; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_46=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_46);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}


if(id.equals(b11_47)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_47; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_47=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_47);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_48)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_48; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_48=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_48);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b11_49)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_49; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_49=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_49);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
if(id.equals(b11_50)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B11_50; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B11_50=""+month+".jpg";part.write(uploadFilePath + File.separator + B11_50);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}



//*********************************************************************12

if(id.equals(b12_1)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_1; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_1=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_1);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if
if(id.equals(b12_2)){String applicationPath = request.getServletContext().getRealPath("");

String uploadFilePath = applicationPath + File.separator + B12_2; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_2=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_2);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_3)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_3; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_3=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_3);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_4)){String applicationPath = request.getServletContext().getRealPath("");

String uploadFilePath = applicationPath + File.separator + B12_4; File fileSaveDir = new File(uploadFilePath);

if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_4=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_4);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_5)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_5; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_5=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_5);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_6)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_6; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_6=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_6);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_7)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_7; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_7=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_7);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_8)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_8; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_8=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_8);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_9)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_9; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_9=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_9);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if


if(id.equals(b12_10)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_10; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_10=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_10);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_11)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_11; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_11=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_11);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_12)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_12; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_12=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_12);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_13)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_13; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_13=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_13);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_14)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_14; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_14=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_14);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_15)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_15; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_15=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_15);} 

request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_16)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_16; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_16=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_16);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_17)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_17; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_17=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_17);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_18)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_18; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_18=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_18);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if


if(id.equals(b12_19)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_19; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_19=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_19);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_20)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_20; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_20=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_20);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_21)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_21; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_21=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_21);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if


if(id.equals(b12_22)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_22; File fileSaveDir = new File(uploadFilePath);

if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_22=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_22);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b12_23)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_23; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_23=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_23);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}


if(id.equals(b12_24)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_24; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_24=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_24);} 

request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_25)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_25; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_25=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_25);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_26)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_26; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_26=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_26);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_27)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_27 ; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_27=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_27);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_28)){String applicationPath = request.getServletContext().getRealPath("");

String uploadFilePath = applicationPath + File.separator + B12_28; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_28=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_28);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_29)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_29; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_29=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_29);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_30)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_30; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_30=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_30);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
if(id.equals(b12_31)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_31; File fileSaveDir = new File(uploadFilePath);

if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_31=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_31);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_32)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_32; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_32=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_32);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_33)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_33; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_33=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_33);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_34)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_34; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_34=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_34);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 

}

if(id.equals(b12_35)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_35; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_35=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_35);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_36)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_36; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_36=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_36);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_37)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_37; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_37=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_37);} 
request.setAttribute("message", fileName + " File uploaded successfully!");

response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_38)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_38; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_38=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_38);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_39)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_39; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_39=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_39);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}



if(id.equals(b12_40)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_40; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_40=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_40);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_41)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_41; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_41=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_41);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_42)){String applicationPath = request.getServletContext().getRealPath("");

String uploadFilePath = applicationPath + File.separator + B12_42; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_42=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_42);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
if(id.equals(b12_43)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_43; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_43=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_43);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b12_44)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_44; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_44=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_44);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 

}

if(id.equals(b12_45)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B12_45; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_45=""+month+".jpg";part.write(uploadFilePath + File.separator + B12_45);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}




//*********************************************************************12


//*********************************************************************13

if(id.equals(b13_1)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_1; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_1=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_1);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if
if(id.equals(b13_2)){String applicationPath = request.getServletContext().getRealPath("");

String uploadFilePath = applicationPath + File.separator + B13_2; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_2=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_2);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_3)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_3; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_3=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_3);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_4)){String applicationPath = request.getServletContext().getRealPath("");

String uploadFilePath = applicationPath + File.separator + B13_4; File fileSaveDir = new File(uploadFilePath);

if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_4=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_4);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_5)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_5; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_5=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_5);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_6)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_6; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_6=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_6);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_7)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_7; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_7=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_7);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_8)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_8; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_8=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_8);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_9)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_9; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_9=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_9);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if


if(id.equals(b13_10)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_10; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_10=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_10);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_11)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_11; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_11=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_11);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_12)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_12; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_12=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_12);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_13)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_13; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_13=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_13);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_14)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_14; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_14=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_14);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_15)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_15; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_15=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_15);} 

request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_16)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_16; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_16=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_16);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_17)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_17; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_17=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_17);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_18)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_18; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_18=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_18);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if


if(id.equals(b13_19)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_19; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_19=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_19);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_20)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_20; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_20=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_20);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_21)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_21; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_21=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_21);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if


if(id.equals(b13_22)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_22; File fileSaveDir = new File(uploadFilePath);

if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_22=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_22);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
//if

if(id.equals(b13_23)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_23; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_23=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_23);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}


if(id.equals(b13_24)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_24; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B12_24=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_24);} 

request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_25)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_25; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_25=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_25);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_26)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_26; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_26=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_26);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_27)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_27 ; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_27=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_27);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_28)){String applicationPath = request.getServletContext().getRealPath("");

String uploadFilePath = applicationPath + File.separator + B13_28; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_28=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_28);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_29)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_29; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_29=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_29);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_30)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_30; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_30=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_30);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}
if(id.equals(b13_31)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_31; File fileSaveDir = new File(uploadFilePath);

if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_31=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_31);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_32)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_32; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_32=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_32);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_33)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_33; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_33=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_33);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_34)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_34; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_34=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_34);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 

}

if(id.equals(b13_35)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_35; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_35=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_35);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_36)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_36; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_36=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_36);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_37)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_37; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_37=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_37);} 
request.setAttribute("message", fileName + " File uploaded successfully!");

response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_38)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_38; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_38=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_38);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}

if(id.equals(b13_39)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_39; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_39=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_39);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}



if(id.equals(b13_40)){String applicationPath = request.getServletContext().getRealPath("");
String uploadFilePath = applicationPath + File.separator + B13_40; File fileSaveDir = new File(uploadFilePath);
if (!fileSaveDir.exists()) {fileSaveDir.mkdirs();}
System.out.println("Upload File Directory="+fileSaveDir.getAbsolutePath()); String fileName = null;for (Part part : request.getParts())
{String B13_40=""+month+".jpg";part.write(uploadFilePath + File.separator + B13_40);} 
request.setAttribute("message", fileName + " File uploaded successfully!");
response.sendRedirect("/msged/servlet/studentpaiddis?id="+id+"&batch="+batch+""); 
}




//*********************************************************************13




    }
  
   
    private String getFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        System.out.println("content-disposition header= "+contentDisp);
        String[] tokens = contentDisp.split(";");
        for (String token : tokens) {
            if (token.trim().startsWith("filename")) {
                return token.substring(token.indexOf("=") + 2, token.length()-1);
            }
        }
        return "";
    }
}
