// Crear una funcion que reciba un precio y devuelva el precio con el iva incluido
public class funcionMain {
    public static void main(String[] args) {
              float resultado= getPrecio(15F, 0.16F);
              System.out.println(resultado);

    }

    static float getPrecio (float numero1, float iva){
          return (numero1 * iva)+numero1;
    }

}
