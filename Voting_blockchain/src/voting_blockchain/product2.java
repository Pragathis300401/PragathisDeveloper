/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package voting_blockchain;

/**
 *
 * @author ELCOT
 */
public class product2 {
   //  private String id;
  //   private String name;
      private String partyname;
      private byte[] party_Image;
      private String conditate_name;
    
        
        public product2 (){}
        
        public product2(String PARTYNAME,byte[]PARTYIMAGE,String CONDITATE_NAME){
            
            this.partyname =PARTYNAME;
            this.party_Image=PARTYIMAGE;
            this.conditate_name=CONDITATE_NAME;
            
           
        }
        public String getpartyname(){
            return partyname;
        }
        public void setpartyname(String PARTYNAME){
            this.partyname=PARTYNAME;
        }
         public byte[]getparty_image(){
             return party_Image;
        }
        public void setimage(byte[] PARTYIMAGE){
          this.party_Image=PARTYIMAGE;
        }
        
        public String getconditate(){
            return conditate_name;
        }
        public void setconditate(String CONDITATE_NAME){
            this.conditate_name=CONDITATE_NAME;
        }
       
   
    
}
