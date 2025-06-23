import org.example.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void soma(){
        Calculadora objcal = new Calculadora();
        double result = objcal.somar(10,10);
        Assertions.assertEquals(20,result);
    };

    @Test
    public void subtrai(){
        Calculadora objcal = new Calculadora();
        double result = objcal.subtrair(10,7);
        Assertions.assertEquals(3,result);
    };

    @Test
    public void multiplica(){
        Calculadora objcal = new Calculadora();
        double result = objcal.multiplicar(10,7);
        Assertions.assertEquals(70,result);
    };

    @Test
    public void divide(){
        double a =10, b =5;
        Calculadora objcal = new Calculadora();
        double result = objcal.dividir(a,b);
        if(b == 0){
            throw new IllegalArgumentException("Erro: divisão por zero.");
        }
        Assertions.assertEquals(2,result);
    };
}
