/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voting_blockchain;


public class Item {
   
    private String voter_ID;
    private String Name;
    private String Mobile_number;
    private String DOB;
    private String Region;
   
    private byte[] Profile;
    
    
    public Item(String voterid,String name,String mobile_number,String dob,String region,byte[] profile)
    {
    
     this.voter_ID=voterid;
     this.Name = name;
     this.Mobile_number=mobile_number;
     this.DOB=dob;
     
     this.Region=region;
     
     this.Profile=profile;
    }

  
    
   
     public String getvoterid()
    {
        return voter_ID;
    }
      public String getname()
    {
        return Name;
    }
       public String getmobile_number()
    {
        return Mobile_number;
    }
        public String dob()
    {
        return DOB;
    }
        
          public String region()
    {
        return Region;
    }
         
            public byte[] getprofile()
    {
        return Profile;
    }
    
}
