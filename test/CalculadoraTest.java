/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import unitcalculadora.UnitCalculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jesusgabriel
 */
public class CalculadoraTest {
    
    static UnitCalculadora calc;
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("beforeClass()");
        calc = new UnitCalculadora();
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("afterClass()");
        calc.ac();
    }
    
    @Before
    public void before() {
        System.out.println("before()");
        calc.ac();
    }
    
    @After
    public void after() {
        System.out.println("after()");
        calc.ac();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testSuma(){
        System.out.println("suma()");
        double resultado = calc.suma(3.3, 2.8);
        double esperado = 6.1;
        assertEquals(esperado, resultado, 0);
    }
    
    @Test
    public void testResta(){
        System.out.println("resta()");
        double resultado = calc.resta(3, 2);
        double esperado = 1;
        assertEquals(esperado, resultado, 0);
    }
    
    @Test
    public void testMultiplicacion(){
        System.out.println("multiplicacion()");
        double resultado = calc.multiplicacion(3, 2);
        double esperado = 6;
        assertEquals(esperado, resultado, 0);
    }
    
    @Test
    public void testDivision(){
        System.out.println("division()");
        double resultado = calc.division(10, 3);
        double esperado = 3.3;
        System.out.println(resultado);
        assertEquals(esperado, resultado, 0.33);
    }
    
    @Test(expected = ArithmeticException.class)
    public void testDivicionXcero(){
        System.out.println("divicionXcero()");
        calc.division(10, 0);
    }
    
    @Test
    public void testPotenciacion(){
        System.out.println("potenciacion()");
        double resultado = calc.potenciacion(3.2, -2.5);
        double esperado = 0.05;
        assertEquals(esperado, resultado, 0.005);
    }
    
    @Test
    public void testAdd(){
        System.out.println("add()");
        calc.suma(4,5);
        
//        double resultado=calc.add(2);
//        double esperado=11;
//        assertEquals(esperado,resultado,0);
    }
    
    @Test
    public void testSub(){
        System.out.println("sub()");
        calc.suma(4,5);
        
//        double resultado=calc.sub(2);
//        double esperado=7;
//        assertEquals(esperado,resultado,0);
    }

    
    @Test
    public void testAnsSuma(){
        System.out.println("ansSuma()");
        calc.suma(4,5);
        
        double resultado=calc.ans();
        double esperado=9;
        assertEquals(esperado,resultado,0);
    }

    
    @Test
    public void testAns(){
        System.out.println("ans()");
        double resultado = calc.ans();
        double esperado = 0;
        assertEquals(esperado, resultado, 1);
    }
    
    @Test(timeout=2500)
    public void testoperaciontiempo(){
        System.out.println("operacion tiempo");
        calc.operaciontiempo();
    }
    
    @Test
    public void testString(){
        System.out.println("String");
        String x1 = new String("Hola");//"Hola";
        String x2 = new String("Hola");//"Hola";
        assertSame(x1, x2);
    }
}
