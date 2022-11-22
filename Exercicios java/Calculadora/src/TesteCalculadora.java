import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Eu sou a classe de teste da calculadora")
class TesteCalculadora {

  @Test
  @DisplayName("Testando o metodo somar...")
  public void testeSomar() {
    Calculadora calc = new Calculadora();
    assertEquals(34, calc.somar(32, 2));
  }

  @Test
  @DisplayName("testando o metodo subtrair...")
  public void testeSubtrair() {
    Calculadora cal = new Calculadora();
    assertEquals(1, cal.subtrair(3, 2));
  }

  @Test
  @DisplayName("testando o metodo dividir...")
  public void testeDividir() {
    Calculadora cal = new Calculadora();
    assertEquals(3, cal.dividir(6, 2));
  }

  // @Test
  // @DisplayName("testando o metodo verificar dividendo...")
  // public void testeVefificarDividendo() {
  // Calculadora cal = new Calculadora();
  // assertTrue(cal.verificarDividendo(5));
  // }

  // @Test
  // @DisplayName("testa se ha uma excecao...")
  // public void testeDividirExcecao() {
  // Calculadora cal = new Calculadora();
  // assertThrows(ArithmeticException.class, () -> {
  // cal.dividir(3, 0);
  // });
  // }

}
