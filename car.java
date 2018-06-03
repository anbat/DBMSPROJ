/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Work
 */
public class car {
    private int SEATINGCAPACITY,PRICEPERDAY;
     
    private String CID,BRAND,MODELNAME,FUEL;
    
    
        public car(String CID, String BRAND,int SEATINGCAPACITY,int PRICEPERDAY,String MODELNAME,String FUEL  )
        {
            this.CID =CID;
            this.BRAND = BRAND;
            this.SEATINGCAPACITY=SEATINGCAPACITY;
            this.PRICEPERDAY = PRICEPERDAY;
            this.MODELNAME = MODELNAME;
            this.FUEL = FUEL;
        }
            
            
            public String getCID(){
                return CID;
            }
            
            public String getBRAND(){
                return BRAND;
               
            }
            
            public int getSEATINGCAPACITY(){
                return SEATINGCAPACITY;
            }
            
            public int getPRICEPERDAY(){
                return PRICEPERDAY;
            }
            
            public String getMODELNAME(){
                return MODELNAME;
            }
            public String getFUEL(){
                return FUEL;
            }
            
            
            
}
    

