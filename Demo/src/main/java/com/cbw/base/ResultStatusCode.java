package com.cbw.base;

public enum ResultStatusCode {

	OK(0, "OK"),  
	PERMISSION_DENIED(1,"PERMISSION_DENIED"),
    SYSTEM_ERR(30001, "System error");  
	
	
      
    private int errcode;  
    private String errmsg;  
    public int getErrcode() {  
        return errcode;  
    }  
  
    public void setErrcode(int errcode) {  
        this.errcode = errcode;  
    }  
  
    public String getErrmsg() {  
        return errmsg;  
    }  
  
    public void setErrmsg(String errmsg) {  
        this.errmsg = errmsg;  
    }  
    
    private ResultStatusCode(int Errode, String ErrMsg)  
    {  
        this.errcode = Errode;  
        this.errmsg = ErrMsg;  
    }  
}
