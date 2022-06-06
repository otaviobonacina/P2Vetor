public class P2Vetor{
    public static void main(String[]args){

        String brinquedo[] = new String[5];

        brinquedo[0]="- Carrinho de controle Remoto -";
        brinquedo[1]="- Barbie -";
        brinquedo[2]="- Pista hotweels -";
        brinquedo[3]="- Dinossauro -";
        brinquedo[4]="- Galinha Pintadinha -";
    
      
       
        int valor[]=new int[5];

        valor[0]=150;
        valor[1]=50;
        valor[2]=300;
        valor[3]=48;
        valor[4]=69;

        for (int index=0; index < valor.length; index++){
            System.out.println("O Brinquedo "+brinquedo[index] + " Custa R$"+ valor[index]+  " Reais");

        }
    }
}