import org.junit.Assert;
import org.junit.Test;

public class PessoaTest {
	
	@Test
	public void test() {
	 Pessoa pessoa = new Pessoa("Jo�o", 34);
	 Assert.assertTrue("A pessoa deve chamar Jo�o", pessoa.getName().equals("Jo�o"));
	 Assert.assertTrue("Jo�o deve ter 34", pessoa.getIdade() == 34);
	}
	
	@Test
	public void test1() {
	 Pessoa pessoa = new Pessoa("Fernando", 37);
	 Assert.assertFalse("A pessoa n�o deve chamar Jo�o", pessoa.getName().equals("Jo�o"));
	 Assert.assertFalse("Fernando n�o deve ter 34 anos", pessoa.getIdade() == 34);
	}
}
