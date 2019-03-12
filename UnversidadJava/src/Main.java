import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* --------------------------------------------------------------------------------------
                                                         //Tipos Primitivos byte, short, int, long
        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("Valor mínimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor máximo tipo byte: " + Byte.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("Valor mínimo tipo short: " + Short.MIN_VALUE);
        System.out.println("Valor máximo tipo short: " + Short.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("bytes tipo int: " + Integer.BYTES);
        System.out.println("Valor mínimo tipo int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo tipo int: " + Integer.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("Valor mínimo tipo long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo tipo long: " + Long.MAX_VALUE);
        /* RESULTADO IMPRESIÓN
                bits tipo byte: 8
                bytes tipo byte: 1
                Valor mínimo tipo byte: -128
                Valor máximo tipo byte: 127

                bits tipo short: 16
                bytes tipo short: 2
                Valor mínimo tipo short: -32768
                Valor máximo tipo short: 32767

                bits tipo int: 32
                bytes tipo int: 4
                Valor mínimo tipo int: -2147483648
                Valor máximo tipo int: 2147483647

                bits tipo long: 64
                bytes tipo long: 8
                Valor mínimo tipo long: -9223372036854775808
                Valor máximo tipo long: 9223372036854775807
        * */
        /*
        byte byteVar = 15;
        System.out.println("byteVar = " + byteVar);

        short shortVar = 100;
        System.out.println("shortVar = " + shortVar);

        int intVar = 500;
        System.out.println("intVar = " + intVar);

        long longVar = 1000;
        System.out.println("longVar = " + longVar);

        var numero = 10;
        System.out.println("numero = " + numero);
        */
        /* ------------------------------------------------------------------------------
                                                        //Clase Octal, Decimal, Hexadecimal
        
        byte b1 = 10; //Decimal
        System.out.println("b1 = " + b1);
        
        byte b2 = 0xa; //Hexadecimal - Se imprime como un 10
        System.out.println("b2 = " + b2);
        
        byte b3 = 012; //Octal Se imprime como un 10
        System.out.println("b3 = " + b3);
        */

        /* ------------------------------------------------------------------------------
                                                                    //Clase Tipos Flotantes
        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("Valor mínimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo tipo float: " + Float.MAX_VALUE);
        System.out.println();
        System.out.println("bits tipo Double: " + Double.SIZE);
        System.out.println("bytes tipo Double: " + Double.BYTES);
        System.out.println("Valor mínimo tipo Double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo tipo Double: " + Double.MAX_VALUE);
        System.out.println();
        */
        /*------------------------------------------------------------------------------------------
                                                                //Clase Tipo Char - Usa tabla Unicode
        System.out.println("bits tipo char: " + Character.SIZE);
        System.out.println("bytes tipo char: " + Character.BYTES);
        System.out.println("Valor mínimo tipo char: " + Character.MIN_VALUE);
        System.out.println("Valor máximo tipo char: " + Character.MAX_VALUE);
        System.out.println();
        char c = '\u0021'; //Representación hexadecimal Unicode
        System.out.println("c = " + c);
        c = 33;
        System.out.println("c = " + c);
        var edad = 23;
        var adulto = edad >= 18;
        */
        /*-------------------------------------------------------------------------------------
                                                                    //Clase Conversión de Tipos
        double valorPi = Double.parseDouble("3.14");
        System.out.println("valorPi = " + valorPi);

        char c = "Hola".charAt(0);
        System.out.println("c = " + c);

        var scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        
        String edadTexto = String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);
            */
        //EJERCICIO FINAL SECCIÓN
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Proporciona el id:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el precio:");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.println("Proporciona el simbolo:");
        char simbolo = scanner.nextLine().charAt(0);
        System.out.println("Proporciona el envío gratuito:");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: "+simbolo+precio);
        System.out.println("Envío Gratuito: "+ envioGratuito);
    }
}
