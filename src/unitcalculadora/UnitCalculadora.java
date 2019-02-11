package unitcalculadora;

import static java.lang.System.exit;
import java.util.Scanner;

public class UnitCalculadora {
    static Scanner teclado = new Scanner (System.in);    
    private static double ans;

    public UnitCalculadora() {
        ans = 0;
    }
    
    public static double suma(double a, double b){
        ans = a + b;
        return ans;
    }
    
    public static double resta(double a, double b){
        ans = a - b;
        return ans;
    }
    
    public static double multiplicacion(double a, double b){
        ans = a * b;
        return ans;
    }
    
    public static double division(double a, double b){
        ans = a / b;
        return ans;
    }
    
    public static double potenciacion(double a, double b){
        ans = Math.pow(a,b);
        return ans;
    }
    
    public static double ans(){
        return ans;
    }
    
    public static double operarAns(String o, double v){
        switch (o){
            case "+":{
                ans += v;
                break;
            }
            case "-":{
                ans -= v;
                break;
            }
            case "*":{
                ans *= v;
                break;
            }
            case "/":{
                ans /= v;
                break;
            }
            case "^":{
                ans = Math.pow(ans,v);
                break;
            }
        }
        return ans;
    }
    
    public static double ac(){
        ans = 0;
        return ans;
    }
    
     public void operaciontiempo(){
        try{
            Thread.sleep(2500);
        }
        catch(InterruptedException e) {
            
        }
    }

    
    public static void main(String[] args) {
        double a, b, res;
        int op = 0;
        do{
            switch (menu()) {
                case 0:{
                    exit(0);
                    break;
                }
                case 1:{
                    System.out.println("Eligio suma");
                    System.out.print("Ingrese a = ");
                    a = ingresarValor();
                    System.out.print("Ingrese b = ");
                    b = ingresarValor();
                    res = suma(a, b);
                    System.out.println(a+" + "+b+" = "+res);
                    break;
                }
                case 2:{
                    System.out.println("Eligio resta");
                    System.out.print("Ingrese a = ");
                    a = ingresarValor();
                    System.out.print("Ingrese b = ");
                    b = ingresarValor();
                    res = resta(a, b);
                    System.out.println(a+" - "+b+" = "+res);
                    break;
                }
                case 3:{
                    System.out.println("Eligio multiplicación");
                    System.out.print("Ingrese a = ");
                    a = ingresarValor();
                    System.out.print("Ingrese b = ");
                    b = ingresarValor();
                    res = multiplicacion(a, b);
                    System.out.println(a+" X "+b+" = "+res);
                    break;
                }
                case 4:{
                    System.out.println("Eligio división");
                    System.out.print("Ingrese a = ");
                    a = ingresarValor();
                    System.out.print("Ingrese b = ");
                    b = ingresarValor();
                    while(b==0){
                        System.out.println("No se puede dividir por cero");
                        System.out.print("Ingrese b = ");
                        b = ingresarValor();
                    }
                    res = division(a, b);
                    System.out.println(a+" / "+b+" = "+res);
                    break;
                }
                case 5:{
                    System.out.println("Eligio potenciación");
                    System.out.print("Ingrese a = ");
                    a = ingresarValor();
                    System.out.print("Ingrese b = ");
                    b = ingresarValor();
                    res = potenciacion(a, b);
                    System.out.println(a+" ^ "+b+" = "+res);
                    break;
                }
                case 6:{
                    System.out.println("Eligio Ans");
                    System.out.println("Ans = "+ans());
                    break;
                }
                case 7:{
                    String o;
                    System.out.println("Eligio operar Ans");
                    System.out.print("Ingrese + - * / ^ segun desee ==> ");
                    o = teclado.next();
                    System.out.print("Ingrese valor = ");
                    a = ingresarValor();
                    res = operarAns(o, a);
                    System.out.println("Ans "+o+" "+a+" = "+ans());
                    break;
                }
                case 8:{
                    System.out.println("Eligio AC");
                    System.out.println("Ans = "+ac());
                    break;
                }
            }
            System.out.print("\nPresione 1 para volver al MENÚ u otro número para salir ... ");
            op = teclado.nextInt();
        }while (op == 1);
    }
    static public int menu (){
        int opc;
        do{
            System.out.println("\n***** MENÚ *****");
            System.out.println("[0] Salir");
            System.out.println("[1] Suma");
            System.out.println("[2] Resta");
            System.out.println("[3] Multiplicación");
            System.out.println("[4] División");
            System.out.println("[5] Potenciación");
            System.out.println("[6] Ans");
            System.out.println("[7] Operar Ans");
            System.out.println("[8] AC");
            System.out.print("Elija una operación ... ");
            opc = teclado.nextInt();
            System.out.println("");
        }while(opc<0 || opc>10);
        return opc;
    }
    static public double ingresarValor(){
        double v;
        v = teclado.nextDouble();
        return v;
    }
}