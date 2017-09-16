import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
	
	@Test
	public void test() {
	 Pessoa pessoa = new Pessoa("João", 34);
	 Assert.assertTrue("A pessoa deve chamar João", pessoa.getName().equals("João"));
	 Assert.assertTrue("João deve ter 34", pessoa.getIdade() == 34);
	}
	
	@Test
	public void test1() {
	 Pessoa pessoa = new Pessoa("Fernando", 37);
	 Assert.assertFalse("A pessoa não deve chamar João", pessoa.getName().equals("João"));
	 Assert.assertFalse("Fernando não deve ter 34 anos", pessoa.getIdade() == 34);
	}
}
