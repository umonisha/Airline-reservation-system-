/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypack;

/**
 *
 * @author cskl
 */
class User {
    private String flightid;
    private String flightname;
    private String fromplace;
    private String toplace;
    private String flightdeptap;
    private String flightarrap;
    private String flightdapcode;
    private String fligtaapcode;
    private String flightdep;
    private String flightarr;
    
    public User(String flightid, String flightname,String fromplace,String toplace,String flightdeptap,String flightarrap,String flightdapcode,String flightaapcode,String flightdep,
            String flightarr){
        this.flightid=flightid;
         this.flightname=flightname;
         this.fromplace=fromplace;
         this.toplace=toplace;
         this.flightdeptap=flightdeptap;
         this.flightarrap=flightarrap;
         this.flightdapcode=flightdapcode;
         this.fligtaapcode=flightaapcode;
         this.flightdep=flightdep;
         this.flightarr=flightarr;

    }
    
    public String getflightid(){
        return flightid;
    }
    public String getflightname(){
        return flightname;
    }
     public String gettoplace(){
        return toplace;
    }
     public String getfromplace(){
        return fromplace;
    }
      public String getflightdeptap(){
        return flightdeptap;
    }
       public String getflightarrap(){
        return flightarrap;
    }
        public String getflightdapcode(){
        return flightdapcode;
    }
         public String getfligtaapcode(){
        return fligtaapcode;
    }
          public String getflightdep(){
        return flightdep;
    }
           public String getflightarr(){
        return flightarr;
    }
    
    
    
}
