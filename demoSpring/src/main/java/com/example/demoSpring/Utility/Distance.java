package com.example.demoSpring.Utility;
/**
 *LA seguente classe si occupa del calcolo della distanza tra due punti 
 * @author RiccardoAngelini
 * @author LeonardoDiPietro
 *
 */

public class Distance {


   private String input;
   private String latitude1;
   private String longitude1;
   private String latitude2;
   private String longitude2;
   private String cords;

    public Distance(String cords )
    {
    this.cords=cords;

    }

    /**
     * Il seguente metodo calcola la distanza tra due punti entrambi passate inzialmente come stringhe
     * e poi ne viene fatto il parse in double
     * @param input rappresenta le coordinate prese dal tweet
     * @return ritorna la distanza come double tra due posizioni
     */
    public double  findDistance (String input){

        String[] parts=input.split(",");
        if(!input.contains(",")){
            throw  new IllegalArgumentException("String " + input + " does not contain ,");
        }
        latitude1=parts[0];
        longitude1=parts[1];
        ConvertStringindouble pointone=new ConvertStringindouble(latitude1,longitude1);
        //cords.getCoordinates();//gliela passiamo noi tramite file
        //String input2= cords.getCoordinates();
        
        String[] parts2=cords.split(",");
        if(!input.contains(",")){

            throw  new IllegalArgumentException("String " + cords + " does not contain ,");
        }
        latitude2=parts2[0];
        longitude2=parts[2];
       ConvertStringindouble pointtwo=new ConvertStringindouble(latitude2,longitude2);
       double distance;
       double lat_one=3.1415927*pointone.conversionLatitude(latitude1)/180;  //3.14ecc è il pigrecp
       double lat_two=3.1415927*pointtwo.conversionLatitude(latitude2)/180;
       double lon_one=3.1415927*pointone.conversionLongitude(longitude1)/180;
       double lon_two=3.1415927*pointtwo.conversionLongitude(longitude2)/180;
       double fi=Math.abs(lon_one-lon_two) ;  //calcola l'angolo compreso fi
       double p=Math.cos(Math.sin(lat_two)*Math.sin(lat_one)+Math.cos(lat_two)*Math.cos(lat_one)*Math.cos(fi));//calcolo il terzo lato del triangolo sferico
       distance=p*6371; // 6371 è il raggio della superfice terrestre
       return distance;
                    }


}


