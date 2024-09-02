public class Main {
    public static void main(String[] args)
    {
        /*
        ejercicio 1
        int numN=1;
        double numA=2.33;
        char numC='D';
        int numC2= numC;
        double suma=0;
        double resta=0;
        suma=numA+numN;
        resta=numA-numN;
        System.out.println("Printeo numN: "+numN);
        System.out.println("Printeo numA: "+numA);
        System.out.println("Printeo numC: "+numC);
        System.out.println("Printeo suma: "+suma);
        System.out.println("Printeo resta: "+resta);
        System.out.println("Printeo numC2: "+numC2);*/
        /*
        ejercicio 2
        int numX=3;
        int numY=6;
        double numM=3.33;
        double numN=6.66;
        int suma=numX+numY;
        int resta=numY-numX;
        int multiplicacion=numX*numY;
        int division=numY/numX;
        double sumaD=numM+numN;
        double restaD=numN-numM;
        double multiplicacionD=numM*numN;
        double divisionD=numM/numN;
        System.out.println("Suma X+Y: "+suma);
        System.out.println("Resta Y-X: "+resta);
        System.out.println("Multiplicacion X*Y: "+multiplicacion);
        System.out.println("Division Y/X: "+division);
        System.out.println("Suma M+N: "+sumaD);
        System.out.println("Resta M-N: "+restaD);
        System.out.println("Multiplicacion M*N: "+multiplicacionD);
        System.out.println("Division M/N: "+divisionD);*/
        /*
        ejercicio 3
        int valor;
        int flag=0;
        int reduccion=0;
        System.out.println("Ingrese un valor: ");
        Scanner sc = new Scanner(System.in);
        valor = sc.nextInt();
        int suma=valor+77;
        int duplicar=valor*2;
        valor=3;
        System.out.println("Valor aumentado en 77: "+suma);
        System.out.println("Valor reducido a 3: "+valor);
        System.out.println("Valor duplicado: "+duplicar);*/
        /*
        ejercicio 4
        int A=1;
        int B=2;
        int C=3;
        int D=4;
        int aux=A;
        A=D;
        D=B;
        B=C;
        C=aux;
        System.out.println("A:"+A);
        System.out.println("B:"+B);
        System.out.println("C:"+C);
        System.out.println("D:"+D);*/
        /*
        ejercicio 5
        int A=4;
        if(A%2==0)
        {
            System.out.println("Es un numero par");
        }
        else
        {
            System.out.println("Es un numero impar");
        }*/
        /*
        ejercicio 6
        int B;
        System.out.println("Ingrese un numero:");
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        if(B>0)
        {
            System.out.println("El numero es positivo");
        }
        else
        {
            System.out.println("El numero es negativo");
        }*/
        /*
        ejercicio 7
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        char caracter = sc.next().charAt(0);
        int valorAscii;
        valorAscii= caracter;
        System.out.println(valorAscii);*/
        /*
        ejercicio 8
         int c;
        char control='s';
        while(control=='s')
        {
            System.out.println("Ingrese un número: ");
            Scanner sc = new Scanner(System.in);
            c = sc.nextInt();
            if(c>0)
                System.out.println("Es un numero positivo");
            else
                System.out.println("Es un numero negativo");
            if(c%2==0)
                System.out.println("Es un numero par");
            else
                System.out.println("Es un numero impar");
            if(c%5==0)
                System.out.println("Es multiplo de 5");
            else
                System.out.println("No es multiplo de 5");
            if(c%10==0)
                System.out.println("Es multiplo de 10");
            else
                System.out.println("No es multiplo de 10");
            if(c>100)
                System.out.println("Es mayor a 100");
            else
                System.out.println("Es menor a 100");
            System.out.println("Desea ingresar otro numero? s/n");
            Scanner Sc=new Scanner(System.in);
            control=Sc.next().charAt(0);
        }*/
        /*ejercicio 9
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Buenos dias,"+ nombre);*/
        /*ejercicio 10
        int valor_radio;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        valor_radio = entrada.nextInt();
        double area=Math.PI*valor_radio*valor_radio;
        long redondeo=Math.round(area);
        double longitud=2*Math.PI*valor_radio;
        long redondeo_2=Math.round(longitud);
        System.out.println("Area del circulo:"+redondeo);
        System.out.println("Longitud del circulo:"+redondeo_2);*/
        /*ejercicio 11
        int velocidad_Kmh;
        System.out.println("Ingrese velocidad:");
        Scanner sc = new Scanner(System.in);
        velocidad_Kmh = sc.nextInt();
        int velocidad_Ms=(velocidad_Kmh*1000)/3600;
        System.out.println("La velocidad "+velocidad_Kmh+" Km/h es igual a "+velocidad_Ms+" M/s.");*/
        /*ejercicio 12
        double cateto_a,cateto_b;
        System.out.println("Ingrese el valor el cateto A:");
        Scanner sc_a = new Scanner(System.in);
        cateto_a = sc_a.nextDouble();
        System.out.println("Ingrese el valor el cateto B:");
        Scanner sc_b = new Scanner(System.in);
        cateto_b = sc_b.nextDouble();
        double hipotenusa=(cateto_a*cateto_a)+(cateto_b*cateto_b);
        System.out.println("El valor de la hipotenusa es de: "+hipotenusa+"cm");*/
    }
}
