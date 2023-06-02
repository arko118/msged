import java.io.*;


public class Shoppingbean implements Serializable{
private int aid=-1;
private int bid=-1;
private int did=-1;
private int eid=-1;
private int pid=-1;
private int cid=-1;
private int fid=-1;
private int gid=-1;
private int hid=-1;
private int iid=-1;
private int jid=-1;
private int kid=-1;
private int lid=-1;
private int mid=-1;
private String name=new String("");
private String cname=new String("");
private String dat=new String("");
private String username=new String("");
private String useremail=new String("");
private String log=new String("");

private int time=0;
private double price=0.0;
private double total=0.0;
private double eachprice=0.0;
private int item=0;
private int quantity=0;
private int quan=0;
private int catagory=0;
private int pass=0;

private String country=new String("");
private String street=new String("");

private String district=new String("");
private String thana=new String("");
private String postoffice=new String("");
private String area=new String("");
private String mobail=new String("");


private String holding=new String("");
private String division=new String("");
private String floor=new String("");
private int teliphone=0;
private String email=new String("");

private String proname=new String("");
private String pri=new String("");

private String trimester1=new String("");
private String trimester2=new String("");
private String trimester3=new String("");



public Shoppingbean(){}


 
 
    public void setTrimester1(String value) {
        this.trimester1 = value;
    }
public String getTrimester1() {
        return trimester1;
    }


  public void setTrimester2(String value) {
        this.trimester2 = value;
    }
public String getTrimester2() {
        return trimester2;
    }

  public void setTrimester3(String value) {
        this.trimester3 = value;
    }
public String getTrimester3() {
        return trimester3;
    }


public void setPid(int value){
pid=value;
}
public int getPid(){
return pid;
	}
public void setAid(int value){
aid=value;
}
public int getAid(){
return aid;
	}
public void setBid(int value){
bid=value;
}
public int getBid(){
return bid;
	}
public void setCid(int value){
cid=value;
}
public int getCid(){
return cid;
	}
public void setDid(int value){
did=value;
}
public int getDid(){
return did;
	}
public void setEid(int value){
eid=value;
}
public int getEid(){
return eid;
	}
public void setFid(int value){
fid=value;
}
public int getFid(){
return fid;
	}
public void setGid(int value){
gid=value;
}
public int getGid(){
return gid;
	}
public void setHid(int value){
hid=value;
}
public int getHid(){
return hid;
	}
public void setIid(int value){
iid=value;
}
public int getIid(){
return iid;
	}
public void setJid(int value){
jid=value;
}
public int getJid(){
return jid;
	}
public void setKid(int value){
kid=value;
}
public int getKid(){
return kid;
	}
public void setLid(int value){
lid=value;
}
public int getLid(){
return lid;
	}
public void setMid(int value){
mid=value;
}
public int getMid(){
return mid;
	}
public void setPass(int value){
pass=value;
}
public int getPass(){
return pass;
	}

public void setName(String value){
if(value !=null){
name=value;
}
}
public String getName(){
return name;
	}

public void setCName(String value){
if(value !=null){
cname=value;
}
}
public String getCName(){
return cname;
	}

public void setDat(String value){
if(value !=null){
dat=value;
}
}

public String getDat(){
return dat;
	}

public void setTime(int value){

time=value;

}

public int getTime(){
return time;
	}

public void setPrice(double value){
price=value;
}
public double getPrice(){
return price;
	}

public void setTotal(double value){
total +=value;
}
public double getTotal(){
return total;
	}
public void setEachprice(double value){
eachprice=value;
}
public double getEachprice(){
return eachprice;
	}
public void setItem(int value){
item=value;
}
public int getItem(){
return item;
	}

public void setQuantity(int value){
quantity=value;
}
public int getQuantity(){
return quantity;
	}

public void setQuan(int value){


quan =value;

	
}
public int getQuan(){
return quan;
	}
public void setCatagory(int value){
catagory=value;
}
public int getGatagory(){
return catagory;
	}

public void setUserName(String value){
if(value !=null){
username ="id"+value;

}
}
public String getUserName(){
return username;
	}
public void setUserEmail(String value){
if(value !=null){
useremail=value;
}
}
public String getUserEmail(){
return useremail;
	}

public void setCountry(String value){
if(value !=null){
country=value;
}
}
public String getCountry(){
return country;
	}

public void setDivision(String value){
if(value !=null){
division=value;
}
}
public String getDivision(){
return division;
	}
public void setStreet(String value){
if(value !=null){
street=value;
}
}

public String getStreet(){
return street;
	}

public void setHolding(String value){
if(value !=null){
holding=value;
}
}

public String getHolding(){
return holding;
	}
public void setFloor(String value){
if(value !=null){
floor=value;
}
}

public String getFloor(){
return floor;
	}

public void setTeliphone(int value){
teliphone=value;
}
public int getTeliphone(){
return teliphone;
	}


public void setEmail(String value){
if(value !=null){
email=value;
}
}

public String getEmail(){
return email;
	}


public void setLog(String value){
if(value !=null){

log ="Id"+value;
}
}

public String getLog(){
return log;
	}





public void setDistrict(String value){
if(value !=null){
district=value;
}}
public String getDistrict(){
return district;
	}



public void setThana(String value){
if(value !=null){
thana=value;
}}

public String getThana(){
return thana;
}	




public void setPostoffice(String value){
if(value !=null){
postoffice=value;
}}

public String getPostoffice(){
return postoffice;
}	



public void setArea(String value){
if(value !=null){
area=value;
}}

public String getArea(){
return area;
}

public void setMobail(String value){
if(value !=null){
mobail=value;
}}

public String getMobail(){
return mobail;
}

public void setProname(String value){
if(value !=null){
proname=value;
}}

public String getProname(){
return proname;
}


public void setPri(String value){
if(value !=null){
pri=value;
}}

public String getPri(){
return pri;
}



}
