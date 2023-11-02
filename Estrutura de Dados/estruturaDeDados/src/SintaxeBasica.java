public class SintaxeBasica {
    public static void main(String[] args) {
        //tipoDoArray[]  nome =  new tipoDoArray[i];
        Integer[] precos = new Integer[3];
        precos[0] = 10;
        precos[1] = 20;
        precos[2] = 30;
        for (int i = 0; i < precos.length; i++){
            System.out.println(precos[i]);
        }
    }
}