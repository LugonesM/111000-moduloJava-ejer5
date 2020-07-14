package com.mvl.practica_herencia;


import javax.swing.JOptionPane;

 class Herencia {

    public static void main(String[] args) {
      
        Vehiculo ve1=new Vehiculo();
        ve1.setNum_serie(33389);
        ve1.setMarca("yamaha");
        Vehiculo ve2=new Vehiculo();
        ve2.setNum_serie(746789);
        ve2.setMarca("yamaha");
            
        /*Bicicleta bi1=new Bicicleta();
        bi1("sdfdf","fwdf",232,"dfwf");
        */                              
        Moto mo1=new Moto();
        mo1.setNum_serie(4390948);
        mo1.setPeso((float) 203.89);
        mo1.setMarca("motomel"); 
        
        Auto lista_autos[]=new Auto[3];
        for(int i=0;i<3;i++){
            int puertas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de puertas del auto:"+  Integer.toString(i+1)));
            String color=JOptionPane.showInputDialog("Ahora el color");
            int numSerie=Integer.parseInt(JOptionPane.showInputDialog("el numero de serie"));
            String marca=JOptionPane.showInputDialog("la marca");
            lista_autos[i]=new Auto(puertas,color,numSerie,marca);
        }
        
        
                
        System.out.println("Objetos tipo vehiculos");
        System.out.printf("Num de serie : %d, Marca : %s\n", ve1.getNum_serie(), ve1.getMarca());
        System.out.printf("Num de serie : %d, Marca : %s\n\n", ve2.getNum_serie(), ve2.getMarca());
        
        /*System.out.println("Objetos tipo Vehiculo_Bicicleta");
        System.out.printf("Diametro de las ruedas : %f, Color : %s, Marca: %s\n\n", bic.getDiametro_ruedas(), bic.getColor(), bic.getMarca());
        */
        System.out.println("Objetos tipo Vehiculo_Moto");
        System.out.printf("Num de serie : %d, Peso : %f, Marca: %s\n\n", mo1.getNum_serie(), mo1.getPeso(), mo1.getMarca());
       
        
         System.out.println("Objetos tipo Vehiculo_Auto");
         for(int i=0;i<3;i++){
             System.out.printf("Num de puertas : %d, Color : %s, Num de serie: %d, Marca: %s\n", lista_autos[i].getCant_puertas(), lista_autos[i].getColor(), lista_autos[i].getNum_serie(), lista_autos[i].getMarca());
         }
         
    }
    
}
