function formValidation()  
{  
var uid= document.register-form.userid; 
var uname= document.register-form.username; 
var pass= document.register-form.passid;  
 
var phone= document.register-form.phone;  
var uemail = document.registration.email;  
var umsex = document.registration.msex;  
var ufsex = document.registration.fsex; 
if(userid_validation(uid,5,12))  
{  
if(passid_validation(pass,7,12))  
{  
if(allLetter(uname))  
{  
  

if(ValidateEmail(uemail))  
{  
if(validsex(umsex,ufsex))  
{  
 
  
 
}   
}  
}  
}  
}  
return false;  
}  