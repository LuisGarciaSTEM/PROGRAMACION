import java.util.Scanner;
// # print("Hola Mundo")

public class HolaMundo {
    /*
        El nombre de la class simpre empieza por mayúscula.
            Tiene que llamarse igual que el archivo.

        Para ejecutar código de JAVA:
        1º compilar: javac nombreArchivo.java 
            Esto genera un nombreArchivo.class
        2º interpretar: java nombreArchivo

    */

    /* 
        El String[] args sirve para, en el momento de lanzar la ejecución, 
        pasarle información al proceso.
            ARGS significa ARGUMENTO 
        Como main es una función también podemos pasarle argumentos.
            java nombreArchivo args1 args2 args3
    */
    public static void main(String[] args){
        // Solicitar argumentos en el momento de ejecutar el código:
        if (args.length == 1){
            System.out.println("Hola " + args[0] +"!");
        }else{
            System.out.println("Hola Mundo!!!");
        }   


        System.out.println("\n\n--- Uso del print ---");
        // Diferencia entre print y println:
        System.out.print("tilizando print...");
        System.out.println("Despues del print...");
        System.out.println("Utilizando println...");
        System.out.println("Despues del println...");
        System.out.println("\nUtilizando\nsaltos\nde\nlinea\ncon\n\\n\n");
        

        System.out.println("\n\n--- Operaciones dentro del print ---");
        // Hacer operaciones en el print:
        System.out.print("3+3: ");
        // Hace la cuenta 3+3 = 6
        System.out.println(3+3);
        // Si sumas texto + numero, lo convierte a texto: 3+3: 33
        System.out.println("3+3: " + 3+3 );
        // Si sumas texto + numero, pero le das prioridad con los paréntesis al número: 3+3: 6
        System.out.println("3+3: " + (3+3) );
        System.out.println("3*3: " + (3*3) );
        // No puedes multiplicar un número por un texto.
        // ERROR: System.out.println("3*'n': " + (3*"n") );
        // No puedes multiplicar dos textos.
        // ERROR: System.out.println("'3'*'n': " + ("3"*"n") );
        // " " significa texto. ' ' significa char/letra.
        // Cada char tiene asociado un número en ASCII
        System.out.println("'3'*'n': " + ('3'*'n') );



        System.out.println("\n\n--- Tipos de dato numérico ---");
        // Los tipos de dato.
        // La declaración de variables se hace al principio del código.
        int numeroInt = 5/2; // No existe la división entera como en Python //
        System.out.println("El número, de tipo int, es " + numeroInt + ".");
        double numeroDouble = 5/2.0;
        // numeroDouble = 5/2 -> El resultado sería 2 porque los operandos son enteros.
        numeroDouble = 5/2.0f;
        System.out.println("El número, de tipo double, es " + numeroDouble + ".");
        float numeroFloat = 5/2.0f;
        System.out.println("El número, de tipo float, es " + numeroFloat + "."); 
    


        System.out.println("\n\n--- Tipo de dato: String y char ---");
        String letraString;
        int letraInt;
        char letra = 'a';
        System.out.println("Letra: " + letra);
        letra = 65; // A en ASCII
        System.out.println("Letra: " + letra);
        letraInt = 66;
        // No podemos asignarle un int a un char
        // letra = letraInt; 
        letra = (char)letraInt;
        System.out.println("Letra: " + letra);
        letraInt = letra;
        System.out.println("Letra: " + letraInt);
        letra += 5;
        System.out.println("Letra: " + letra);



        System.out.println("\n\n--- Tipos de dato: BOOLEAN ---");
        boolean esFacil = true;
        boolean esBonito = true;
        boolean esPar = false;
        boolean esUnBuenObjeto = esFacil && esBonito;
        System.out.println(esFacil);
        System.out.println(!esFacil); 
        System.out.println(esFacil && esBonito); 
        System.out.println("10%2 da 0, lo que significa false: " + (10%2));
        // ERROR: esPar = !(10%2)
        esPar = (10%2 == 0);
        System.out.println("esPar = 10%2==0 : " + esPar);



        // Castings: Cambiar de tipos.
        // Declarar es darle tipo. Definir es darle valor.
        System.out.println("\n\n--- CASTEANDO ---");
        numeroInt = 2;
        // float numeroFloat; 
        // double numeroDouble;
        String numeroString;

        System.out.println("Conversión de double/float a int");
        numeroFloat = numeroInt;
        numeroDouble = numeroInt; 
        System.out.println("Int: " + numeroInt + "\nDouble: " + numeroDouble + "\nFloat: " + numeroFloat);
        numeroDouble = numeroFloat;
        System.out.println("Int: " + numeroInt + "\nDouble: " + numeroDouble + "\nFloat: " + numeroFloat);
        
        System.out.println("Conversión de int a double/float");
        numeroInt = 1;
        numeroFloat = 2.25f;
        numeroDouble = 3.75;
        numeroFloat = (float)numeroDouble;
        numeroInt = (int)numeroDouble;
        System.out.println("Int: " + numeroInt + "\nDouble: " + numeroDouble + "\nFloat: " + numeroFloat);
        
        System.out.println("Conversión int-String");
        numeroInt = 1;
        numeroString = "10";
        System.out.println("Int: " + numeroInt + "\nString: " + numeroString );
        // ERROR: numeroInt = numeroString;
        // ERROR: numeroInt = (int)numeroString;
        numeroInt = Integer.parseInt(numeroString);
        //numeroString = numeroInt;
        System.out.println("Int: " + numeroInt + "\nString: " + numeroString );
        numeroString = String.valueOf(numeroInt);
        System.out.println("Int: " + numeroInt + "\nString: " + numeroString );

        System.out.println("Conversión double-String");
        numeroDouble = 1.0;
        numeroString = "10.5";
        System.out.println("Double: " + numeroDouble + "\nString: " + numeroString );
        // ERROR: numeroDouble = numeroString;
        // ERROR: numeroDouble = (double)numeroString;
        numeroDouble = Double.parseDouble(numeroString);
        //numeroString = numeroDouble;
        System.out.println("Double: " + numeroDouble + "\nString: " + numeroString );
        numeroString = "" + numeroDouble;
        

        
        System.out.println("\n\n--- Declaración de variables ---");
        // Solo se declaran juntas variables que estén relacionadas.
        int x, y, z;
        x = 10;
        y = 20;
        z = 30;
        System.out.println(x + " - " + y + " - " + z);
        int a = 10, b = 20, c = 30;
        System.out.println(a + " - " + b + " - " + c);



        System.out.println("\n\n--- Declaración de variables CONSTANTES ---");
        final int TAMA_MAX = 100;
        // ERROR: TAMA_MAX = 10;
        final String PALABRA_FINAL = "Hola";
        System.out.println("final INT: " + TAMA_MAX + "\nfinal String: " + PALABRA_FINAL);
    
        double notacionCientifica = 1.2E-2; // 1.2*10^2
        System.out.println("Notación cientifica 1.2E-2" + notacionCientifica);
      


        System.out.println("\n\n--- Input - SCANNER ---");
        Scanner sc = new Scanner(System.in);
        String palabra; 
        int numero1, numero2, numero3;
        System.out.print("Introduce una palabra: ");
        palabra = sc.nextLine();
        System.out.println(palabra);
        System.out.print("Introduce tres numeros: ");
        numero1 = sc.nextInt();
        numero2 = sc.nextInt();
        numero3 = sc.nextInt();
        System.out.println(numero1 + " " + numero2 + " " + numero3);
        // Solución 1: 
        sc.nextLine();
        // Solución 2: Si solo quieres pedir un número, lo guardas como
        // String con nextLine() y luego lo pasas a int con parseInt().
        System.out.print("Introduce un numero: ");
        numero1 = Integer.parseInt(sc.nextLine());
        System.out.print("Introduce otra palabra: ");
        palabra = sc.nextLine();
        System.out.println(palabra);

    }

}